package app;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AddBooksController {


    @FXML
    private AnchorPane pane;

    @FXML
    private TextField name;

    @FXML
    private TextField CallNo;

    @FXML
    private TextField author;

    @FXML
    private TextField publisher;

    @FXML
    private TextField quantity;

    @FXML
    private Button addBtn;

    @FXML
    private Button backBtn;

    @FXML
    void add(ActionEvent event) throws IOException {
    	System.out.println("book added");
    	Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Book Added successfully");
    	
    
    	alert.showAndWait();
    	
    	
    }

    @FXML
    void back(ActionEvent event) throws IOException{
    	Parent root = FXMLLoader.load(getClass().getResource("LibrarianSection.fxml"));
    	Scene scene = new Scene(root, 600, 600);
    	Stage stage = (Stage) pane.getScene().getWindow();
    	stage.setScene(scene);
    }
}
