package Main;

import javax.swing.JFrame;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 14 de mai de 2023
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

		final String currentDir = System.getProperty( "user.dir" );
		System.out.println( "Current working directory: " + currentDir );

		final ListImages imagesList = new ListImages();
		final Frame frame = new Frame( "Images", imagesList );

		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setSize( 400, 400 );
	}

}
