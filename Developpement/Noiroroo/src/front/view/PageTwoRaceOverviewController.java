package front.view;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import informations.Competence;
import informations.Race;
import javafx.beans.InvalidationListener;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PageTwoRaceOverviewController {
	
	@FXML
	private Label description;
	@FXML
	private Label descriptionComp;
	@FXML
	private Label physique;
	@FXML
	private TableView<Competence> tableCompetence;
	@FXML
	private TableColumn<Competence, String> nameCol;

	
	ObservableList<Competence> compRaces = FXCollections.observableArrayList();
	double width;
	
	
	public PageTwoRaceOverviewController() {
		// TODO Auto-generated constructor stub
	}

	 @FXML
	 private void initialize() { 	
		 description.setWrapText(true);
		 descriptionComp.setWrapText(true);
		 nameCol.setCellValueFactory(cellData -> cellData.getValue().getNomProperty());
		 tableCompetence.getSelectionModel().selectedItemProperty().addListener(
		            (observable, oldValue, newValue) -> setDescriptionCompLabel(newValue));

	}
	
	public void setDescript(Race race, Vector<Competence> competences){
		this.description.setText(race.getDescription());
		this.physique.setText(race.getApparence());
		
		compRaces.clear();
		List list = new ArrayList();

		Vector<Vector<String>> competenceRace = race.getCompetences();
		for (Vector<String> comp : competenceRace) 
			list.add(new Competence(competences.get(Integer.parseInt(comp.get(0))), Integer.parseInt(comp.get(0))));
		
		compRaces = FXCollections.observableArrayList(list);
		tableCompetence.setItems(compRaces);
	}
	
	private void setDescriptionCompLabel(Competence comp){
		descriptionComp.setText(comp.getDescription());
	}
	
	public void setWidthLabel(double width){
		this.description.setMaxWidth(width);
		this.physique.setMaxWidth(width);
		this.descriptionComp.setPrefWidth(width/(3));
	}
	public void setHeightLabel(double heigh){
		this.description.setMaxHeight(heigh);
		this.physique.setMaxHeight(heigh);
	}
}
