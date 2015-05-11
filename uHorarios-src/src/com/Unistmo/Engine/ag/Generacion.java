package com.Unistmo.Engine.ag;

import java.util.ArrayList;
import java.util.Collections;

public class Generacion {
	private int nI;
	private ArrayList<Individuo> iX = new ArrayList<>();
	private int maxRamNum[] = new int[5];
	private int r;
	private Evaluacion eval;
	private ArrayList<Individuo> gen=new ArrayList<Individuo>();
	public Generacion() {

	}

	public Generacion(int nI) {
		this.nI = nI;
		for (int l = 0; l < maxRamNum.length; l++)
			maxRamNum[l] = 0;
		generar();
		eval=new Evaluacion();
	}

	public void generar() {

		for (int i = 0; i < nI; i++) {
			Individuo ind = new Individuo();
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 15; k++) {
					if (j == 0) {
						r = DatosProfesoresMaterias.GenerarR(0, 4);
						maxRamNum[r]++;

						if (!(maxRamNum[r] > 3))
							ind.getMat()[j][k] = DatosProfesoresMaterias.s1[r];//query de base de datoshnh
						else {
							k = k - 1;
						}
					}
					if (j == 1) {
						r = DatosProfesoresMaterias.GenerarR(0, 4);
						maxRamNum[r]++;
						if (!(maxRamNum[r] > 3))
							ind.getMat()[j][k] = DatosProfesoresMaterias.s2[r];
						else {
							k = k - 1;
						}
					}
					if (j == 2) {
						r =DatosProfesoresMaterias.GenerarR(0, 4);
						maxRamNum[r]++;
						if (!(maxRamNum[r] > 3))
							ind.getMat()[j][k] = DatosProfesoresMaterias.s3[r];
						else {
							k = k - 1;
						}
					}
				}
				for (int l = 0; l < maxRamNum.length; l++)
					maxRamNum[l] = 0;
			}

			iX.add(ind);
		}

	}
	public void generar(Generacion G){
	
		G=eval.evaluar(G);
		Collections.sort(G.iX);
		imprimirGen(G);
		gen.addAll(G.iX.subList(0,(G.iX.size()-1)/2));
		
		
		ArrayList<Individuo> d=new ArrayList<Individuo>();
		
	}	
	public void imprimirGen(Generacion G){
		
		int c=1;
		for (Individuo inv : G.getIx()) {
			
			for (int j = 0; j < 15; j++) {
				for (int i = 0; i < 3; i++) {
					System.out.print(inv.getMat()[i][j].toString()+"|** ");	
				}
				
				System.out.println("\n");
				if(j==4||j==9||j==14)
					System.out.println("<-fin dia-> "+(c++));
			}
			c=1;
			System.out.println("Aptitud: "+inv.getAptitud());
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			
		}
		}

	public int[] getMaxRamNum() {
		return maxRamNum;
	}

	public void setMaxRamNum(int maxRamNum[]) {
		this.maxRamNum = maxRamNum;
	}

	public ArrayList<Individuo> getIx() {
		return iX;
	}

	public void setIx(ArrayList<Individuo> ix) {
		iX = ix;
	}

}
