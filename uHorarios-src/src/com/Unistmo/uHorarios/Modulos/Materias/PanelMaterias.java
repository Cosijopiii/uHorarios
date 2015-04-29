package com.Unistmo.uHorarios.Modulos.Materias;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JList;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

import java.awt.GridLayout;

import javax.swing.border.LineBorder;

import com.Unistmo.uHorarios.RecursosConstantes;
import java.awt.Cursor;
import javax.swing.ListSelectionModel;


public class PanelMaterias extends JDialog implements RecursosConstantes {

	private static final long serialVersionUID = 5827242967903659794L;
	private JScrollPane scrollPane;
	private JList<?> list;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblProfesores;
	private JLabel lblCorreo;
	private JTextField txtClave;
	private JButton btnNuevo;
	private JButton btnGuardar;
	private JComboBox<?> cmbSemestre;
	private JLabel lblClave;
	private JButton btnEliminar;
	private JPanel panelheader;
	private JLabel lblMaterias;
	private JLabel lblSemestres;
	private JComboBox<?> cmbSemestresList;
	private ModeloListMaterias listModel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelMaterias dialog = new PanelMaterias();
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
	public PanelMaterias() {
		getContentPane().setFont(new Font("DengXian", Font.PLAIN, 18));
		setResizable(false);
		getContentPane().setBackground(new Color(128, 0, 0));
		setBounds(100, 100, 789, 394);
		ControlMaterias listener=new ControlMaterias(this);
		scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBorder(null);
		scrollPane.setBackground(new Color(255, 255, 255));
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(new Color(255, 215, 0));
		lblNombre.setFont(new Font("DengXian", Font.PLAIN, 18));
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("DengXian", Font.PLAIN, 18));
		txtNombre.setColumns(10);
		
		lblProfesores = new JLabel("Materias");
		lblProfesores.setForeground(new Color(255, 215, 0));
		lblProfesores.setFont(new Font("DengXian", Font.PLAIN, 36));
		
		lblCorreo = new JLabel("Semestre:");
		lblCorreo.setForeground(new Color(255, 215, 0));
		lblCorreo.setFont(new Font("DengXian", Font.PLAIN, 18));
		
		txtClave = new JTextField();
		txtClave.setFont(new Font("DengXian", Font.PLAIN, 18));
		txtClave.setColumns(10);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setForeground(new Color(128, 0, 0));
		btnNuevo.setFont(new Font("DengXian", Font.PLAIN, 18));
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(new Color(128, 0, 0));
		btnGuardar.setFont(new Font("DengXian", Font.PLAIN, 18));
		
		cmbSemestre = new JComboBox<Object>();
		cmbSemestre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbSemestre.setFont(new Font("DengXian", Font.PLAIN, 18));
		cmbSemestre.setModel(new DefaultComboBoxModel(SEMESTRES));
		lblClave = new JLabel("Codigo de materia:");
		lblClave.setForeground(new Color(255, 215, 0));
		lblClave.setFont(new Font("DengXian", Font.PLAIN, 18));
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setForeground(new Color(128, 0, 0));
		btnEliminar.setFont(new Font("DengXian", Font.PLAIN, 18));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(28)
							.addComponent(btnNuevo, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(67)
							.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNombre)
										.addComponent(lblCorreo, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(cmbSemestre, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblClave)
											.addGap(5)
											.addComponent(txtClave, 0, 0, Short.MAX_VALUE))
										.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnGuardar, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblProfesores))))
					.addGap(765))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblProfesores, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCorreo, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addComponent(cmbSemestre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtClave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblClave, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnEliminar, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNuevo, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addGap(41))
		);
		listModel =new ModeloListMaterias();
		list = new JList<Object>();
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFont(new Font("Dialog", Font.PLAIN, 13));
		list.setValueIsAdjusting(true);
		list.setOpaque(false);
		list.setModel(listModel);
		list.addListSelectionListener(listener);
		
		
		scrollPane.setViewportView(list);
		panelheader = new JPanel();
		scrollPane.setColumnHeaderView(panelheader);
		panelheader.setLayout(new GridLayout(3, 1, 0, 0));
		lblMaterias = new JLabel("Materias");
		lblMaterias.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblMaterias.setFont(new Font("DengXian", Font.PLAIN, 26));
		lblMaterias.setForeground(new Color(139, 0, 0));
		lblMaterias.setOpaque(true);
		lblMaterias.setBackground(new Color(184, 134, 11));
		lblMaterias.setHorizontalAlignment(SwingConstants.CENTER);
		panelheader.add(lblMaterias);	
		lblSemestres = new JLabel("Semestre");
		lblSemestres.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSemestres.setOpaque(true);
		lblSemestres.setForeground(new Color(184, 134, 11));
		lblSemestres.setBackground(new Color(139, 0, 0));
		lblSemestres.setFont(new Font("DengXian", Font.PLAIN, 18));
		lblSemestres.setHorizontalAlignment(SwingConstants.CENTER);
		panelheader.add(lblSemestres);
		cmbSemestresList = 	new JComboBox<Object>();
		cmbSemestresList.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbSemestresList.setFont(new Font("DengXian", Font.PLAIN, 16));
		cmbSemestresList.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Todos"}));
		panelheader.add(cmbSemestresList);
		btnNuevo.addActionListener(listener);
		btnEliminar.addActionListener(listener);
		btnGuardar.addActionListener(listener);
		cmbSemestresList.addActionListener(listener);
		listModel.setMaterias(listener.Select_all_Materias());
		getContentPane().setLayout(groupLayout);
		
			
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the scrollPane
	 */
	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	/**
	 * @return the list
	 */
	public JList<?> getList() {
		return list;
	}

	/**
	 * @return the lblNombre
	 */
	public JLabel getLblNombre() {
		return lblNombre;
	}

	/**
	 * @return the txtNombre
	 */
	public JTextField getTxtNombre() {
		return txtNombre;
	}

	/**
	 * @return the lblProfesores
	 */
	public JLabel getLblProfesores() {
		return lblProfesores;
	}

	/**
	 * @return the lblCorreo
	 */
	public JLabel getLblCorreo() {
		return lblCorreo;
	}

	/**
	 * @return the txtClave
	 */
	public JTextField getTxtClave() {
		return txtClave;
	}

	/**
	 * @return the btnNuevo
	 */
	public JButton getBtnNuevo() {
		return btnNuevo;
	}

	/**
	 * @return the btnGuardar
	 */
	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	/**
	 * @return the cmbSemestre
	 */
	public JComboBox<?> getCmbSemestre() {
		return cmbSemestre;
	}

	/**
	 * @return the lblClave
	 */
	public JLabel getLblClave() {
		return lblClave;
	}

	/**
	 * @return the btnEliminar
	 */
	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	/**
	 * @return the panelheader
	 */
	public JPanel getPanelheader() {
		return panelheader;
	}

	/**
	 * @return the lblMaterias
	 */
	public JLabel getLblMaterias() {
		return lblMaterias;
	}

	/**
	 * @return the lblSemestres
	 */
	public JLabel getLblSemestres() {
		return lblSemestres;
	}

	/**
	 * @return the cmbSemestresList
	 */
	public JComboBox<?> getCmbSemestresList() {
		return cmbSemestresList;
	}

	/**
	 * @return the listModel
	 */
	public ModeloListMaterias getListModel() {
		return listModel;
	}
}
