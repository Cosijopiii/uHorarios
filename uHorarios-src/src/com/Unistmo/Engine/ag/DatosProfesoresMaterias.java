package com.Unistmo.Engine.ag;

import com.Unistmo.Engine.ag.RelacionPM;

public interface DatosProfesoresMaterias {
	
	public static RelacionPM s1[] = {
		    new RelacionPM(1, 1, "Gabriel", "Tw"),
			new RelacionPM(2, 2, "Luis", "Pv"),
			new RelacionPM(3, 3, "Nubia", "Ig"),
			new RelacionPM(4, 4, "Carlos", "Re"),
			new RelacionPM(5, 5, "Nayeli", "SO") };
	
	public static RelacionPM s2[] = {
			new RelacionPM(6, 6, "Felipe", "MN"),
			new RelacionPM(2, 7, "Luis", "SY"),
			new RelacionPM(3, 8, "Nubia", "PO"),
			new RelacionPM(7, 9, "Oscar", "DB"),
			new RelacionPM(8, 10, "Alfaro", "DW") };

	public static RelacionPM s3[] = {
	     	new RelacionPM(5, 11, "Nayeli", "SD"),
			new RelacionPM(9, 12, "Cano", "CS"),
			new RelacionPM(10, 13, "Nubia", "MA"),
			new RelacionPM(11, 14, "Carlos", "MB"),
			new RelacionPM(1, 15, "Gabriel", "MC") };
	
	
	public static int GenerarR(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}


}



