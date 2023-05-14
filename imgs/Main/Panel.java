package Main;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

/**
 * <p>
 * </p>
 * @author imarc
 * @version 1.0 Created on 14 de mai de 2023
 */
public class Panel extends JPanel
{
	public static final int IMG_X = 0;
	public static final int IMG_Y = 0;
	private ListImages listImages;
	
	public Panel(ListImages l) {
		this.listImages = l;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent( g );
		Image[] vImages = this.listImages.getImage();
		int larg = IMG_X;
		int alt = IMG_Y;
		
		for(int i = 0; i < listImages.getTam(); i++ ) {
			g.drawImage( vImages[i], larg, alt, null );
			alt += vImages[i].getHeight( null );
			larg += vImages[i].getWidth( null );
		}
	}
}
