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
		getContentPane().setBackground(new Color(139, 0, 0));
		setBounds(100, 100, 927, 484);
		
		scrollPaneProfesores = new JScrollPane();
		scrollPaneProfesores.setBorder(null);
		scrollPaneProfesores.setBackground(new Color(255, 255, 255));
		
		lblFoto = new JLabel("Seleccione una foto");
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoto.setOpaque(true);
		lblFoto.setBackground(new Color(255, 255, 255));
		
		lblNombre = new JLabel("Nombre :");
		lblNombre.setForeground(new Color(218, 165, 32));
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 12));
		
		btnAgregarFoto = new JButton("Agregar foto");
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		lblProfesores = new JLabel("Profesores");
		lblProfesores.setForeground(new Color(218, 165, 32));
		lblProfesores.setFont(new Font("Dialog", Font.BOLD, 31));
		
		lblCorreo = new JLabel("Correo electronico :");
		lblCorreo.setForeground(new Color(218, 165, 32));
		lblCorreo.setFont(new Font("Dialog", Font.BOLD, 12));
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		
		lblEdad = new JLabel("Fecha de nacimiento :");
		lblEdad.setForeground(new Color(218, 165, 32));
		lblEdad.setFont(new Font("Dialog", Font.BOLD, 12));
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		
		lblTelefono = new JLabel("Telefono :");
		lblTelefono.setForeground(new Color(218, 165, 32));
		lblTelefono.setFont(new Font("Dialog", Font.BOLD, 12));
		
		lblNDeCubiculo = new JLabel("N\u00BA de cubiculo :");
		lblNDeCubiculo.setForeground(new Color(218, 165, 32));
		lblNDeCubiculo.setFont(new Font("Dialog", Font.BOLD, 12));
		
		lblClaveUnica = new JLabel("N\u00B0 de nomina: ");
		lblClaveUnica.setForeground(new Color(218, 165, 32));
		lblClaveUnica.setFont(new Font("Dialog", Font.BOLD, 12));
		
		txtClave = new JTextField();
		txtClave.setColumns(10);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setForeground(Color.BLACK);
		btnNuevo.setFont(new Font("SansSerif", Font.PLAIN, 17));
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(Color.BLACK);
		btnGuardar.setFont(new Font("SansSerif", Font.PLAIN, 17));
	
		cmbCubiculo = new JComboBox<Object>();
		cmbCubiculo.setModel(new DefaultComboBoxModel(CUBICULOS));
		
		dateChooser = new JDateChooser();
		
		lblEdificio = new JLabel("Edificio: ");
		lblEdificio.setForeground(new Color(218, 165, 32));
		lblEdificio.setFont(new Font("Dialog", Font.BOLD, 12));
		
		cmbEdificio = new JComboBox();
		cmbEdificio.setModel(new DefaultComboBoxModel(EDIFICIOS));
		lblCarreraALa = new JLabel("Carrera a la que esta adscrito(a)");
		lblCarreraALa.setForeground(new Color(218, 165, 32));
		lblCarreraALa.setFont(new Font("Dialog", Font.BOLD, 12));
		
		cmbCarreras = new JComboBox();
		cmbCarreras.setModel(new DefaultComboBoxModel(CARRERAS));
		
	     btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(Color.BLACK);
		btnEliminar.setFont(new Font("SansSerif", Font.PLAIN, 17));

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPaneProfesores, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNDeCubiculo)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(cmbCubiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblCarreraALa)
										.addComponent(lblEdad, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(lblClaveUnica, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblEdificio))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(cmbEdificio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(txtClave, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)))
										.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
										.addComponent(cmbCarreras, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
									.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
										.addComponent(lblCorreo)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtCorreo, GroupLayout.PREFERRED_SIZE, 284, GroupLayout.PREFERRED_SIZE))
									.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
										.addComponent(lblNombre)
										.addGap(18)
										.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE))))
							.addGap(33)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblFoto, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED, 29, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnAgregarFoto)
									.addGap(33)))
							.addGap(32))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(162)
							.addComponent(btnNuevo, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblProfesores))
					.addGap(97))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(13)
							.addComponent(lblProfesores, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(39)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombre))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtCorreo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCorreo, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNDeCubiculo, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbCubiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblClaveUnica, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtClave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblEdad, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblEdificio)
									.addComponent(cmbEdificio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(cmbCarreras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCarreraALa))
							.addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(55)
							.addComponent(lblFoto, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnAgregarFoto)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnNuevo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnEliminar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnGuardar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap())
				.addComponent(scrollPaneProfesores, GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
		);
		getContentPane().setLayout(groupLayout);
		listModel =new ModeluHorariosList();
		listProfesores = new JList();
		listProfesores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listProfesores.setModel(listModel);
		listProfesores.setValueIsAdjusting(true);
		listProfesores.setOpaque(false);
		listProfesores.addListSelectionListener(listener);
		scrollPaneProfesores.setViewportView(listProfesores);
		lblTituloProfesores = new JLabel("Profesores adscritos ");
		lblTituloProfesores.setBackground(new Color(218, 165, 32));
		lblTituloProfesores.setOpaque(true);
		lblTituloProfesores.setForeground(new Color(139, 0, 0));
		lblTituloProfesores.setFont(new Font("Dialog", Font.BOLD, 14));
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
