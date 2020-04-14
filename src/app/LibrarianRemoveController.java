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

public class LibrarianRemoveController {

    @FXML
    private AnchorPane pane;

    @FXML
    private Label idLabel;

    @FXML
    private TextField Id;

    @FXML
    private Button deleteBtn;

    @FXML
    private Button backBtn;

    @FXML
    void back(ActionEvent event) throws IOException {
    	// deletion successfully 
    	
    	Parent root = FXMLLoader.load(getClass().getResource("AdminSection.fxml"));
    	Scene scene = new Scene(root);
    	Stage stage = (Stage) pane.getScene().getWindow();
    	stage.setScene(scene);
    }

    @FXML
    void delete(ActionEvent event)  {
    	Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Record deleted successfully");
    	
        
    	alert.showAndWait();
    	
    }

}
