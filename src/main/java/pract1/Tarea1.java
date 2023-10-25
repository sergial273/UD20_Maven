package pract1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Tarea1 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel etiqueta;
	
	private int tamaño_letra = 28;
	
	private ActionListener a = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	if (e.getActionCommand() == "Agrandar") {
        		redimensionarEtiqueta(50, 20, 1);
        	}
        	else {
        		redimensionarEtiqueta(50, 20, -1);
        	}
        		
        }
    };
    
    public Tarea1() {
    	setTitle("Tarea1");
        setBounds(400,300,450,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        etiqueta = new JLabel("Etiqueta");

        etiqueta.setFont(new Font("Arial", Font.PLAIN, tamaño_letra));
        
        JButton btnAgrandar = new JButton("Agrandar");
        JButton btnReducir = new JButton("Reducir");
        
        
        btnAgrandar.addActionListener(a);

        btnReducir.addActionListener(a);

        
        etiqueta.setBounds(150,100,150,100);
        add(etiqueta);
        
        btnAgrandar.setBounds(100,270,100,30);
        add(btnAgrandar);
        
        btnReducir.setBounds(200,270,100,30);
        add(btnReducir);

    }

    private void redimensionarEtiqueta(int width, int height, int signo) {

        int w = etiqueta.getWidth() + signo*width;
        int h = etiqueta.getHeight() + signo*height;
        etiqueta.setBounds(150,100,w,h);
        tamaño_letra = tamaño_letra +signo*2;
        etiqueta.setFont(new Font("Arial", Font.PLAIN, tamaño_letra));
        
    }

}