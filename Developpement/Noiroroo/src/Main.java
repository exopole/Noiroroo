import java.util.Vector;

import complement.*;
import fenetre.Fenetre;
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
		System.out.println(newRace.getName() + "\nStatistique de perception : \n\tPresicision " + newRace.getPrecision());
		System.out.println("\tChance " + newRace.getChance() );
		System.out.println("\tEsquive " + newRace.getEsquive() );
		System.out.println("\tHabilite " + newRace.getHabilite() );
		System.out.println("\tintellignece " + newRace.getIntelligence() );
		System.out.println("\tEndurance "+ newRace.getEndurance());
		System.out.println("\tFurtivite " + newRace.getFurtivite() );
		System.out.println("\tCharisme " + newRace.getCharisme() );
		
		System.out.println("Statistique Brute : ");
		System.out.println("\tVie " + newRace.getVie() );
		System.out.println("\tForce " + newRace.getForce());
		System.out.println("\tRapidite " + newRace.getRapidite() );
		System.out.println("\tDexterite " + newRace.getDexterite() );
		System.out.println("\tResistance " + newRace.getResistance() );
		System.out.println("\tEsprit " + newRace.getEsprit());
		System.out.println("\tDeplacement " + newRace.getDeplacement());
		
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
		System.out.println("Classe conseillé : " + newRace.getBestClass());
		System.out.println("Niveau joueur : " + newRace.getAccess());
		*/
		
		/// essaye de la class Classe
		/*
		Classe newClasse = new Classe("Classe/Alchimiste.txt");

		System.out.println(newClasse.getName() );
		System.out.println("Description : " + newClasse.getDescription() );
		System.out.println("Statistique de perception :");
		System.out.println("\tPresicision " + newClasse.getPrecision() );
		System.out.println("\tChance " + newClasse.getChance() );
		System.out.println("\tEsquive " + newClasse.getEsquive() );
		System.out.println("\tHabilite " + newClasse.getHabilite() );
		System.out.println("\tintellignece " + newClasse.getIntelligence() );
		System.out.println("\tEndurance "+ newClasse.getEndurance());
		System.out.println("\tFurtivite " + newClasse.getFurtivite() );
		System.out.println("\tCharisme " + newClasse.getCharisme() );
		
		System.out.println("Statistique Brute : ");
		System.out.println("\tVie " + newClasse.getVie() );
		System.out.println("\tForce " + newClasse.getForce());
		System.out.println("\tRapidite " + newClasse.getRapidite() );
		System.out.println("\tDexterite " + newClasse.getDexterite() );
		System.out.println("\tResistance " + newClasse.getResistance() );
		System.out.println("\tEsprit " + newClasse.getEsprit());
		
		System.out.println("Competence : ");
		for (Vector<String> vect : newClasse.getCompetences()) {
			System.out.print("\t");
			for (String str : vect) {
				System.out.print(str+ " ");
			}
			System.out.println();
		}
		
		*/
		
		Fenetre fen = new Fenetre();

	}

}
