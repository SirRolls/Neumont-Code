package Graphics;

import java.net.URL;
import java.util.ResourceBundle;

import gameControllers.Hell;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;
import models.Level;
import models.PowerUp;

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
	private Button Horse1;
	@FXML
	private Button Horse2;
	@FXML
	private Button Horse3;
	@FXML
	private Button Horse4;
	//pb0 is the main pb, in the center
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
    private Text Price1 = new Text();
    @FXML
    private Text Price2  = new Text();
    @FXML
    private Text Price3  = new Text();
    @FXML
    private Text Price4  = new Text(); 
    @FXML
    private Text Mod1  = new Text();
    @FXML
    private Text Mod2  = new Text();
    @FXML
    private Text Mod3  = new Text();
    @FXML
    private Text Mod4  = new Text();
    @FXML
    private String difficulty;
    @FXML
    private Text CurrentAmountOfSouls = new Text();
    @FXML
    private Text MaxSoulsPossible = new Text();

	// Add a public no-args constructor
	public FxFXMLController() {
	}
	Hell h = null;
	@FXML
	private void initialize() {
		Diff.setItems(FXCollections.observableArrayList("Easy","Medium","Hard"));
		difficulty = Diff.getSelectionModel().getSelectedItem();
		
		
	}
	
	private String powerUpCost(PowerUp pu) {
		StringBuilder sb =new StringBuilder();
		sb.append(pu.getSoulFee());
		return sb.toString();
	}
	private String powerUpMod(PowerUp pu) {
		StringBuilder sb =new StringBuilder();
		sb.append(pu.getPowerupmodifier());
		return sb.toString();
	}


	@FXML
	public void Start() {
		
		int diffInt = 0;
		HelpText.setVisible(false);
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
		
		StringBuilder sb = new StringBuilder();
		sb.append(h.getCurrentAmountOfSouls());
		CurrentAmountOfSouls.setText(sb.toString());
		if(true) {
			
		}
		StringBuilder sn = new StringBuilder();
		sn.append(h.getMaxSoulsPossible());
		MaxSoulsPossible.setText(sn.toString());
		
		
for(int i = 0; i < h.powerUpArray.length; i ++) {
			
			PowerUp [] puArr = h.getPowerUpArray();
			
			if(i == 0) {
				Mod1.setText(powerUpMod(puArr[i]));
				Price1.setText(powerUpCost(puArr[i]));
			}else if(i == 1) {
				Mod2.setText(powerUpMod(puArr[i]));
				Price2.setText(powerUpCost(puArr[i]));
			}else if( i == 2) {
				Mod3.setText(powerUpMod(puArr[i]));
				Price3.setText(powerUpCost(puArr[i]));
			}else {
				Mod4.setText(powerUpMod(puArr[i]));
				Price4.setText(powerUpCost(puArr[i]));
			}
			
		}
		
		Layer1CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer1CB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Level l1 = h.levelManager.get(1);
				int currAmSoul = h.getCurrentAmountOfSouls();
				int choice = Layer1CB.getSelectionModel().getSelectedItem();
				if(choice + l1.getCurrentSoulAmount()  < l1.getMaxSoulCap()) {
					l1.setCurrentSoulAmount(choice + l1.getCurrentSoulAmount()); 
				}else {
					l1.setCurrentSoulAmount(l1.getMaxSoulCap());
				}
				Integer l1max = l1.getMaxSoulCap();
				Integer l1cur = l1.getCurrentSoulAmount();
				L1Souls.setText(l1cur.toString() + '/' + l1max.toString());
				StringBuilder sb = new StringBuilder();
				
				sb.append(l1.getMaxSoulCapModifier()+"%");
				L1Mod.setText(sb.toString());
				
				StringBuilder sn = new StringBuilder();
				currAmSoul -= choice;
				sn.append(currAmSoul);
				h.setCurrentAmountOfSouls(currAmSoul);
				CurrentAmountOfSouls.setText(sn.toString());
			}
		});
		Layer2CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer2CB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int choice = Layer2CB.getSelectionModel().getSelectedItem();
				int currAmSoul = h.getCurrentAmountOfSouls();
				Level l2 = h.levelManager.get(2);
				if(choice + l2.getCurrentSoulAmount()  < l2.getMaxSoulCap()) {
					l2.setCurrentSoulAmount(choice + l2.getCurrentSoulAmount()); 
				}else {
					l2.setCurrentSoulAmount(l1.getMaxSoulCap());
				}
				Integer l2max = l2.getMaxSoulCap();
				Integer l2cur = l2.getCurrentSoulAmount();
				L2Souls.setText(l2cur.toString() + '/' + l2max.toString());
				StringBuilder sb = new StringBuilder();
				sb.append(l2.getMaxSoulCapModifier()+"%");
				L2Mod.setText(sb.toString());
				
				StringBuilder sn = new StringBuilder();
				currAmSoul -= choice;
				sn.append(currAmSoul);
				h.setCurrentAmountOfSouls(currAmSoul);
				CurrentAmountOfSouls.setText(sn.toString());
			}
		}
		);
		Layer3CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer3CB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int choice = Layer3CB.getSelectionModel().getSelectedItem();
				int currAmSoul = h.getCurrentAmountOfSouls();
				Level l3 = h.levelManager.get(3);
				if(choice + l3.getCurrentSoulAmount()  < l3.getMaxSoulCap()) {
					l3.setCurrentSoulAmount(choice + l3.getCurrentSoulAmount()); 
				}else {
					l3.setCurrentSoulAmount(l3.getMaxSoulCap());
				}
				Integer l3max = l3.getMaxSoulCap();
				Integer l3cur = l3.getCurrentSoulAmount();
				L3Souls.setText(l3cur.toString() + '/' + l3max.toString());
				StringBuilder sb = new StringBuilder();
				sb.append(l3.getMaxSoulCapModifier()+"%");
				L3Mod.setText(sb.toString());
				
				
				StringBuilder sn = new StringBuilder();
				currAmSoul -= choice;
				sn.append(currAmSoul);
				h.setCurrentAmountOfSouls(currAmSoul);
				CurrentAmountOfSouls.setText(sn.toString());
			}
		}
		);
		Layer4CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer4CB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int choice = Layer4CB.getSelectionModel().getSelectedItem();
				Level l4 = h.levelManager.get(4);
				int currAmSoul = h.getCurrentAmountOfSouls();
				if(choice + l4.getCurrentSoulAmount()  < l4.getMaxSoulCap()) {
					l4.setCurrentSoulAmount(choice + l4.getCurrentSoulAmount()); 
				}else {
					l4.setCurrentSoulAmount(l4.getMaxSoulCap());
				}
				Integer l4max = l4.getMaxSoulCap();
				Integer l4cur = l4.getCurrentSoulAmount();
				L4Souls.setText(l4cur.toString() + '/' + l4max.toString());
				StringBuilder sb = new StringBuilder();
				sb.append(l4.getMaxSoulCapModifier()+"%");
				L4Mod.setText(sb.toString());
				
				StringBuilder sn = new StringBuilder();
				currAmSoul -= choice;
				sn.append(currAmSoul);
				h.setCurrentAmountOfSouls(currAmSoul);
				CurrentAmountOfSouls.setText(sn.toString());
			}
		}
		);
		Layer5CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer5CB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int choice = Layer5CB.getSelectionModel().getSelectedItem();
				Level l5 = h.levelManager.get(5);
				int currAmSoul = h.getCurrentAmountOfSouls();
				if(choice + l5.getCurrentSoulAmount()  < l5.getMaxSoulCap()) {
					l5.setCurrentSoulAmount(choice + l5.getCurrentSoulAmount()); 
				}else {
					l5.setCurrentSoulAmount(l5.getMaxSoulCap());
				} 
				Integer l5max = l5.getMaxSoulCap();
				Integer l5cur = l5.getCurrentSoulAmount();
				L5Souls.setText(l5cur.toString() + '/' + l5max.toString());
				StringBuilder sb = new StringBuilder();
				sb.append(l5.getMaxSoulCapModifier()+"%");
				L5Mod.setText(sb.toString());
				
				StringBuilder sn = new StringBuilder();
				currAmSoul -= choice;
				sn.append(currAmSoul);
				h.setCurrentAmountOfSouls(currAmSoul);
				CurrentAmountOfSouls.setText(sn.toString());
			}
		}
		);
		Layer6CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer6CB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int choice = Layer6CB.getSelectionModel().getSelectedItem();
				int currAmSoul = h.getCurrentAmountOfSouls();
				Level l6 = h.levelManager.get(6);
				if(choice + l6.getCurrentSoulAmount()  < l6.getMaxSoulCap()) {
					l6.setCurrentSoulAmount(choice + l6.getCurrentSoulAmount()); 
				}else {
					l6.setCurrentSoulAmount(l6.getMaxSoulCap());
				}
				Integer l6max = l6.getMaxSoulCap();
				Integer l6cur = l6.getCurrentSoulAmount();
				L6Souls.setText(l6cur.toString() + '/' + l6max.toString());
				StringBuilder sb = new StringBuilder();
				sb.append(l6.getMaxSoulCapModifier()+"%");
				L6Mod.setText(sb.toString());
				
				StringBuilder sn = new StringBuilder();
				currAmSoul -= choice;
				sn.append(currAmSoul);
				h.setCurrentAmountOfSouls(currAmSoul);
				CurrentAmountOfSouls.setText(sn.toString());
			}
		}
		);
		Layer7CB.setItems(FXCollections.observableArrayList(10, 50, 100, 1000));
		Layer7CB.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				int choice = Layer7CB.getSelectionModel().getSelectedItem();
				int currAmSoul = h.getCurrentAmountOfSouls();
				Level l7 = h.levelManager.get(7);
				if(choice + l7.getCurrentSoulAmount()  < l7.getMaxSoulCap()) {
					l7.setCurrentSoulAmount(choice + l7.getCurrentSoulAmount()); 
				}else {
					l7.setCurrentSoulAmount(l7.getMaxSoulCap());
				}
				Integer l7max = l7.getMaxSoulCap();
				Integer l7cur = l7.getCurrentSoulAmount();
				L7Souls.setText(l7cur.toString() + '/' + l7max.toString());
				StringBuilder sb = new StringBuilder();
				sb.append(l7.getMaxSoulCapModifier()+"%");
				L7Mod.setText(sb.toString());
				
				StringBuilder sn = new StringBuilder();
				currAmSoul -= choice;
				sn.append(currAmSoul);
				h.setCurrentAmountOfSouls(currAmSoul);
				CurrentAmountOfSouls.setText(sn.toString());
			}
		}
	);
		
		Horse1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				int currAmSouls = h.getCurrentAmountOfSouls() - h.powerUpArray[0].getSoulFee();
				if(currAmSouls > 0) {
					StringBuilder sb = new StringBuilder();
					sb.append(currAmSouls);
					CurrentAmountOfSouls.setText(sb.toString());
				}
				
			}
			
		});
		Horse2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				int currAmSouls = h.getCurrentAmountOfSouls() - h.powerUpArray[1].getSoulFee();
				if(currAmSouls > 0) {
					StringBuilder sb = new StringBuilder();
					sb.append(currAmSouls);
					CurrentAmountOfSouls.setText(sb.toString());
				}
				
			}
			
		});
		Horse3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				int currAmSouls = h.getCurrentAmountOfSouls() - h.powerUpArray[2].getSoulFee();
				if(currAmSouls > 0) {
					StringBuilder sb = new StringBuilder();
					sb.append(currAmSouls);
					CurrentAmountOfSouls.setText(sb.toString());
				}
				
			}
			
		});
		Horse4.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				
				int currAmSouls = h.getCurrentAmountOfSouls() - h.powerUpArray[3].getSoulFee();
				if(currAmSouls > 0) {
					StringBuilder sb = new StringBuilder();
					sb.append(currAmSouls);
					CurrentAmountOfSouls.setText(sb.toString());
				}
				
			}
			
		});
		}
	
	

	public void Exit() {
		System.exit(0);
	}

}
