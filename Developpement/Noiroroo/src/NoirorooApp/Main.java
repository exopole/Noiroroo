package NoirorooApp;

import java.io.File;
import java.util.Vector;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;
import complement.*;
import front.view.PageOneRaceOverviewController;
import front.view.PageTwoRaceOverviewController;
import informations.*;
import parsing.*;

import java.io.IOException;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application{
	private Label textLabel;

	private ImageView imageView;

	private VBox vBox;
	private HBox hBox;

  	private StackPane mainPane;

	  
	private Stage primaryStage;
    private BorderPane rootLayout;
    
    
    private Vector<Race> races = new Vector<Race>();
    private Vector <Classe> classes = new Vector<Classe>();
    private Vector<Competence> competences = new Vector<Competence>();
    PageTwoRaceOverviewController controllerRacePage2 ;
    PageOneRaceOverviewController controllerRacePage1;
    
    private String lorem = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eligendi non quis exercitationem culpa nesciunt nihil aut nostrum explicabo reprehenderit optio amet ab temporibus asperiores quasi cupiditate. Voluptatum ducimus voluptates voluptas?";
    	
    @Override
    public void start(Stage primaryStage) throws Exception{
    	ChoiceBox cbRace = new ChoiceBox();
		for (int i = 0; i < races.size(); i++) 
			cbRace.getItems().add(races.get(i).getName());
		
		ChoiceBox cbClasses = new ChoiceBox();
		for (int i = 0; i < classes.size(); i++) 
			cbClasses.getItems().add(classes.get(i).getName());
		  
	        
        GridPane race = new GridPane();
        
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(100/3);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth((100/3));
        	 
        
        Pane statistiquePan = new Pane();
        statistiquePan.autosize();
        
        Pane descriptionPan = new Pane();
  

        
        
       /* HBox hboxName = new HBox(20);
        hboxName.getChildren().addAll(new Label("Race : "),  cbRace);
        hboxName.setLayoutX(20);
        hboxName.setLayoutY(50);
        */
        FXMLLoader loaderBruteRace = new FXMLLoader();
        loaderBruteRace.setLocation(Main.class.getResource("../front/view/StatistiqueRaceOverview.fxml"));
        
        VBox bruteRace = (VBox) loaderBruteRace.load();
        
        FXMLLoader loaderPageOneRace = new FXMLLoader();
        loaderPageOneRace.setLocation(Main.class.getResource("../front/view/PageOneRaceOverview.fxml"));
        VBox pageOneRace = (VBox) loaderPageOneRace.load();

        
        FXMLLoader loaderPageTwoRace = new FXMLLoader();
        loaderPageTwoRace.setLocation(Main.class.getResource("../front/view/PageTwoRaceOverview.fxml"));
        VBox pageTwoRace = (VBox) loaderPageTwoRace.load();
        
        controllerRacePage2 = loaderPageTwoRace.getController();
        controllerRacePage2.setDescript(races.get(0), competences);

        controllerRacePage1 = loaderPageOneRace.getController();
        controllerRacePage1.setMainApp(this);
        
        
        statistiquePan.getChildren().add(pageOneRace);
        race.add(statistiquePan, 0,1);
        
        descriptionPan.getChildren().add(pageTwoRace);
        race.add(descriptionPan, 1, 1);
        
        
        
        primaryStage.setScene(new Scene(race));
        primaryStage.setFullScreen(true);

        primaryStage.show();
        
        controllerRacePage2.setWidthLabel(primaryStage.getWidth());
        //controllerRacePage2.setHeightLabel(primaryStage.getHeight()/2);
    	
        
    }

   
    public Main(){
    	File[] listOfFilesRace = (new File("RaceJSON/")).listFiles();
		File[] listOfFilesClasse = (new File("ClasseJSON/")).listFiles();

		for (int i = 0; i < listOfFilesRace.length ; i++)
			races.add(new Race(listOfFilesRace[i].getPath()));
		
		for (int i = 0; i < listOfFilesClasse.length ; i++)
			classes.add(new Classe(listOfFilesClasse[i].getPath()));
		
		competences = new Vector<Competence>();
		Vector<String> fileContenant = ParsingFile.readFile("Competence/competences.txt");
		for (String comp : fileContenant) 
			competences.addElement(new Competence(comp));
		
		
		
    }
    
    public Vector<Race> getRaces(){
    	return races;
    }
    
    public Vector<Classe> getClasses(){
    	return classes;
    }
    
    
    public void setPage2Race(int index){
        controllerRacePage2.setDescript(races.get(index), competences);

    }

    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		launch(args);
	}

}
