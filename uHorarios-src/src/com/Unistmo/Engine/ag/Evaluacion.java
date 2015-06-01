package com.Unistmo.Engine.ag;

import java.util.ArrayList;
import java.util.Arrays;

public class Evaluacion {

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

	public Generacion fitness(Generacion G) {
		double pena = 1;
		double fit = 0;
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
	 * Matematicas I 9:00
	 * 
	 * @param G
	 * @return generacion ya evaluada
	 */
	public Generacion twoHours(Generacion G) {

		double pena = 1;
		double fit = 0;

		for (Individuo inv : G.getGenInd()) {

			RelacionPM temp[][] = inv.getMat();
			countMaterias(temp);

			fit = (1 / pena);
			inv.setAptitud(inv.getAptitud() + fit);
		}

		return G;
	}

	private RelacionPM[] countMaterias(RelacionPM temp[][]) {
		int cX = 0, cY = HOURPERDAY - 1;
		for (int i = 0; i < Individuo.SIZEA; i++) {

			for (int j = 0; j < Individuo.SIZEA; j++) {

				for (int k = cX; k < cY; k++) {
				RelacionPM pivote=temp[cX][cY];
					
					
				}
				
				cX = cX + HOURPERDAY;
				cY = cY + HOURPERDAY;
			}

		}

		return null;
	}
	
	private boolean Search(Object i){
		return false;
		
		
	}
	
	

	/**
	 * Metodo para hallar la moda en un vector de enteros Utilizando la tecnica
	 * Divide y Venceras
	 * 
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
	 * 
	 * @param a
	 * @param p
	 * @param prim
	 * @param ult
	 * @return
	 */
	public static int Frecuencia(int a[], int p, int prim, int ult) {
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
