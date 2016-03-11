package interfaceGraphique;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	//Background pan = new Background("Portraits/ArmandeConcept.png"); 
	JPanel pan = new JPanel();
	
	 GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
	public Fenetre() {
		// TODO Auto-generated constructor stub
		this.setTitle("Noiroroo");
	
		setMaximized(true);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Toolkit tk = Toolkit.getDefaultToolkit();
		int width = tk.getScreenSize().width;
		int heigth = tk.getScreenSize().height;

		//this.getContentPane().setBackgroundImage(new Background("Portraits/ArmandeConcept.png"));
		
		pan.setPreferredSize(new Dimension(width, heigth));
		// toutes les cellules 
		//cellule 1 => celle de gauche présentant les statisitiques
		JPanel cell1 = new JPanel();
		cell1.setBackground(Color.BLACK);
		cell1.setPreferredSize(new Dimension(width/3, heigth));
		
		//cellule 2 => celle de la Race
		JPanel cell2 = new JPanel();
		cell2.setBackground(Color.BLUE);
		cell2.setPreferredSize(new Dimension(width/3, 2*heigth/3));


		
		//Celule 3 => celle de la classe
		JPanel cell3 = new JPanel();
		cell3.setBackground(Color.green);
		cell3.setPreferredSize(new Dimension(width/3, 2*heigth/3));
		
		//Cellule 4 => celle des compétences
		JPanel cell4 = new JPanel();
		cell4.setBackground(Color.yellow);
		cell4.setPreferredSize(new Dimension(width/3*2, heigth/3));

		
		
		pan.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(1,1,1,1);
		
		gbc.gridx = 0;
		gbc.gridy = 0;


		gbc.gridheight = 3;
		gbc.gridwidth = 1;
		pan.add(cell1, gbc);
		
		gbc.gridx = 1;
		gbc.gridheight = 2;
		pan.add(cell2, gbc);
		
		gbc.gridx = 2;
		pan.add(cell3, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		pan.add(cell4, gbc);
		
		
		
//		
//		
//		pan.add(new Portrait("Portraits/ArmandeConcept.png"));
//		pan.add(new Portrait("Portraits/ArmandeConcept.png"));
//		pan.add(new Portrait("Portraits/ArmandeConcept.png"));
//		
		this.getContentPane().add(pan);
		this.pack();

		
		 this.setVisible(true);
	}
	
	public void setMaximized(boolean maximized){
	    if(maximized){
	        DisplayMode mode = this.getGraphicsConfiguration().getDevice().getDisplayMode();
	        Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(this.getGraphicsConfiguration());
	        this.setMaximizedBounds(new Rectangle(
	                mode.getWidth() - insets.right - insets.left, 
	                mode.getHeight() - insets.top - insets.bottom
	        ));
	        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	    }else{
	        this.setExtendedState(JFrame.NORMAL);
	    }
	}
}
