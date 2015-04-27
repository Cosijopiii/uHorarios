package com.Unistmo.uHorarios.Modulos.Materias;

import java.util.*;

import javax.swing.AbstractListModel;

/**
 * Representa el modelo que se aplica a un Jlist ,
 * Modificado para el uso con la base de datos y
 * trabaja en conjunto con la clase @see Materia
 * 
 * @author Cosijopii García García
 * @version 1.0
 */
@SuppressWarnings({ "serial", "rawtypes" })
public class ModeloListMaterias extends AbstractListModel{
	/**
	 * Arreglo donde se guardan todas las materias en tiempo de ejecucion
	 */
	private ArrayList<Materia>  Materias= new ArrayList<Materia>();

	@Override
	public Object getElementAt(int index) {
		Materia m = Materias.get(index);
		   return m.getNombre();
	}
	@Override
	public int getSize() {	
		return Materias.size();
	}
	/**
	 * Resibe una instancia de materia y la agrega a la lista
	 * @param item materia a agregar en la lista
	 */
	public void addElement(Materia item){
		if (!buscar(item.getId())) {
			Materias.add(item);
			fireIntervalAdded(this, getSize(), getSize() + 1);
		}
	}
	/**
	 * Remueve un elemento de la lista 
	 * @param index indice el cual se eliminara de la lista
	 */
	public void removeElement(int index) {
		if (index != -1) {
			Materias.remove(index);
			if (index == 0) {
				fireIntervalRemoved(this, getSize(), getSize());
			} else {
				fireIntervalRemoved(this, getSize(), getSize() - 1);
			}
		}
	}
	/**
	 * Retorna una materia que esta en la lista
	 * @param index posicion en la que esta la materia
	 * @return una instacia de la materia
	 */
	public Materia getElementP(int index){
		return Materias.get(index);
	}
	/**
	 * Busca si existe cierta materia en el arreglo de materias
	 * @param clv clave de la materia 
	 * @return true is existe en la lista 
	 * false en caso contrario
	 */
	public boolean buscar(int clv){
		
		for (Materia materia : Materias) {
			if(materia.getId()==clv){	
				return true;
			}	
		}
		return false;
	}
	/**
	 * @return the materias
	 */
	public ArrayList<Materia> getMaterias() {
		return Materias;
	}
	/**
	 * @param materias the materias to set
	 */
	public void setMaterias(ArrayList<Materia> materias) {
		Materias = materias;
	}
	

}
