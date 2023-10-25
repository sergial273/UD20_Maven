package pract3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tarea3 extends JFrame {

	private static final long serialVersionUID = 1L;
    private JLabel texto1;
    private JLabel texto2;
    private JButton but1;
    private JButton but2;
    private int bot1 = 0;
    private int bot2 = 0;
    
    public Tarea3() {
        setTitle("Tarea3");
        setBounds(400,300,300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        but1 = new JButton("Boton 1");
        but2 = new JButton("Boton 2");
        texto1 = new JLabel("Boton 1: ");
        texto2 = new JLabel("Boton 2: ");
        
        ActionListener act1 = new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				bot1 += 1;
				texto1.setText("Boton 1: " + bot1 + " veces");
			}
		};
		ActionListener act2 = new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				bot2 += 1;
				texto2.setText("Boton 2: " + bot2 + " veces");
			}
		};
        
        but1.addActionListener(act1);
        but2.addActionListener(act2);
        
        texto1.setBounds(10,30,150,30);
        add(texto1);
        
        texto2.setBounds(160,30,150,30);
        add(texto2);
        
        but1.setBounds(10,60,100,30);
        add(but1);
        
        but2.setBounds(160,60,100,30);
        add(but2);
        
        
    }
    
}