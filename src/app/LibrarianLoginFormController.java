
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
		boolean found = false;
		if (employeeList.isEmpty()) {
			System.out.println("Alert");
			Alert alert = new Alert(Alert.AlertType.ERROR, "The librarian database is empty");
			alert.showAndWait();
		} else if (!employeeList.isEmpty()) {
			for (Librarian librarian : employeeList) {
				if (librarian.getFirstName().equals(username) && librarian.getLastName().equals(password_)) {
					Parent root = FXMLLoader.load(getClass().getResource("LibrarianSection.fxml"));
					Scene scene = new Scene(root, 600, 600);
					Stage stage = (Stage) pane.getScene().getWindow();
					stage.setScene(scene);
					found = true;
					break;
				}
			}
		}
		if (!found) {
			System.out.println("Alert");
			Alert alert = new Alert(Alert.AlertType.ERROR, "Username or Password incorrect");
			alert.showAndWait();
		}
	}
}
