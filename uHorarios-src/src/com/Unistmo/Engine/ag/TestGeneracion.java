package com.Unistmo.Engine.ag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class TestGeneracion {

	public static void main(String argv[]) {

		Evaluacion eval =new Evaluacion();
		Generacion G=eval.evaluar(20);
		/*
		 * usar g
		 * 
		 * generar g1 a
		 * 
		 * 
		 * 
		 */
		//G.imprimirGen(G);
		List<Double> x = new ArrayList<Double>();
		for (Individuo inv : G.getIx()) {
			x.add(inv.getAptitud());
		}
		Collections.sort(x);
		int y=0;
		
		for (Double double1 : x) {
			if(double1.equals(1.0))
				y++;
		}
		System.out.println(y);
		System.out.println("-------------------------------------------");
		Individuo a=Cruza.CruzaAleatoria(G.getIx().get(0), G.getIx().get(1)).get(0);
		
		System.out.println(G.getIx().get(0).getAptitud());
		System.out.println(G.getIx().get(1).getAptitud());
		System.out.println("--o--");
		a=eval.evaluar(a);
		//a.ImprimirInd(a);
		G.generar(G);
		
		
		
		System.out.println("--o--");
	}
}
