package com.Unistmo.uHorarios.Modulos.Materias;

/**
 * Clase materia Contiene datos de la materia
 * 
 * @author Cosijopii García García
 * @version 1.0
 *
 */
public class Materia {
	/**
	 * Codigo de la materia
	 */
	private int id;
	/**
	 * Nombre de la materia
	 */
	private String nombre;
	/**
	 * Semestre al cual pertenece la materia
	 */
	private int semestre;

	/**
	 * Constructor por defecto
	 */
	public Materia() {
	}
	/**
	 * 
	 * @param id codigo unico de la materia
	 * @param semestre semestre al cual pertenece la meteria 
	 * @param nombre nombre de la materia 
	 */
	public Materia(int id, String nombre, int semestre) {
		this.id = id;
		this.nombre = nombre;
		this.semestre = semestre;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the semestre
	 */
	public int getSemestre() {
		return semestre;
	}

	/**
	 * @param semestre
	 *            the semestre to set
	 */
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

}
