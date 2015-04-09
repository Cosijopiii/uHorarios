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

import com.toedter.calendar.JDateChooser;

import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class PanelProfesores extends JDialog {
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
	private static final  String CUBICULOS [] ={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
	private JLabel lblNewLabel;
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
		listener =new ControlProfesores(this);
		setResizable(false);
		getContentPane().setBackground(SystemColor.textInactiveText);
		setBounds(100, 100, 753, 597);
		
		scrollPaneProfesores = new JScrollPane();
		scrollPaneProfesores.setBorder(null);
		scrollPaneProfesores.setBackground(new Color(255, 255, 255));
		
		lblFoto = new JLabel("Seleccione una foto");
		lblFoto.setHorizontalAlignment(SwingConstants.CENTER);
		lblFoto.setOpaque(true);
		lblFoto.setBackground(new Color(255, 255, 255));
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(SystemColor.window);
		lblNombre.setFont(new Font("Dialog", Font.BOLD, 12));
		
		btnAgregarFoto = new JButton("Agregar foto");
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		lblProfesores = new JLabel("Profesores");
		lblProfesores.setForeground(SystemColor.window);
		lblProfesores.setFont(new Font("Dialog", Font.BOLD, 27));
		
		lblCorreo = new JLabel("Correo");
		lblCorreo.setForeground(SystemColor.window);
		lblCorreo.setFont(new Font("Dialog", Font.BOLD, 12));
		
		txtCorreo = new JTextField();
		txtCorreo.setColumns(10);
		
		lblEdad = new JLabel("Fecha de nacimiento");
		lblEdad.setForeground(SystemColor.window);
		lblEdad.setFont(new Font("Dialog", Font.BOLD, 12));
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setForeground(SystemColor.window);
		lblTelefono.setFont(new Font("Dialog", Font.BOLD, 12));
		
		lblNDeCubiculo = new JLabel("N\u00BA de cubiculo");
		lblNDeCubiculo.setForeground(SystemColor.window);
		lblNDeCubiculo.setFont(new Font("Dialog", Font.BOLD, 12));
		
		lblClaveUnica = new JLabel("N\u00B0 de nomina");
		lblClaveUnica.setForeground(SystemColor.window);
		lblClaveUnica.setFont(new Font("Dialog", Font.BOLD, 12));
		
		txtClave = new JTextField();
		txtClave.setColumns(10);
		
		btnNuevo = new JButton("+");
		btnNuevo.setForeground(Color.BLACK);
		btnNuevo.setFont(new Font("SansSerif", Font.PLAIN, 35));
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(Color.BLACK);
		btnGuardar.setFont(new Font("SansSerif", Font.PLAIN, 19));
	
		cmbCubiculo = new JComboBox<Object>();
		cmbCubiculo.setModel(new DefaultComboBoxModel(CUBICULOS));
		
		dateChooser = new JDateChooser();
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\COSI\\Documents\\GitHub\\uHorarios\\uHorarios-src\\icons\\calendar.png"));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPaneProfesores, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(19)
									.addComponent(lblFoto, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addGap(36)
											.addComponent(lblProfesores, GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNombre)
											.addGap(18)
											.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblCorreo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(txtCorreo, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
												.addComponent(lblEdad, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblNDeCubiculo)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(cmbCubiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addComponent(dateChooser, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
											.addGap(18)
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
												.addGroup(groupLayout.createSequentialGroup()
													.addComponent(lblClaveUnica, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(txtClave, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(49)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnAgregarFoto)
										.addComponent(btnNuevo, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
									.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
							.addGap(21))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(38)
							.addComponent(lblNewLabel)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblProfesores, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
							.addGap(37)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombre))
							.addGap(14)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtCorreo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblCorreo, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTelefono, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNDeCubiculo, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(cmbCubiculo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtClave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblClaveUnica, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEdad, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblFoto, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnAgregarFoto)))
					.addGap(77)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNuevo, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
				.addComponent(scrollPaneProfesores, GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
		);
		
		listProfesores = new JList();
		listProfesores.setValueIsAdjusting(true);
		listProfesores.setOpaque(false);
		scrollPaneProfesores.setViewportView(listProfesores);
		getContentPane().setLayout(groupLayout);
		this.btnGuardar.addActionListener(listener);
		this.btnNuevo.addActionListener(listener);
		this.btnAgregarFoto.addActionListener(listener);
		this.txtClave.addKeyListener(listener);
		this.txtCorreo.addKeyListener(listener);
		this.txtTelefono.addKeyListener(listener);
		this.txtNombre.addKeyListener(listener);
		this.listProfesores.addListSelectionListener(listener);
		
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
}
