package controllers;

import java.util.ResourceBundle;

import java.net.URL;

import javafx.fxml.FXML;
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
	    public void TestPb() {
	    	pb1.setProgress(1);
	    	pb2.setProgress(.5);
	    }
}
