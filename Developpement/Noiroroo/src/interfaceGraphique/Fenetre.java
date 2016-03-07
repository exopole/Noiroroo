package interfaceGraphique;

import java.awt.BorderLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	Background pan = new Background("Portraits/ArmandeConcept.png"); 
	
	
	 GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
	public Fenetre() {
		// TODO Auto-generated constructor stub
		this.setTitle("Noiroroo");
	
	
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//this.getContentPane().setBackgroundImage(new Background("Portraits/ArmandeConcept.png"));
		pan.setLayout(new GridLayout(1, 3));

		pan.add(new Portrait("Portraits/ArmandeConcept.png"));
		pan.add(new Portrait("Portraits/ArmandeConcept.png"));
		pan.add(new Portrait("Portraits/ArmandeConcept.png"));
		
		this.getContentPane().add(pan);
		
		
		 this.setVisible(true);
		 

	   
	}
}
