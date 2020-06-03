
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
    	
    	class Employee {
        	String username;
        	String password;
        	   	
        	public Employee(String username, String password) {
        		this.username = username;
        		this.password = password;
        	}
        	public String getUsername() {
        		return username;
        	}
        	public void setUsername(String username) {
        		this.username = username;
        	}
        	public String getPassword() {
        		return password;
        	}
        	public void setPassword(String password) {
        		this.password = password;
        }
    	}
    	List<Employee> employeeList = new ArrayList<>();
    	employeeList.add(new Employee("Ahadu" , "Addis"));
		employeeList.add(new Employee("Gutema", "London"));
		employeeList.add(new Employee("Mike", "Washington"));
		employeeList.add(new Employee("Nati", "Paris"));
		System.out.println(name.getText());
		String username = name.getText();
		String password_ = password.getText();
		
		for(int i = 0; i < employeeList.size(); i ++) {
			if(employeeList.get(i) != null) {
				if(username == employeeList.get(i).getUsername() && password_ == employeeList.get(i).getPassword()) {
					Parent root = FXMLLoader.load(getClass().getResource("LibrarianSection.fxml"));
					Scene scene = new Scene(root,600,600);
					Stage stage = (Stage) pane.getScene().getWindow();
					stage.setScene(scene);
		    	}
			}
			else {
					Parent root = FXMLLoader.load(getClass().getResource("LibrarianLoginAlert.fxml"));
			    	Scene scene = new Scene(root,600,600);
			    	Stage stage = (Stage) pane.getScene().getWindow();
			    	stage.setScene(scene);
					
				}
		}
		
    }
}
   
