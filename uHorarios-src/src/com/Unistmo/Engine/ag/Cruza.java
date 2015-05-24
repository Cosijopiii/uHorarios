package com.Unistmo.Engine.ag;

import java.util.ArrayList;
public class Cruza {

	private Individuo g1 ;
	private Individuo g2;
	
	public Cruza (){
	}
	/**
	 * @deprecated
	 * @param g1
	 * @param g2
	 * @return
	 */
	public static Individuo cruza2puntos(Individuo g1 ,Individuo g2){
	
		RelacionPM[] sub1=Mtoarray(g1.getMat(), 0, 0,Individuo.SIZEB-7);
		RelacionPM[] sub2=Mtoarray(g1.getMat(), 1, 0,Individuo.SIZEB-7);
		RelacionPM[] sub3=Mtoarray(g1.getMat(), 2, 0,Individuo.SIZEB-7);
		
		RelacionPM[] sub4=Mtoarray(g2.getMat(), 0, 8,Individuo.SIZEB);
		RelacionPM[] sub5=Mtoarray(g2.getMat(), 1, 8,Individuo.SIZEB);
		RelacionPM[] sub6=Mtoarray(g2.getMat(), 2, 8,Individuo.SIZEB);	
		RelacionPM[][] cria=new RelacionPM[Individuo.SIZEA][Individuo.SIZEB];
		
		for (int i = 0; i < Individuo.SIZEB; i++) {		
			cria[0][i]= (i< sub1.length) ? sub1[i] :sub4[i-sub1.length]; 			
			cria[1][i]= (i< sub2.length) ? sub2[i] :sub5[i-sub2.length]; 		
			cria[2][i]= (i< sub3.length) ? sub3[i] :sub6[i-sub3.length]; 		
		}
		Individuo cr=new Individuo(cria);
		return cr;	
	}
	/**
	 * @deprecated
	 * @param m
	 * @param x
	 * @param y
	 * @param fin
	 * @return
	 */
	public static RelacionPM[] Mtoarray(RelacionPM[][] m, int x, int y, int fin) {
		RelacionPM[] arr = new RelacionPM[fin - y];
		int c = 0;
		for (int i = y; i < fin; i++) {
			arr[c] = m[x][i];
			c++;
		}
		return arr;
	}
	public static ArrayList<Individuo> CruzaAleatoria(Individuo a,Individuo b){
		ArrayList<RelacionPM> indA=MtoArray(a);
		ArrayList<RelacionPM> indB=MtoArray(b);
		ArrayList<RelacionPM> offp1=new ArrayList<>();
		ArrayList<RelacionPM> offp2=new ArrayList<>();
		int crossPoint=DatosProfesoresMaterias.GenerarR(0, indA.size()-1);
		
		offp1.addAll(indA.subList(0, crossPoint));
		offp1.addAll(indB.subList(crossPoint, Individuo.SIZEA*Individuo.SIZEB));
		offp2.addAll(indB.subList(0,crossPoint));
		offp2.addAll(indA.subList(crossPoint, Individuo.SIZEA*Individuo.SIZEB));
		
		Individuo cr1 =new Individuo();
		Individuo cr2 =new Individuo();
		int c=0;
		for (int i = 0; i < Individuo.SIZEA; i++) {
			for (int j = 0; j < Individuo.SIZEB; j++) {
				cr1.getMat()[i][j]=offp1.get(c);
				cr2.getMat()[i][j]=offp2.get(c);
				c++;
			}
		}	
		ArrayList<Individuo> cruza=new ArrayList<Individuo>();
		cruza.add(cr1);
		cruza.add(cr2);
		return cruza;
	}
	public static ArrayList<RelacionPM> MtoArray(Individuo mat){
		ArrayList<RelacionPM> array=new ArrayList<RelacionPM>();
		for (int i = 0; i < Individuo.SIZEA; i++) {
			for (int j = 0; j < Individuo.SIZEB; j++) {
				array.add(mat.getMat()[i][j]);
			}
		}
		return  array;
	}

	public Individuo getG1() {
		return g1;
	}
	public void setG1(Individuo g1) {
		this.g1 = g1;
	}
	public Individuo getG2() {
		return g2;
	}
	public void setG2(Individuo g2) {
		this.g2 = g2;
	}
}
