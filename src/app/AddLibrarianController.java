package app;

import java.io.*;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * A librarian Controller class
 *
 * @author Mikias
 */
public class AddLibrarianController {

    @FXML
    private Button addbtn;

    @FXML
    private Button backbtn;

    @FXML
    private TextField LibName;

    @FXML
    private PasswordField libPass;

    @FXML
    private TextField libEmail;

    @FXML
    private TextField libAddress;

    @FXML
    private TextField LibCity;

    @FXML
    private TextField libContactNo;

    private Librarian librarian; // reference to a librarian object
    ArrayList<Librarian> listOfLib = new ArrayList<>();
    ArrayList<Librarian> libList = new ArrayList<>();
    Random rand = new Random();

    /**
     * add method adds a librarian onto a file
     * the add method expects an Arraylist of Librarian form a dataBase loader class
     * It uses the arraylist to check if the new librarian already existed or not. if not it will add the new librarian
     * and write the new object to a file.
     * the method uses the librarian phone number as a unique key to prevent duplicate librarian
     *
     * @param event
     * @throws IOException
     * @author
     */
    @FXML
    public void add(ActionEvent event) throws IOException {
        listOfLib = FileLoader.loadLibrarianFromFile();
        // creates a librarian object from the textField provided in the GUI
        librarian = new Librarian(LibName.getText(), libPass.getText(), libEmail.getText(), libAddress.getText(),
                LibCity.getText(), libContactNo.getText());

        //check if all the text field have been filled. If not, It gives an error message
        // If all information is entered, the method checks if the librarian is already in the system.
        // If so, an error message will be displayed
        if (LibName.getText().equals("") || libPass.getText().equals("") || libEmail.getText().equals("") ||
                LibCity.getText().equals("") || libAddress.getText().equals("") || libContactNo.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("You have to fill all text fields");
            alert.show();
        } else {
            int id = rand.nextInt(100) + 1;
            librarian.setID(id);
            FileOutputStream filename = new FileOutputStream("Librarian.txt");
            ObjectOutputStream libObj = new ObjectOutputStream(filename);
            if (listOfLib.isEmpty()) {
                listOfLib.add(librarian);
                libObj.writeObject(listOfLib);
                addedSuccessfully();
                libObj.close();
            } else {
                boolean found = false;
                for (Librarian lib : listOfLib) {
                    if (lib.getContactNum().equals(libContactNo.getText())) {
                        duplicateLibrarian();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    listOfLib.add(librarian);
                    libObj.writeObject(listOfLib);
                    libObj.close();
                    addedSuccessfully();
                }
            }
        }
    }

    public void addedSuccessfully() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText("Adding Completed");
        alert.setContentText("The Librarian is already successfully added");
        alert.showAndWait();
    }

    public void duplicateLibrarian() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText("Can not add Librarian");
        alert.setTitle("Librarian Error");
        alert.setContentText("The Librarian is existed in the Database");
        alert.showAndWait();
    }

    @FXML
    void back(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("AdminSection.fxml"));
        Scene scene = new Scene(root, 600, 600);
        Stage stage = (Stage) backbtn.getScene().getWindow();
        stage.setScene(scene);
    }
}
