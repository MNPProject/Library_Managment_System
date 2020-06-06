package app;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

public class IssuedBookController implements Initializable {

        @FXML
        private AnchorPane pane;

        @FXML
        private TableView<IssuedBook> tableView;

        @FXML
        private TableColumn<IssuedBook, Integer> Id;

        @FXML
        private TableColumn<IssuedBook, String> callNo;

        @FXML
        private TableColumn<IssuedBook, String> studentID;

        @FXML
        private TableColumn<IssuedBook, String> studentName;

        @FXML
        private TableColumn<IssuedBook, String> studentContact;

        @FXML
        private TableColumn<IssuedBook, String> data;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)  {
            Id.setCellValueFactory(new PropertyValueFactory<IssuedBook, Integer>("Id"));
            callNo.setCellValueFactory(new PropertyValueFactory<IssuedBook, String>("bookCallNo"));
            studentID.setCellValueFactory(new PropertyValueFactory<IssuedBook, String>("studentId"));
            studentName.setCellValueFactory(new PropertyValueFactory<IssuedBook, String>("studentName"));
            studentContact.setCellValueFactory(new PropertyValueFactory<IssuedBook, String>("studentContact"));
            data.setCellValueFactory(new PropertyValueFactory<IssuedBook, String>("issuedDate"));

          try{ tableView.setItems(getIssuedBook()); } catch (Exception e){e.getMessage();}
    }
    ObservableList<IssuedBook> issuedBook;
    public ObservableList<IssuedBook> getIssuedBook() throws Exception{
        issuedBook = FXCollections.observableArrayList();
         Map<Student, ArrayList<Book>> issued = FileLoader.getIssuedBook();
        System.out.println("This line 63 executed");
         Set<Student> key = issued.keySet();

         for(Student s : key){

                 for (int i = 0; i < issued.get(s).size(); i++)
                     issuedBook.add(new IssuedBook(1, "call", s.getId(), s.getFirstName(), s.getContactNum(), "6/5/2020" ));

         }

         return issuedBook;
    }
}