package com.Unistmo.Engine.ag;


import java.util.Iterator;
import java.util.TreeSet;

public class Evaluacion {
	public static final int CONSTRAINS =2;
	public static final int HOURPERDAY = 5;

	/**
	 * Genera una nueva Instancia de Generacion con los individuos dados en el
	 * parametro nGen
	 * 
	 * @param nGen
	 * @return una nueva instancia de la Clase Generacion con los individuos ya
	 *         evaluados
	 */
	public Generacion fitness(int nGen) {
		double pena = 1;
		double fit = 0;
		Generacion G = new Generacion(nGen);

		for (Individuo inv : G.getGenInd()) {
			pena = 1;
			for (int i = 0; i < 15; i++) {
				if (inv.getMat()[0][i].getIdProfesor() == inv.getMat()[1][i]
						.getIdProfesor())
					pena = pena + 1;
				if (inv.getMat()[1][i].getIdProfesor() == inv.getMat()[2][i]
						.getIdProfesor())
					pena = pena + 1;
				if (inv.getMat()[2][i].getIdProfesor() == inv.getMat()[0][i]
						.getIdProfesor())
					pena = pena + 1;
			}
			fit = (1 / pena);
			inv.setAptitud(fit);

		}
		// twoHours (G);

		return G;
	}
	/**
	 * Evalua una Instancia de una @see Generacion G
	 * mediante los metodos de evaluacion 
	 * 
	 * @param nGen
	 * @return La Generacion con los individuos ya
	 *         evaluados
	 */
	public Generacion fitness(Generacion G) {
		double pena = 1;
		double fit = 0;
		for (Individuo inv : G.getGenInd()) {
			pena = 1;
			for (int i = 0; i < 15; i++) {
				if (inv.getMat()[0][i].getIdProfesor() == inv.getMat()[1][i]
						.getIdProfesor())
					pena = pena + 2;
				if (inv.getMat()[1][i].getIdProfesor() == inv.getMat()[2][i]
						.getIdProfesor())
					pena = pena + 2;
				if (inv.getMat()[2][i].getIdProfesor() == inv.getMat()[0][i]
						.getIdProfesor())
					pena = pena + 2;
			}
			fit = (1 / pena);
			inv.setAptitud(fit);
		}
		 twoHours (G);
		return G;
	}
  
	public Individuo fitness(Individuo inv) {
		double pena = 1;
		double fit = 0;
		for (int i = 0; i < 15; i++) {
			if (inv.getMat()[0][i].getIdProfesor() == inv.getMat()[1][i]
					.getIdProfesor())
				pena = pena + 1;
			if (inv.getMat()[1][i].getIdProfesor() == inv.getMat()[2][i]
					.getIdProfesor())
				pena = pena + 1;
			if (inv.getMat()[2][i].getIdProfesor() == inv.getMat()[0][i]
					.getIdProfesor())
				pena = pena + 1;
		}
		fit = (1 / pena);
		inv.setAptitud(fit);
		return inv;
	}
	/**
	 * Funcion que evalua una generacion en la cual la su funcion objetivo es
	 * evaluar a los individuos los cuales en sus horarios tengan 2 materias
	 * iguales pero en ciclos diferentes por ejemplo Matematicas I 8:00 y
	 * Matematicas I 10:00 cuando deberia de ser Matematicas I 8:00 y
	 * Matematicas I 9:00 si es que asi se desea 
	 * 
	 * @param G
	 * @return generacion ya evaluada 
	 */
	public Generacion twoHours(Generacion G) {

		double pena = 1;
		double fit = 1;

		for (Individuo inv : G.getGenInd()) {

			RelacionPM temp[][] = inv.getMat();
			pena=subTabla_twoHours(temp);
			fit = (1 / pena);
			inv.setAptitud((inv.getAptitud() + fit)/CONSTRAINS);
		}
		return G;
	}
	/**
	 * retorna la penalizacion de una subparte de un horario
	 * tal parte es abstractamente un dia de trabajo
	 * @param temp
	 * @return
	 */
	private int subTabla_twoHours(RelacionPM temp[][]) {

		int penalizacion = 0;
		int cX = 0, cY = HOURPERDAY;
		RelacionPM piv[] = new RelacionPM[HOURPERDAY];
		for (int i = 0; i < Individuo.NUMBER_OF_DAYS; i++) { // for para iterar los
													// semestres
			cX = 0;
			cY = HOURPERDAY;
			for (int j = 0; j < Individuo.NUMBER_OF_DAYS; j++) {// for para iterar los
														// dias

				for (int k = cX, z = 0; k < cY; k++, z++) { // for para iterar
															// los dias con sus
															// horas
					piv[z] = temp[i][k]; // se llena arreglo temporal

				}
				
				penalizacion = +Penalizacion_twoHours(piv);
			//	System.out.println("subtabla: "+penalizacion);
				cX = +HOURPERDAY;
				cY = +HOURPERDAY;
			}
		}
		

		return penalizacion;
	}
	
	public void Mutacion(){}
	/**
	 * Recibe la subtabla y evalua que se cumplan las condiciones del 
	 * metodo 
	 * @param temp
	 * @return
	 */
	private int Penalizacion_twoHours(RelacionPM temp[]){
		int penalizacion = 1;
		TreeSet<RelacionPM> t	=Frec_twoHours(temp);
		for (Iterator<RelacionPM> iterator = t.iterator(); iterator.hasNext();) {
			RelacionPM r = (RelacionPM) iterator.next();
			if(r.tempRepeat==3){
			System.out.println(r.tempRepeat);
				penalizacion=penalizacion+1;
			}
			if(r.tempRepeat>1){
				for (int i = 0; i < temp.length; i++) {
					if(r.getIdMateria()==temp[i].getIdMateria()){
						if(i==0){
							if(!(r.getIdMateria()==temp[i+1].getIdMateria())){
								penalizacion++;
							}
						}
						else if(i==temp.length-1){
							if(!(r.getIdMateria()==temp[i-1].getIdMateria())){
								penalizacion++;
							}
						}
						else{
							if(!(r.getIdMateria()==temp[i+1].getIdMateria()||r.getIdMateria()==temp[i-1].getIdMateria())){
								penalizacion++;
							}
						}
					}
				}	
			}
		}
		return penalizacion;
	}
	/**
	 * Devuelve un arbol donde cada nodo es una relacion de maestros y materias 
	 * y en el atributo tempRepeat se guardan las repeticione de las mismas en el dia
	 * correspondiente
	 * al ser un arbol este no tiene duplicados 
	 * @param temp
	 * @return frecuencia
	 */
	@SuppressWarnings("unused")
	private TreeSet<RelacionPM> Frec_twoHours(RelacionPM temp[]) {
		TreeSet<RelacionPM> t=null;
		if(t==null)
			t=new TreeSet<RelacionPM>();
		else
			t.clear();
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				if (temp[i].equals(temp[j])) {
					temp[i].tempRepeat=+1;	
				}	
			}		
			t.add(temp[i]);
		}
	return t;
	}
	/**
	 * Metodo para hallar la moda en un vector de enteros Utilizando la tecnica
	 * Divide y Venceras
	 * @deprecated
	 * @param a
	 * @param prim
	 * @param ult
	 * @return
	 */
	public static int hallarModa(int a[], int prim, int ult) {
		int i, frec, maxfrec, moda;
		if (prim == ult)
			return a[prim];
		moda = a[prim];
		maxfrec = Frecuencia(a, a[prim], prim, ult);
		for (i = prim + 1; i <= ult; i++) {
			frec = Frecuencia(a, a[i], i, ult);
			if (frec > maxfrec) {
				maxfrec = frec;
				moda = a[i];
			}
		}
		return moda;
	}
	/**
	 * Metodo para calcular el numero de veces que se repite un elemento
	 * Utilizado por el metodo hallarModa
	 * @deprecated
	 * @param a
	 * @param p
	 * @param prim
	 * @param ult
	 * @return
	 */
	  private static int Frecuencia(int a[], int p, int prim, int ult) {
		int i, suma;
		if (prim > ult)
			return 0;
		suma = 0;
		for (i = prim; i <= ult; i++)
			if (a[i] == p)
				suma++;

		return suma;

	}

}
