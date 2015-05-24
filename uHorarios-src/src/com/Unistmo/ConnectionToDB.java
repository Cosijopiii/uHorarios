package com.Unistmo;
import java.sql.*;
public class ConnectionToDB {
	/**
	 * Nombre de la base de datos MySQL
	 */
	protected static final String DB = "uHorarios";
	/**
	 * Nombre del usuario de la base de datos MySQL
	 */
	protected static final String USER = "root";
	/**
	 * Contraseña del usuario de la base de datos MySQL
	 */
	protected static final String PASSWORD = "ouqqwpwruq";
	/**
	 * URL de la base de datos  MySQL
	 */
	protected static final String URL = "jdbc:mysql://127.0.0.1:3306/" +DB;
	/**
	 * Conector de la base de datos MySQL
	 */
	private Connection conn = null;
	/**
	 * Conexion con la base de datos MySQL
	 */
	public ConnectionToDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (Exception e) {e.printStackTrace();
    	}		
	}
	/**
	 * Consigue la conexion con la base de datos MySQL
	 * @return Conexion con la base de datos MySQL
	 */
	protected Connection getConexion() {
	return	conn;
	}
}

