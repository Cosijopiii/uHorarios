package com.Unistmo.Engine.ag;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Unistmo.ConnectionToDB;
import com.Unistmo.uHorarios.Modulos.Materias.Materia;
import com.Unistmo.uHorarios.Modulos.Profesores.Profesor;

public class QueryGenetic extends ConnectionToDB {
	/**
	 * Tabla virtual donde se vuelcal los datos conseguidos de la base de datos
	 */
	protected ResultSet rs;
	/**
	 * Coleccion de datos de tipo profesor que contiene los datos de todos los
	 * profesores de la tabla Profesores de la base de datos
	 */
	protected ArrayList<Profesor> profesor = new ArrayList<Profesor>();
	/**
	 * Colecion de datos de tipo profesor que contiene los datos de todos las
	 * materias de la tabla materias de la base de datos
	 */
	protected ArrayList<Materia> materias = null;

	/**
	 * Constructor por defecto
	 */
	public QueryGenetic() {

	}

	/**
	 * Consigue todas las aterias de la base de datos
	 * 
	 * @return Coleccion de datos en un ArrayList de tipo Materias
	 * @throws SQLException
	 *             Si ocurrio algun error en la base de datos
	 */
	protected ArrayList<Materia> Select_all_Materias() throws SQLException {
		if (materias == null) materias = new ArrayList<Materia>();
		materias.clear();
		PreparedStatement ps = getConexion().prepareStatement("select * from materia");
		rs = ps.executeQuery();
		while (rs.next()) materias.add(new Materia(rs.getInt(1), rs.getString(2), rs.getInt(3)));
		return materias;
	}

	/**
	 * Consigue a todos los profesores de la base de datos
	 * 
	 * @return Coleccion de datos en un ArrayList de tipo profesores
	 * @throws SQLException
	 *             si ocurrio algun error en la base de datos
	 */
	protected ArrayList<Profesor> Select_all_Profesor() throws SQLException {
		if (profesor == null) profesor = new ArrayList<Profesor>();
		profesor.clear();
		PreparedStatement ps = getConexion().prepareStatement("select * from Profesor");
		rs = ps.executeQuery();
		while (rs.next())
			profesor.add(new Profesor(rs.getString(2), rs.getString(6), rs.getString(3), rs.getInt(7), rs.getString(5),rs.getDate(4), rs.getString(1), rs.getInt(8),rs.getString(9), rs.getString(10)));
		return profesor;
	}

}
