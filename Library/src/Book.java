
public class Book extends Media implements Readable{

	private boolean hardback;
	private static int counter = 0;

	public Book( int publishDate, int pageCount, String author, String title, boolean hardback) {
		super(publishDate, pageCount, author, title);
		this.hardback = hardback;
		counter++;
		this.ID = "B" + counter;
		this.type = "book";
	}

	public boolean isHardback() {
		return hardback;
	}

	public void setHardback(boolean hardback) {
		this.hardback = hardback;
	}
	
	@Override
	public String toString()
	{
		 return super.toString(); 
	}

	@Override
	public void read() {
		System.out.println("You read " + this.getTitle() + "!");		
	}
	
	
	public void updateAllInfo(int publishDate, int pageCount, String author, String title, boolean hardback) {
		super.updateAllInfo(publishDate, pageCount, author, title);
		
		this.hardback = hardback;
	}
	
	public void rollbackCounter()
	{
		counter--;
	}

	
}
