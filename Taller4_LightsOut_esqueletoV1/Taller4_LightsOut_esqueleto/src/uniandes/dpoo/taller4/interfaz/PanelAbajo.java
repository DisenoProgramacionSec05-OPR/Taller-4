package uniandes.dpoo.taller4.interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PanelAbajo extends JFrame implements ActionListener
{
	private JTextField jugadas;
	
	private JTextField jugador;
	
	private JLabel Jugadas;
	
	private JLabel Jugador;
	
	public PanelAbajo()
	{
		setLayout(new GridLayout(1, 4));
		
		Jugadas = new JLabel("Jugadas");
		add(Jugadas);
		
		jugadas = new JTextField("");
		add(jugadas);
		
		Jugador = new JLabel("Jugador");
		add(Jugador);
		
		jugador = new JTextField("");
		add(jugador);
	}
}
