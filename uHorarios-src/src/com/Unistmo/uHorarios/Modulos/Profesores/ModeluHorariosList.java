package com.Unistmo.uHorarios.Modulos.Profesores;

import java.util.*;
import javax.swing.AbstractListModel;

@SuppressWarnings({ "serial", "rawtypes" })
public class ModeluHorariosList extends AbstractListModel{
	
	private ArrayList<Profesor> profesores= new ArrayList<Profesor>();

	@Override
	public Object getElementAt(int index) {
		 Profesor p = profesores.get(index);
		   return p.getNombre();
	}
	@Override
	public int getSize() {	
		return profesores.size();
	}
	
	

}
