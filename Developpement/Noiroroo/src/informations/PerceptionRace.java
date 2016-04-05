package informations;

import java.util.Vector;

import parsing.ParsingString;
import parsing.ParsingVector;

public class PerceptionRace {

	/**
	 * Statistique de precision
	 */
	private Integer precision;
	/**
	 * Statistique de chance
	 */
	private Integer chance;
	/**
	 * Statistique d'esquive
	 */
	private Integer esquive;
	/**
	 * Statistique d'habilite
	 */
	private Integer habilite;
	/**
	 * Statistique d'intelligence
	 */
	private Integer intelligence;
	/**
	 * Statistique d'endurance
	 */
	private Integer endurance;
	/**
	 * Statistique de furtivite
	 */
	private Integer furtivite;
	/**
	 * Staistique de charisme
	 */
	private Integer charisme;
	
	/**
	 * Constructeur permettant d'instancier toutes les valeurs d'instance via un string
	 * @param content
	 */
	public PerceptionRace(String content) {
		Vector<Integer> statPerception =ParsingVector.stringToInt(ParsingString.split(content, ";"));
		precision = statPerception.get(0);
		chance = statPerception.get(1);
		esquive = statPerception.get(2);
		habilite = statPerception.get(3);
		intelligence = statPerception.get(4);
		furtivite = statPerception.get(5);
		charisme = statPerception.get(6);
		
	}

	/**
	 * @return the precision
	 */
	public Integer getPrecision() {
		return precision;
	}

	/**
	 * @param precision the precision to set
	 */
	public void setPrecision(Integer precision) {
		this.precision = precision;
	}

	/**
	 * @return the chance
	 */
	public Integer getChance() {
		return chance;
	}

	/**
	 * @param chance the chance to set
	 */
	public void setChance(Integer chance) {
		this.chance = chance;
	}

	/**
	 * @return the esquive
	 */
	public Integer getEsquive() {
		return esquive;
	}

	/**
	 * @param esquive the esquive to set
	 */
	public void setEsquive(Integer esquive) {
		this.esquive = esquive;
	}

	/**
	 * @return the habilite
	 */
	public Integer getHabilite() {
		return habilite;
	}

	/**
	 * @param habilite the habilite to set
	 */
	public void setHabilite(Integer habilite) {
		this.habilite = habilite;
	}

	/**
	 * @return the intelligence
	 */
	public Integer getIntelligence() {
		return intelligence;
	}

	/**
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	/**
	 * @return the endurance
	 */
	public Integer getEndurance() {
		return endurance;
	}

	/**
	 * @param endurance the endurance to set
	 */
	public void setEndurance(Integer endurance) {
		this.endurance = endurance;
	}

	/**
	 * @return the furtivite
	 */
	public Integer getFurtivite() {
		return furtivite;
	}

	/**
	 * @param furtivite the furtivite to set
	 */
	public void setFurtivite(Integer furtivite) {
		this.furtivite = furtivite;
	}

	/**
	 * @return the charisme
	 */
	public Integer getCharisme() {
		return charisme;
	}

	/**
	 * @param charisme the charisme to set
	 */
	public void setCharisme(Integer charisme) {
		this.charisme = charisme;
	}
}
