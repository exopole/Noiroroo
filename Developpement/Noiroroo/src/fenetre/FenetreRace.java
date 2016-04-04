package fenetre;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import panneau.PanneauRace;
import utils.UtilsJFrame;

@SuppressWarnings("serial")
public class FenetreRace extends JFrame{
	public FenetreRace() {
		// TODO Auto-generated constructor stub
		this.setTitle("Noiroroo");
		
		UtilsJFrame.setMaximized(this, true);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		Toolkit tk = Toolkit.getDefaultToolkit();
		int width = tk.getScreenSize().width;
		int heigth = tk.getScreenSize().height;
		PanneauRace race = new PanneauRace("Portraits/ArmandeConcept.png",new Dimension(width,heigth), true );
		this.add(race);
		this.setVisible(true);
	}
}
