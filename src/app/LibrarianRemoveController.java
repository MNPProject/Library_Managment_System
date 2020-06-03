package app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LibrarianRemoveController {

    @FXML
    private AnchorPane pane;

    @FXML
    private Label idLabel;

    @FXML
    private TextField Id;

    @FXML
    private Button deleteBtn;

    @FXML
    private Button backBtn;

    @FXML
    void back(ActionEvent event) throws IOException {
        // deletion successfully

        Parent root = FXMLLoader.load(getClass().getResource("AdminSection.fxml"));
        Scene scene = new Scene(root, 600, 600);
        Stage stage = (Stage) pane.getScene().getWindow();
        stage.setScene(scene);
    }

    @FXML
    void delete(ActionEvent event) throws Exception {
        ArrayList<Librarian> lib = FileLoader.loadLibrarianFromFile();
        Librarian l;
        boolean removed = false;
        ListIterator<Librarian> itr = lib.listIterator();
        Librarian librarian;
        while(!removed && itr.hasNext()){
            librarian = itr.next();
            if(librarian.getId() == Integer.parseInt(Id.getText())){
                lib.remove(librarian);
                removed = true;
            }

        }

//        for (Librarian val : lib) {
//            if (val.getId() == Integer.parseInt(Id.getText())) {
//                l = val;
//                lib.remove(l);
//                removed = true;
//                break;
//            }
//        }
        if (removed) {
            FileOutputStream file = new FileOutputStream("Librarian.txt");
            ObjectOutputStream rewrite = new ObjectOutputStream(file);
            rewrite.writeObject(lib);
            rewrite.close();
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Librarian deleted successfully");
            alert.showAndWait();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "There is no librarian with the specified ID");
            alert.setHeaderText("ID NOT FOUND");
            alert.showAndWait();
        }


    }

}
