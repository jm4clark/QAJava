
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
		
		library.addMedia(m1);
		
		Book b1new = new Book(1996, 116, "J.K. Rowling", "Harry Potter", true);
		library.updateMedia("B1", b1new);
		Book b3 = new Book(1997, 180, "J.K. Rowling", "Harry Potter 2: Electic Boogaloo", true);
		library.addMedia(b3);
		System.out.println(library.getAllMedia());
		
		System.out.println(library.getUserDB().getAllUsers());
		
		library.checkOut("B1", 1);
		
		System.out.println(library.getUserDB().getAllUsers());
		
		library.checkOut("B1", 2);
		
		library.checkOut("M1", 1);		
		library.checkIn("B1", 1);
		
		library.checkOut("B1", 2);
		System.out.println(library.getUserDB().getAllUsers());
		
		System.out.println(library.sortMediaByName(false));
		System.out.println(library.sortSelectByType("book", true));
		
		b3.read();
		m1.read();
		
		check("HelloWorld");
	}
	
	public static void check(String s) {
		if(s.length()%2 == 0) {
			System.out.println(s.substring(0, s.length()/2));
		}
		else {
			System.out.println(s.substring(s.length()/2,s.length()/2 +1));
		}
	}
}
