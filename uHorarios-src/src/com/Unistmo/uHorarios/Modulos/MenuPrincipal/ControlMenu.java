package com.Unistmo.uHorarios.Modulos.MenuPrincipal;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.Unistmo.uHorarios.Modulos.Materias.PanelMaterias;
import com.Unistmo.uHorarios.Modulos.Profesores.PanelProfesores;

public class ControlMenu implements ActionListener{
	FrameMenu  m;
	public ControlMenu(FrameMenu m){
		this.m=m;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==m.getBtnProfesores()){
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PanelProfesores.getInstance().setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
		}
		if(e.getSource()==m.getBtnMaterias()){
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						PanelMaterias.getInstance().setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
			
		}
	}
}
