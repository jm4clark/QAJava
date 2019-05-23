
public class Media {
	
	protected String type = "";
	private int publishDate = 1900;
	private int pageCount = 0;
	private String author = "";
	private String title = "";
	protected String ID;
	private boolean checkedOut;

	public Media() {};
	
	public Media(int publishDate, int pageCount, String author, String title) {
		this.publishDate = publishDate;
		this.pageCount = pageCount;
		this.author = author;
		this.title = title;
		this.checkedOut = false;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(int publishDate) {
		this.publishDate = publishDate;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getID() {
		return ID;
	}
	public void setID(String ID) {
		this.ID = ID;
	}

	public boolean isCheckedOut() {
		return checkedOut;
	}

	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	
	public String toString() {
		return "\nID: " + this.getID() + ", Name: " + this.getTitle() 
		+ ", Author: " + this.getAuthor() + ", Checked out: " + this.isCheckedOut();
	}
}
