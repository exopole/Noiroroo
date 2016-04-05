package informations;
import java.util.Vector;
import parsing.*;


/**
 * Classe est la classe presentant les classes des personnages
 * 
 * @author exopole
 * 
 */
public class Classe {
	
	/**
	 * nom de la classe, inchangeable
	 */
	
	private String name; 
	/**
	 * description de la classe, inchangeable
	 */
	private String description;
	
	/**
	 * Toutes les statistique lie a la perception de la classe, inchangeable
	 * @see PerceptionClasse
	 */
	private Vector<Integer> statPerception;
	
	/**
	 * Toutes les statistique brute de la classe, inchangeable
	 * @see BruteClasse
	 */
	private Vector<Integer> statBrute;
	
	/**
	 * Toutes les competences et xp associe disponible pour la classe, inchangeable
	 * @see BruteClasse
	 */
	private Vector<Vector <String>> competences;
	
	
	/**
	 * Constructeur permettant d'initie toutes les valeurs de la classe
	 * @param name
	 * @param description
	 * @param statPerception
	 * @param statBrute
	 * @param competences
	 */
	public Classe(String name, String description, Vector<Integer> statPerception, Vector<Integer> statBrute, Vector<Vector <String>> competences)
	{
		this.name = name;
		this.statPerception = statPerception;
		this.statBrute = statBrute;
		this.competences = competences;
		this.description = description;
	}
	
	/**
	 * Constructeur permettant d'initie toutes les valeurs de la classe grace au path du fichier
	 * @param nameFile
	 */
	public Classe(String nameFile) {
		Vector<String> fileContenant = ParsingFile.readFile(nameFile);
		name = fileContenant.get(0);
		description = fileContenant.get(1);
		statPerception =ParsingVector.stringToInt(ParsingString.split(fileContenant.get(2), ";"));	
		statBrute =ParsingVector.stringToInt(ParsingString.split(fileContenant.get(3), ";"));	
		competences =ParsingString.split2time(fileContenant.get(4), ";", ",");

	}
	
	/*
	 * retourne le nom de la classe
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * retourne la description de la classe
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * retourne toutes les statistique lie a la precision
	 * @return precision
	 */
	public Integer getPrecision() {
		return statPerception.get(0);
	}

	/**
	 * Retourne la chance 
	 * @return chance
	 */
	public Integer getChance() {
		return statPerception.get(1);
	}

	/**
	 * Retourne la valeur de l'esquive
	 * @return Esquive
	 */
	public Integer getEsquive() {
		return statPerception.get(2);
	}
	
	/**
	 * Retourne la valeur de l'habilite
	 * @return habilite
	 */
	public Integer getHabilite() {
		return statPerception.get(3);
	}

	/**
	 * Retourne la valeur de l'intelligence
	 * @return Intelligence
	 */
	public Integer getIntelligence() {
		return statPerception.get(4);
	}
	
	/**
	 * Retourne la valeur de l'endurance
	 * @return Endurance
	 */
	public Integer getEndurance() {
		return statPerception.get(5);
	}
	
	/**
	 * Retourne la valeur associe a la furtivite
	 * @return furtivite
	 */
	public Integer getFurtivite() {
		return statPerception.get(6);
	}

	/**
	 * Retourne la valeur associe au charisme
	 * @return charisme
	 */
	public Integer getCharisme() {
		return statPerception.get(7);
	}

	/**
	 * Retourne le nombre de point de vie
	 * @return vie
	 */
	public Integer getVie() {
		return statBrute.get(0);
	}

	/**
	 * Retourne la valeur associe a la force
	 * @return force
	 */
	public Integer getForce() {
		return statBrute.get(1);
	}

	/**
	 * Retourne la valeur associe a la rapidite 
	 * @return rapidite
	 */
	public Integer getRapidite() {
		return statBrute.get(2);
	}

	/**
	 * Retourne la valeur associe a la dexterite
	 * @return dexterite
	 */
	public Integer getDexterite() {
		return statBrute.get(3);
	}

	/**
	 * Retourne la valeur associe a la resistance
	 * @return resistance
	 */
	public Integer getResistance() {
		return statBrute.get(4);
	}

	/**
	 * Retourne la valeur associe a l'esprit
	 * @return esprit
	 */
	public Integer getEsprit() {
		return statBrute.get(5);
	}
	
	/**
	 * Retourne les statistiques associe a la perception
	 * @return Perception
	 */
	public Vector<Integer> getStatPerception() {
		return statPerception;
	}

	/**
	 * Retourne les statistiques associe aux statistique brutes
	 * @return Brute
	 */
	public Vector<Integer> getStatBrute() {
		return statBrute;
	}

	/**
	 * Retourne les competences avec leur points experience recquis
	 * @return Vector of vector de string
	 */
	public Vector<Vector <String>> getCompetences() {
		return competences;
	}
	
	/**
	 * Retourne la liste de noms de toutes les competences
	 * @return Vector of String
	 */
	public Vector<String> getAllNameCompetences() {
		Vector<String> newVector = new Vector<String>();
		for (int i = 0; i < competences.size(); i++) 
			newVector.add(competences.get(i).get(0));
		
		return newVector;
	}
	
	/**
	 * Retourne la liste des points experiences necessaire pour chaques competences
	 * @return vector of double
	 */
	public Vector<Double> getAllXP() {
		Vector<Double> newVector = new Vector<Double>();
		for (int i = 0; i < competences.size(); i++) 
			newVector.add(Double.parseDouble(competences.get(i).get(1)));
		
		return newVector;
	}
	
	/**
	 * Retourne la liste des competences et le nombre de points d'experiences associe 
	 * @param i
	 * @return Vector of String
	 */
	public Vector<String> getCompetenceAndXpByNumber(int i){
		return competences.get(i);
	}
	
	
	
}
