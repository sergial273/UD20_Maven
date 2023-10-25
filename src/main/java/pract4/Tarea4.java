package pract4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Tarea4 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextArea areaTexto;

	public Tarea4() {
		setTitle("Tarea4");
		setBounds(400,300,500,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		areaTexto = new JTextArea(500, 800);
		areaTexto.setEditable(false);

		add(areaTexto, BorderLayout.CENTER);
		add(new JLabel("Eventos de la ventana"), BorderLayout.NORTH);

		addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
				logEvento(areaTexto, "Ventana abierta");
			}

			@Override
			public void windowClosing(WindowEvent e) {
				logEvento(areaTexto, "Ventana cerrándose");
			}

			@Override
			public void windowClosed(WindowEvent e) {
				logEvento(areaTexto, "Ventana cerrada");
			}

			@Override
			public void windowIconified(WindowEvent e) {
				logEvento(areaTexto, "Ventana minimizada");
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				logEvento(areaTexto, "Ventana restaurada");
			}

			@Override
			public void windowActivated(WindowEvent e) {
				logEvento(areaTexto, "Ventana activada");
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				logEvento(areaTexto, "Ventana desactivada");
			}
		});

	}

	private static void logEvento(JTextArea areaTexto, String evento) {
		areaTexto.append(evento + "\n");
	}

}
