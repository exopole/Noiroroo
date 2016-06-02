package front.view;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javafx.beans.value.ChangeListener;

import NoirorooApp.Main;
import informations.Race;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class PageOneRaceOverviewController {
	
	@FXML
    private Label bestClasse;
	@FXML
    private Label lvlPlayer;
	@FXML
	private ChoiceBox cbox;
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
	PageTwoRaceOverviewController controller;
	
	private Vector<Race> races = new Vector<Race>();
	private ObservableList<String> raceName;
	
	
	public PageOneRaceOverviewController() {
		
	}
	
	/**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
    	/*
    	for (Race race : races) {
			cbox.getItems().add(race.getName());
		}
    	showStatistique(races.get(0));
    	*/
    	
    	
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
	
	public void showrace(Race race){
		showStatistique(race);
		bestClasse.setText(race.getBestClass());
		lvlPlayer.setText(race.getAccess());
	}
	
	
	
	
	public void setMainApp(Main main){
		this.main = main;
		races = main.getRaces();
		List<String> list = new ArrayList<String>();

		for (Race race : races) {
			list.add(race.getName());
		}
	    raceName = FXCollections.observableList(list);
        FXMLLoader loaderPageTwoRace = new FXMLLoader();

        cbox.getItems().addAll(raceName);
	    cbox.getSelectionModel().select(0);
	    cbox.getSelectionModel().selectedIndexProperty().addListener(new  
	    		ChangeListener<Number>() 
	    		{
	    		public void changed(ObservableValue observable,Number  
	    		oldValue,Number newValue) 
	    		{
	    			Race race = races.get(newValue.intValue());
	    			showrace(race);
	    			main.setPage2Race(newValue.intValue());
	    		}   
	    });
	    
	    showrace(races.get(0));

	    System.out.println(races.get(0).getName());
	}
	
}
