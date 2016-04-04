package panneau;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanneauRace extends JPanel{
	String pathImage;
	Dimension dim;
	double width;
	double height;
	boolean full;
	

	public PanneauRace(String path, Dimension dim, boolean full) {
		// TODO Auto-generated constructor stub
		pathImage = path;
		this.dim = dim;
		this.full = full;
		this.setPreferredSize(dim);
		width = dim.getWidth();
		height = dim.getHeight();
		
		System.out.println(dim.getWidth());
		System.out.println(dim.getHeight());
		
	}
	public void paintComponent(Graphics g){
		try {
		  Image img = ImageIO.read(new File(pathImage));
		  //Pour une image de fond
		  if (full) 
		  {
			  g.drawImage(img, (int)(2*width/4),(int)(2*height/4), (int) (2*width/4),(int)(2* height/4), this);

		  }
		  else 
		  {
			  g.drawImage(img, 0,0, (int) width,(int) height, this);
		  }

		
		} catch (IOException e) {
		  e.printStackTrace();
		}
	      g.drawString("Race", 10, 20);

	     
	} 
}

