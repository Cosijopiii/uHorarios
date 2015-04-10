package com.Unistmo.uHorarios;
import java.sql.*;
public class ConectorToDB {
	private static final String DB = "uHorarios";
	private static final String USER = "root";
	private static final String PASSWORD = "ouqqwpwruq";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/" +DB;
	private Connection conn = null;
	public ConectorToDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
			
		}	
	}
	public Connection getConexion() {
	return	conn;
	}
}

