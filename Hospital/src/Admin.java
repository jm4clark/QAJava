import java.util.ArrayList;

public class Admin extends Staff {
private StaffFactory sf = new StaffFactory(); 
	private ArrayList<Staff> listOfStaff = new ArrayList<Staff>();
	private ArrayList<Patient> listOfPatients = new ArrayList<Patient>();
	
	public Admin(String firstName, String secondName) {
		super(firstName, secondName);
		// TODO Auto-generated constructor stub
	}
	
	public void hireDoctor(String firstName, String secondName, int grade, String title) {
		listOfStaff.add(sf.hireStaff("Doctor", "John", "Smith", grade, title));
	}
	
	public void hireStaff(String jobTitle, String firstName, String secondName) {
		listOfStaff.add(sf.hireStaff(jobTitle, firstName, secondName));
	}
	
	public void createTeam() {};
	
	public void promoteDoctor() {};
	
	public void removeDrFromTeam() {};

}
