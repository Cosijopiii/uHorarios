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
import javax.swing.AbstractListModel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;

public class PanelMaterias extends JDialog {
	private JScrollPane scrollPane;
	private JList list;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblProfesores;
	private JLabel lblCorreo;
	private JTextField txtClave;
	private JButton button;
	private JButton btnGuardar;
	private JComboBox comboBox;
	private JLabel lblClave;

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
	public PanelMaterias() {
		setResizable(false);
		getContentPane().setBackground(new Color(128, 0, 0));
		setBounds(100, 100, 753, 597);
		
		scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setBackground(new Color(255, 255, 255));
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(new Color(255, 215, 0));
		lblNombre.setFont(new Font("SansSerif", Font.PLAIN, 13));
		
		txtNombre = new JTextField();
		txtNombre.setText("nombre");
		txtNombre.setColumns(10);
		
		lblProfesores = new JLabel("Materias");
		lblProfesores.setForeground(new Color(255, 215, 0));
		lblProfesores.setFont(new Font("SansSerif", Font.PLAIN, 39));
		
		lblCorreo = new JLabel("Semestre");
		lblCorreo.setForeground(new Color(255, 215, 0));
		lblCorreo.setFont(new Font("SansSerif", Font.PLAIN, 13));
		
		txtClave = new JTextField();
		txtClave.setText("clave");
		txtClave.setColumns(10);
		
		button = new JButton("+");
		button.setForeground(new Color(128, 0, 0));
		button.setFont(new Font("SansSerif", Font.PLAIN, 35));
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(new Color(128, 0, 0));
		btnGuardar.setFont(new Font("SansSerif", Font.PLAIN, 19));
		
		comboBox = new JComboBox();
		
		lblClave = new JLabel("Clave");
		lblClave.setForeground(new Color(255, 215, 0));
		lblClave.setFont(new Font("SansSerif", Font.PLAIN, 13));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(182)
									.addComponent(lblProfesores, GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(70)
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
									.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
							.addGap(21))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(54)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNombre)
								.addComponent(lblCorreo, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
									.addGap(102)
									.addComponent(lblClave, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(txtClave, 0, 0, Short.MAX_VALUE))
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(18)
					.addComponent(lblProfesores, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblCorreo, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtClave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblClave, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGuardar, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)))
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
		);
		
		list = new JList();
		list.setValueIsAdjusting(true);
		list.setOpaque(false);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Materia X", "Materia Y"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		getContentPane().setLayout(groupLayout);

	}
}
