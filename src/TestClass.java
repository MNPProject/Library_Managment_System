


public class TestClass {

	public static void main(String[] args) throws BookNotFoundException {

		LibrarianManager manager = new LibrarianManager();
		manager.addBook("Java", "1@2", "Gaddis", "Pearson", 2);
		manager.addBook("C++", "1@3", "Gaddis", "Pearson", 3);
		manager.addBook("Alice", "1@4", "Gaddis", "Pearson", 9);
		manager.addBook("python", "1@5", "Gaddis", "Pearson", 7);
		manager.addBook("Core Java", "1@6", "Gaddis", "Pearson", 1);

		manager.viewBook();
		
		manager.issueBook("1@5", "Mikias", "Kebede", "M213", "2023490384");
		manager.issueBook("1@6", "Eyuel", "Kebede", "M211", "2353490384");
		manager.issueBook("1@3", "Mikias", "saj", "M142", "2023240384");
 //manager.issueBook("1@9", "Eyuel", "Kebede", "M211", "2353490384");
//		
		System.out.println("**********  AFTER BOOK ISSUED  ***********\n");
		
		manager.viewBook();
//		
	System.out.println();
//		
		manager.viewIssuedBook();

		manager.returnBook("1@6", "M211");
		System.out.println("*************** AFTER RETURNING BOOK  *****************\n");
		manager.viewBook();
	}
		
}
