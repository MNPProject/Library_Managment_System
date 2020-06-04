package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class IssueBookController {

    @FXML
    private AnchorPane pane;

    @FXML
    private TextField studentId;

    @FXML
    private TextField callNo;

    @FXML
    private TextField studentName;

    @FXML
    private TextField studentContact;

    @FXML
    private Button issueBookBtn;

    @FXML
    private Button back;

    @FXML
    void backBtn(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("LibrarianSection.fxml"));
		Scene scene = new Scene(root, 600, 600);
		Stage stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
    }

    @FXML
    void issueBook(ActionEvent event) {
    	// check if the fields are empty
    	Alert alert;
		if(studentId.getText().isBlank() || callNo.getText().isBlank()
				|| studentName.getText().isBlank() || studentContact.getText().isBlank() ) {
			alert = new Alert(Alert.AlertType.ERROR, "All fields must be completed");
		}
    	
    	// if the book exist and quantity is not zero get the book
		ArrayList<Book> books = FileLoader.loadBooks("src/books.ser");
		String num = callNo.getText();
		Book book = null;
		for (Book b : books) {
			if (num.equals(b.getCallNo()) && b.getQuantity() != 0) {
				b.setQuantity(b.getQuantity()-1);
				b.setIssued(b.getIssued()+1);
				book = b;
			}
		}
		if (book == null) {
			alert = new Alert(Alert.AlertType.ERROR, "Sorry! book not available");
		} else {
			// create a student
			Student student = new Student();
			student.setId(studentId.getText());
			student.setFirstName(studentName.getText());
			student.setContactNum(studentContact.getText());

			//
			Map<Student, ArrayList<Book>> issued = new HashMap<>();
			if(issued.containsKey(student)) {
				issued.get(student).add(book);
			}
			else {
				ArrayList<Book> values = new ArrayList<>();
				values.add(book);
				issued.put(student, values);
			}
		}
    }

}
