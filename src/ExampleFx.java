import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ExampleFx extends Application{

	// may not be necessary 
	Scene EntryView,
	adminSection,LibrarianSection,
	addBook,addLib,
	adminLogin, libLogin,
	returnBook, deleteBook;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Parent root = FXMLLoader.load(getClass().getResource("EntryView.fxml"));
		
		
		EntryView = new Scene(root, 600, 600);
		primaryStage.setScene(EntryView);
		primaryStage.show();
	}
	public void adminLogin(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("AdminLoginForm.fxml"));
		adminLogin = new Scene(root);
		
		
		Stage stage= getStage(event);
		
		stage.setScene(adminLogin);
		stage.show();
	}
	public void libLogin(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("LibrarianLoginForm.fxml"));
		Scene scene = new Scene(root);
		
		
		Stage stage= getStage(event);
		
		stage.setScene(scene);
		stage.show();
	}
	public void adminSection(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("AdminSection.fxml"));
		adminSection = new Scene(root);
		Stage stage = getStage(event);
		stage.setScene(adminSection);
		stage.show();
	}
	private Stage getStage(ActionEvent event) {
		Node node = (Node) event.getSource();
		Stage stage= (Stage) node.getScene().getWindow();
		return stage;
	}
	public void LibrarianSection(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("LibrarianSection.fxml"));
		Scene scene = new Scene(root);
		Stage stage = getStage(event);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}
}
