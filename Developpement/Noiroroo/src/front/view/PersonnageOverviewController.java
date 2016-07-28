/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package front.view;

import informations.Competence;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author exopole
 */
public class PersonnageOverviewController implements Initializable {

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

    //description de la race
    @FXML
    private Label description;
    @FXML
    private Label descriptionComp;
    @FXML
    private Label compName;
    @FXML
    private Label physique;
    @FXML
    private TableView<Competence> tableCompetence;
    @FXML
    private TableColumn<Competence, String> nameCol;

    ObservableList<Competence> compList = FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    
   
    
}
