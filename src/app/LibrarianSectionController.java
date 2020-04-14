

package app;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LibrarianSectionController {

    @FXML
    private Button addBookBtn;

    @FXML
    private Button viewBooksBtn;

    @FXML
    private Button issueBookBtn;

    @FXML
    private Button issuedBooksBtn;

    @FXML
    private Button returnBooksBtn;

    @FXML
    private Button logoutBtn;

    @FXML
    void addBook(ActionEvent event) throws IOException{
    	Parent root = FXMLLoader.load(getClass().getResource("AddBooks.fxml"));
    	Scene scene = new Scene(root);
    	Stage stage = (Stage) addBookBtn.getScene().getWindow();
    	stage.setScene(scene);
    }

    @FXML
    void issueBookBtn(ActionEvent event) {

    }

    @FXML
    void issuedBooks(ActionEvent event) {

    }

    @FXML
    void logout(ActionEvent event) {

    }

    @FXML
    void returnBooksBtn(ActionEvent event) {

    }

    @FXML
    void viewBooks(ActionEvent event) {

    }

}
