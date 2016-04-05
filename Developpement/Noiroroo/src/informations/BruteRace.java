package informations;

import java.util.Vector;

import parsing.ParsingString;
import parsing.ParsingVector;

public class BruteRace {
	private Integer  vieBase;
	private String  vieDe;
	private Integer  forceBase;
	private String  forceDe;
	private Integer  rapiditeBase;
	private String  rapiditeDe;
	private Integer  resistanceBase;
	private String  resistanceDe;
	private Integer  espritBase;
	private String  espritDe;
	private Integer  deplacementBase;
	private String  deplacementDe;
	private Integer  dexteriteBase;
	private String  dexteriteDe;
	
	/**
	 * 
	 * @param content which list all the brute statistic
	 */
	public BruteRace(String content) {
		// TODO Auto-generated constructor stub
		Vector<Vector<String>> statBrute = ParsingString.split2time(content, ";", ",");
		vieBase = Integer.valueOf(statBrute.get(0).get(0));
		forceBase = Integer.valueOf(statBrute.get(1).get(0));
		rapiditeBase = Integer.valueOf(statBrute.get(2).get(0));
		dexteriteBase = Integer.valueOf(statBrute.get(3).get(0));
		resistanceBase = Integer.valueOf(statBrute.get(4).get(0));
		espritBase = Integer.valueOf(statBrute.get(5).get(0));
		deplacementBase = Integer.valueOf(statBrute.get(6).get(0));
		vieDe = testForDe(statBrute.get(0));
		forceDe = testForDe(statBrute.get(1));
		rapiditeDe = testForDe(statBrute.get(2));
		dexteriteDe = testForDe(statBrute.get(3));
		resistanceDe = testForDe(statBrute.get(4));
		espritDe = testForDe(statBrute.get(5));
		deplacementDe = testForDe(statBrute.get(6));
	}

	private String testForDe(Vector<String> vecteur)
	{
		return ((vecteur.size() > 1) ? vecteur.get(1) : null);
	}
	
	
	/**
	 * @return the vieBase
	 */
	public Integer getVieBase() {
		return vieBase;
	}

	/**
	 * @param vieBase the vieBase to set
	 */
	public void setVieBase(Integer vieBase) {
		this.vieBase = vieBase;
	}

	/**
	 * @return the vieDe
	 */
	public String getVieDe() {
		return vieDe;
	}

	/**
	 * @param vieDe the vieDe to set
	 */
	public void setVieDe(String vieDe) {
		this.vieDe = vieDe;
	}

	/**
	 * @return the forceBase
	 */
	public Integer getForceBase() {
		return forceBase;
	}

	/**
	 * @param forceBase the forceBase to set
	 */
	public void setForceBase(Integer forceBase) {
		this.forceBase = forceBase;
	}

	/**
	 * @return the forceDe
	 */
	public String getForceDe() {
		return forceDe;
	}

	/**
	 * @param forceDe the forceDe to set
	 */
	public void setForceDe(String forceDe) {
		this.forceDe = forceDe;
	}

	/**
	 * @return the rapiditeBase
	 */
	public Integer getRapiditeBase() {
		return rapiditeBase;
	}

	/**
	 * @param rapiditeBase the rapiditeBase to set
	 */
	public void setRapiditeBase(Integer rapiditeBase) {
		this.rapiditeBase = rapiditeBase;
	}

	/**
	 * @return the rapiditeDe
	 */
	public String getRapiditeDe() {
		return rapiditeDe;
	}

	/**
	 * @param rapiditeDe the rapiditeDe to set
	 */
	public void setRapiditeDe(String rapiditeDe) {
		this.rapiditeDe = rapiditeDe;
	}

	/**
	 * @return the resistanceBase
	 */
	public Integer getResistanceBase() {
		return resistanceBase;
	}

	/**
	 * @param resistanceBase the resistanceBase to set
	 */
	public void setResistanceBase(Integer resistanceBase) {
		this.resistanceBase = resistanceBase;
	}

	/**
	 * @return the resistanceDe
	 */
	public String getResistanceDe() {
		return resistanceDe;
	}

	/**
	 * @param resistanceDe the resistanceDe to set
	 */
	public void setResistanceDe(String resistanceDe) {
		this.resistanceDe = resistanceDe;
	}

	/**
	 * @return the espritBase
	 */
	public Integer getEspritBase() {
		return espritBase;
	}

	/**
	 * @param espritBase the espritBase to set
	 */
	public void setEspritBase(Integer espritBase) {
		this.espritBase = espritBase;
	}

	/**
	 * @return the espritDe
	 */
	public String getEspritDe() {
		return espritDe;
	}

	/**
	 * @param espritDe the espritDe to set
	 */
	public void setEspritDe(String espritDe) {
		this.espritDe = espritDe;
	}

	/**
	 * @return the deplacementBase
	 */
	public Integer getDeplacementBase() {
		return deplacementBase;
	}

	/**
	 * @param deplacementBase the deplacementBase to set
	 */
	public void setDeplacementBase(Integer deplacementBase) {
		this.deplacementBase = deplacementBase;
	}

	/**
	 * @return the deplacementDe
	 */
	public String getDeplacementDe() {
		return deplacementDe;
	}

	/**
	 * @param deplacementDe the deplacementDe to set
	 */
	public void setDeplacementDe(String deplacementDe) {
		this.deplacementDe = deplacementDe;
	}

	/**
	 * @return the dexteriteBase
	 */
	public Integer getDexteriteBase() {
		return dexteriteBase;
	}

	/**
	 * @param dexteriteBase the dexteriteBase to set
	 */
	public void setDexteriteBase(Integer dexteriteBase) {
		this.dexteriteBase = dexteriteBase;
	}

	/**
	 * @return the dexteriteDe
	 */
	public String getDexteriteDe() {
		return dexteriteDe;
	}

	/**
	 * @param dexteriteDe the dexteriteDe to set
	 */
	public void setDexteriteDe(String dexteriteDe) {
		this.dexteriteDe = dexteriteDe;
	}
	
	
}
