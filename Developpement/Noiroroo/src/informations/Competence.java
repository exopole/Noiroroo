package informations;
import java.io.File;
import java.util.Vector;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

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
	private final StringProperty nom;
	/**
	 * Description de la competence
	 */
	private final StringProperty description;
	/**
	 * Type de la competence
	 */
	private final StringProperty type;
	/**
	 * Nature de la competence
	 */
	private final StringProperty nature;
	/**
	 * Level maximum que peut atteindre la competence
	 */
	private final IntegerProperty levelMax;
	/**
	 * Temps necessaire a l'incantation de la competence
	 */
	private final DoubleProperty tempsIncantation;
	/**
	 * Level maximum que peut atteindre la competence
	 */
	private final IntegerProperty exp;



	
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
		this.nom = new SimpleStringProperty(nom);
		this.description = new SimpleStringProperty(description);
		this.type = new SimpleStringProperty(type);
		this.nature = new SimpleStringProperty(nature);
		this.levelMax = new SimpleIntegerProperty(levelMax);
		this.tempsIncantation = new SimpleDoubleProperty(tempsIncantation);
		this.exp = null;
	}
	
	/**
	 * Constructeur permettant d'instancier toutes les valeurs via un chaine de caractere
	 * @param listComp
	 */
	public Competence(String listComp) {
		String[] stringSplit = listComp.split(";");
		nom = new SimpleStringProperty(stringSplit[0]);
		description = new SimpleStringProperty(stringSplit[1]);
		type = new SimpleStringProperty(stringSplit[2]);
		nature = new SimpleStringProperty(stringSplit[3]);
		levelMax = new SimpleIntegerProperty(Integer.parseInt(stringSplit[4])) ;
		tempsIncantation = new SimpleDoubleProperty(Double.parseDouble(stringSplit[5]));
		this.exp = null;
	}
	
	
	/**
	 * Constructeur permettant d'instancier toutes les valeurs via un chaine de caractere
	 * @param listComp
	 */
	public Competence(String listComp, int exp) {
		String[] stringSplit = listComp.split(";");
		nom = new SimpleStringProperty(stringSplit[0]);
		description = new SimpleStringProperty(stringSplit[1]);
		type = new SimpleStringProperty(stringSplit[2]);
		nature = new SimpleStringProperty(stringSplit[3]);
		levelMax = new SimpleIntegerProperty(Integer.parseInt(stringSplit[4])) ;
		tempsIncantation = new SimpleDoubleProperty(Double.parseDouble(stringSplit[5]));
		this.exp = new SimpleIntegerProperty(exp) ;

	}
	
	/**
	 * Constructeur permettant d'instancier toutes les valeurs via un chaine de caractere
	 * @param listComp
	 */
	public Competence(Competence comp, int exp) {
		nom = comp.nom;
		description = comp.description;
		type = comp.type;
		nature = comp.nature;
		levelMax = comp.levelMax ;
		tempsIncantation = comp.tempsIncantation;
		this.exp = new SimpleIntegerProperty(exp) ;

	}
	

	
	/**
	 * Retourne le nom
	 * @return String
	 */
	public String getNom() {
		return nom.get();
	}
	
	
	public StringProperty getNomProperty() {
		return nom;
	}
	
	/**
	 * Retourne la description de la competence
	 * @return String
	 */
	public String getDescription() {
		return description.get();
	}
	
	/**
	 * Retourne la description de la competence
	 * @return String
	 */
	public StringProperty getDescriptionProperty() {
		return description;
	}

	/**
	 * Retourne le type de la competence
	 * @return String
	 */
	public StringProperty getTypeProperty() {
		return type;
	}
	
	/**
	 * Retourne le type de la competence
	 * @return String
	 */
	public String getType() {
		return type.get();
	}
	
	/**
	 * Retourne la nature de la competence
	 * @return String
	 */
	public StringProperty getNatureProperty() {
		return nature;
	}
	/**
	 * Retourne la nature de la competence
	 * @return String
	 */
	public String getNature() {
		return nature.get();
	}

	/**
	 * Retourne le level max pouvant atteindre la competence
	 * @return int
	 */
	public IntegerProperty getLevelMaxProperty() {
		return levelMax;
	}
	
	/**
	 * Retourne le level max pouvant atteindre la competence
	 * @return int
	 */
	public int getLevelMax() {
		return levelMax.get();
	}

	/**
	 * @return the exp
	 */
	public IntegerProperty getExpProperty() {
		return exp;
	}
	

	/**
	 * @return the exp
	 */
	public int getExp() {
		return exp.get();
	}

	
	/**
	 * Retourne le temps d'incantation necessaire pour lancer la competence
	 * @return Double
	 */
	public DoubleProperty getTempsIncantationProperty() {
		return tempsIncantation;
	}
	
	public Double getTempsIncantation() {
		return tempsIncantation.get();
	}
	
	/**
	 * @param exp the exp to set
	 */
	public void setExp(int exp) {
		this.exp.set(exp); 
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom.set(nom);
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description.set(description);
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type.set(type);
	}

	/**
	 * @param nature the nature to set
	 */
	public void setNature(String nature) {
		this.nature.set(nature);
	}

	/**
	 * @param levelMax the levelMax to set
	 */
	public void setLevelMax(int levelMax) {
		this.levelMax.set(levelMax);
	}

	/**
	 * @param tempsIncantation the tempsIncantation to set
	 */
	public void setTempsIncantation(double tempsIncantation) {
		this.tempsIncantation.set(tempsIncantation);
	}


}
