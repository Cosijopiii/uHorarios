package com.Unistmo.uHorarios.Modulos.Materias;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.Unistmo.uHorarios.Modulos.RecursosConstantes;

public class ControlMaterias extends QueryMaterias implements ActionListener,KeyListener,RecursosConstantes,ListSelectionListener{

	private PanelMaterias comp;
	
	public ControlMaterias(PanelMaterias comp){
		this.comp=comp;
	}
	public void Semestre(Object d) {
		comp.getListModel().removeAllelements();
		if (d.equals("Todos"))
			comp.getListModel().setMaterias(Select_all_Materias());
		else
			comp.getListModel().setMaterias(Select_all_Materias_Semestre(Integer.valueOf(d.toString())));
	}
	public void  GuardarMateria(){		
		if(!comp.getTxtClave().getText().trim().isEmpty() && !comp.getTxtNombre().getText().trim().isEmpty())
			
			if(comp.getTxtClave().getText().matches(PATTERN_CODIGO_MATERIA)){
				Materia m=Select_Materia(Integer.parseInt(comp.getTxtClave().getText()));
				if(m==null && comp.getTxtClave().isEnabled()){
					Insert_Materia(Integer.parseInt(comp.getTxtClave().getText()),comp.getTxtNombre().getText(),Integer.parseInt(comp.getCmbSemestre().getSelectedItem().toString()));
					AddToList(Integer.parseInt(comp.getTxtClave().getText()));
				}
				if(m!=null && !comp.getTxtClave().isEnabled()){
					
					comp.getListModel().removeElement(comp.getList().getSelectedIndex());
					Update_Materia(Integer.parseInt(comp.getTxtClave().getText()),comp.getTxtNombre().getText(),Integer.parseInt(comp.getCmbSemestre().getSelectedItem().toString()));
					AddToList(Integer.parseInt(comp.getTxtClave().getText()));
					comp.getTxtClave().setEnabled(false);			
				}
				if(m!=null && comp.getTxtClave().isEnabled()){
					JOptionPane.showMessageDialog(null,
							MENSAJE_JOPTIONPANE_ERROR_MATERIA_DUPLICADA[0],
							MENSAJE_JOPTIONPANE_ERROR_MATERIA_DUPLICADA[1],
							JOptionPane.ERROR_MESSAGE);
				}
				
			}
		else
		JOptionPane.showMessageDialog(null,MENSAJE_JOPTIONPANE_ERROR_GUARDAR[0],MENSAJE_JOPTIONPANE_ERROR_GUARDAR[1],JOptionPane.ERROR_MESSAGE);
	}
	public void Eliminar(){
	
		if(!comp.getTxtClave().getText().isEmpty()&& !comp.getTxtClave().isEnabled()){
			
			int opcion=JOptionPane.showConfirmDialog(null,
					MENSAJE_JOPTIONPANE_ALERTA_ELIMINAR_MATERIA[0]
							+" "+ comp.getTxtNombre().getText(),
					MENSAJE_JOPTIONPANE_ALERTA_ELIMINAR_MATERIA[1],
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (opcion == JOptionPane.YES_OPTION) {
				
				int seleccion =comp.getList().getSelectedIndex();
					if(seleccion!=-1){
						comp.getListModel().removeElement(seleccion);
						Delete_Materia(Integer.parseInt(comp.getTxtClave().getText()));
						limpiarCampos();
					}
				
			}
			
			
		}
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==comp.getCmbSemestresList())
			Semestre(comp.getCmbSemestresList().getSelectedItem());
		if(e.getSource()==comp.getBtnGuardar())
			GuardarMateria();
		if(e.getSource()==comp.getBtnNuevo())
			limpiarCampos();
		if(e.getSource()==comp.getBtnEliminar())
			Eliminar();
	}
	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		 MostrarElementos();
		
	}
	public void AddToList(int clv) {
		comp.getListModel().addElement(this.Select_Materia(clv));
	}
	
	public void limpiarCampos(){
		comp.getTxtClave().setText("");
		comp.getTxtNombre().setText("");
		comp.getTxtClave().setEnabled(true);
		
	}
	public void MostrarElementos(){
		int seleccion =comp.getList().getSelectedIndex();
		if(seleccion!=-1){
		Materia m=comp.getListModel().getElementP(seleccion);
		comp.getTxtClave().setText(String.valueOf(m.getId()));
		comp.getTxtNombre().setText(m.getNombre());
		comp.getCmbSemestre().setSelectedIndex(RecursosConstantes.Buscar(String.valueOf(m.getSemestre()),RecursosConstantes.SEMESTRES));
		comp.getTxtClave().setEnabled(false);
		}
		
		
	}
	

}
