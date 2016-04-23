package informations;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;
import parsing.*;
import statistiques.StatistiqueBruteClasse;
import statistiques.StatistiqueBruteRace;
import statistiques.StatistiquePerception;

public class Race {
	Vector<String> fileContenant;
	private String name;
	private String description;
	// vecteur regroupant toute les statistique de perception : Precision, Chance, Esquive, Habilite, Inteligence, Furtivite, Charisme
	private StatistiquePerception statPerception;
	// Vecteur regroupant toutes les statistiques Brute : Vie, Force, Rapidite, Dexterite, Resistance, Esprit, Deplacement
	private StatistiqueBruteRace statBrute;
	// Vecteur regroupant toutes les competences possibles avec le nombre de point d'exp besoin
	private Vector<Vector<String>> competences;

	private String apparence;
	// classe conseille par le maitre de jeu avec cette classe
	private String bestClass;
	// niveau de joueur conseille (ex : experimente)
	private String access;
	
	private Boolean compute = false;

	

	
	public Race(String nameFile) {
		Vector<String> fileContenant = ParsingFile.readFile(nameFile);
		name = fileContenant.get(0);
		statPerception = new StatistiquePerception(fileContenant.get(1));	
		statBrute = new StatistiqueBruteRace(fileContenant.get(2));
		competences =ParsingString.split2time(fileContenant.get(3), ";", ",");
		description = fileContenant.get(4);
		apparence = fileContenant.get(5);
		bestClass = fileContenant.get(6);
		access = fileContenant.get(7);
	}

	
	/////////////  getter //////////
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}


	/**
	 * @return the statPerception
	 */
	public StatistiquePerception getStatPerception() {
		return statPerception;
	}


	/**
	 * @return the statBrute
	 */
	public StatistiqueBruteRace getStatBrute() {
		return statBrute;
	}


	// getter pour les competences
	public Vector<Vector<String>> getCompetences() {
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

	public Vector<String> getCompetenceAndXpByNumber(int i) {
		return competences.get(i);
	}
	
	
	// getter pour les notes du maitre de jeu
	public String getAccess() {
		return access;
	}
	
	public String getApparence() {
		return apparence;
	}
	
	public String getBestClass() {
		return bestClass;
	}
	
	public void compute() {
		if (compute == false)
		{
			statBrute.compute();
			statPerception.compute();
			compute = true;
		}
	}
	////////////// parsing des fichiers ///////////////
	
}
