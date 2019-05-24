enum Grade {
	ONE, TWO, THREE
}

public class Doctor extends Staff {
	private boolean isInTeam;

	private int grade;
	private String title = "Junior";

	public Doctor(String firstName, String secondName, int grade, String title) {
		super(firstName, secondName);
		this.grade = grade;
		this.title = title;
	}
	
	public boolean isInTeam() {
		return isInTeam;
	}

	public void setInTeam(boolean isInTeam) {
		this.isInTeam = isInTeam;
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

	public void treatPatient() {
	};

	public String toString() {
		return title + " Dr. " + this.getFirstName() + " " + this.getSecondName() + ", Grade " + grade;
	}

}
