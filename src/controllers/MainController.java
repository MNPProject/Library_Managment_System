package controllers;
import java.io.File;
import java.io.IOException;
import java.util.EventObject;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import app.Main;;

public class MainController {

    @FXML
    private AnchorPane MainView;

    @FXML
    private Button adminLogin;

    @FXML
    private Button LibrarianLogin;

    @FXML
    void LibrarianLogin(ActionEvent event) throws IOException {
    	File file = new File("resources/LibrarianView.fxml");
    	System.out.println(file.getPath().isEmpty());
    	
    	Parent root = FXMLLoader.load(getClass().getResource(file.getPath()));
    	
    	 Scene scene = new Scene(root);
    	 
    	//FXMLLoader loader = new FXMLLoader(getClass().getResource(file.getPath()));
    	// loader.setRoot(this);
    	Stage stage = (Stage)((Node)((EventObject) event).getSource()).getScene().getWindow();
    
//    	Parent root = (Parent)loader.load();
//    	Scene scene = new Scene(root,600,600);
//    	stage.close();
    	stage.setScene(scene);
    }

    @FXML
    void adminLogin(ActionEvent event) {

    }

}
