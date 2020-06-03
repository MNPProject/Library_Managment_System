package app;
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
/**
 * Controller for the first View.
 * transition to adminLoginfrom or Librarian login form
 * @author Gutama
 *
 */
public class MainController {

    @FXML
    private AnchorPane MainView;

    @FXML
    private Button adminLogin;

    @FXML
    private Button LibrarianLogin;

    @FXML
    void LibrarianLogin(ActionEvent event) throws IOException {
    	File file = new File("app/LibrarianLoginForm.fxml");
    	System.out.println(file.getPath().isEmpty());
    	System.out.println(file.exists()+"does it?");
    	
    	Parent root = FXMLLoader.load(getClass().getResource("LibrarianLoginForm.fxml"));
    	
    	 Scene scene = new Scene(root,600,600);
    	 
    	Stage stage = (Stage)((Node)((EventObject) event).getSource()).getScene().getWindow();
    	
    	stage.setScene(scene);
    }

    @FXML
    void adminLogin(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("AdminLoginForm.fxml"));
    	Scene scene = new Scene(root,600,600);
    	Stage stage = (Stage) MainView.getScene().getWindow();
    	stage.setScene(scene);
    	// (event) => {x....}
    }
    
}
