package com.Unistmo.Engine.ag;

import com.Unistmo.Engine.ag.RelacionPM;

public interface DatosProfesoresMaterias {
	/**
	 * Espesifica el numero de Profesores que imparten clases por semestre
	 */
	public static final int NUMBER_OF_TEACHERS_SEMESTER = 5;
	/**
	 * Espesifica el numero de semestres que hay en un ciclo escolar o periodo
	 * de 6 meses;
	 */
	public static final int NUMBER_OF_SEMESTER_FOR_PERIODY = 5;

	public static final int NUMBER_MAX_OF_CLASS_PER_DAY_FOR_TEACHER=3;
	public static RelacionPM s1[] = { new RelacionPM(1, 1, "Gabriel", "Tw"),
			new RelacionPM(2, 2, "Luis", "Pv"),
			new RelacionPM(3, 3, "Nubia", "Ig"),
			new RelacionPM(4, 4, "Carlos", "Re"),
			new RelacionPM(5, 5, "Nayeli", "SO") };

	public static RelacionPM s2[] = { new RelacionPM(6, 6, "Felipe", "MN"),
			new RelacionPM(2, 7, "Luis", "SY"),
			new RelacionPM(3, 8, "Nubia", "PO"),
			new RelacionPM(7, 9, "Oscar", "DB"),
			new RelacionPM(8, 10, "Alfaro", "DW") };

	public static RelacionPM s3[] = { new RelacionPM(5, 11, "Nayeli", "SD"),
			new RelacionPM(9, 12, "Cano", "CS"),
			new RelacionPM(10, 13, "Nubia", "MA"),
			new RelacionPM(11, 14, "Carlos", "MB"),
			new RelacionPM(1, 15, "Gabriel", "MC") };

	public static int GenerarR(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}

}
