package app;

import javafx.scene.control.Alert;

import java.io.*;
import java.util.ArrayList;

public  class FileLoader {

    static ArrayList<Librarian>listOfLibrarian =  new ArrayList<>();

    public static ArrayList<Librarian> loadLibrarianFromFile(){

        try{
            FileInputStream file = new FileInputStream("Librarian.txt");
            ObjectInputStream librarian = new ObjectInputStream(file);
            listOfLibrarian = (ArrayList<Librarian>)librarian.readObject();
        }
        catch (EOFException e){
            Alert alert = new Alert(Alert.AlertType.ERROR, "There is noting to read from a file");
        }
        catch (FileNotFoundException e){

            try{
                FileOutputStream createFile = new FileOutputStream("Librarian.txt");
                FileInputStream file = new FileInputStream("Librarian.txt");
                ObjectInputStream librarian = new ObjectInputStream(file);
                listOfLibrarian = (ArrayList<Librarian>)librarian.readObject();
            }
            catch (Exception ee){
                Alert alert = new Alert(Alert.AlertType.ERROR, "There is an Error opening a file ");
            }
        }
        catch (ClassNotFoundException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "The class is not found");
        }
        catch (IOException e){
            Alert alert = new Alert(Alert.AlertType.ERROR, "There is an error in the file");
        }
        return listOfLibrarian;
    }
    
	public static ArrayList<Book> loadBooks(String fileName) {

		ArrayList<Book> books2 = new ArrayList<>();
		// FileInputStream fis;
		try {
			FileInputStream fis = new FileInputStream("src/books.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			books2 = (ArrayList<Book>) ois.readObject(); // SuppressWarnings

			fis.close();
			ois.close();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return books2;
	}

}
