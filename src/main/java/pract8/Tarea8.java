package pract8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Tarea8 extends JFrame {
	
	private final double CONVERSION = 166.386;
	private static final long serialVersionUID = 1L;
	private JLabel cantidadLabel;
	private JTextField cantidadField;
	private JLabel resultadoLabel;
	private JTextField resultadoField;
	private JButton calcular;
	private JButton cambiar;
	private JButton borrar;
	private boolean modo = true;
	
    public Tarea8() {
        setTitle("Tarea8");
        setBounds(400,300,550,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        cantidadLabel = new JLabel("Cantidad a convertir:");
        cantidadField = new JTextField(10);
        
        resultadoLabel = new JLabel("Resultado:");
        resultadoField = new JTextField(10);
        resultadoField.setEditable(false);
        
        calcular = new JButton("Euros a ptas");
        cambiar = new JButton("Cambiar");
        borrar = new JButton("Borrar");
        
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double cantidad = Double.parseDouble(cantidadField.getText());
                    double imc = 0;
                    
                    if (modo) { //euros a pesetas
                    	imc = cantidad * CONVERSION;
                    }
                    else {
                    	imc = cantidad / CONVERSION;
                    }
                    
                    resultadoField.setText(String.format("%.2f", imc));
                } catch (NumberFormatException ex) {
                    resultadoField.setText("Error en la entrada");
                }
            }
        });
        
        cambiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	if (modo) { //esta de euros a pesetas
            		calcular.setText("Ptas a euros"); 
                }
                else {
                	calcular.setText("Euros a ptas"); 
                }
                modo  = !modo; 
            }
        });
        
        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {       	     
            	cantidadField.setText("");
            	resultadoField.setText("");
            }
        });
        
        setLayout(null);
        
        cantidadLabel.setBounds(10,30,130,30);
        add(cantidadLabel);
        
        cantidadField.setBounds(140,30,100,30);
        add(cantidadField);
        
        resultadoLabel.setBounds(250,30,70,30);
        add(resultadoLabel);
        
        resultadoField.setBounds(320,30,100,30);
        add(resultadoField);
        
        calcular.setBounds(70,65,150,30);
        add(calcular);
        
        cambiar.setBounds(230,65,130,30);
        add(cambiar);
        
        borrar.setBounds(370,65,130,30);
        add(borrar);
        
     // Definir el acelerador (Enter o Espacio)
        calcular.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0), "clickButton");
        calcular.getActionMap().put("clickButton", new AbstractAction() {
			private static final long serialVersionUID = 1L;

			@Override
            public void actionPerformed(ActionEvent e) {
                calcular.doClick();
            }
        });
        
    }
}