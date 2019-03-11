package controllers;

import java.util.ResourceBundle;
import java.awt.Button;
import java.net.URL;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ProgressBar;

public class FxFXMLController {
	@FXML
	private URL location;
	@FXML
	private ProgressBar pb1;
	@FXML
	private ProgressBar pb2;
	@FXML
	private ProgressBar pb3;
	@FXML
	private ProgressBar pb4;
	@FXML
	private ProgressBar pb5;
	@FXML
	private ProgressBar pb6;
	@FXML
	private ProgressBar pb7;
	@FXML
	private ProgressBar pb8;
	@FXML
	private ProgressBar pb9;
	@FXML
	private ChoiceBox Layer1CB;
	@FXML
	private ChoiceBox Layer2CB;
	@FXML
	private ChoiceBox Layer3CB;
	@FXML
	private ChoiceBox Layer4CB;
	@FXML
	private ChoiceBox Layer5CB;
	@FXML
	private ChoiceBox Layer6CB;
	@FXML
	private ChoiceBox Layer7CB;
	@FXML
	private ResourceBundle resources;
	@FXML
	private Button startButton;

	// Add a public no-args constructor
	public FxFXMLController() {
	}

	@FXML
	private void initialize() {
	}
	
	@FXML
	public void StartButtonPressed() {
	}

	@FXML
	public void Layer1ChoiceBox() {
	}

	@FXML
	public void Layer2ChoiceBox() {
	}

	@FXML
	public void Layer3ChoiceBox() {
	}

	@FXML
	public void Layer4ChoiceBox() {
	}

	@FXML
	public void Layer5ChoiceBox() {
	}

	@FXML
	public void Layer6ChoiceBox() {
	}

	@FXML
	public void Layer7ChoiceBox() {
	}

	@FXML
	public void InitGame() {
		Layer1CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer2CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer3CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer4CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer5CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer6CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer7CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));

	}
}
