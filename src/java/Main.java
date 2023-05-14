import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 13 de mai de 2023
 */
public class Main
{

	/**
	 * <p>
	 * </p>
	 *
	 * @param args
	 */
	public static void main( final String[] args )
	{
        JFrame frame = new JFrame("Panel Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        Panel panel = new Panel();
        frame.add(panel);
        
        frame.setVisible(true);
	}

}
