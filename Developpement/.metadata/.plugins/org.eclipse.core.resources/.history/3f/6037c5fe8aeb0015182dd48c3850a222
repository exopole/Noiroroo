package interfaceGraphique;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.Graphics;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	//Background pan = new Background("Portraits/ArmandeConcept.png"); 
	JPanel pan = new JPanel();
	
	 GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
	public Fenetre() {
		ImageIcon icon = createImageIcon("images/middle.gif",
                "a pretty but meaningless splat");
		JLabel img = new JLabel(icon);
		
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
	
		PanneauPersonnage personnage = new PanneauPersonnage("Portraits/ArmandeConcept.png",new Dimension(width/3, heigth) );
		PanneauRace race = new PanneauRace("Portraits/ArmandeConcept.png",new Dimension(width/3,2*heigth/3) );
		PanneauClass classe = new PanneauClass("Portraits/ArmandeConcept.png",new Dimension(width/3, 2*heigth/3) );
		PanneauCompetence competence = new PanneauCompetence("Portraits/ArmandeConcept.png",new Dimension(2*width/3, heigth/3) );

		
		
		pan.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		//gbc.insets = new Insets(1,1,1,1);
		
		gbc.gridx = 0;
		gbc.gridy = 0;


		gbc.gridheight = 3;
		gbc.gridwidth = 1;
		pan.add(personnage, gbc);
		
		gbc.gridx = 1;
		gbc.gridheight = 2;
		pan.add(race, gbc);
		
		gbc.gridx = 2;
		pan.add(classe, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 2;
		pan.add(competence, gbc);
		
		
		
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
	
	/** Returns an ImageIcon, or null if the path was invalid. */
	protected ImageIcon createImageIcon(String path,
	                                           String description) {
	    if (path != null) {
	        return new ImageIcon(path, description);
	    } else {
	        System.err.println("Couldn't find file: " + path);
	        return null;
	    }
	}
}
