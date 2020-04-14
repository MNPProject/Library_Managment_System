
package app;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AdminSectionController {

    @FXML
    private Button addLib;

    @FXML
    private Button ViewLibrarian;

    @FXML
    private Button deleteLibrarian;

    @FXML
    private Button logout;

    @FXML
    void ViewLibrarian(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("LibrarianView.fxml"));
    	Scene scene = new Scene(root);
    	Stage stage = (Stage) addLib.getScene().getWindow();
    	stage.setScene(scene);
    }

    @FXML
    void adminAddForm(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("AddLibrarian.fxml"));
    	Scene scene = new Scene(root);
    	Stage stage = (Stage) addLib.getScene().getWindow();
    	stage.setScene(scene);
    }

    @FXML
    void deleteLibrarian(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("LibrarianRemove.fxml"));
    	Scene scene = new Scene(root);
    	Stage stage = (Stage) addLib.getScene().getWindow();
    	stage.setScene(scene);
    }

    @FXML
    void logout(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
    	Scene scene = new Scene(root);
    	Stage stage = (Stage) addLib.getScene().getWindow();
    	stage.setScene(scene);
    }

}
