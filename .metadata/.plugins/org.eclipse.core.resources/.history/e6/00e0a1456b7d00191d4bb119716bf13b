
public class Map extends Media {
	private String coordinates;
	private static int counter = 0;

	public Map(int publishDate, int pageCount, String author, 
			String title, String coordinates) {
		super(publishDate, pageCount, author, title);
		this.coordinates = coordinates;
		counter++;
		this.ID = "M" + counter;
	}
	
	public String toString() {
		return super.toString() + ", Co-ordinates: " + coordinates;
	}

}
