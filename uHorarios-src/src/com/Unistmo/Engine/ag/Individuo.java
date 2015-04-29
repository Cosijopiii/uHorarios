package com.Unistmo.Engine.ag;

public class Individuo {
	
	public static final int SIZEA=3;
	public static final int SIZEB=15;
	
	
	private double aptitud;
	private RelacionPM  Mat[][]=new RelacionPM [SIZEA][SIZEB];
	public Individuo(){
		
	}

	
	
	

	public RelacionPM[][] getMat() {
		return Mat;
	}

	public void setMat(RelacionPM mat[][]) {
		Mat = mat;
	}





	public double getAptitud() {
		return aptitud;
	}





	public void setAptitud(double aptitud) {
		this.aptitud = aptitud;
	}





	
	
	
	



}
