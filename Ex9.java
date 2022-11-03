package UD20_Grupo1.UD20_ProyectoMaven.Ex9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.AbstractButton;
import javax.swing.*;

public class Ex9 extends JFrame{
	
	private JPanel panel;
	private JToggleButton button[];

	boolean boto0, boto1, boto2, boto3, boto4, boto5, boto6,
			boto7, boto8, boto9, boto10, boto11, boto12,
			boto13, boto14, boto15;
	int n;
	int k2;
	String colorBoto;
	String colorBoto1;
	String colorBoto2;

			
	public static void main( String[] args )
	{        
	        Ex9 ex9 = new Ex9();
	        ex9.joc();
	}
				
	public Ex9(){	
		
		
		this.n = 0;
		this.k2 = 0;
		this.colorBoto = "";
		this.colorBoto1 = "";
		this.colorBoto2 = "";
		
	}
	
	public void joc() {
		
		  setTitle("Juego de formar parejas");
	      panel = new JPanel();
	      panel.setLayout(new GridLayout(4, 1));
	      button = new JToggleButton[16];	      	      
	      	     
	      add(panel, BorderLayout.CENTER);
	      setSize(400, 300);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLocationRelativeTo(null);
	      setVisible(true);
	      
	      colocarButons();
	 
	      botons();	 	
	   
	}
	
	public void colocarButons(){
		 for(int count = 0; count < button.length; count++) {
	         button[count] = new JToggleButton("Button "+(count));
	         panel.add(button[count]);
	         button[count].setBorder(BorderFactory.createLineBorder(Color.blue));	   	         
		 }
	
	}
	
	public void comprobarBoto(int k, String colorBoto) {
		
		n++;				
		if (n == 1) {
		
			colorBoto1 = colorBoto;
			System.out.println();	
			k2 = k;
		}
		if (n == 2) {
			colorBoto2 = colorBoto;		
			n = 0;
			//borrar botons
			if(colorBoto1 == colorBoto2) {
				System.out.println();	
				button[k2].setVisible(false);
				button[k].setVisible(false);
			}
		}
	}
	
	public void botons() {
		
        /*button[0].addItemListener(new ItemListener() {
        	   public void itemStateChanged(ItemEvent itemEvent) {
        		       
                   int state = itemEvent.getStateChange();

                   if (state == ItemEvent.SELECTED) {
                       System.out.println("Selected");
                       int k = 0;
                       button[0].setBackground(Color.blue);
                       colorBoto = "blue";
   					   comprobarBoto(k, colorBoto);
                   }
                   else {
    
                       System.out.println("Deselected");
                       
                   }        		   
        	   }        	
        });*/
		
		 button[0].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
											
					int k = 0;						
					button[0].setBackground(Color.blue);	
					colorBoto = "blue";
					comprobarBoto(k, colorBoto);														
				}
	       });
		 
		 button[1].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
				
					int k = 1;					
					button[1].setBackground(Color.blue);	
					colorBoto = "blue";
					comprobarBoto(k, colorBoto);
				}
	       });
		 
		 button[2].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
				
					int k = 2;
					button[2].setBackground(Color.cyan);
					colorBoto = "cyan";
					comprobarBoto(k,colorBoto);		
				}
	       });
		 
		 button[3].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
				
					int k = 3;					
					button[3].setBackground(Color.cyan);
					colorBoto = "cyan";
					comprobarBoto(k,colorBoto);		
				}
	       });
		 
		 button[4].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
							
					int k = 4;					
					button[4].setBackground(Color.magenta);
					colorBoto = "magenta";
					comprobarBoto(k,colorBoto);		
				}
	       });
		 
		 button[5].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
				
					int k = 5;					
					button[5].setBackground(Color.magenta);
					colorBoto = "magenta";
					comprobarBoto(k,colorBoto);		
				}
	       });
		 
		 button[6].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
		
					int k = 6;					
					button[6].setBackground(Color.orange);
					colorBoto = "orange";
					comprobarBoto(k,colorBoto);		
				}
	       });
		 
		 button[7].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
		
					int k = 7;					
					button[7].setBackground(Color.orange);
					colorBoto = "orange";
					comprobarBoto(k,colorBoto);		
				}
	       });
		 
		 button[8].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
		
					int k = 8;					
					button[8].setBackground(Color.gray);
					colorBoto = "gray";
					comprobarBoto(k,colorBoto);		
				}
	       });
		 
		 button[9].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
		
					int k = 9;					
					button[9].setBackground(Color.gray);
					colorBoto = "gray";
					comprobarBoto(k,colorBoto);		
				}
	       });
		 
		 button[10].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
			
					int k = 10;					
					button[10].setBackground(Color.yellow);
					colorBoto = "yellow";
					comprobarBoto(k,colorBoto);		
				}
	       });
		 
		 button[11].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
			
					int k = 11;					
					button[11].setBackground(Color.yellow);
					colorBoto = "yellow";
					comprobarBoto(k,colorBoto);		
				}
	       });
		 
		 button[12].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
				
					int k = 12;					
					button[12].setBackground(Color.white);
					colorBoto = "white";
					comprobarBoto(k,colorBoto);		
				}
	       });
		 
		 button[13].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
			
					int k = 13;					
					button[13].setBackground(Color.white);
					colorBoto = "white";
					comprobarBoto(k,colorBoto);		
				}
	       });
		 
		 button[14].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {

					int k = 14;					
					button[14].setBackground(Color.green);
					colorBoto = "green";
					comprobarBoto(k,colorBoto);		
				}
	       });
		 
		 button[15].addActionListener(new ActionListener(){
				public void actionPerformed (ActionEvent e) {
				
					int k = 15;					
					button[15].setBackground(Color.green);
					colorBoto = "green";
					comprobarBoto(k,colorBoto);		
				}
	       });
		
	}
			
}