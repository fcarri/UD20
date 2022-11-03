package UD20_Grupo1.UD20_ProyectoMaven;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ex6 extends JFrame {
	
	private JPanel contentPane;
	double imc = 0;
	
    public static void main( String[] args )
    {        
        Ex6 ex6 = new Ex6();
    }
    
    
    public Ex6() {
    	
    	setTitle("Indice de masa corporal");
		setBounds(400,200,550,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel etiqueta1 = new JLabel("Altura(metros)");
		etiqueta1.setBounds(40, 20, 200, 20);
		contentPane.add(etiqueta1);	
		
		JLabel etiqueta2 = new JLabel("Peso(kg)");
		etiqueta2.setBounds(280, 20, 200, 20);
		contentPane.add(etiqueta2);
		
		JTextField textField = new JTextField();
		textField.setBounds(150,20,100,26);
		contentPane.add(textField);	
								
		JTextField textField2 = new JTextField();
		textField2.setBounds(350,20,100,26);
		contentPane.add(textField2);
		
		JLabel etiqueta3 = new JLabel("IMC:");
		etiqueta3.setBounds(280, 70, 200, 40);
		contentPane.add(etiqueta3);
			
		JTextField textField3 = new JTextField();
		textField3.setBounds(280,70,140,26);
		textField3.setEditable(false);
		contentPane.add(textField3);
		
		JButton boton1 = new JButton("Calcular IMC");
		boton1.setBounds(120,70,120,23);
		contentPane.add(boton1);
		
		boton1.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {	
				try {
					double altura = Double.parseDouble(textField.getText());	
					double pes = Double.parseDouble(textField2.getText());
					imc = pes/(altura*altura);
					String s = Double.toString(imc);
					textField3.setText(s);
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null,"Introducir sólo números");
				}
			}			
		});
				
    
    }
    

}
