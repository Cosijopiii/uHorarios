package com.Test;


import main.java.ar.edu.utn.frba.ia.ag.AlgoritmoGenetico;
import main.java.ar.edu.utn.frba.ia.ag.ConfiguracionDefault;
import main.java.ar.edu.utn.frba.ia.ag.Individuo;

public class AGS2 {
	public static void main(String[] args) {
	AlgoritmoGenetico pxyz = new AlgoritmoGenetico(new ConfiguracionDefault(), Individuoag.class);

	Individuo xyzp = pxyz.ejecutar();

	Individuoag x=new Individuoag(); 
	x=(Individuoag) xyzp;
	
	
	System.out.println("\n x "+ x.getX()+  " y " +x.getY()+ " z "+ x.getZ()  );
	
	}
	
	
}