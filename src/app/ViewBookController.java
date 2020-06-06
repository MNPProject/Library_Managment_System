package app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ViewBookController implements Initializable {

    @FXML
    private TableView<BookManager> tableView;

    @FXML
    private TableColumn<BookManager, Integer> Id;

    @FXML
    private TableColumn<BookManager, String> callno;

    @FXML
    private TableColumn<BookManager, String> name;

    @FXML
    private TableColumn<BookManager, String> Author;

    @FXML
    private TableColumn<BookManager, String> publisher;

    @FXML
    private TableColumn<BookManager, Integer> quantity;

    @FXML
    private TableColumn<BookManager, Integer> issued;

    @FXML
    private TableColumn<BookManager, String> date;


      @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Id.setCellValueFactory(new PropertyValueFactory<BookManager, Integer>("Id"));
        name.setCellValueFactory(new PropertyValueFactory<BookManager, String>("name"));
        callno.setCellValueFactory(new PropertyValueFactory<BookManager, String>("callno"));
        publisher.setCellValueFactory(new PropertyValueFactory<BookManager, String>("publisher"));
        Author.setCellValueFactory(new PropertyValueFactory<BookManager, String>("Author"));
        quantity.setCellValueFactory(new PropertyValueFactory<BookManager, Integer>("quantity"));
        issued.setCellValueFactory(new PropertyValueFactory<BookManager, Integer>("issued"));

        tableView.setItems(getBook());

    }

    ObservableList<BookManager> libList;

    public ObservableList<BookManager> getBook() {
        libList = FXCollections.observableArrayList();
       ArrayList<Book> lib = FileLoader.loadBooks("src/books.ser");
        for (Book l : lib){
            libList.add(new BookManager(1, l.getCallNo(), l.getTitle(), l.getAuthor(), l.getPublisher(), l.getQuantity()));
        }

        return libList;
    }

}
