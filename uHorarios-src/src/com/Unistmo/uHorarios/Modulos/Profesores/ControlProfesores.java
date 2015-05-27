package com.Unistmo.uHorarios.Modulos.Profesores;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;

import com.Unistmo.uHorarios.*;

import javax.imageio.ImageIO;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Cosijopii
 *
 */
public class ControlProfesores extends QueryProfesores implements ActionListener, KeyListener,ListSelectionListener,RecursosConstantes {
	private static JFileChooser jf =new JFileChooser();
	
	private PanelProfesores comp;
	private Sequencer seq;
	private File sound;
	private String rutaFoto;
	
	public ControlProfesores(PanelProfesores pnaProfesores) {
			comp=pnaProfesores;
			jf.setFileFilter(new FileNameExtensionFilter("JPG & PNG", "jpg", "png"));
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comp.getBtnGuardar())
			AccionGuardar();
		if(e.getSource()==comp.getBtnAgregarFoto())
			AccionFoto();
		if(e.getSource()==comp.getBtnEliminar())
			Eliminar();
		if(e.getSource()==comp.getBtnNuevo())
			limpiarCampos();
			
			
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getSource() == comp.getTxtNombre())
			comp.getTxtNombre().setForeground((!comp.getTxtNombre().getText().matches(PATTERN_NOMBRE)) ? Color.RED: Color.BLACK);
		if (e.getSource() == comp.getTxtCorreo())
			comp.getTxtCorreo().setForeground((!comp.getTxtCorreo().getText().matches(PATTERN_CORREO)) ? Color.RED: Color.BLACK);
		if (e.getSource() == comp.getTxtClave())
			comp.getTxtClave().setForeground((!comp.getTxtClave().getText().matches(PATTERN_NOMINA)) ? Color.RED: Color.BLACK);
		if (e.getSource() == comp.getTxtTelefono())
			comp.getTxtTelefono().setForeground((!comp.getTxtTelefono().getText().matches(PATTERN_TELEFONO)) ? Color.RED: Color.BLACK);
	}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		MostrarElementos();
		
	}
	public void MostrarElementos(){
		int seleccion =comp.getListProfesores().getSelectedIndex();
		if(seleccion!=-1){
			Profesor p=comp.getListModel().getElementP(seleccion);
			comp.getTxtClave().setText(p.getId());
			comp.getTxtNombre().setText(p.getNombre());
			comp.getTxtCorreo().setText(p.getCorreo());
			comp.getTxtTelefono().setText(p.getTelefono());		
			comp.getCmbCarreras().setSelectedIndex(RecursosConstantes.Buscar(p.getCarrera(),CARRERAS));
			comp.getCmbCubiculo().setSelectedIndex(RecursosConstantes.Buscar(String.valueOf(p.getnCubo()),CUBICULOS));
			comp.getCmbEdificio().setSelectedIndex(RecursosConstantes.Buscar(String.valueOf(p.getEdificio()),EDIFICIOS));
			comp.getTxtClave().setEnabled(false);
			
			try {
				comp.getDateChooser().setDate(from.parse(from.format(p.getfNacimiento())));
				AccionFoto(p.getFoto());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	public void AccionFoto() {
		int opc = jf.showOpenDialog(null);
		BufferedImage img = null;
		Image dimg = null;
		ImageIcon imgI = null;
		if (opc == 0) {
			try {
				rutaFoto=jf.getSelectedFile().getAbsolutePath();
				img = ImageIO.read(new File(rutaFoto));
				dimg = img.getScaledInstance(comp.getLblFoto().getWidth(), comp
						.getLblFoto().getHeight(), Image.SCALE_SMOOTH);
				imgI = new ImageIcon(dimg);
				comp.getLblFoto().setIcon(imgI);
				comp.getLblFoto().setText("");

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,
						MENSAJE_JOPTIONPANE_ERROR_IMAGEN[0],
						MENSAJE_JOPTIONPANE_ERROR_IMAGEN[1],
						JOptionPane.ERROR_MESSAGE);
				rutaFoto=null;
			}
		}
	}
	public void AccionFoto(String path) {
	
		BufferedImage img = null;
		Image dimg = null;
		ImageIcon imgI = null;
		if (path!=null) {
			
			try {
			
				img = ImageIO.read(new File(path));
				dimg = img.getScaledInstance(comp.getLblFoto().getWidth(), comp
						.getLblFoto().getHeight(), Image.SCALE_SMOOTH);
				imgI = new ImageIcon(dimg);
				comp.getLblFoto().setIcon(imgI);

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,
						MENSAJE_JOPTIONPANE_ERROR_IMAGEN[0],
						MENSAJE_JOPTIONPANE_ERROR_IMAGEN[1],
						JOptionPane.ERROR_MESSAGE);
				rutaFoto=null;
			}
		}else{
			comp.getLblFoto().setText("Seleccione una foto");
			comp.getLblFoto().setIcon(null);
		}
	}

	public void AccionGuardar(){
	
		if (validarGuardar()) {
			Guardar_BD();		
		} else {
			SoundError();
			JOptionPane.showMessageDialog(null,MENSAJE_JOPTIONPANE_ERROR_GUARDAR[0],MENSAJE_JOPTIONPANE_ERROR_GUARDAR[1],JOptionPane.ERROR_MESSAGE);
			seq.stop();
		}
 
	}
	public void SoundError() {
		if (sound == null) {
			sound = new File(PATH_SOUND_FALL);
		}
		try {
			Sequence S = MidiSystem.getSequence(sound);
			seq = MidiSystem.getSequencer();
			seq.open();
			seq.setSequence(S);
			seq.start();
		} catch (InvalidMidiDataException | IOException
				| MidiUnavailableException e) {
			e.printStackTrace();
		}
	}	
	public boolean validarGuardar() {
		boolean validaciones[] = new boolean[5];
		for (int i = 0; i < validaciones.length; i++)
			validaciones[i] = true;
		validaciones[0] = comp.getTxtClave().getForeground().equals(Color.red) ? false: true;
		validaciones[1] = comp.getTxtCorreo().getForeground().equals(Color.red) ? false: true;
		validaciones[3] = comp.getTxtNombre().getForeground().equals(Color.red) ? false: true;
		validaciones[4] = comp.getTxtTelefono().getForeground().equals(Color.red) ? false : true;
		java.util.Date fecha =new java.util.Date();	
		if (comp.getDateChooser().getDate() != null) {
		Date one=Date.valueOf(to.format(comp.getDateChooser().getDate()));
		Date two =Date.valueOf(to.format(fecha));
			if (one.equals(two)||comp.getDateChooser().getDate().after(fecha)) {
				
				validaciones[2] =false;
			}else
				validaciones[2]=true;
		}else{
			validaciones[2]=false;
		}
		
		fecha= null;
	
		for (int i = 0; i < validaciones.length; i++)
			if (!validaciones[i])
				return false;
		return true;
	}

	public void Guardar_BD() {
		String nom = RecursosConstantes.ToUPPER(comp.getTxtNombre().getText());
		Profesor p = Select_Profesor(comp.getTxtClave().getText());
		if (p == null && comp.getTxtClave().isEnabled()) {
			Insert_Profesor(nom, rutaFoto, comp.getTxtCorreo().getText(),
					Integer.parseInt(comp.getCmbCubiculo().getSelectedItem()
							.toString()), comp.getTxtTelefono().getText(),
					(Date) Date.valueOf(to.format(comp.getDateChooser()
							.getDate())), comp.getTxtClave().getText(),
					Integer.parseInt(comp.getCmbEdificio().getSelectedItem()
							.toString()), comp.getCmbCarreras()
							.getSelectedItem().toString());
			AddToList(comp.getTxtClave().getText());
			comp.getTxtClave().setEnabled(false);
		}
		if (p != null && !comp.getTxtClave().isEnabled()) {
			// elimar antes de actualizar
			comp.getListModel().removeElement(
					comp.getListProfesores().getSelectedIndex());
			this.Update_Profesor(nom, rutaFoto, comp.getTxtCorreo().getText(),
					Integer.parseInt(comp.getCmbCubiculo().getSelectedItem()
							.toString()), comp.getTxtTelefono().getText(),
					(Date) Date.valueOf(to.format(comp.getDateChooser()
							.getDate())), comp.getTxtClave().getText(), Integer
							.parseInt(comp.getCmbEdificio().getSelectedItem()
									.toString()), comp.getCmbCarreras()
							.getSelectedItem().toString());

			AddToList(comp.getTxtClave().getText());
			comp.getTxtClave().setEnabled(false);
		}
		if (p != null && comp.getTxtClave().isEnabled()) {
			JOptionPane.showMessageDialog(null,
					MENSAJE_JOPTIONPANE_ERROR_PROFESOR_DUPLICADO[0],
					MENSAJE_JOPTIONPANE_ERROR_PROFESOR_DUPLICADO[1],
					JOptionPane.ERROR_MESSAGE);
		}

	}
	public void Eliminar(){	
		if (!comp.getTxtClave().getText().isEmpty() && !comp.getTxtClave().isEnabled()) {
			int opcion = JOptionPane.showConfirmDialog(null,
					MENSAJE_JOPTIONPANE_ALERTA_ELIMINAR_PROFESOR[0]
							+" "+ comp.getTxtNombre().getText(),
					MENSAJE_JOPTIONPANE_ALERTA_ELIMINAR_PROFESOR[1],
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			if (opcion == JOptionPane.YES_OPTION) {
				int seleccion = comp.getListProfesores().getSelectedIndex();
				if (seleccion != -1) {
					comp.getListModel().removeElement(seleccion);
					Delete_Profesor(comp.getTxtClave().getText());
					limpiarCampos();
				}
			}
		}
	}
	public void limpiarCampos(){
		comp.getListProfesores().clearSelection();
		comp.getTxtClave().setText("");	
		comp.getTxtClave().setForeground(Color.BLACK);
		comp.getTxtCorreo().setText("");
		comp.getTxtCorreo().setForeground(Color.BLACK);
		comp.getDateChooser().setDate(null);
		comp.getTxtNombre().setText("");
		comp.getTxtNombre().setForeground(Color.BLACK);
		comp.getTxtTelefono().setText("");
		comp.getTxtTelefono().setForeground(Color.BLACK);
		comp.getLblFoto().setIcon(null);
		comp.getLblFoto().setText("Seleccione una foto");	
		comp.getTxtClave().setEnabled(true);
		rutaFoto=null;
	}
	public void AddToList(String clv) {
		comp.getListModel().addElement(this.Select_Profesor(clv));
	}
	@Override
	public void keyPressed(KeyEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}

}
