package app;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;

public class LibrarianViewController {

    @FXML
    private AnchorPane tableView;

    @FXML
    private TableColumn<?, ?> Id;

    @FXML
    private TableColumn<?, ?> name;

    @FXML
    private TableColumn<?, ?> password;

    @FXML
    private TableColumn<?, ?> email;

    @FXML
    private TableColumn<?, ?> address;

    @FXML
    private TableColumn<?, ?> city;

    @FXML
    private TableColumn<?, ?> contact;

}
