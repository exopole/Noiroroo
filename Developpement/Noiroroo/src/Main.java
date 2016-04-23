
import java.util.Vector;

import complement.*;
import fenetre.Fenetre;
import fenetre.FenetreRace;
import informations.*;
import parsing.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// essaye de la classe De
		/*
		int[] tabl = new int[6];
		for (int i = 0; i < 100; i++){
			De newde = new De("2D6");
			tabl[newde.getResult()-1]++;
		}
		
		for (int i = 0; i < tabl.length; i++) {
			System.out.println(i + " : " + tabl[i]);
		}
		*/
		
		
		// essaye de la classe Race
		//Vie, Force, Rapidite, Dexterite, Resistance, Esprit, Deplacement
		/*
		Race newRace = new Race("Race/Ardamirs.txt");
		newRace.getStatBrute().compute();
		newRace.getStatPerception().compute();
		System.out.println("Esprit : " + newRace.getStatBrute().getEsprit().getValue());
		System.out.println("Deplacement : " + newRace.getStatBrute().getDeplacement().getValue());
		System.out.println("Dexterite : " + newRace.getStatBrute().getDexterite().getValue());
		System.out.println("Force : " + newRace.getStatBrute().getForce().getValue());
		System.out.println("Rapidite : " + newRace.getStatBrute().getRapidite().getValue());
		System.out.println("Resistance : " + newRace.getStatBrute().getResistance().getValue());
		System.out.println("Vie : " + newRace.getStatBrute().getVie().getValue());
		System.out.println("Chance : " + newRace.getStatPerception().getChance().getValue());
		System.out.println("Charisme : " + newRace.getStatPerception().getCharisme().getValue());
		System.out.println("Endurance : " + newRace.getStatPerception().getEndurance().getValue());
		System.out.println("Esquive : " + newRace.getStatPerception().getEsquive().getValue());
		System.out.println("Furtivite : " + newRace.getStatPerception().getFurtivite().getValue());
		System.out.println("Habilite : " + newRace.getStatPerception().getHabilite().getValue());
		System.out.println("Intelligence : " + newRace.getStatPerception().getIntelligence().getValue());
		System.out.println("Precision : " + newRace.getStatPerception().getPrecision().getValue());
		System.out.println("Competence : ");
		
		for (Vector<String> vect : newRace.getCompetences()) {
			System.out.print("\t");
			for (String str : vect) {
				System.out.print(str+ " ");
			}
			System.out.println();
		}
		
		System.out.println("Description : " + newRace.getDescription() );
		System.out.println("Apparence : " + newRace.getApparence()	);
		System.out.println("Classe conseill� : " + newRace.getBestClass());
		System.out.println("Niveau joueur : " + newRace.getAccess());
		*/
		
		/// essaye de la class Classe
		/*
		Classe newClasse = new Classe("Classe/Alchimiste.txt");
		newClasse.compute();
		System.out.println(newClasse.getName() );
		System.out.println("Description : " + newClasse.getDescription() );
		System.out.println("Statistique de perception :");
		System.out.println("\tPresicision " + newClasse.getStatPerception().getPrecision().getValue() );
		System.out.println("\tChance " + newClasse.getStatPerception().getPrecision().getValue() );
		System.out.println("\tEsquive " + newClasse.getStatPerception().getEsquive().getValue() );
		System.out.println("\tHabilite " + newClasse.getStatPerception().getHabilite().getValue() );
		System.out.println("\tintellignece " + newClasse.getStatPerception().getIntelligence().getValue() );
		System.out.println("\tEndurance "+ newClasse.getStatPerception().getEndurance().getValue());
		System.out.println("\tFurtivite " + newClasse.getStatPerception().getFurtivite().getValue() );
		System.out.println("\tCharisme " + newClasse.getStatPerception().getFurtivite().getValue() );
		
		System.out.println("Statistique Brute : ");
		System.out.println("\tVie " + newClasse.getStatBrute().getVie().getValue() );
		System.out.println("\tForce " + newClasse.getStatBrute().getForce().getValue());
		System.out.println("\tRapidite " + newClasse.getStatBrute().getRapidite().getValue() );
		System.out.println("\tDexterite " + newClasse.getStatBrute().getDexterite().getValue() );
		System.out.println("\tResistance " + newClasse.getStatBrute().getResistance().getValue() );
		System.out.println("\tEsprit " + newClasse.getStatBrute().getEsprit().getValue());
		
		
		
		System.out.println("Competence : ");
		for (Vector<String> vect : newClasse.getCompetences()) {
			System.out.print("\t");
			for (String str : vect) {
				System.out.print(str+ " ");
			}
			System.out.println();
		}
		
		*/
		
		//FenetreRace fen = new FenetreRace();

	}

}
