package com.Unistmo.Engine.ag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;



public class TestGeneracion {

	public static void main(String argv[]) {

		Evaluacion eval =new Evaluacion();
		Generacion G=eval.fitness(1000);
		final int size =1000;
		//G.imprimirGen(G);
	    List<Double> x = new ArrayList<Double>();
		for (Individuo inv : G.getGenInd()) {
			x.add(inv.getAptitud()); 
		}
		Collections.sort(x);
		double sum = 0;
		for (Double double1 : x) {
			sum+=double1;
		}
		
		sum=sum/x.size();
		System.out.println("agv gen Dinosaurio=  "+sum);
		Generacion GenArray[]=new Generacion[size];
		Generacion temp;
		temp=G;
			
		GenArray[0]=G.generar(temp);
		//Algoritmo genetico
		for (int i = 1; i < size; i++) {
			
			GenArray[i]=G.generar(GenArray[i-1]);
			System.out.println("*---{----*");
			System.out.println(GenArray[i].getGenInd().size());
			System.out.println("*----}----*");
			eval.fitness(GenArray[i]);
			List<Double> y = new ArrayList<Double>();
			for (Individuo inv : GenArray[i].getGenInd()) {
				y.add(inv.getAptitud()); 
			}
			Collections.sort(y);
			int count=0;
			double sum2 = 0;
			for (Double double1 : y) {
				sum2+=double1;
			}
			for (Double double1 : y) {
				if(double1==1.0)
					count++;
			}
			sum2=sum2/y.size();
		
			
			System.out.println("agv gen "+i+" ="+sum2+" "+y.size()+" best= "+count);
		}
		
	
	}
}
