package Graphics;

import java.net.URL;
import java.util.ResourceBundle;

import gameControllers.Hell;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ProgressBar;
import javafx.scene.text.Text;
import models.Level;

public class FxFXMLController {
	@FXML
	private Text L1Souls;
	@FXML
	private Text L2Souls;
	@FXML
	private Text L3Souls;
	@FXML
	private Text L4Souls;
	@FXML
	private Text L5Souls;
	@FXML
	private Text L6Souls;
	@FXML
	private Text L7Souls;
	@FXML
	private Text L1Mod;
	@FXML
	private Text L2Mod;
	@FXML
	private Text L3Mod;
	@FXML
	private Text L4Mod;
	@FXML
	private Text L5Mod;
	@FXML
	private Text L6Mod;
	@FXML
	private Text L7Mod;
	@FXML
	private Text HelpText;
	@FXML
	private URL location;
	@FXML
	private ProgressBar pb1 = new ProgressBar(1);
	@FXML                   
	private ProgressBar pb2 = new ProgressBar(1);
	@FXML                   
	private ProgressBar pb3 = new ProgressBar(1);
	@FXML                   
	private ProgressBar pb4 = new ProgressBar(1);
	@FXML                   
	private ProgressBar pb5 = new ProgressBar(1);
	@FXML                   
	private ProgressBar pb6 = new ProgressBar(1);
	@FXML                   
	private ProgressBar pb7 = new ProgressBar(1);
	@FXML                   
	private ProgressBar pb8 = new ProgressBar(1);
	@FXML                   
	private ProgressBar pb9 = new ProgressBar(1);
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
    @FXML
    private ChoiceBox<String> Diff = new ChoiceBox<String>();
    
    @FXML
    private String difficulty;

	// Add a public no-args constructor
	public FxFXMLController() {
	}
	//TODO why is this null?
	//because we need a class level instance of Hell but Hell's constructor needs an integer passed in which is handled later
	
	Hell h = null;
	@FXML
	private void initialize() {
		Diff.setItems(FXCollections.observableArrayList("Easy","Medium","Hard"));
		difficulty = Diff.getSelectionModel().getSelectedItem();
		
	}


	@FXML
	public void Start() {
		int diffInt = 0;
		HelpText.setVisible(false);
//		pb1.setProgress(0.0);
		if(difficulty != null) {
			
			if(difficulty.equals("Easy")) {
				diffInt = 3;
			}else if(difficulty.equals("Medium")) {
				diffInt = 2;
			}else {
				diffInt = 1;
			}
		}else {
			diffInt = 3;
		}
		h = new Hell(diffInt);
		Layer1CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer1CB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				float progressChanged = 0;
				Level l1 = h.levelManager.get(1);
				int choice = Layer1CB.getSelectionModel().getSelectedItem();
				Integer l1max = l1.getMaxSoulCap();
				Integer l1cur = l1.getCurrentSoulAmount();
				L1Souls.setText(l1cur.toString() + '/' + l1max.toString());
				StringBuilder sb = new StringBuilder();
				sb.append(l1.getMaxSoulCapModifier());
				L1Mod.setText(sb.toString());
				if(choice == 10) {
				progressChanged = 100 * .001f;
				}else if(choice == 50) {
					progressChanged = 100 * .005f;
				}else if(choice == 100) {
					progressChanged = 100 *.01f;
				}else {
					progressChanged = 100 * .1f;
				}
				
				pb1.setProgress(progressChanged);
			}
		});
		Layer2CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer2CB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int choice = Layer2CB.getSelectionModel().getSelectedItem();
				float progressChanged = 0;
				Level l2 = h.levelManager.get(2);
				Integer l2max = l2.getMaxSoulCap();
				Integer l2cur = l2.getCurrentSoulAmount();
				L2Souls.setText(l2cur.toString() + '/' + l2max.toString());
				if(choice == 10) {
				progressChanged = 100 * .001f;
				}else if(choice == 50) {
					progressChanged = 100 * .005f;
				}else if(choice == 100) {
					progressChanged = 100 *.01f;
				}else {
					progressChanged = 100 * .1f;
				}
				
				pb2.setProgress(progressChanged);
			}
		}
		);
		Layer3CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer3CB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int choice = Layer3CB.getSelectionModel().getSelectedItem();
				float progressChanged = 0;
				Level l3 = h.levelManager.get(3);
				Integer l3max = l3.getMaxSoulCap();
				Integer l3cur = l3.getCurrentSoulAmount();
				L3Souls.setText(l3cur.toString() + '/' + l3max.toString());
				if(choice == 10) {
				progressChanged = 100 * .001f;
				}else if(choice == 50) {
					progressChanged = 100 * .005f;
				}else if(choice == 100) {
					progressChanged = 100 *.01f;
				}else {
					progressChanged = 100 * .1f;
				}
				
				pb3.setProgress(progressChanged);
			}
		}
		);
		Layer4CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer4CB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int choice = Layer4CB.getSelectionModel().getSelectedItem();
				float progressChanged = 0;
				Level l4 = h.levelManager.get(4);
				Integer l4max = l4.getMaxSoulCap();
				Integer l4cur = l4.getCurrentSoulAmount();
				L4Souls.setText(l4cur.toString() + '/' + l4max.toString());
				if(choice == 10) {
				progressChanged = 100 * .001f;
				}else if(choice == 50) {
					progressChanged = 100 * .005f;
				}else if(choice == 100) {
					progressChanged = 100 *.01f;
				}else {
					progressChanged = 100 * .1f;
				}
				
				pb4.setProgress(progressChanged);
			}
		}
		);
		Layer5CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer5CB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int choice = Layer5CB.getSelectionModel().getSelectedItem();
				float progressChanged = 0;
				Level l5 = h.levelManager.get(5);
				Integer l5max = l5.getMaxSoulCap();
				Integer l5cur = l5.getCurrentSoulAmount();
				L5Souls.setText(l5cur.toString() + '/' + l5max.toString());
				if(choice == 10) {
				progressChanged = 100 * .001f;
				}else if(choice == 50) {
					progressChanged = 100 * .005f;
				}else if(choice == 100) {
					progressChanged = 100 *.01f;
				}else {
					progressChanged = 100 * .1f;
				}
				
				pb5.setProgress(progressChanged);
			}
		}
		);
		Layer6CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer6CB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int choice = Layer6CB.getSelectionModel().getSelectedItem();
				float progressChanged = 0;
				Level l6 = h.levelManager.get(6);
				Integer l6max = l6.getMaxSoulCap();
				Integer l6cur = l6.getCurrentSoulAmount();
				L6Souls.setText(l6cur.toString() + '/' + l6max.toString());
				if(choice == 10) {
				progressChanged = 100 * .001f;
				}else if(choice == 50) {
					progressChanged = 100 * .005f;
				}else if(choice == 100) {
					progressChanged = 100 *.01f;
				}else {
					progressChanged = 100 * .1f;
				}
				
				pb3.setProgress(progressChanged);
			}
		}
		);
		Layer7CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer7CB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int choice = Layer7CB.getSelectionModel().getSelectedItem();
				float progressChanged = 0;
				Level l7 = h.levelManager.get(7);
				Integer l7max = l7.getMaxSoulCap();
				Integer l7cur = l7.getCurrentSoulAmount();
				L7Souls.setText(l7cur.toString() + '/' + l7max.toString());
				if(choice == 10) {
				progressChanged = 100 * .001f;
				}else if(choice == 50) {
					progressChanged = 100 * .005f;
				}else if(choice == 100) {
					progressChanged = 100 *.01f;
				}else {
					progressChanged = 100 * .1f;
				}
				
				pb3.setProgress(progressChanged);
			}
		}
	);}
	
	

	public void Exit() {
		System.exit(0);
	}

}
