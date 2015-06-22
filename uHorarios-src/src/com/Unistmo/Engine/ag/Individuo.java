package com.Unistmo.Engine.ag;


public class Individuo implements Comparable<Individuo>{
	
	
	public static final int NUMBER_OF_DAYS=3;
	public static final int NUMBER_OF_HOURS_PER_DAY=5;
	public static final int HOURS_WORKERD_PER_WEEK=NUMBER_OF_DAYS*NUMBER_OF_HOURS_PER_DAY;
	private double aptitud;
	private RelacionPM  Mat[][]=new RelacionPM [NUMBER_OF_DAYS][HOURS_WORKERD_PER_WEEK];
	public Individuo(){
		
	}
	public Individuo(RelacionPM[][] mat){
		Mat=mat;
	}
	public void ImprimirInd(Individuo I){
		
		for (int j = 0; j < HOURS_WORKERD_PER_WEEK; j++) {
			for (int i = 0; i < NUMBER_OF_DAYS; i++) {
				System.out.print(I.getMat()[i][j].toString()+"|** ");	
			}
			System.out.println("\n");
			if(j==4||j==9||j==14)
				System.out.println("<-fin dia-> ");
		}
		System.out.println("Aptitud: "+I.getAptitud());
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------");		
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
	@Override
	public int compareTo(Individuo ac) {
		if(aptitud<ac.aptitud)
    		return 1;
    	if(aptitud>ac.aptitud)
    		return -1;
    	return 0;
	}


}
