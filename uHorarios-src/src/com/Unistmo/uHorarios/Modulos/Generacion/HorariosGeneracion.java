package com.Unistmo.uHorarios.Modulos.Generacion;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class HorariosGeneracion extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4599039268308027444L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HorariosGeneracion dialog = new HorariosGeneracion();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public HorariosGeneracion() {
		setBounds(100, 100, 847, 404);

	}

}
