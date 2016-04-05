package informations;

import java.util.Vector;

import parsing.ParsingString;
import parsing.ParsingVector;

public class BruteClasse {
	private Integer  vie;
	private Integer  force;
	private Integer  rapidite;
	private Integer  resistance;
	private Integer  esprit;
	private Integer  deplacement;
	private Integer  dexterite;
	
	/**
	 * 
	 * @param content which list all the brute statistic
	 */
	public BruteClasse(String content) {
		// TODO Auto-generated constructor stub
		Vector<Integer> statBrute = ParsingVector.stringToInt(ParsingString.split(content, ";"));
		vie = statBrute.get(0);
		force = statBrute.get(1);
		rapidite = statBrute.get(2);
		dexterite = statBrute.get(3);
		resistance = statBrute.get(4);
		esprit = statBrute.get(5);
		deplacement = statBrute.get(6);
	}

	/**
	 * @return the vie
	 */
	public Integer getVie() {
		return vie;
	}

	/**
	 * @param vie the vie to set
	 */
	public void setVie(Integer vie) {
		this.vie = vie;
	}

	/**
	 * @return the force
	 */
	public Integer getForce() {
		return force;
	}

	/**
	 * @param force the force to set
	 */
	public void setForce(Integer force) {
		this.force = force;
	}

	/**
	 * @return the rapidite
	 */
	public Integer getRapidite() {
		return rapidite;
	}

	/**
	 * @param rapidite the rapidite to set
	 */
	public void setRapidite(Integer rapidite) {
		this.rapidite = rapidite;
	}

	/**
	 * @return the resistance
	 */
	public Integer getResistance() {
		return resistance;
	}

	/**
	 * @param resistance the resistance to set
	 */
	public void setResistance(Integer resistance) {
		this.resistance = resistance;
	}

	/**
	 * @return the esprit
	 */
	public Integer getEsprit() {
		return esprit;
	}

	/**
	 * @param esprit the esprit to set
	 */
	public void setEsprit(Integer esprit) {
		this.esprit = esprit;
	}

	/**
	 * @return the deplacement
	 */
	public Integer getDeplacement() {
		return deplacement;
	}

	/**
	 * @param deplacement the deplacement to set
	 */
	public void setDeplacement(Integer deplacement) {
		this.deplacement = deplacement;
	}

	/**
	 * @return the dexterite
	 */
	public Integer getDexterite() {
		return dexterite;
	}

	/**
	 * @param dexterite the dexterite to set
	 */
	public void setDexterite(Integer dexterite) {
		this.dexterite = dexterite;
	}
	
	
	
	
	
}
