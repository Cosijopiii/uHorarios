package com.Unistmo.uHorarios.Modulos.MenuPrincipal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.Box;
import javax.swing.JSeparator;






import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Rectangle;
@SuppressWarnings("serial")
public class PanelLogeo extends JDialog  {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField password;
	private JTextField user;
	private JLabel lbluser;
	private JLabel lblpass;
	private JSeparator separator;
	private Component horizontalStrut;
	private Component horizontalStrut_1;
	private JLabel lbltitle;
	private JLabel lblNewLabel;
	private JLabel lblimagew;
	private JLabel lblE;
	private ControlLogeo cl;
	private JButton okButton;
	private JButton cancelButton;
	private JLabel label;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelLogeo dialog=new PanelLogeo();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public PanelLogeo() {
		setUndecorated(true);
		
		cl=new ControlLogeo(this);
		setTitle("Bienvenido");
//		 try
//         {
//         JFrame.setDefaultLookAndFeelDecorated(true);
//         JDialog.setDefaultLookAndFeelDecorated(true);
//         UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
//         }
//         catch (Exception e)
//         {
//         e.printStackTrace();
//         }
		setResizable(false);
		
		setBounds(100, 100, 450, 306);
		setLocationRelativeTo(null);

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(139, 0, 0));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			password = new JPasswordField();
			password.setFont(new Font("Tahoma", Font.PLAIN, 17));
		}
		
		user = new JTextField();
		user.setFont(new Font("Tahoma", Font.PLAIN, 17));
		user.setColumns(10);
		
		lbluser = new JLabel("Usuario");
		lbluser.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbluser.setForeground(Color.WHITE);
		
		lblpass = new JLabel("Contrase\u00F1a");
		lblpass.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblpass.setForeground(Color.WHITE);
		
		separator = new JSeparator();
		
		lbltitle = new JLabel("Horarios");
		lbltitle.setFont(new Font("Dialog", Font.PLAIN, 36));
		lbltitle.setForeground(new Color(255, 255, 255));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\COSI\\Dropbox\\Time_planning_64.png"));
		
		lblimagew = new JLabel("");
		lblimagew.setIcon(new ImageIcon("/Users/Cosijopii/uHorarios/uHorarios-src/icons/calendar.png"));
		
		lblE = new JLabel("u");
		lblE.setOpaque(true);
		lblE.setBounds(new Rectangle(30, 30, 30, 30));
		lblE.setForeground(Color.RED);
		lblE.setFont(new Font("Monotype Corsiva", Font.ITALIC, 54));
		
		label = new JLabel("");
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(98)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lbluser)
								.addComponent(lblpass))
							.addGap(28)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(password, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
								.addComponent(user, GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(407)
									.addComponent(label))
								.addComponent(lblimagew)
								.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
									.addGap(8)
									.addComponent(lblE, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lbltitle)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel)
									.addGap(16)))))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap(171, Short.MAX_VALUE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(label)
									.addGap(13)
									.addComponent(lblNewLabel))
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addGap(30)
									.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
										.addComponent(lbltitle, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblE, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))))
							.addGap(30)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(user, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbluser))
							.addGap(4))
						.addComponent(lblimagew))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(password, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblpass))
					.addGap(73)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(17))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 215, 0));
			FlowLayout fl_buttonPane = new FlowLayout(FlowLayout.RIGHT);
			buttonPane.setLayout(fl_buttonPane);
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				{
					okButton = new JButton("Entrar");
					buttonPane.add(okButton);
					okButton.addActionListener(cl);
					okButton.setBorderPainted(false);
					okButton.setForeground(new Color(0, 0, 0));
					okButton.setBackground(new Color(255, 255, 255));
					okButton.setActionCommand("OK");
					getRootPane().setDefaultButton(okButton);
			   	}

				{
					horizontalStrut = Box.createHorizontalStrut(20);
					buttonPane.add(horizontalStrut);
				}
			}
		    cancelButton = new JButton("Salir");
			buttonPane.add(cancelButton);
			cancelButton.setForeground(new Color(0, 0, 0));
			cancelButton.setBackground(new Color(255, 255, 255));
			cancelButton.setBorderPainted(false);
			cancelButton.setActionCommand("Cancel");
			cancelButton.addActionListener(cl);
			{
				horizontalStrut_1 = Box.createHorizontalStrut(20);
				buttonPane.add(horizontalStrut_1);
			}
		}
	}
	public JPanel getContentPanel() {
		return contentPanel;
	}

	public JPasswordField getPassword() {
		return password;
	}

	public JTextField getUser() {
		return user;
	}

	public JLabel getLbluser() {
		return lbluser;
	}

	public JLabel getLblpass() {
		return lblpass;
	}

	public JSeparator getSeparator() {
		return separator;
	}

	public Component getHorizontalStrut() {
		return horizontalStrut;
	}

	public Component getHorizontalStrut_1() {
		return horizontalStrut_1;
	}

	public JLabel getLbltitle() {
		return lbltitle;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public JLabel getLblimagew() {
		return lblimagew;
	}

	public JLabel getLblE() {
		return lblE;
	}

	public ControlLogeo getCl() {
		return cl;
	}

	public JButton getOkButton() {
		return okButton;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	
	}
