package uniandes.dpoo.taller4.interfaz;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PanelDerecho extends JFrame
{
	private JButton btnNuevo;
	private JButton btnReiniciar;
	private JButton btnTop10;
	private JButton btnCambiarJugador;
	
	public PanelDerecho()
	{
		setLayout(new GridLayout(1,4));
		
		btnNuevo = new JButton("NUEVO");
		add(btnNuevo);
		
		btnReiniciar = new JButton("REINICIAR");
		add(btnReiniciar);
		
		btnTop10 = new JButton("TOP-10");
		add(btnTop10);
		
		btnCambiarJugador = new JButton("CAMBIAR JUGADOR");
		add(btnCambiarJugador);
	}
}
