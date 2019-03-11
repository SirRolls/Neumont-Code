package controllers;

import java.util.ResourceBundle;

import java.net.URL;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ProgressBar;

public class FxFXMLController {

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
	    private ChoiceBox<Integer> Layer1CB;
	    @FXML
	    private ChoiceBox<Integer> Layer2CB;
	    @FXML
	    private ChoiceBox<Integer> Layer3CB;
	    @FXML
	    private ChoiceBox<Integer> Layer4CB;
	    @FXML
	    private ChoiceBox<Integer> Layer5CB;
	    @FXML
	    private ChoiceBox<Integer> Layer6CB;
	    @FXML
	    private ChoiceBox<Integer> Layer7CB;
	    @FXML
	    private ResourceBundle resources;
	     
	    // Add a public no-args constructor
	    public FxFXMLController() 
	    {
	    }
	     
	    @FXML
	    private void initialize() 
	    {
	    }
	    @FXML
	    public void Layer1ButtonPressed() {
	    	
	    }
	    @FXML
	    public void Start() {
	    	Layer1CB.setItems(FXCollections.observableArrayList(10,50,100,1000));
	    	Layer1CB.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					int choice = Layer1CB.getSelectionModel().getSelectedItem();
					
				}
			});
	    	Layer2CB.setItems(FXCollections.observableArrayList(10,50,100,1000));
	    	Layer2CB.setOnAction(new EventHandler<ActionEvent>() {
	    		
	    		@Override
	    		public void handle(ActionEvent event) {
					int choice = Layer2CB.getSelectionModel().getSelectedItem();
					
				}}
	    	
	    	);
	    	Layer3CB.setItems(FXCollections.observableArrayList(10,50,100,1000));
	    	Layer3CB.setOnAction(new EventHandler<ActionEvent>() {
	    		
	    		@Override
	    		public void handle(ActionEvent event) {
					int choice = Layer3CB.getSelectionModel().getSelectedItem();
					
				}}
	    	
	    	);
	    	Layer4CB.setItems(FXCollections.observableArrayList(10,50,100,1000));
	    	Layer4CB.setOnAction(new EventHandler<ActionEvent>() {
	    		
	    		@Override
	    		public void handle(ActionEvent event) {
					int choice = Layer4CB.getSelectionModel().getSelectedItem();
					
				}}
	    	
	    	);
	    	Layer5CB.setItems(FXCollections.observableArrayList(10,50,100,1000));
	    	Layer5CB.setOnAction(new EventHandler<ActionEvent>() {
	    		
	    		@Override
	    		public void handle(ActionEvent event) {
					int choice = Layer5CB.getSelectionModel().getSelectedItem();
					
				}}
	    	
	    	);
	    	Layer6CB.setItems(FXCollections.observableArrayList(10,50,100,1000));
	    	Layer6CB.setOnAction(new EventHandler<ActionEvent>() {
	    		
	    		@Override
	    		public void handle(ActionEvent event) {
					int choice = Layer6CB.getSelectionModel().getSelectedItem();
					
				}}
	    	
	    	);
	    	Layer7CB.setItems(FXCollections.observableArrayList(10,50,100,1000));
	    	Layer7CB.setOnAction(new EventHandler<ActionEvent>() {
	    		
	    		@Override
	    		public void handle(ActionEvent event) {
					int choice = Layer7CB.getSelectionModel().getSelectedItem();
					
				}}
	    	
	    	);
	    	}
		public void Exit() {
	    	System.exit(0);
	    }

}
