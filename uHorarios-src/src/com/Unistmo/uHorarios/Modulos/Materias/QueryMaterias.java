package com.Unistmo.uHorarios.Modulos.Materias;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.Unistmo.ConnectionToDB;

public class QueryMaterias extends ConnectionToDB {
	protected ArrayList<Materia> materias=null;
	protected ResultSet rs;
	public QueryMaterias(){
		
	}
	protected ArrayList<Materia>Select_all_Materias_Semestre(int sem){
		if (materias == null) {
			materias = new ArrayList<Materia>();
		}
		materias.clear();
		try {
			PreparedStatement ps = getConexion().prepareStatement("select * from materia where idSemestre =?");
			ps.setInt(1, sem);
			rs = ps.executeQuery();
			while (rs.next()) {
				materias.add(new Materia(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return materias;
	}
	protected ArrayList<Materia> Select_all_Materias() {
		if (materias == null) {
			materias = new ArrayList<Materia>();
		}
		materias.clear();
		try {
			PreparedStatement ps = getConexion().prepareStatement("select * from materia");
			rs = ps.executeQuery();
			while (rs.next()) {
				materias.add(new Materia(rs.getInt(1), rs.getString(2), rs
						.getInt(3)));
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return materias;
	}	
	protected Materia Select_Materia(int id){
		Materia m=null;
		try{
			PreparedStatement ps = getConexion().prepareStatement("select * from materia where idMateria=?");
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while(rs.next()){
				
				m=new Materia(rs.getInt(1),rs.getString(2),rs.getInt(3));
			}
		}catch (Exception e) {
			e.printStackTrace();
		 return null;	
		}
		return m;
	}
	
	protected boolean Insert_Materia(int id,String nombre,int semestre){
		try{
			CallableStatement cs =getConexion().prepareCall("{call Insert_Materia(?,?,?)}");	
			cs.setInt(1, id);
			cs.setString(2, nombre);
			cs.setInt(3, semestre);
			cs.execute();
			cs.close();
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return false;
	}
	protected boolean Update_Materia(int idMateria,String NombreMateria,int idSemestre){		
		try {
			CallableStatement cs = getConexion().prepareCall("{call Update_Materia(?,?,?)}");
			cs.setInt(1, idMateria);
			cs.setString(2, NombreMateria);
			cs.setInt(3, idSemestre);
			cs.execute();
			cs.close();
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	protected boolean Delete_Materia(int clv){
		try {
			CallableStatement cs = getConexion().prepareCall("{call delete_Materia(?)}");
			cs.setInt(1, clv);
			cs.execute();
			cs.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

}
