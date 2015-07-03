package com.Unistmo.uHorarios.Modulos.MenuPrincipal;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class FrameMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8764507406757230716L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnUhorarios;
	private JMenu mnProfesores;
	private JMenu mnMaterias;
	private JMenuItem mntmAbrirModulo;
	private JMenuItem mntmAbrirModulo_1;
	private JButton btnProfesores;
	private JButton btnMaterias;
	private JButton btnGeneracionDeHorarios;
	private static FrameMenu instance=null; 
	private ControlMenu m;

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

	public static FrameMenu getInstance(){
		if(instance==null){
			instance=new FrameMenu();
		}
		return instance;
	}
	/**
	 * Create the frame.
	 */
	private FrameMenu() {
		setTitle("Menu Principal- uHorarios");
		setName("Menu Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 477);
		this.setLocationRelativeTo(null);
		 m=new ControlMenu(this);
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnUhorarios = new JMenu("uHorarios");
		menuBar.add(mnUhorarios);
		
		mnProfesores = new JMenu("Profesores");
		menuBar.add(mnProfesores);
		
		mntmAbrirModulo = new JMenuItem("Abrir Modulo");
		mnProfesores.add(mntmAbrirModulo);
		
		mnMaterias = new JMenu("Materias");
		menuBar.add(mnMaterias);
		
		mntmAbrirModulo_1 = new JMenuItem("abrir modulo");
		mnMaterias.add(mntmAbrirModulo_1);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(139, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnProfesores = new JButton("Profesores");
		btnProfesores.setFocusPainted(false);
		btnProfesores.setOpaque(false);
		btnProfesores.setVerticalTextPosition(SwingConstants.TOP);
		btnProfesores.setContentAreaFilled(false);
		btnProfesores.setIcon(new ImageIcon("C:\\Users\\COSI\\Dropbox\\Teacher_Reading_64.png"));
		btnProfesores.setForeground(new Color(255, 215, 0));
		btnProfesores.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnProfesores.setBackground(new Color(255, 215, 0));
		btnProfesores.addActionListener(m);
		btnMaterias = new JButton("Materias");
		btnMaterias.setFocusPainted(false);
		btnMaterias.setOpaque(false);
		btnMaterias.setContentAreaFilled(false);
		btnMaterias.setIcon(new ImageIcon("C:\\Users\\COSI\\Dropbox\\Pencil_writing_on_a_paper_sheet_64.png"));
		btnMaterias.setForeground(new Color(255, 215, 0));
		btnMaterias.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnMaterias.setBackground(new Color(255, 215, 0));
		btnMaterias.addActionListener(m);
		btnGeneracionDeHorarios = new JButton("Horarios");
		btnGeneracionDeHorarios.setFocusPainted(false);
		btnGeneracionDeHorarios.setOpaque(false);
		btnGeneracionDeHorarios.setContentAreaFilled(false);
		btnGeneracionDeHorarios.setIcon(new ImageIcon("C:\\Users\\COSI\\Dropbox\\Time_planning_64.png"));
		btnGeneracionDeHorarios.setForeground(new Color(255, 215, 0));
		btnGeneracionDeHorarios.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnGeneracionDeHorarios.setBackground(new Color(255, 215, 0));
		btnGeneracionDeHorarios.setToolTipText("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnGeneracionDeHorarios, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
						.addComponent(btnMaterias, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
						.addComponent(btnProfesores, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
					.addGap(480))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(26)
					.addComponent(btnProfesores, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnMaterias, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnGeneracionDeHorarios, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		gl_contentPane.linkSize(SwingConstants.VERTICAL, new Component[] {btnProfesores, btnMaterias, btnGeneracionDeHorarios});
		contentPane.setLayout(gl_contentPane);
	}

	/**
	 * @return the contentPane
	 */
	public JPanel getContentPane() {
		return contentPane;
	}

	/**
	 * @return the mnUhorarios
	 */
	public JMenu getMnUhorarios() {
		return mnUhorarios;
	}

	/**
	 * @return the mnProfesores
	 */
	public JMenu getMnProfesores() {
		return mnProfesores;
	}

	/**
	 * @return the mnMaterias
	 */
	public JMenu getMnMaterias() {
		return mnMaterias;
	}

	/**
	 * @return the mntmAbrirModulo
	 */
	public JMenuItem getMntmAbrirModulo() {
		return mntmAbrirModulo;
	}

	/**
	 * @return the mntmAbrirModulo_1
	 */
	public JMenuItem getMntmAbrirModulo_1() {
		return mntmAbrirModulo_1;
	}

	/**
	 * @return the btnProfesores
	 */
	public JButton getBtnProfesores() {
		return btnProfesores;
	}

	/**
	 * @return the btnMaterias
	 */
	public JButton getBtnMaterias() {
		return btnMaterias;
	}

	/**
	 * @return the btnGeneracionDeHorarios
	 */
	public JButton getBtnGeneracionDeHorarios() {
		return btnGeneracionDeHorarios;
	}
}
