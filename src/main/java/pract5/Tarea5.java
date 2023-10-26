package pract5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tarea5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextArea areaTexto;
	private JButton limpiarBoton;
	
	public Tarea5() {
        setTitle("Ventana con Eventos de Ratón");
        setBounds(400,300,500,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        areaTexto = new JTextArea(10, 40);
        areaTexto.setEditable(false);

        limpiarBoton = new JButton("Limpiar");
        
        ActionListener act1 = new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				areaTexto.setText("");
			}
		};
		
        limpiarBoton.addActionListener(act1);

        areaTexto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                logEvento(areaTexto, "Clic en (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                logEvento(areaTexto, "Raton entro al area de texto");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                logEvento(areaTexto, "Raton salio del area de texto");
            }
        });

        setLayout(new BorderLayout());
        add(areaTexto, BorderLayout.CENTER);
        add(limpiarBoton, BorderLayout.NORTH);

    }

    private static void logEvento(JTextArea areaTexto, String evento) {
        areaTexto.append(evento + "\n");
    }
}
