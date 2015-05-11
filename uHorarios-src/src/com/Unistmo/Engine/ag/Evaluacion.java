package com.Unistmo.Engine.ag;

public class Evaluacion {

	public Generacion evaluar(int nGen) {
		double pena = 1;
		double fit=0;
		Generacion G = new Generacion(nGen);

		for (Individuo inv : G.getIx()) {
			pena=1;
			for (int i = 0; i < 15; i++) {
		        if (inv.getMat()[0][i].idProfesor== inv.getMat()[1][i].idProfesor)
					pena=pena+1;
				if(inv.getMat()[1][i].idProfesor == inv.getMat()[2][i].idProfesor)
					pena=pena+1;
				if( inv.getMat()[2][i].idProfesor == inv.getMat()[0][i].idProfesor)
					pena=pena+1;	
			}
			fit=(1/pena);
			inv.setAptitud(fit);	
			
		}

		return G;
	}
	public Generacion evaluar(Generacion G){
		double pena = 1;
		double fit=0;	
		for (Individuo inv : G.getIx()) {
			pena=1;
			for (int i = 0; i < 15; i++) {
		        if (inv.getMat()[0][i].idProfesor== inv.getMat()[1][i].idProfesor)
					pena=pena+1;
				if(inv.getMat()[1][i].idProfesor == inv.getMat()[2][i].idProfesor)
					pena=pena+1;
				if( inv.getMat()[2][i].idProfesor == inv.getMat()[0][i].idProfesor)
					pena=pena+1;	
			}
			fit=(1/pena);
			inv.setAptitud(fit);		
		}
		return G;
	}
	
	public Individuo evaluar(Individuo inv){
		double pena = 1;
		double fit=0;
		for (int i = 0; i < 15; i++) {
	        if (inv.getMat()[0][i].idProfesor== inv.getMat()[1][i].idProfesor)
				pena=pena+1;
			if(inv.getMat()[1][i].idProfesor == inv.getMat()[2][i].idProfesor)
				pena=pena+1;
			if( inv.getMat()[2][i].idProfesor == inv.getMat()[0][i].idProfesor)
				pena=pena+1;	
		}
		fit=(1/pena);
		inv.setAptitud(fit);	
		return inv;
		
	}
	
	
}
