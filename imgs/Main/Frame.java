package Main;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>
 * </p>
 * 
 * @author imarc
 * @version 1.0 Created on 14 de mai de 2023
 */
public class Frame
	extends JFrame
{

	JPanel panel;

	public Frame (final String s, ListImages l) {
		super(s);
		panel = new Panel(l);
		panel.setBackground( Color.white );
		getContentPane().add( panel );
		setSize( 300, 300 );
	}
}
