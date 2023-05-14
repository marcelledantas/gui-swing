package Main;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * <p>
 * </p>
 * @author imarc
 * @version 1.0 Created on 14 de mai de 2023
 */
public class ListImages
{
	private Image[] vetImages = new Image[100];
	private Image i;
	private int tam;
	
	public ListImages() {
		
		try 
		{
			i = ImageIO.read( new File( "C:/minds/workspace/gui-swing/Dado1.png" ) );
		} 
		catch ( IOException e )
		{
			System.out.println( e.getMessage() );
			System.exit( 1 );
		}
		
	}
	
	void novaImagem() {
		vetImages[tam] = i;
		tam ++;
	}
	
	int getTam() {
		return tam;
	}
	
	Image[] getImage() {
		return this.vetImages;
	}
}
