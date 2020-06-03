package app;
import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * Library Management Main class.
 * launches the first scene.
 * @author Gutama
 *
 */
// --module-path "C:\Users\ahadu yilma\Desktop\javafx-sdk-11.0.2\lib" --add-modules javafx.controls,javafx.fxml
public class Main extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// loads fxml file MainView. 
		// This scene has the first entry point to the program
		Parent root = FXMLLoader.load(getClass().getResource("MainView.fxml"));
		
		Scene  EntryView = new Scene(root, 600, 600);
		primaryStage.setScene(EntryView);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}