import javax.swing.JFrame;

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
	
	public PrimFrame() {
		setSize(LARG_DEFAULT,ALT_DEFAULT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
