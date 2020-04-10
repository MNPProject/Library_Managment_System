package app;
import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// stage = primaryStage;
		File file = new File("src/resources/MainView.fxml");
		System.out.println(file.exists());
		System.out.println(file.getPath());
		// Parent root = new Group();
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("resources/MainView.fxml"));
		
		Scene  EntryView = new Scene(root, 600, 600);
		primaryStage.setScene(EntryView);
		primaryStage.show();
	}
	public static void main(String[] args) {
		System.out.println("Welcome!");
		launch(args);
	}
	/**
	 * 
	 */
//	@FXML 
//	private void LibrarianLogin() {
//		// System.out.println("button clicked");
//	}
//	@FXML
//	private void adminLogin() {
//		
//	}
	
}
//
//FXMLLoader loader = new FXMLLoader();
//loader.setLocation(getClass().getResource("/main.fxml"));
//Parent content = loader.load();