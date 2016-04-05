package informations;

import java.util.Vector;

public class Personnage {

	
	private String name;
	private Integer sexe;
	private Race race;
	private Classe classe;
	private PerceptionClasse perceptStat;
	private BruteClasse bruteStat;
	private Integer exp;
	private Vector<Competence> compList = new Vector<Competence>();
}
