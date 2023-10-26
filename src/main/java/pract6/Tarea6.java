package pract6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tarea6 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel pesoLabel;
	private JTextField pesoField;
	private JLabel alturaLabel;
	private JTextField alturaField;
	private JLabel resultadoLabel;
	private JTextField resultadoField;
	private JButton calcular;
	
    public Tarea6() {
        setTitle("Tarea6");
        setBounds(400,300,380,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        pesoLabel = new JLabel("Peso (kg):");
        pesoField = new JTextField(10);
        
        alturaLabel = new JLabel("Altura (m):");
        alturaField = new JTextField(10);
        
        resultadoLabel = new JLabel("IMC:");
        resultadoField = new JTextField(10);
        resultadoField.setEditable(false);
        
        calcular = new JButton("Calcular IMC");
        
        calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double peso = Double.parseDouble(pesoField.getText());
                    double altura = Double.parseDouble(alturaField.getText());
                    
                    double imc = peso / (altura * altura);
                    resultadoField.setText(String.format("%.2f", imc));
                } catch (NumberFormatException ex) {
                    resultadoField.setText("Error en la entrada");
                }
            }
        });
        
        setLayout(null);
        
        alturaLabel.setBounds(10,30,70,30);
        add(alturaLabel);
        
        alturaField.setBounds(80,30,100,30);
        add(alturaField);
        
        pesoLabel.setBounds(180,30,70,30);
        add(pesoLabel);
        
        pesoField.setBounds(250,30,100,30);
        add(pesoField);
        
        calcular.setBounds(10,60,150,30);
        add(calcular);
        
        resultadoLabel.setBounds(170,60,130,30);
        add(resultadoLabel);
        
        resultadoField.setBounds(200,60,150,30);
        add(resultadoField);
        
        
    }
}
