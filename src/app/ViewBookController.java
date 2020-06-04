package app;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;

public class ViewBookController {

    @FXML
    private AnchorPane tableView;

    @FXML
    private TableColumn<?, ?> Id;

    @FXML
    private TableColumn<?, ?> name;

    @FXML
    private TableColumn<?, ?> password;

    @FXML
    private TableColumn<?, ?> address;

    @FXML
    private TableColumn<?, ?> publisher;

    @FXML
    private TableColumn<?, ?> quantity;

    @FXML
    private TableColumn<?, ?> issued;

    @FXML
    private TableColumn<?, ?> contact;

}
