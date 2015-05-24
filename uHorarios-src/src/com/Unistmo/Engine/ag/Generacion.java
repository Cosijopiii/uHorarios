package com.Unistmo.Engine.ag;

import java.util.ArrayList;
import java.util.Collections;

public class Generacion {
	private int nI;
	private ArrayList<Individuo> genInd = new ArrayList<>();
	private int maxRamNum[] = new int[5];
	private int r;
	private Evaluacion eval;

	public Generacion() {

	}

	public Generacion(int nI) {
		this.nI = nI;
		for (int l = 0; l < maxRamNum.length; l++)
			maxRamNum[l] = 0;
		generar();
		eval = new Evaluacion();
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
							ind.getMat()[j][k] = DatosProfesoresMaterias.s1[r];
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
						r = DatosProfesoresMaterias.GenerarR(0, 4);
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

			genInd.add(ind);
		}

	}

	public Generacion generar(Generacion G) {

		ArrayList<Individuo> gen = new ArrayList<Individuo>();
		G = eval.fitness(G);
		Collections.sort(G.genInd);
		
		//Collections.shuffle(G.genInd);
		gen.addAll(G.genInd.subList(0, (G.genInd.size()) / 2));
		ArrayList<Individuo> newGeneracion = new ArrayList<Individuo>();
		for (int i = 0; i < gen.size(); i++)
			newGeneracion.addAll(Cruza.CruzaAleatoria(gen.get(i),
					gen.get(gen.size() - 1 - i)));
		Generacion ng = new Generacion();
		ng.setGenInd(newGeneracion);
		return ng;

	}

	public void imprimirGen(Generacion G) {

		int c = 1;
		for (Individuo inv : G.getGenInd()) {

			for (int j = 0; j < 15; j++) {
				for (int i = 0; i < 3; i++) {
					System.out.print(inv.getMat()[i][j].toString() + "|** ");
				}

				System.out.println("\n");
				if (j == 4 || j == 9 || j == 14)
					System.out.println("<-fin dia-> " + (c++));
			}
			c = 1;
			System.out.println("Aptitud: " + inv.getAptitud());
			System.out
					.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");

		}
	}

	public int[] getMaxRamNum() {
		return maxRamNum;
	}

	public void setMaxRamNum(int maxRamNum[]) {
		this.maxRamNum = maxRamNum;
	}

	public ArrayList<Individuo> getGenInd() {
		return genInd;
	}

	public void setGenInd(ArrayList<Individuo> ix) {
		genInd = ix;
	}

}
