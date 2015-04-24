package com.Unistmo.uHorarios.Modulos.Profesores;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JList;

import java.awt.Color;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import com.Unistmo.uHorarios.RecursosConstantes;
import com.toedter.calendar.JDateChooser;


import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;
public class PanelProfesores extends JDialog implements RecursosConstantes{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4180401533603554976L;
	private JScrollPane scrollPaneProfesores;
	private JList<?> listProfesores;
	private JLabel lblFoto;
	private JLabel lblNombre;
	private JButton btnAgregarFoto;
	private JTextField txtNombre;
	private JLabel lblProfesores;
	private JLabel lblCorreo;
	private JTextField txtCorreo;
	private JLabel lblEdad;
	private JTextField txtTelefono;
	private JLabel lblTelefono;
	private JLabel lblNDeCubiculo;
	private JLabel lblClaveUnica;
	private JTextField txtClave;
	private JButton btnNuevo;
	private JButton btnGuardar;
	private JComboBox<?> cmbCubiculo;
	private JDateChooser dateChooser;
	private ControlProfesores listener;
	private JLabel lblEdificio;
	private JComboBox<?> cmbEdificio;
	private JLabel lblCarreraALa;
	private JComboBox<?> cmbCarreras;
	private ModeluHorariosList listModel;
	private JButton btnEliminar;
	private JLabel lblTituloProfesores;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelProfesores dialog = new PanelProfesores();
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
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public PanelProfesores() {
		getContentPane().setForeground(new Color(218, 165, 32));
		setTitle("uProfesores");
		listener =new ControlProfesores(this);
		setResizable(false);
		getContentPane().setBackground(new Color(128, 0, 0));
		setBounds(100, 100, 984, 484);
		
		scrollPaneProfesores = new JScrollPane();
		scrollPaneProfesores.setBorder(null);
		scrollPaneProfesores.setBackground(new Color(255, 255, 255));
		
		lblFoto = new JLabel("Seleccione una foto");
		lblFoto.setFont(new Font("DengXian", Font.PLAIN, 16));
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoto.setOpaque(true);
		lblFoto.setBackground(new Color(255, 255, 255));
		
		lblNombre = new JLabel("Nombre :");
		lblNombre.setForeground(new Color(255, 215, 0));
		lblNombre.setFont(new Font("DengXian", Font.PLAIN, 16));
		
		btnAgregarFoto = new JButton("Agregar foto");
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("DengXian", Font.PLAIN, 16));
		txtNombre.setColumns(10);
		
		lblProfesores = new JLabel("Profesores");
		lblProfesores.setForeground(new Color(255, 215, 0));
		lblProfesores.setFont(new Font("DengXian", Font.PLAIN, 32));
		
		lblCorreo = new JLabel("Correo electronico :");
		lblCorreo.setForeground(new Color(255, 215, 0));
		lblCorreo.setFont(new Font("DengXian", Font.PLAIN, 16));
		
		txtCorreo = new JTextField();
		txtCorreo.setFont(new Font("DengXian", Font.PLAIN, 16));
		txtCorreo.setColumns(10);
		
		lblEdad = new JLabel("Fecha de nacimiento :");
		lblEdad.setForeground(new Color(255, 215, 0));
		lblEdad.setFont(new Font("DengXian", Font.PLAIN, 16));
		
		txtTelefono = new JTextField();
		txtTelefono.setFont(new Font("DengXian", Font.PLAIN, 16));
		txtTelefono.setColumns(10);
		
		lblTelefono = new JLabel("Telefono :");
		lblTelefono.setForeground(new Color(255, 215, 0));
		lblTelefono.setFont(new Font("DengXian", Font.PLAIN, 16));
		
		lblNDeCubiculo = new JLabel("N\u00B0 de cubiculo :");
		lblNDeCubiculo.setForeground(new Color(255, 215, 0));
		lblNDeCubiculo.setFont(new Font("DengXian", Font.PLAIN, 16));
		
		lblClaveUnica = new JLabel("N\u00B0 de nomina: ");
		lblClaveUnica.setForeground(new Color(255, 215, 0));
		lblClaveUnica.setFont(new Font("DengXian", Font.PLAIN, 16));
		
		txtClave = new JTextField();
		txtClave.setFont(new Font("DengXian", Font.PLAIN, 16));
		txtClave.setColumns(10);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setForeground(Color.BLACK);
		btnNuevo.setFont(new Font("SansSerif", Font.PLAIN, 17));
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(Color.BLACK);
		btnGuardar.setFont(new Font("SansSerif", Font.PLAIN, 17));
	
		cmbCubiculo = new JComboBox<Object>();
		cmbCubiculo.setFont(new Font("DengXian", Font.PLAIN, 16));
		cmbCubiculo.setModel(new DefaultComboBoxModel(CUBICULOS));
		
		dateChooser = new JDateChooser();
		
		lblEdificio = new JLabel("Edificio: ");
		lblEdificio.setForeground(new Color(255, 215, 0));
		lblEdificio.setFont(new Font("DengXian", Font.PLAIN, 16));
		
		cmbEdificio = new JComboBox();
		cmbEdificio.setFont(new Font("DengXian", Font.PLAIN, 16));
		cmbEdificio.setModel(new DefaultComboBoxModel(EDIFICIOS));
		lblCarreraALa = new JLabel("Carrera a la que esta adscrito(a)");
		lblCarreraALa.setForeground(new Color(255, 215, 0));
		lblCarreraALa.setFont(new Font("DengXian", Font.PLAIN, 16));
		
		cmbCarreras = new JComboBox();
		cmbCarreras.setFont(new Font("DengXian", Font.PLAIN, 16));
		cmbCarreras.setModel(new DefaultComboBoxModel(CARRERAS));
		
	     btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(Color.BLACK);
		btnEliminar.setFont(new Font("SansSerif", Font.PLAIN, 17));

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPaneProfesores, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(159)
									.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
								.addComponent(btnNuevo, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
							.addGap(52)
							.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
							.addGap(241))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnAgregarFoto)
									.addGap(30))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(lblCarreraALa)
										.addGap(18)
										.addComponent(cmbCarreras, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
										.addComponent(lblFoto, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
									.addGroup(groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(lblProfesores, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
											.addGroup(groupLayout.createSequentialGroup()
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
													.addGroup(groupLayout.createSequentialGroup()
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addGroup(groupLayout.createSequentialGroup()
																.addComponent(lblNDeCubiculo)
																.addPreferredGap(ComponentPlacement.RELATED)
																.addComponent(cmbCubiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
															.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
																.addComponent(dateChooser, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(lblEdad, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
														.addGap(18)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
																.addGroup(groupLayout.createSequentialGroup()
																	.addComponent(lblEdificio)
																	.addPreferredGap(ComponentPlacement.UNRELATED)
																	.addComponent(cmbEdificio, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
																.addComponent(lblClaveUnica))
															.addComponent(lblTelefono))
														.addPreferredGap(ComponentPlacement.RELATED)
														.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
															.addComponent(txtTelefono, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
															.addComponent(txtClave, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
													.addGroup(groupLayout.createSequentialGroup()
														.addComponent(lblCorreo)
														.addPreferredGap(ComponentPlacement.RELATED)
														.addComponent(txtCorreo, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
													.addGroup(groupLayout.createSequentialGroup()
														.addComponent(lblNombre)
														.addGap(18)
														.addComponent(txtNombre, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)))
												.addGap(26)))
										.addGap(225))))
							.addGap(16))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblProfesores, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
							.addGap(28)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombre))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtCorreo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCorreo, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNDeCubiculo, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbCubiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(15)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblEdad, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblClaveUnica, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtClave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblEdificio)
									.addComponent(cmbEdificio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(27)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCarreraALa)
								.addComponent(cmbCarreras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(61)
							.addComponent(lblFoto, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(btnAgregarFoto)))
					.addGap(54)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNuevo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnEliminar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnGuardar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
				.addComponent(scrollPaneProfesores, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
		);
		getContentPane().setLayout(groupLayout);
		listModel =new ModeluHorariosList();
		listProfesores = new JList();
		listProfesores.setOpaque(false);
		listProfesores.setFont(new Font("DengXian", Font.PLAIN, 14));
		listProfesores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listProfesores.setModel(listModel);
		listProfesores.setValueIsAdjusting(true);
		listProfesores.addListSelectionListener(listener);
		scrollPaneProfesores.setViewportView(listProfesores);
		lblTituloProfesores = new JLabel("Profesores adscritos ");
		lblTituloProfesores.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblTituloProfesores.setBackground(new Color(218, 165, 32));
		lblTituloProfesores.setOpaque(true);
		lblTituloProfesores.setForeground(new Color(139, 0, 0));
		lblTituloProfesores.setFont(new Font("DengXian", Font.PLAIN, 18));
		lblTituloProfesores.setHorizontalAlignment(SwingConstants.CENTER);
		scrollPaneProfesores.setColumnHeaderView(lblTituloProfesores);
		
		this.btnGuardar.addActionListener(listener);
		this.btnNuevo.addActionListener(listener);
		this.btnAgregarFoto.addActionListener(listener);
		this.txtClave.addKeyListener(listener);
		this.txtCorreo.addKeyListener(listener);
		this.txtTelefono.addKeyListener(listener);
		this.txtNombre.addKeyListener(listener);
		this.btnEliminar.addActionListener(listener);
		listModel.setProfesores(listener.Select_all_Profesor());
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public JLabel getLblEdificio() {
		return lblEdificio;
	}

	public JComboBox<?> getCmbEdificio() {
		return cmbEdificio;
	}

	public JLabel getLblCarreraALa() {
		return lblCarreraALa;
	}

	public JComboBox<?> getCmbCarreras() {
		return cmbCarreras;
	}

	public JScrollPane getScrollPaneProfesores() {
		return scrollPaneProfesores;
	}

	public JList<?> getListProfesores() {
		return listProfesores;
	}

	public JLabel getLblFoto() {
		return lblFoto;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public JButton getBtnAgregarFoto() {
		return btnAgregarFoto;
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public JLabel getLblProfesores() {
		return lblProfesores;
	}

	public JLabel getLblCorreo() {
		return lblCorreo;
	}

	public JTextField getTxtCorreo() {
		return txtCorreo;
	}

	public JLabel getLblEdad() {
		return lblEdad;
	}

	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	public JLabel getLblTelefono() {
		return lblTelefono;
	}

	public JLabel getLblNDeCubiculo() {
		return lblNDeCubiculo;
	}

	public JLabel getLblClaveUnica() {
		return lblClaveUnica;
	}

	public JTextField getTxtClave() {
		return txtClave;
	}

	public JButton getBtnNuevo() {
		return btnNuevo;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JComboBox<?> getCmbCubiculo() {
		return cmbCubiculo;
	}

	public JDateChooser getDateChooser() {
		return dateChooser;
	}

	public ControlProfesores getListener() {
		return listener;
	}

	/**
	 * @return the listModel
	 */
	public ModeluHorariosList getListModel() {
		return listModel;
	}

	/**
	 * @return the btnEliminar
	 */
	public JButton getBtnEliminar() {
		return btnEliminar;
	}
}
