package app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Cell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ResourceBundle;

public class LibrarianViewController implements Initializable {

    @FXML
    private TableView<LibrarianViewManager> tableView;

    @FXML
    private TableColumn<LibrarianViewManager, Integer> Id;

    @FXML
    private TableColumn<LibrarianViewManager, String> name;

    @FXML
    private TableColumn<LibrarianViewManager, String> password;

    @FXML
    private TableColumn<LibrarianViewManager, String> email;

    @FXML
    private TableColumn<LibrarianViewManager, String> address;

    @FXML
    private TableColumn<LibrarianViewManager, String> city;

    @FXML
    private TableColumn<LibrarianViewManager, String> contact;

    @FXML
    private Button backButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Id.setCellValueFactory(new PropertyValueFactory<LibrarianViewManager, Integer>("Id"));
        name.setCellValueFactory(new PropertyValueFactory<LibrarianViewManager, String>("name"));
        password.setCellValueFactory(new PropertyValueFactory<LibrarianViewManager, String>("password"));
        email.setCellValueFactory(new PropertyValueFactory<LibrarianViewManager, String>("email"));
        address.setCellValueFactory(new PropertyValueFactory<LibrarianViewManager, String>("address"));
        city.setCellValueFactory(new PropertyValueFactory<LibrarianViewManager, String>("city"));
        contact.setCellValueFactory(new PropertyValueFactory<LibrarianViewManager, String>("contact"));

        tableView.setItems(getLibrarian());

        // making the table editable
        tableView.setEditable(true);
        name.setCellFactory(TextFieldTableCell.forTableColumn());
        address.setCellFactory(TextFieldTableCell.forTableColumn());
        city.setCellFactory(TextFieldTableCell.forTableColumn());
        email.setCellFactory(TextFieldTableCell.forTableColumn());
    }

    ObservableList<LibrarianViewManager> libList;

    public ObservableList<LibrarianViewManager> getLibrarian() {
        libList = FXCollections.observableArrayList();
        ArrayList<Librarian> lib = FileLoader.loadLibrarianFromFile();
        for (Librarian l : lib)
            libList.add(new LibrarianViewManager(l.getId(), l.getFirstName(), l.getLastName(), l.getEmail(), l.getAddress(), l.getCity(), l.getContactNum()));
        return libList;
    }

    public void editEmail(TableColumn.CellEditEvent editedCell) throws Exception {
        ArrayList<Librarian> lib = FileLoader.loadLibrarianFromFile();
        LibrarianViewManager selectedLib = tableView.getSelectionModel().getSelectedItem();
        String email = editedCell.getNewValue().toString();
        selectedLib.setEmail(email);
        for (Librarian val : lib) {
            if (val.getId() == selectedLib.getId()) {
                int index = lib.indexOf(val);
                val.setEmail(email);
                lib.set(index, val);
                break;
            }
        }
        updateFile(lib);
    }

    public void editName(TableColumn.CellEditEvent editedCell) throws Exception {
        ArrayList<Librarian> lib = FileLoader.loadLibrarianFromFile();
        LibrarianViewManager selectedLib = tableView.getSelectionModel().getSelectedItem();
        String newName = editedCell.getNewValue().toString();
        selectedLib.setEmail(newName);
        for (Librarian val : lib) {
            if (val.getId() == selectedLib.getId()) {
                int index = lib.indexOf(val);
                val.setFirstName(newName);
                lib.set(index, val);
                break;
            }
        }
        updateFile(lib);
    }

    public void editAddress(TableColumn.CellEditEvent editedCell) throws Exception {
        ArrayList<Librarian> lib = FileLoader.loadLibrarianFromFile();
        LibrarianViewManager selectedLib = tableView.getSelectionModel().getSelectedItem();
        String newName = editedCell.getNewValue().toString();
        selectedLib.setAddress(newName);
        for (Librarian val : lib) {
            if (val.getId() == selectedLib.getId()) {
                int index = lib.indexOf(val);
                val.setAddress(newName);
                lib.set(index, val);
                break;
            }
        }
        updateFile(lib);
    }

    public void editCity(TableColumn.CellEditEvent editedCell) throws Exception {
        ArrayList<Librarian> lib = FileLoader.loadLibrarianFromFile();
        LibrarianViewManager selectedLib = tableView.getSelectionModel().getSelectedItem();
        String newCity = editedCell.getNewValue().toString();
        selectedLib.setCity(newCity);
        for (Librarian val : lib) {
            if (val.getId() == selectedLib.getId()) {
                int index = lib.indexOf(val);
                val.setCity(newCity);
                lib.set(index, val);
                break;
            }
        }
        updateFile(lib);
    }

    private void updateFile(ArrayList<Librarian> librarians) throws Exception {
        FileOutputStream file = new FileOutputStream("Librarian.txt");
        ObjectOutputStream obj = new ObjectOutputStream(file);
        obj.writeObject(librarians);
        obj.close();
    }

    public void back(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("AdminSection.fxml"));
        Scene scene = new Scene(root, 600, 600);
        Stage stage = (Stage) tableView.getScene().getWindow();
        stage.setScene(scene);
    }
}
