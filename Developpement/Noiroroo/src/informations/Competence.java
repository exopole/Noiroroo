package informations;
import java.util.Vector;

public class Competence {
	
	private String nom;
	private String description;
	private String type;
	private String nature;
	private int levelMax;
	private Double tempsIncantation;
	
	public Competence(String nom, String description, String type, String nature, int levelMax, Double tempsIncantation) {
		this.nom = nom;
		this.description = description;
		this.type = type;
		this.nature = nature;
		this.levelMax = levelMax;
		this.tempsIncantation = tempsIncantation;
	}
	
	public Competence(String listComp) {
		String[] stringSplit = listComp.split(";");
		nom = stringSplit[0];
		description = stringSplit[1];
		type = stringSplit[2];
		nature = stringSplit[3];
		levelMax = Integer.parseInt(stringSplit[4]) ;
		tempsIncantation = Double.parseDouble(stringSplit[5]);
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getDescription() {
		return description;
	}

	public String getType() {
		return type;
	}
	
	public String getNature() {
		return nature;
	}

	
	public int getLevelMax() {
		return levelMax;
	}

	
	public Double getTempsIncantation() {
		return tempsIncantation;
	}

	
	
}
