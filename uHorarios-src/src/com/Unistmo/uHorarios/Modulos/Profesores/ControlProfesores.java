package com.Unistmo.uHorarios.Modulos.Profesores;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Date;

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
public class ControlProfesores extends QueryProfesores implements ActionListener, KeyListener,
ListSelectionListener,RecursosConstantes {
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
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getSource() == comp.getTxtNombre())
			comp.getTxtNombre().setForeground((!comp.getTxtNombre().getText().matches(PATTERN_NOMBRE)) ? Color.RED: Color.BLACK);
		if (e.getSource() == comp.getTxtCorreo())
			comp.getTxtCorreo().setForeground((!comp.getTxtCorreo().getText().matches(PATTERN_CORREO)) ? Color.RED: Color.BLACK);
		if (e.getSource() == comp.getTxtClave())
			comp.getTxtClave().setForeground((!comp.getTxtClave().getText().matches("[0-9]+")) ? Color.RED: Color.BLACK);
		if (e.getSource() == comp.getTxtTelefono())
			comp.getTxtTelefono().setForeground((!comp.getTxtTelefono().getText().matches(PATTERN_TELEFONO)) ? Color.RED: Color.BLACK);
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

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null,
						MENSAJE_JOPTIONPANE_ERROR_IMAGEN[0],
						MENSAJE_JOPTIONPANE_ERROR_IMAGEN[1],
						JOptionPane.ERROR_MESSAGE);
				rutaFoto=null;
			}
		}
	}

	public void AccionGuardar(){
		if (validarGuardar()) {	
			String nom=RecursosConstantes.ToUPPER(comp.getTxtNombre().getText());				
			Insert_Profesor(nom, rutaFoto, comp.getTxtCorreo().getText(),
					Integer.parseInt(comp.getCmbCubiculo().getSelectedItem()
							.toString()), comp.getTxtTelefono().getText(),
					(Date) Date.valueOf(to.format(comp.getDateChooser().getDate())), comp.getTxtClave()
							.getText(), Integer.parseInt(comp.getCmbEdificio()
							.getSelectedItem().toString()), comp
							.getCmbCarreras().getSelectedItem().toString());
				} else {
					SoundError();
					JOptionPane.showMessageDialog(null,
							MENSAJE_JOPTIONPANE_ERROR_GUARDAR[0],
							MENSAJE_JOPTIONPANE_ERROR_GUARDAR[1],
							JOptionPane.ERROR_MESSAGE);
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
	public boolean validarGuardar(){	
		boolean validaciones [] =new boolean[5];
		for (int i = 0; i < validaciones.length; i++)
			validaciones[i]=true;		
		
		validaciones[0]=comp.getTxtClave().getForeground().equals(Color.red)? false :true);
		validaciones[1]=comp.getTxtCorreo().getForeground().equals(Color.red)? false :true);
	    validaciones[4]=(comp.getDateChooser().getDate()==null ? false :true );
		
		   
		for (int i = 0; i < validaciones.length; i++)
		   if(validaciones[i]==false)
			  return false;		
		return true;
	}
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		System.out.println(e.getSource());
	}
	@Override
	public void keyPressed(KeyEvent e) {}
}
