package com.Unistmo.Engine.ag;

public class Cruza {

	private Individuo g1 ;
	private Individuo g2;
	
	public Cruza (){
	}
	
	public static Individuo cruza2puntos(Individuo g1 ,Individuo g2){
		
		
		RelacionPM[] sub1=Mtoarray(g1.getMat(), 0, 0,8);
		RelacionPM[] sub2=Mtoarray(g1.getMat(), 1, 0,8);
		RelacionPM[] sub3=Mtoarray(g1.getMat(), 2, 0,8);
		RelacionPM[] sub4=Mtoarray(g2.getMat(), 0, 8,Individuo.SIZEB);
		RelacionPM[] sub5=Mtoarray(g2.getMat(), 1, 8,Individuo.SIZEB);
		RelacionPM[] sub6=Mtoarray(g2.getMat(), 2, 8,Individuo.SIZEB);	
		RelacionPM[][] cria=new RelacionPM[Individuo.SIZEA][Individuo.SIZEB];
		
		for (int i = 0; i < Individuo.SIZEB; i++) {		
			cria[0][i]= (i< sub1.length) ? sub1[i] :sub4[i-sub1.length]; 			
			cria[1][i]= (i< sub2.length) ? sub2[i] :sub5[i-sub2.length]; 		
			cria[2][i]= (i< sub3.length) ? sub3[i] :sub6[i-sub3.length]; 		
		}
		Individuo cr=new Individuo();
		cr.setMat(cria);
		return cr;	
	}
	
	public static RelacionPM[] Mtoarray(RelacionPM [][] m,int x, int y,int fin){
		RelacionPM[] arr =new RelacionPM [fin-y];
		int c=0;
		for (int i = y; i <fin; i++) {
			arr[c]=m[x][i];
			c++;
		}
		
		
		return arr;	
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
