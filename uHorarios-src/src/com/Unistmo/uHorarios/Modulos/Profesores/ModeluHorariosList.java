package com.Unistmo.uHorarios.Modulos.Profesores;

import java.util.*;

import javax.swing.AbstractListModel;

@SuppressWarnings({ "serial", "rawtypes" })
public class ModeluHorariosList extends AbstractListModel{
	private ArrayList<Profesor> profesores;

	public ModeluHorariosList(){
		profesores= new ArrayList<Profesor>();
	}
	
	
	@Override
	public Object getElementAt(int index) {
		 Profesor p = profesores.get(index);
		   return p.getNombre();
	}
	@Override
	public int getSize() {	
		return profesores.size();
	}
	public void addElement(Object item){
		profesores.add((Profesor) item);
		this.fireIntervalAdded(this, getSize(),getSize()+1);
	}
	public void removeElement(int index){
		profesores.remove(index);
		this.fireIntervalRemoved(this, getSize(), getSize()-1);
	}
	public Profesor getElementP(int index){
		return profesores.get(index);
	}

}
