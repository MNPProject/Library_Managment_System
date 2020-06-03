package app;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Reads user inputs. Username and Password then transition user to admin window
 * @author Gutama
 *
 */
public class AdminLoginFormController {
	
	@FXML
    private TextField adminName;
	
    @FXML
    private PasswordField adminPassword;
    
    @FXML
    private Button adminLogbtn;
    ArrayList<Admin> admins = new ArrayList<>();
    @FXML
    void adminLoginCheck(ActionEvent event) throws IOException {
    	    	
    	Admin admin1 = new Admin();
    	
    	// 
    	// databaseLoader
    	
    	// give as an array list of admins.
    	// give as an array list of 
    	// write require it to write onto a file.<admins, librarins, books> 
    	
    	// Admin a = new Admin('name','pass');
    	
    	// adminName.getText();
    	// is the adminName ligit?
    	
    	// is the adminPassword correct?
    	
    	// do this two exist 
    	
    	// the question is where should we get list of admins from?
    	
    	Parent root = FXMLLoader.load(getClass().getResource("AdminSection.fxml"));
    	Scene scene = new Scene(root,600,600);
    	Stage stage = (Stage) adminPassword.getScene().getWindow();
    	stage.setScene(scene);
    	
    	// 
    }

}
