package com.Unistmo.uHorarios.Modulos.MenuPrincipal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class FrameMenu extends JFrame {

	private JPanel contentPane;
	private JPanel panelBotones;
	private JButton btnProfesores;
	private JButton btnMaterias;
	private JButton btnGeneracion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMenu frame = new FrameMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrameMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 477);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panelBotones = new JPanel();
		panelBotones.setBackground(SystemColor.textHighlight);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panelBotones, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(335, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panelBotones, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
		);
		
		btnProfesores = new JButton("Profesores");
		
		btnMaterias = new JButton("Materias");
		
		btnGeneracion = new JButton("Generacion");
		GroupLayout gl_panelBotones = new GroupLayout(panelBotones);
		gl_panelBotones.setHorizontalGroup(
			gl_panelBotones.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelBotones.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelBotones.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnGeneracion, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
						.addComponent(btnProfesores, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
						.addComponent(btnMaterias, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelBotones.setVerticalGroup(
			gl_panelBotones.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBotones.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnProfesores, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnMaterias, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnGeneracion, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(61, Short.MAX_VALUE))
		);
		panelBotones.setLayout(gl_panelBotones);
		contentPane.setLayout(gl_contentPane);
	}
}
