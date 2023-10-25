package pract2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tarea2 extends JFrame {

	private static final long serialVersionUID = 1L;
    private JLabel texto;
    private JButton but1;
    private JButton but2;
    
    public Tarea2() {
        setTitle("Tarea2");
        setBounds(400,300,450,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        but1 = new JButton("Boton 1");
        but2 = new JButton("Boton 2");
        texto = new JLabel("Has pulsado: ");
        
        ActionListener act = new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				texto.setText("Has pulsado: "+e.getActionCommand());
			}
		};
        
        but1.addActionListener(act);
        but2.addActionListener(act);
        
        texto.setBounds(10,30,150,30);
        add(texto);
        
        but1.setBounds(170,30,100,30);
        add(but1);
        
        but2.setBounds(290,30,100,30);
        add(but2);
        
        
    }
    
}