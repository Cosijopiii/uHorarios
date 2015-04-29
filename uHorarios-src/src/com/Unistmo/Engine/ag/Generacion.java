package com.Unistmo.Engine.ag;

import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;

public class Generacion {
	private int nI;
	private ArrayList<Individuo> iX = new ArrayList<>();
	private int maxRamNum[] = new int[5];
	private int r;

	public Generacion() {

	}

	public Generacion(int nI) {
		this.nI = nI;
		for (int l = 0; l < maxRamNum.length; l++)
			maxRamNum[l] = 0;
		generar();

	}

	public void generar() {

		for (int i = 0; i < nI; i++) {
			Individuo ind = new Individuo();
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 15; k++) {
					if (j == 0) {
						r = GenerarR(0, 4);
						maxRamNum[r]++;
						
						if (!(maxRamNum[r] > 3))
							ind.getMat()[j][k] = DatosProfesoresMaterias.G1[r];
						else {
							k=k-1;
						}
					}
					if (j == 1) {
						r = GenerarR(0, 4);
						maxRamNum[r]++;
						if (!(maxRamNum[r] > 3))
							ind.getMat()[j][k] = DatosProfesoresMaterias.G2[r];
						else {
							k=k-1;
						}
					}
					if (j == 2) {
						r = GenerarR(0, 4);
						maxRamNum[r]++;
						if (!(maxRamNum[r] > 3))
							ind.getMat()[j][k] = DatosProfesoresMaterias.G3[r];
						else {		
							k=k-1;
						}
					}
				}
				for (int l = 0; l < maxRamNum.length; l++)
					maxRamNum[l] = 0;
			}
			
			
			iX.add(ind);
		}
		
		

	}

	public int GenerarR(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
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
