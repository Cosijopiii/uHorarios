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
	/**
	 * 
	 */
	protected ResultSet rs;
	protected ArrayList<Profesor>profesor=new ArrayList<Profesor>();
	protected SimpleDateFormat to = new SimpleDateFormat("yyyy-MM-dd");
	protected SimpleDateFormat from = new SimpleDateFormat("dd/MM/yyyy");

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
	protected boolean Update_Profesor(String nombre,String foto,String correo,int nCubo,String telefono, Date fNacimiento,String id,int edificio, String carrera ){
			try {
				CallableStatement cs = getConexion().prepareCall("{call Update_Profesor(?,?,?,?,?,?,?,?,?)}");
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
		
	protected boolean Delete_Profesor(String clv){
		try {
			CallableStatement cs = getConexion().prepareCall(
					"{call delete_Profesor(?)}");
			cs.setString(1, clv);
			cs.execute();
			cs.close();
		
	} catch (Exception e) {
		e.printStackTrace();
	}	
		return true;	
	}

	protected ArrayList<Profesor> Select_all_Profesor(){
		
		try {
	
			PreparedStatement ps = getConexion().prepareStatement("select * from Profesor");
			rs=ps.executeQuery();
			while(rs.next()){
				profesor.add(new Profesor(rs.getString(2),rs.getString(6),rs.getString(3),rs.getInt(7),rs.getString(5),rs.getDate(4),rs.getString(1),rs.getInt(8),rs.getString(9)));
			}
		} catch (Exception e) {
			e.printStackTrace();
		return null;
		}
				
		return profesor;
	}
	protected Profesor Select_Profesor(String clv){
		Profesor p=null;
		try {
			PreparedStatement ps = getConexion().prepareStatement("select * from Profesor where idProfesor=?");
			ps.setString(1, clv);
			rs=ps.executeQuery();
			while(rs.next()){
				 p=new Profesor(rs.getString(2),rs.getString(6),rs.getString(3),rs.getInt(7),rs.getString(5),rs.getDate(4),rs.getString(1),rs.getInt(8),rs.getString(9));
			}		
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return p;
	}
	public int Buscar(Object i,Object[] t)
	{
		for (int j = 0; j<t.length; j++) {
			if(i.equals(t[j])){
				return j;
			}
		}	
		return -1;
	}
}
