import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

/**
 * <p>
 * </p>
 *
 * @author imarc
 * @version 1.0 Created on 14 de mai de 2023
 */
public class Panel
	extends JPanel
{

	public static final int TXT_X = 10;

	public static final int TXT_Y = 10;

	@Override
	public void paintComponent( final Graphics g )
	{
		super.paintComponent( g );

		g.drawString( "Primeiro Programa Gráfico", TXT_X, TXT_Y );

		final Graphics2D graphics2d = ( Graphics2D ) g;

		// Desenha retângulo
		final double leftX = 100.0;
		final double topY = 100.0;
		final double larg = 200;
		final double alt = 150;

		final Rectangle2D rt = new Rectangle2D.Double( leftX, topY, larg, alt );
		graphics2d.draw( rt );

	}
}
