
import java.io.File;
import java.util.Vector;

import complement.*;
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
    
    private String lorem = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Eligendi non quis exercitationem culpa nesciunt nihil aut nostrum explicabo reprehenderit optio amet ab temporibus asperiores quasi cupiditate. Voluptatum ducimus voluptates voluptas?";
    
    /*
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.textLabel = new Label(lorem );
        textLabel.setWrapText(true);

        this.imageView = new ImageView("http://goo.gl/1tEZxQ");
        imageView.setFitWidth(240);
        imageView.setPreserveRatio(true);

        hBox = new HBox();
        hBox.setSpacing(8);

        vBox = new VBox();
        vBox.setSpacing(8);

        mainPane = new StackPane();
        mainPane.setPadding(new Insets(24));

        changeToLargeLayout();

        primaryStage.widthProperty().addListener(e -> {
            if(primaryStage.getWidth() < 600) {
                changeToSmallLayout();
            } else {
                changeToLargeLayout();
            }
        });

        primaryStage.setScene(new Scene(mainPane));
        primaryStage.show();
    }*/
    
    private void initUI(Stage stage) {

        AnchorPane root = new AnchorPane();
       
        Button okBtn = new Button("OK");
        Button closeBtn = new Button("Close");
        HBox hbox = new HBox(5, okBtn, closeBtn);

        root.getChildren().addAll(hbox);
        
        AnchorPane.setRightAnchor(hbox, 10d);
        AnchorPane.setBottomAnchor(hbox, 10d);

        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("Corner buttons");
        stage.setScene(scene);
        stage.show();
    }

    public void changeToSmallLayout() {
        hBox.getChildren().clear();
        vBox.getChildren().clear();
        vBox.getChildren().addAll(imageView, textLabel);
        mainPane.getChildren().clear();
        mainPane.getChildren().add(vBox);
    }

    public void changeToLargeLayout() {
        hBox.getChildren().clear();
        vBox.getChildren().clear();
        hBox.getChildren().addAll(imageView, textLabel);
        mainPane.getChildren().clear();
        mainPane.getChildren().add(hBox);
    }
    
    
    
    @Override
    public void start(Stage primaryStage) throws Exception{
    	
    	File[] listOfFilesRace = (new File("Race/")).listFiles();
		Vector <Race> races = new Vector<Race>();
		File[] listOfFilesClasse = (new File("Classe/")).listFiles();
		Vector <Classe> classes = new Vector<Classe>();

		for (int i = 0; i < listOfFilesRace.length ; i++)
			races.add(new Race(listOfFilesRace[i].getPath()));
		
		for (int i = 0; i < listOfFilesClasse.length ; i++)
			classes.add(new Classe(listOfFilesClasse[i].getPath()));
		
		Vector<Competence> competences = new Vector<Competence>();
		Vector<String> fileContenant = ParsingFile.readFile("Competence/competences.txt");
		for (String comp : fileContenant) 
			competences.addElement(new Competence(comp));
    	
    	/*
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");

        initRootLayout();

        showRaceOverview();
        */
		
		ChoiceBox cbRace = new ChoiceBox();
		for (int i = 0; i < races.size(); i++) {
			cbRace.getItems().add(races.get(i).getName());

		}
		
		ChoiceBox cbClasses = new ChoiceBox();
		for (int i = 0; i < classes.size(); i++) {
			cbClasses.getItems().add(classes.get(i).getName());

		}
		  
	        
        GridPane race = new GridPane();
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(100/3);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(100/3);
        ColumnConstraints column3 = new ColumnConstraints();
        column3.setPercentWidth(100/3);
        race.getColumnConstraints().addAll(column1, column2, column3); 	 
        
        Pane statistiquePan = new Pane();
        statistiquePan.autosize();

        Pane namePan = new Pane();
        
        
        HBox hboxName = new HBox(20);
        hboxName.getChildren().addAll(new Label("Race : "),  cbRace);
        hboxName.setLayoutX(50);
        hboxName.setLayoutY(100);
        statistiquePan.getChildren().add(hboxName);
        race.add(statistiquePan, 0,1);
        race.add(new Label("Description"), 1, 1);
        race.add(new Label("Compétences"), 2, 1);
        
        primaryStage.setScene(new Scene(race));
        primaryStage.setFullScreen(true);
        primaryStage.show();
        
    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/RootLayout.fxml"));
            
            
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.setFullScreen(true);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showRaceOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("view/RaceOverview.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
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
		/*
		File[] listOfFilesRace = (new File("Race/")).listFiles();
		Vector <Race> races = new Vector<Race>();
		File[] listOfFilesClasse = (new File("Classe/")).listFiles();
		Vector <Classe> classes = new Vector<Classe>();

		for (int i = 0; i < listOfFilesRace.length ; i++)
			races.add(new Race(listOfFilesRace[i].getPath()));
		
		for (int i = 0; i < listOfFilesClasse.length ; i++)
			classes.add(new Classe(listOfFilesClasse[i].getPath()));
		
		Vector<Competence> competences = new Vector<Competence>();
		Vector<String> fileContenant = ParsingFile.readFile("Competence/competences.txt");
		for (String comp : fileContenant) 
			competences.addElement(new Competence(comp));
		System.out.println("fin de la partie back début du front");
		*/
		launch(args);
	}

}
