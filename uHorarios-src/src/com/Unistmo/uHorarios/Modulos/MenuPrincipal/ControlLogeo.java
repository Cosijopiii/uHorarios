package com.Unistmo.uHorarios.Modulos.MenuPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class ControlLogeo implements ActionListener {

	public PanelLogeo login;
	public ControlLogeo(PanelLogeo login) {
	
		this.login=login;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==login.getOkButton()){
		
		if(login.getUser().getText().equals("qwe")&&String.valueOf(login.getPassword().getPassword()).equals("123")){
			login.setVisible(false);
			login.dispose();
			FrameMenu.getInstance().setVisible(true);			
		}else{
			JOptionPane.showMessageDialog(login,"\tDatos incorrectos","Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	if(e.getSource()==login.getCancelButton()){
		System.exit(0);
	}
	}

}
