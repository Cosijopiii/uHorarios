package com.Unistmo.uHorarios.Modulos.Profesores;
import java.sql.CallableStatement;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.Unistmo.uHorarios.*;
public class QueryProfesores extends ConectorToDB{
	protected ResultSet rs;
	protected ArrayList<Profesor>profesor=new ArrayList<Profesor>();
	protected SimpleDateFormat to = new SimpleDateFormat("yyyy-MM-dd");
	protected QueryProfesores(){
	}
	protected boolean Insert_Profesor(String nombre,String foto,String correo,int nCubo,
			String telefono, Date fNacimiento,String id,int edificio, String carrera ){
		try {
			CallableStatement cs = getConexion().prepareCall("{call Insert_Profesor(?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, id);
			cs.setString(2, nombre);
			cs.setString(3, correo);
			cs.setDate(4, fNacimiento);
			cs.setString(5,telefono);
			cs.setString(6, foto);
			cs.setInt(7, nCubo);
			cs.setInt(8, edificio);
			cs.setString(9, carrera);
			cs.execute();
			cs.close();
			return true;
		} catch (SQLException se) {
			// se.printStackTrace();
			JOptionPane.showMessageDialog(null,
					"error al dar de alta profesores " + se);
		}
		return false;	
	}
	protected ArrayList<Profesor> Select_Profesor(){
		
		try {
			//Profesor(String nombre,String foto,String correo,int nCubo,
			//String telefono, Date fNacimiento,String id,int edificio, String carrera ){
				
			PreparedStatement ps = getConexion().prepareStatement("select * from Profesor");
			rs=ps.executeQuery();
			while(rs.next()){
			//	profesor.add(new profesor()));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		return null;
	}
	
	
}
