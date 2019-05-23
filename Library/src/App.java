
public class App {
	public static void main(String[] args) {
		Library library = new Library();
		
		Book b1 = new Book(1996, 106, "J.K. Rolling", "Harry Patter", true);
		Book b2 = new Book(2004, 399, "Dude", "My Book", false);
		Newspaper n1 = new Newspaper(2019, 30, "Newspaper Writer", "Old man yells at cloud","The Sun");
		Map m1 = new Map(1883, 1, "Captain Hook", "Treasure Map", "41*N, 55*E");
		library.addMedia(b1);
		library.addMedia(b2);
		library.addMedia(n1);
		
		User u1 = new User("Dave", 21, false);
		User u2 = new User("Jimmy", 55, true);
		library.getUserDB().addUser(u1);
		library.getUserDB().addUser(u2);
		
		
		System.out.println(library.getAllMedia());
		
		Book b1new = new Book(1996, 116, "J.K. Rowling", "Harry Potter", true);
		library.updateMedia(b1, b1new);
		System.out.println(library.getAllMedia());
		
		System.out.println(library.getUserDB().getAllUsers());
		
		library.checkOut(b1, u1);
		
		System.out.println(library.getUserDB().getAllUsers());
		
		library.checkOut(b1, u2);
		
		library.checkOut(m1, u1);		
		library.checkIn(b1, u1);
		
		library.checkOut(b1, u2);
		System.out.println(library.getUserDB().getAllUsers());
		
		b1.read();
	}
}
