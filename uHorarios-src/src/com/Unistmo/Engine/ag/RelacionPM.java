package com.Unistmo.Engine.ag;
import com.Unistmo.uHorarios.Modulos.Materias.Materia;
import com.Unistmo.uHorarios.Modulos.Profesores.Profesor;
public class RelacionPM implements Comparable<RelacionPM> {
	private int idProfesor;
	private int idMateria;
	private String nombreP;
	private String nombreM;
	public int tempRepeat;
	private Profesor profesor;
	private Materia materia;
	public RelacionPM() {
	}
	public RelacionPM(Profesor profesor, Materia materia,int tempRepeat){
		this.profesor=profesor;
		this.materia=materia;
		this.tempRepeat=tempRepeat;
	}
	public RelacionPM(int idP, int idM, String nP, String nM) {
		this.idProfesor = idP;
		this.idMateria = idM;
		this.nombreP = nP;
		this.nombreM = nM;
	}
	public String toString() {
		// return (idProfesor<10) ? "["+String.valueOf(idProfesor)+" "+"]" :
		// "["+String.valueOf(idProfesor)+"]";
		// return (idProfesor<10) ? "["+nombreP+" "+"]" : "["+nombreP+"]";
		return nombreM + "->" + nombreP;
		// return "["+String.valueOf(idProfesor)+"]";
		// //+"-"+String.valueOf(idMateria)+"]";//+"Np:"+nombreP+"Nm:"+nombreM;
	}
	/**
	 * @return the idProfesor
	 */
	public int getIdProfesor() {
		return idProfesor;
	}
	/**
	 * @param idProfesor
	 *            the idProfesor to set
	 */
	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}
	/**
	 * @return the idMateria
	 */
	public int getIdMateria() {
		return idMateria;
	}
	/**
	 * @param idMateria
	 *            the idMateria to set
	 */
	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}
	/**
	 * @return the nombreP
	 */
	public String getNombreP() {
		return nombreP;
	}
	/**
	 * @param nombreP
	 *            the nombreP to set
	 */
	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}
	/**
	 * @return the nombreM
	 */
	public String getNombreM() {
		return nombreM;
	}
	/**
	 * @param nombreM
	 *            the nombreM to set
	 */
	public void setNombreM(String nombreM) {
		this.nombreM = nombreM;
	}
	/**
	 * @return the tempRepeat
	 */
	public int getTempRepeat() {
		return tempRepeat;
	}
	/**
	 * @return the profesor
	 */
	public Profesor getProfesor() {
		return profesor;
	}
	/**
	 * @return the materia
	 */
	public Materia getMateria() {
		return materia;
	}
	@Override
	public boolean equals(Object e) {
		RelacionPM m = (RelacionPM) e;
		return (m.idMateria == this.idMateria) ? true : false;
	}
	@Override
	public int compareTo(RelacionPM p) {
		if(!p.equals(this))
		return 1;
		
		return 0;
	}

}
