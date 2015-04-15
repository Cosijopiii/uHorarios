package com.Unistmo.uHorarios;
import java.sql.*;
public class ConectorToDB {
	protected static final String DB = "uHorarios";
	protected static final String USER = "root";
	protected static final String PASSWORD = "ouqqwpwruq";
	protected static final String URL = "jdbc:mysql://127.0.0.1:3306/" +DB;
	private Connection conn = null;
	public ConectorToDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (Exception e) {e.printStackTrace();
    	}		
	}
	protected Connection getConexion() {
	return	conn;
	}
}

