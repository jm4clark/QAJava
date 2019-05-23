
public class Newspaper extends Media implements Readable{
	private String paperName;
	private static int counter = 0;
	public Newspaper(int publishDate, int pageCount, String author, String title, String paperName) {
		super(publishDate, pageCount, author, title);
		this.paperName = paperName;	
		counter++;
		this.ID = "N" +counter;
	}
	
	public String getPaperName() {
		return paperName;
	}
	
	public void setPaperName(String paperName) {
		this.paperName = paperName;
	}

	@Override
	public void read() {
		System.out.println("You read the newspaper!");
	}
	
	public void updateAllInfo(int publishDate, int pageCount, String author, String title, String paperName) {
		super.updateAllInfo(publishDate, pageCount, author, title);
		this.paperName = paperName;
	}

}
