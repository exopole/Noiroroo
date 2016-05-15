package informations;
import java.io.File;
import java.util.Vector;

/**
 * Classe presentant une competence
 * 
 * @author exopole
 *
 */
public class Competence {
	
	/**
	 * Nom de la competence
	 */
	private String nom;
	/**
	 * Description de la competence
	 */
	private String description;
	/**
	 * Type de la competence
	 */
	private String type;
	/**
	 * Nature de la competence
	 */
	private String nature;
	/**
	 * Level maximum que peut atteindre la competence
	 */
	private int levelMax;
	/**
	 * Temps necessaire a l'incantation de la competence
	 */
	private Double tempsIncantation;
	
	/**
	 * Constructeur permettant d'instancier toutes les valeurs
	 * @param nom
	 * @param description
	 * @param type
	 * @param nature
	 * @param levelMax
	 * @param tempsIncantation
	 */
	public Competence(String nom, String description, String type, String nature, int levelMax, Double tempsIncantation) {
		this.nom = nom;
		this.description = description;
		this.type = type;
		this.nature = nature;
		this.levelMax = levelMax;
		this.tempsIncantation = tempsIncantation;
	}
	
	/**
	 * Constructeur permettant d'instancier toutes les valeurs via un chaine de caractere
	 * @param listComp
	 */
	public Competence(String listComp) {
		String[] stringSplit = listComp.split(";");
		nom = stringSplit[0];
		description = stringSplit[1];
		type = stringSplit[2];
		nature = stringSplit[3];
		levelMax = Integer.parseInt(stringSplit[4]) ;
		tempsIncantation = Double.parseDouble(stringSplit[5]);
	}
	
	public Competence(File comp)
	{
		
	}
	
	/**
	 * Retourne le nom
	 * @return String
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * Retourne la description de la competence
	 * @return String
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Retourne le type de la competence
	 * @return String
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Retourne la nature de la competence
	 * @return String
	 */
	public String getNature() {
		return nature;
	}

	/**
	 * Retourne le level max pouvant atteindre la competence
	 * @return int
	 */
	public int getLevelMax() {
		return levelMax;
	}

	/**
	 * Retourne le temps d'incantation necessaire pour lancer la competence
	 * @return Double
	 */
	public Double getTempsIncantation() {
		return tempsIncantation;
	}
}
