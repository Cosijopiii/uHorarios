package com.Test;

import main.java.ar.edu.utn.frba.ia.ag.Individuo;

public class Individuoag extends Individuo {
	
	int x=0;
	int y=0;
	int z=0;
	
	
	public Individuoag() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public double aptitud() {
		int sumXyz = x+y+z;
		
		// si no es 742.15 no me sirve, arreglo el resultado para que sea menos apto
		return this.getxyz() != 100 ? 999999 : sumXyz;
		
	}
	public boolean esMasAptoQue(Individuo individuo) {
	
		return this.aptitud() <= individuo.aptitud();
	}
	public String toString() {
		return "x: "+ this.x +" y: " +this.y +" z: "+this.z; 
	}
	public Individuo generarRandom() {
		
		int tot =100;
		int totneg =0;
		Individuoag xyz=new Individuoag();
		
		xyz.x=(int)(Math.random() * ((tot - totneg)));
		totneg+=xyz.x;
		xyz.y=(int)(Math.random() * ((tot - totneg)));
		totneg+=xyz.y;
		xyz.z=(int)(Math.random() * ((tot - totneg)));
		totneg+=xyz.z;
		
		
		return xyz;
		
	}
	
	private double getxyz() {
		return x+y+z;
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public int getZ() {
		return z;
	}


	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}


	public void setZ(int z) {
		this.z = z;
	}

}
