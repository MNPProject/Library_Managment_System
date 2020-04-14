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
import javafx.stage.Stage;

/**
 * Reads user inputs. Username and Password then transition user to admin window
 * @author Gutama
 *
 */
public class AdminLoginFormController {

    @FXML
    private PasswordField adminPassword;

    @FXML
    private TextField adminName;

    @FXML
    private Button adminLogbtn;

    @FXML
    void adminLoginCheck(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("AdminSection.fxml"));
    	Scene scene = new Scene(root,800,800);
    	Stage stage = (Stage) adminPassword.getScene().getWindow();
    	stage.setScene(scene);
    }

}
