package com.Unistmo.uHorarios;

public interface Patrones {
	public static final String PATTERN_NOMBRE="[A-Z][a-zá-ú]+[\\s]{1}[A-Z][a-zá-ú]+[\\s]{1}[A-Z][a-zá-ú]+";
	public static final String PATTERN_CORREO="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	public static final String PATTERN_TELEFONO="[0-9]{10}|[0-9]{13}";
	public static final String PATTERN_NOMINA=" ";
	public static final String PATTERN_CLAVE=" ";
}
