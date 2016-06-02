package front.view;

import java.util.logging.Logger;

import NoirorooApp.Main;
import informations.Classe;
import informations.Race;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class StatistiqueOverviewControl {
	//label des statistique de précision
	@FXML
    private Label chance;
	@FXML
    private Label charisme;
	@FXML
    private Label endurance;
	@FXML
    private Label esquive;
	@FXML
    private Label furtivite;
	@FXML
    private Label habilite;
	@FXML
    private Label intelligence;
	@FXML
    private Label precision;
	//label des statistique brute
	@FXML
    private Label dexterite;
	@FXML
    private Label esprit;
	@FXML
    private Label force;
	@FXML
    private Label rapidite;
	@FXML
    private Label resistance;
	@FXML
    private Label vie;
	@FXML
    private Label deplacement;

	
	
	private Main main;
	
	
	public StatistiqueOverviewControl() {
		// TODO Auto-generated constructor stub
	}

	
	private void showStatistique(Classe classe){
		chance.setText(classe.getStatPerception().getChance().toString());
		charisme.setText(classe.getStatPerception().getCharisme().toString());
		endurance.setText(classe.getStatPerception().getEndurance().toString());
		esquive.setText(classe.getStatPerception().getEsquive().toString());
		furtivite.setText(classe.getStatPerception().getFurtivite().toString());
		habilite.setText(classe.getStatPerception().getHabilite().toString());
		intelligence.setText(classe.getStatPerception().getIntelligence().toString());
		precision.setText(classe.getStatPerception().getPrecision().toString());
		//Initialisation des statistique brute
		dexterite.setText(classe.getStatBrute().getDexterite().toString());
		esprit.setText(classe.getStatBrute().getEsprit().toString());
		force.setText(classe.getStatBrute().getForce().toString());
		rapidite.setText(classe.getStatBrute().getRapidite().toString());
		resistance.setText(classe.getStatBrute().getResistance().toString());
		vie.setText(classe.getStatBrute().getVie().toString());
		
	}
	
	private void showStatistique(Race race){
		chance.setText(race.getStatPerception().getChance().toString());
		charisme.setText(race.getStatPerception().getCharisme().toString());
		endurance.setText(race.getStatPerception().getEndurance().toString());
		esquive.setText(race.getStatPerception().getEsquive().toString());
		furtivite.setText(race.getStatPerception().getFurtivite().toString());
		habilite.setText(race.getStatPerception().getHabilite().toString());
		intelligence.setText(race.getStatPerception().getIntelligence().toString());
		precision.setText(race.getStatPerception().getPrecision().toString());
		//Initialisation des statistique brute
		dexterite.setText(race.getStatBrute().getDexterite().toString());
		esprit.setText(race.getStatBrute().getEsprit().toString());
		force.setText(race.getStatBrute().getForce().toString());
		rapidite.setText(race.getStatBrute().getRapidite().toString());
		resistance.setText(race.getStatBrute().getResistance().toString());
		vie.setText(race.getStatBrute().getVie().toString());
		deplacement.setText(race.getStatBrute().getDeplacement().toString());
		
	}
}
