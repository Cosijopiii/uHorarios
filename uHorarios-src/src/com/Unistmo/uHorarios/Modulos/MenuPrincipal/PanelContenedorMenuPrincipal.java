package com.Unistmo.uHorarios.Modulos.MenuPrincipal;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.JMenuBar;

import java.awt.Color;
import javax.swing.JPanel;



import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Cursor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
public class PanelContenedorMenuPrincipal {

	private JFrame frmUprofesores;
	private JMenuBar menuBar;

	private JMenu mnUhorarios;
	private JMenuItem mntmSalir;
	private JMenu mnProfesores;
	private JMenu mnMaterias;
	private JMenu mnHorarios;
	private JMenu mnConsultas;
	private JMenu mnReportes;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JLabel lblVistaRapida;
	
	


	public PanelContenedorMenuPrincipal() {

		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	

		private void initialize() {
		try {
			JFrame.setDefaultLookAndFeelDecorated(true);
			JDialog.setDefaultLookAndFeelDecorated(true);
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		frmUprofesores = new JFrame();
		frmUprofesores.getContentPane().setBackground(new Color(192, 192, 192));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(139, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("/Users/Cosijopii/uHorarios/uHorarios-src/icons/uHorariosIcono.png"));
		
		panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		GroupLayout groupLayout = new GroupLayout(frmUprofesores.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1064, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(56)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 968, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(9, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(42)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE)
					.addGap(10))
		);
		
		lblVistaRapida = new JLabel("Vista rapida");
		lblVistaRapida.setForeground(new Color(139, 0, 0));
		lblVistaRapida.setFont(new Font("Dialog", Font.PLAIN, 36));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addComponent(lblVistaRapida)
					.addContainerGap(897, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(14)
					.addComponent(lblVistaRapida)
					.addContainerGap(154, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frmUprofesores.getContentPane().setLayout(groupLayout);
		frmUprofesores.setTitle("uHorarios");
		frmUprofesores.setCursor(Cursor
				.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frmUprofesores.setBounds(100, 100, 1081, 660);
		frmUprofesores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frmUprofesores.setLocationRelativeTo(null);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 0, 0));
		frmUprofesores.setJMenuBar(menuBar);
		
		mnUhorarios = new JMenu("uHorarios");
		menuBar.add(mnUhorarios);
		
		mntmSalir = new JMenuItem("Salir");
		mnUhorarios.add(mntmSalir);
		
		mnProfesores = new JMenu("Profesores");
		menuBar.add(mnProfesores);
		
		mnMaterias = new JMenu("Materias");
		menuBar.add(mnMaterias);
		
		mnHorarios = new JMenu("Horarios");
		menuBar.add(mnHorarios);
		
		mnConsultas = new JMenu("Consultas");
		menuBar.add(mnConsultas);
		
		mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		/*
		 * TODO implementar control para los reportes unicamente
		 */
		
		
	}
}
