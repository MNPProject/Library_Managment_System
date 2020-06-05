package app;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class IssueBookController {

    @FXML
    private AnchorPane pane;

    @FXML
    private TextField studentId;

    @FXML
    private TextField callNo;

    @FXML
    private TextField studentName;

    @FXML
    private TextField studentContact;

    @FXML
    private Button issueBookBtn;

    @FXML
    private Button back;

     FileLoader loadBook = new FileLoader();

    @FXML
    void backBtn(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("LibrarianSection.fxml"));
		Scene scene = new Scene(root, 600, 600);
		Stage stage = (Stage) pane.getScene().getWindow();
		stage.setScene(scene);
    }

    @FXML
    void issueBook(ActionEvent event) throws Exception
	{
		int index = 0;
		String[] stName = studentName.getText().split(" ");
		System.out.println("The length is " + stName.length);
		System.out.println("The index is " + index++);
		System.out.println("the last index is " + index);
		Student student = new Student(stName[0], stName[1], studentId.getText(), studentContact.getText());

		ArrayList<Book> listOfBook = FileLoader.getData("src/books.ser");

		//subtract the book quantity and add the issued book
		Map<Student, ArrayList<Book>> borrowedBook = getIssuedBook();
		if(!listOfBook.isEmpty())
		{
			Book b = null;
			for(Book book : listOfBook){
				if(book.getCallNo().equalsIgnoreCase(callNo.getText())){
					book.subQuantityBy1();
					book.addIssuedBook();
					b = book;
				}
			}

			if(borrowedBook != null){
				Set<Student> key = borrowedBook.keySet();
				for(Student s : key){
					if(s.getId().equalsIgnoreCase(student.getId()))
						borrowedBook.get(s).add(b);
					else{
						ArrayList<Book> bo = new ArrayList<>();
						bo.add(b);
						borrowedBook.put(student, bo);
					}
				}
				FileOutputStream bBook = new FileOutputStream("src/IssuedBook.txt");
				ObjectOutputStream obj = new ObjectOutputStream(bBook);
				obj.writeObject(borrowedBook);
			}
			else{
				FileOutputStream bBook = new FileOutputStream("src/IssuedBook.txt");
				ObjectOutputStream obj = new ObjectOutputStream(bBook);
				ArrayList<Book> bo = new ArrayList<>();
				bo.add(b);
				borrowedBook = new HashMap<>();
				borrowedBook.put(student, bo);
				obj.writeObject(borrowedBook);
			}
		}
		else{Alert alert = new Alert(Alert.AlertType.ERROR, "There are no books to be issued");}

	}

	 Map<Student, ArrayList<Book>> getIssuedBook() throws Exception{
		FileInputStream file = new FileInputStream("src/IssuedBook.txt");
		 Map<Student, ArrayList<Book>> m = null;
		try{
			ObjectInputStream obj = new ObjectInputStream(file);
			m = (Map<Student, ArrayList<Book>>)obj.readObject();
			Set<Map.Entry<Student, ArrayList<Book>>> s = m.entrySet();
			System.out.println(s);
		}catch (EOFException e){
			return m;
		}


//		 Iterator<Map.Entry<Student, ArrayList<Book>>> itr = s.iterator();
//
//		 while (itr.hasNext()){
//			 Map.Entry<Student, ArrayList<Book>> en = itr.next();
//			 System.out.println(en.getKey().getFirstName() + " " + en.getValue());
//		 }

		return m;
	}

}
