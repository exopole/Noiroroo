package informations;
import java.util.Vector;
import parsing.*;



public class Classe {

	private String name; 
	private String description;
	private Vector<Integer> statPerception;
	private Vector<Integer> statBrute;
	private Vector<Vector <String>> competences;
	
	public Classe(String name, String description, Vector<Integer> statPerception, Vector<Integer> statBrute, Vector<Vector <String>> competences){
		this.name = name;
		this.statPerception = statPerception;
		this.statBrute = statBrute;
		this.competences = competences;
		this.description = description;
	}
	
	public Classe(String nameFile) {
		Vector<String> fileContenant = ParsingFile.readFile(nameFile);
		name = fileContenant.get(0);
		description = fileContenant.get(1);
		statPerception =ParsingVector.stringToInt(ParsingString.split(fileContenant.get(2), ";"));	
		statBrute =ParsingVector.stringToInt(ParsingString.split(fileContenant.get(3), ";"));	
		competences =ParsingString.split2time(fileContenant.get(4), ";", ",");

	}
	
	public String getName() {
		return name;
	}


	public String getDescription() {
		return description;
	}


	public Integer getPrecision() {
		return statPerception.get(0);
	}

	public Integer getChance() {
		return statPerception.get(1);
	}

	public Integer getEsquive() {
		return statPerception.get(2);
	}

	public Integer getHabilite() {
		return statPerception.get(3);
	}

	public Integer getIntelligence() {
		return statPerception.get(4);
	}
	
	public Integer getEndurance() {
		return statPerception.get(5);
	}
	
	public Integer getFurtivite() {
		return statPerception.get(6);
	}

	public Integer getCharisme() {
		return statPerception.get(7);
	}


	public Integer getVie() {
		return statBrute.get(0);
	}

	public Integer getForce() {
		return statBrute.get(1);
	}

	public Integer getRapidite() {
		return statBrute.get(2);
	}

	public Integer getDexterite() {
		return statBrute.get(3);
	}

	public Integer getResistance() {
		return statBrute.get(4);
	}

	public Integer getEsprit() {
		return statBrute.get(5);
	}
	
	public Vector<Integer> getStatPerception() {
		return statPerception;
	}

	public Vector<Integer> getStatBrute() {
		return statBrute;
	}

	public Vector<Vector <String>> getCompetences() {
		return competences;
	}
	
	public Vector<String> getAllNameCompetences() {
		Vector<String> newVector = new Vector<String>();
		for (int i = 0; i < competences.size(); i++) 
			newVector.add(competences.get(i).get(0));
		
		return newVector;
	}
	
	public Vector<Double> getAllXP() {
		Vector<Double> newVector = new Vector<Double>();
		for (int i = 0; i < competences.size(); i++) 
			newVector.add(Double.parseDouble(competences.get(i).get(1)));
		
		return newVector;
	}
	
	public Vector<String> getCompetenceAndXpByNumber(int i){
		return competences.get(i);
	}

	public void setCompetences(Vector<Vector <String>> competences) {
		this.competences = competences;
	}
	
	
	
}
