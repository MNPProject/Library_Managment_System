
package app;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddLibrarianController {

    @FXML
    private Button addbtn;

    @FXML
    private Button backbtn;

    @FXML
    private TextField LibName;

    @FXML
    private PasswordField libPass;

    @FXML
    private TextField libEmail;

    @FXML
    private TextField libAddress;

    @FXML
    private TextField LibCity;

    @FXML
    private TextField libContactNo;

    @FXML
    void add(ActionEvent event) throws IOException {
    	Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Librarian Added successfully");
    	
    
    	alert.showAndWait();
    	
    	
    }

    @FXML
    void back(ActionEvent event) throws IOException{
    	Parent root = FXMLLoader.load(getClass().getResource("AdminSection.fxml"));
    	Scene scene = new Scene(root);
    	Stage stage = (Stage) backbtn.getScene().getWindow();
    	stage.setScene(scene);
    }

}
