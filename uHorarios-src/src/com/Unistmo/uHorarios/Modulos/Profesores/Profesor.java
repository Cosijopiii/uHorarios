package com.Unistmo.uHorarios.Modulos.Profesores;

import java.sql.Date;
/**
 * Clase profesor
 * Contiene los datos genericos de un profesor
 * 
 * @author Cosijopii García García
 * @version 1.0
 */
public class Profesor {
	/**
	 * Nombre del profesor con apellidos
	 */
	private  String nombre;
	/**
	 * Ruta absoluta del archivo de imagen, foto del profesor
	 */
	private String foto;
	/**
	 * Correo electronico del profesor
	 */
	private String correo;
	/**
	 * Numero de cubiculo en el que esta alojado el profesor
	 */
	private int nCubo;
	/**
	 * Numero telefonico del profesor
	 */
	private String telefono;
	/**
	 * Fecha de nacimiento del profesor
	 * @see java.sql.Date
	 */
	private Date fNacimiento;
	/**
	 * Clave unica del profesor , Nomina del profesor
	 */
	private String id;
	/**
	 * Edificio al que pertenece el Profesor solo hay 2 ; E1 o E2
	 *  @see com.Unistmo.uHorarios.Modulos.RecursosConstantes
	 */
	private int edificio;
	/**
	 * Carrera a la cual pertenece el profesor
	 * @see com.Unistmo.uHorarios.Modulos.RecursosConstantes
	 */
	private String carrera;
	/**
	 * Define la hora de entrada del profesor al horario de clases
	 */
	private String HoraEntrada;
	/**
	 * Constructor por defecto
	 */
	public Profesor(){}
	/**
	 * @param nombre Nombre del profesor
	 * @param foto  Ruta absoluta de la imagen del profesor
	 * @param correo Correo Electronico del profesor
	 * @param nCubo Numero de cubiculo del profesor
	 * @param telefono Numero telefonico del profesor
	 * @param fNacimiento Fecha de nacimineto del profesor
	 * @param id numero de nomina del profesor o clave
	 * @param edificio Numero de edificio al cual pertecene el profesor
	 * @param carrera Carrera al cual pertenece el profesor
	 * @param HoraEntrada Hora de entrada del profesor 
	 */
	public Profesor(String nombre,String foto,String correo,int nCubo,
			String telefono, Date fNacimiento,String id,int edificio, String carrera,String HoraEntrada){
		
		this.nombre=nombre;
		this.foto=foto;
		this.correo=correo;
		this.nCubo=nCubo;
		this.telefono=telefono;
		this.fNacimiento=fNacimiento;
		this.id=id;
		this.edificio=edificio;
		this.carrera=carrera;
		this.HoraEntrada=HoraEntrada;
	}

	/**
	 * @return the horaEntrada
	 */
	public String getHoraEntrada() {
		return HoraEntrada;
	}
	/**
	 * @param horaEntrada the horaEntrada to set
	 */
	public void setHoraEntrada(String horaEntrada) {
		HoraEntrada = horaEntrada;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}

	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
	}

	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	/**
	 * @return the nCubo
	 */
	public int getnCubo() {
		return nCubo;
	}

	/**
	 * @param nCubo the nCubo to set
	 */
	public void setnCubo(int nCubo) {
		this.nCubo = nCubo;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the fNacimiento
	 */
	public Date getfNacimiento() {
		return fNacimiento;
	}

	/**
	 * @param fNacimiento the fNacimiento to set
	 */
	public void setfNacimiento(Date fNacimiento) {
		this.fNacimiento = fNacimiento;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the edificio
	 */
	public int getEdificio() {
		return edificio;
	}

	/**
	 * @param edificio the edificio to set
	 */
	public void setEdificio(int edificio) {
		this.edificio = edificio;
	}

	/**
	 * @return the carrera
	 */
	public String getCarrera() {
		return carrera;
	}

	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	
}
