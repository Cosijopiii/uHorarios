package com.Unistmo.uHorarios.Modulos.Profesores;

import java.util.*;

import javax.swing.AbstractListModel;

@SuppressWarnings({ "serial", "rawtypes" })
public class ModeloListProfesores extends AbstractListModel{
	private ArrayList<Profesor>  profesores= new ArrayList<Profesor>();

	@Override
	public Object getElementAt(int index) {
		 Profesor p = profesores.get(index);
		   return p.getNombre();
	}
	@Override
	public int getSize() {	
		return profesores.size();
	}
	public void addElement(Profesor item){
		if (!buscar(item.getId())) {
			profesores.add(item);
			fireIntervalAdded(this, getSize(), getSize() + 1);
		}
	}
	public void removeElement(int index) {
		if (index != -1) {
			profesores.remove(index);
			if (index == 0) {
				fireIntervalRemoved(this, getSize(), getSize());
			} else {
				fireIntervalRemoved(this, getSize(), getSize() - 1);
			}
		}
	}
	public Profesor getElementP(int index){
		return profesores.get(index);
	}
	/**
	 * @return the profesores
	 */
	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}
	/**
	 * @param profesores the profesores to set
	 */
	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}
	
	public boolean buscar(String clv){
		
		for (Profesor profesor : profesores) {
			if(profesor.getId().equals(clv)){	
				return true;
			}	
		}
		return false;
	}
	
	
	
	

}
