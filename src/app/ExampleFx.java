package app;
//import java.io.IOException;
//import java.util.ArrayList;
//
//import controllers.AdminLoginFormController;
//import controllers.LibrarianLoginFormController;
//
//
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.stage.Stage;
//
public class ExampleFx{// extends Application{
//
//	// Array List of librarian
//	// TODO this should be improved
//	ArrayList<Librarian> libs = new ArrayList<>();
//	
//	@FXML AdminLoginFormController afc;
//	@FXML LibrarianLoginFormController lfc;
//	
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		// TODO Auto-generated method stub
//		Parent root = FXMLLoader.load(getClass().getResource("resources/EntryView.fxml"));
//		
//		
//		Scene  EntryView = new Scene(root, 600, 600);
//		primaryStage.setScene(EntryView);
//		primaryStage.show();
//	}
//	
//	public void libLogin(ActionEvent event) throws IOException {
//		Parent root = FXMLLoader.load(getClass().getResource("resources/LibrarianLoginForm.fxml"));
//		Scene scene = new Scene(root);
//		
//		System.out.println(event.getTarget().toString());
//		
//		Stage stage= getStage(event);
//		
//		stage.setScene(scene);
//		stage.show();
//	}
//	
//	/**
//	 * This scene appears if a user chooses the admin log in button.
//	 * 
//	 * @param event
//	 * @throws IOException
//	 */
//	public void adminLogin(ActionEvent event) throws IOException {
//		Parent root = FXMLLoader.load(getClass().getResource("resources/AdminLoginForm.fxml"));
//		
//		Scene adminLogin = new Scene(root);
//		
//		
//		Stage stage= getStage(event);
//		
//		stage.setScene(adminLogin);
//		stage.show();
//	}
//	
//	@FXML PasswordField adminPassword;
//	@FXML TextField adminName;
//	boolean adminFound = false;;
//	@FXML public void adminLoginCheck(ActionEvent event) {
//		// TODO 
//		
//		// check for admin's name existence 
//		// how? pull admin's name from a database, a set, list
//		// then
//		// check for password match
//		
//		// for now a weak test; assuming admins are stored in a list
//		// checks every admin in list, compares name and password with user input
//		Admin admin1 = new Admin("gutama","password");
//		ArrayList<Admin> adminList = new ArrayList<Admin>();
//		adminList.add(admin1);
//		
//		
//		
//		adminList.forEach(admin->{
//			// if true proceeds to the next page
//			if(admin.getName().equals(adminName.getText()) && admin.getPassword().equals(adminPassword.getText())){
//				
//				try {
//					adminFound = true;
//					adminSection(event);
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				return;
//			}
//		});
//		
//		// else shows error
//		if(!adminFound) {
////			Alert alert = new Alert(AlertType.ERROR);
////			alert.setTitle("Error Dialog");
////			alert.setHeaderText("password incorrect");
////			alert.setContentText("password is:"+adminList.get(0).getName()+" "+adminList.get(0).getPassword());
////
////			alert.showAndWait();
//			alert("password incorrect");
//		}
//		
//		
//	}
//	public void alert(String message) {
//		Alert alert = new Alert(AlertType.ERROR);
//		alert.setTitle("Error Dialog");
//		alert.setHeaderText(message);
//		alert.showAndWait();
//	}
//	 public void adminSection(ActionEvent event) throws IOException {
//		Parent root = FXMLLoader.load(getClass().getResource("resources/AdminSection.fxml"));
//		Scene adminSection = new Scene(root);
//		
//		Stage stage = getStage(event);
//		stage.setScene(adminSection);
//		stage.show();
//	}
//	 public void adminAddForm(ActionEvent event) throws IOException {
//			Parent root = FXMLLoader.load(getClass().getResource("resources/AddLibrarian.fxml"));
//			Scene adminSection = new Scene(root);
//			
//			Stage stage = getStage(event);
//			stage.setScene(adminSection);
//			stage.show();
//	}
//
//	@FXML TextField LibName;
//	@FXML PasswordField libPass;
//	@FXML TextField libEmail;
//	@FXML TextField libAddress;
//	@FXML TextField LibCity;
//	@FXML TextField libContactNo;
//	
//	
//	@FXML public void librarianadded(ActionEvent event) {
//		// assuming all input is right
//		Librarian librarian = new Librarian();
//		librarian.setName(LibName.getText());
//		librarian.setPassword(libPass.getText());
//		librarian.setEmail(libEmail.getText());
//		librarian.setAddress(libAddress.getText());
//		librarian.setCity(LibCity.getText());
//		librarian.setContactNum(libContactNo.getText());
//		
//		// once added alert success
//		
//		libs.add(librarian);
//		for (Librarian lib : libs) {
//			System.out.println(lib.toString());
//		}
//		
//		alert("Librarian added Successfully");
//		// TODO validate entries.
//		// what to consider
//		/*
//		 * 1. user name should be unique
//		 * 2. password should be validated
//		 * 3. email should be unique
//		 * 4. other things 
//		 */
//	}
//	public void LibrarianSection(ActionEvent event) throws IOException {
//		Parent root = FXMLLoader.load(getClass().getResource("resources/LibrarianSection.fxml"));
//		Scene scene = new Scene(root);
//		Stage stage = getStage(event);
//		stage.setScene(scene);
//		stage.show();
//	}
//	
//	private Stage getStage(ActionEvent event) {
//		Node node = (Node) event.getSource();
//		Stage stage= (Stage) node.getScene().getWindow();
//		return stage;
//	}
////	public static void main(String[] args) {
////		launch();
////	}
}
