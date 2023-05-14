import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>
 * </p>
 * @author imarc
 * @version 1.0 Created on 13 de mai de 2023
 */
public class PrimFrame extends JFrame
{
	public final int LARG_DEFAULT=400;
	public final int ALT_DEFAULT=300;
	JButton b1 = new JButton("Botão 1");
	JButton b2 = new JButton("Botão 2");
	JPanel panel = new JPanel();
	
	public PrimFrame(String s) {
		super(s);
		panel.add( b1 );
		panel.add( b2 );
		panel.setBackground( Color.ORANGE );
		getContentPane().add( panel );
		setSize(LARG_DEFAULT,ALT_DEFAULT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
