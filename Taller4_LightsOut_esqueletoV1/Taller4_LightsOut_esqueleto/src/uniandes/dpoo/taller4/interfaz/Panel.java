package uniandes.dpoo.taller4.interfaz;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import uniandes.cupi2.cupiMuseo.interfaz.VentanaPrincipal;
import uniandes.cupi2.cupiMuseo.mundo.CupiMuseo;

public class Panel extends JFrame
{
	private PanelBombillos Principal;
	private PanelAbajo PanelcitoAbajo;
	private PanelDerecho PanelcitoDerecho;
	
	public Panel()
	{
		try
        {
            Principal= new PanelBombillos( );
        }
        catch( Exception e )
        {
        }
		
		setSize(750,600);
		setTitle( "LightsOut" );
		setLocationRelativeTo( null );
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		JPanel centro = new JPanel( );
        centro.setLayout( new BorderLayout( ) );
        add( centro, BorderLayout.CENTER );
		
		PanelcitoDerecho = new PanelDerecho();
		centro.add(PanelcitoDerecho, BorderLayout.EAST);
		
		PanelcitoAbajo = new PanelAbajo();
		//east.add(PanelcitoAbajo, BorderLayout.SOUTH);
		
	}
	
	public static void main( String[] pArgs )
    {
		Panel  principal = new  Panel( );
        principal.setVisible( true );
    }
}
