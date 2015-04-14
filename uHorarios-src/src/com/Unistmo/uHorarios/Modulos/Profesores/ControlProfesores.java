package com.Unistmo.uHorarios.Modulos.Profesores;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import com.Unistmo.uHorarios.*;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * @author Cosijopii
 *
 */
public class ControlProfesores implements ActionListener, KeyListener,
ListSelectionListener,Patrones {
	
	private PanelProfesores comp;
	private Sequencer seq;
	public ControlProfesores(PanelProfesores pnaProfesores) {
			comp=pnaProfesores;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comp.getBtnGuardar()) {
			if (validarGuardar()) {
				// metodo para guardar datos con procedimiento almacenado
			} else {
				SoundError();
				JOptionPane.showMessageDialog(null,
						"Por favor verifique los datos que introdujo",
						"Error al tratar de guardar los datos",
						JOptionPane.ERROR_MESSAGE);
				seq.stop();
			}
		}
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
	@Override
	public void keyTyped(KeyEvent e) {}
	@Override
	public void valueChanged(ListSelectionEvent e) {}
	@Override
	public void keyPressed(KeyEvent e) {}
	
	
	
	
	
	
	
	
	
	
	public boolean validarGuardar(){
		boolean validaciones [] =new boolean[5];
		for (int i = 0; i < validaciones.length; i++)
			validaciones[i]=true;
		validaciones[0]=(comp.getTxtClave().getForeground().equals(Color.red)? false :true);
		validaciones[1]=(comp.getTxtNombre().getForeground().equals(Color.red)? false :true);
		validaciones[2]=(comp.getTxtCorreo().getForeground().equals(Color.red)? false :true);
		validaciones[3]=(comp.getTxtTelefono().getForeground().equals(Color.red)? false :true);
		validaciones[4]=(comp.getDateChooser().getDate()==null ? false :true );
		for (int i = 0; i < validaciones.length; i++)
			if(validaciones[i]==false)
				return false;		
		return true;
	}
	public void SoundError(){
		File sound =new File("sonidos\\FALL_01.MID");
		try {
			Sequence S=MidiSystem.getSequence(sound);
			seq=MidiSystem.getSequencer();
			seq.open();
			seq.setSequence(S);
			seq.start();
		} catch (InvalidMidiDataException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MidiUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
