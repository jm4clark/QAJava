
public class Doctor extends Staff{
private int grade;
private String title = "Junior";
	public Doctor(String firstName, String secondName, int grade, String title) {
		super(firstName, secondName);
		this.grade = grade;
		this.title = title;
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void treatPatient() {};
	
	

}
