
/**
 * Take in inputs from the user.
 * Authenticate and admit the user or reject user if fails.
 * @author Gutama
 *
 */
package app;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LibrarianLoginFormController {

	@FXML 
	private AnchorPane pane;
	
    @FXML
    private PasswordField password;

    @FXML
    private TextField name;

    @FXML
    private Button loginBtn;

    // ArrayLIst<Librain> libs.
    
    @FXML
    void login(ActionEvent event) throws IOException {
    	
    	
    	
    	// we give you a list of librarins
	    	// 
	    	Parent root = FXMLLoader.load(getClass().getResource("LibrarianSection.fxml"));
	    	Scene scene = new Scene(root,600,600);
	    	Stage stage = (Stage) pane.getScene().getWindow();
	    	stage.setScene(scene);
	    	
	    
    }

}