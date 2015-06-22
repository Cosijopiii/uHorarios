package com.Unistmo.uHorarios.Modulos.Profesores;

import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import com.Unistmo.ConnectionToDB;

/**
 * Esta clase contiene los metodos para la comunicacion con la tabla profesores
 * de la base de datos MySql.
 * 
 * 
 * @author Cosijopii garcia garcia
 * @version 1.0
 */
public class QueryProfesores extends ConnectionToDB {
	/**
	 * Tabla virtual donde se vuelcal los datos conseguidos de la base de datos
	 */
	protected ResultSet rs;
	/**
	 * Coleccion de datos de tipo profesor que contiene los datos de todos los
	 * profesores de la tabla Profores
	 */
	protected ArrayList<Profesor> profesor = new ArrayList<Profesor>();
	/**
	 * Establece un formato de fecha para la base de datos MySql
	 */
	protected SimpleDateFormat to = new SimpleDateFormat("yyyy-MM-dd");
	/**
	 * Establece un formato de fecha para mostrarsela al usurio generico
	 */
	protected SimpleDateFormat from = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Contructor por defecto
	 */
	protected QueryProfesores() {
	}

	/**
	 * Inserta un nuevo profesor en la tabla profesores en la base de datos
	 * 
	 * @param nombre
	 * @param foto
	 * @param correo
	 * @param nCubo
	 * @param telefono
	 * @param fNacimiento
	 * @param id
	 * @param edificio
	 * @param carrera
	 * @param HoraEntrada
	 * @return True si la inserccion fue correcta
	 * @throws SQLException
	 *             si ocurrio algun error en la base de datos
	 */
	protected boolean Insert_Profesor(String nombre, String foto,
			String correo, int nCubo, String telefono, Date fNacimiento,
			String id, int edificio, String carrera, String HoraEntrada)
			throws SQLException {

		CallableStatement cs = getConexion().prepareCall(
				"{call Insert_Profesor(?,?,?,?,?,?,?,?,?,?)}");
		cs.setString(1, id);
		cs.setString(2, nombre);
		cs.setString(3, correo);
		cs.setDate(4, fNacimiento);
		cs.setString(5, telefono);
		cs.setString(6, foto);
		cs.setInt(7, nCubo);
		cs.setInt(8, edificio);
		cs.setString(9, carrera);
		cs.setString(10, HoraEntrada);
		cs.execute();
		cs.close();
		return true;
	}

	/**
	 * Actuliza un registro de la tabla profesores
	 * 
	 * @param nombre
	 * @param foto
	 * @param correo
	 * @param nCubo
	 * @param telefono
	 * @param fNacimiento
	 * @param id
	 * @param edificio
	 * @param carrera
	 * @param HoraEntrada
	 * @return True si la actualizacion es exitosa
	 * @throws SQLException
	 *             si ocurrio algun error en la base de datos
	 */
	protected boolean Update_Profesor(String nombre, String foto,
			String correo, int nCubo, String telefono, Date fNacimiento,
			String id, int edificio, String carrera, String HoraEntrada)
			throws SQLException {

		CallableStatement cs = getConexion().prepareCall(
				"{call Update_Profesor(?,?,?,?,?,?,?,?,?,?)}");
		cs.setString(1, id);
		cs.setString(2, nombre);
		cs.setString(3, correo);
		cs.setDate(4, fNacimiento);
		cs.setString(5, telefono);
		cs.setString(6, foto);
		cs.setInt(7, nCubo);
		cs.setInt(8, edificio);
		cs.setString(9, carrera);
		cs.setString(10, HoraEntrada);
		cs.execute();
		cs.close();
		return true;

	}

	/**
	 * Elimina un registro de la tabla profesores
	 * 
	 * @param clv
	 * @return true si el profesor fue eliminado con exito
	 * @throws SQLException
	 *             si ocurrio algun error en la base de datos
	 */
	protected boolean Delete_Profesor(String clv) throws SQLException {

		CallableStatement cs = getConexion().prepareCall(
				"{call delete_Profesor(?)}");
		cs.setString(1, clv);
		cs.execute();
		cs.close();

		return true;
	}

	/**
	 * Consigue a todos los profesores de la base de datos
	 * 
	 * @return Coleccion de datos en un ArrayList de tipo profesores
	 * @throws SQLException
	 *             si ocurrio algun error en la base de datos
	 */
	protected ArrayList<Profesor> Select_all_Profesor() throws SQLException {

		PreparedStatement ps = getConexion().prepareStatement(
				"select * from Profesor");
		rs = ps.executeQuery();
		while (rs.next()) {
			profesor.add(new Profesor(rs.getString(2), rs.getString(6), rs
					.getString(3), rs.getInt(7), rs.getString(5),
					rs.getDate(4), rs.getString(1), rs.getInt(8), rs
							.getString(9), rs.getString(10)));
		}

		return profesor;
	}

	/**
	 * consigue un profesor espesificado en el parametro CLV
	 * 
	 * @param clv
	 * @return un instancia del tipo Profesor
	 * @throws SQLException
	 *             si ocurrio algun error en la base de datos
	 */
	protected Profesor Select_Profesor(String clv) throws SQLException {
		Profesor p = null;

		PreparedStatement ps = getConexion().prepareStatement(
				"select * from Profesor where idProfesor=?");
		ps.setString(1, clv);
		rs = ps.executeQuery();
		while (rs.next()) {
			p = new Profesor(rs.getString(2), rs.getString(6), rs.getString(3),
					rs.getInt(7), rs.getString(5), rs.getDate(4),
					rs.getString(1), rs.getInt(8), rs.getString(9),
					rs.getString(10));
		}
		return p;
	}

}
