
/**
 * Take in inputs from the user.
 * Authenticate and admit the user or reject user if fails.
 * @author Gutama
 *
 */
package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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

    @FXML 
    void login(ActionEvent event) throws IOException {
    	

    	List<Librarian> employeeList = FileLoader.loadLibrarianFromFile();
		String username = name.getText();
		String password_ = password.getText();
		
		for(int i = 0; i < employeeList.size(); i ++) {
			if(employeeList.get(i) != null) {
				if(username.equals(employeeList.get(i).getFirstName()) && password_.equals(employeeList.get(i).getLastName())) {
					Parent root = FXMLLoader.load(getClass().getResource("LibrarianSection.fxml"));
					Scene scene = new Scene(root,600,600);
					Stage stage = (Stage) pane.getScene().getWindow();
					stage.setScene(scene);
				}
			}
			else {
					System.out.println("Alert");
					Alert alert = new Alert(Alert.AlertType.ERROR, "Please reenter");
					alert.showAndWait();
				}
		}
			}
		
    	
    	
    	// we give you a list of librarins
	    	// 
	    	/* Parent root = FXMLLoader.load(getClass().getResource("LibrarianSection.fxml"));
	    	Scene scene = new Scene(root,600,600);
	    	Stage stage = (Stage) pane.getScene().getWindow();
	    	stage.setScene(scene);
	    	*/
		
	    

    }

   
