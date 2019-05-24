import java.util.ArrayList;

public class Admin extends Staff {
	private StaffFactory sf = new StaffFactory();
	private ArrayList<Staff> listOfStaff = new ArrayList<Staff>();
	private ArrayList<Patient> listOfPatients = new ArrayList<Patient>();
	private ArrayList<Doctor[]> listOfTeams = new ArrayList<Doctor[]>();

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

	public void createTeam(Doctor d1, Doctor d2) {
		Doctor[] t = new Doctor[2];
		t[0] = d1;
		t[1] = d2;
		if (!isDoctorAlreadyInTeam(t)) {
			if (isDoctorConsultant(t) >= 1) {
				listOfTeams.add(t);
			}
			else {
				System.out.println("There are not enough consultant doctors in the team.");
			}
		} else {
			System.out.println("At least one doctor is already in a team.");
		}

	};

	private boolean isDoctorAlreadyInTeam(Doctor[] team) {

		for (int i = 0; i < team.length; i++) {
			if (team[i].isInTeam()) {
				return true;
			}
		}		
		return false;
	};

	private int isDoctorConsultant(Doctor[] team) {
		int counter = 0;
		for (int i = 0; i < team.length; i++) {
			if (team[i].getTitle().equalsIgnoreCase("CONSULTANT")) {
				counter++;
			}
		}
		return counter;
	}

	public void promoteDoctor() {
	};

	public void removeDrFromTeam() {
	};

}
