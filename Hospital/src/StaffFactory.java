
public class StaffFactory {
	public Staff hireStaff(String staffType, String firstName, String secondName, int grade, String title) {
		if (staffType.equalsIgnoreCase("DOCTOR")) {
			if (grade >= 3 && title.equalsIgnoreCase("CONSULTANT"))
				return new Doctor(firstName, secondName, grade, title);
			else if(grade < 3 && title.equalsIgnoreCase("CONSULTANT")) {
				System.out.println("Consultant doctor's grade must be at least 3");
				return null;
			}
			else if(title.equalsIgnoreCase("JUNIOR")) {
				return new Doctor(firstName, secondName, grade, title);
			}
			else {
				System.out.println("Invalid role, doctor must be either Consultant or Junior.");
				return null;
			}
				
		}
		if (staffType.equalsIgnoreCase("RECEPTIONIST")) {
			return new Receptionist(firstName, secondName);
		}
		if (staffType.equalsIgnoreCase("ADMIN")) {
			return new Admin(firstName, secondName);
		}
		return null;

	}
	
	public Staff hireStaff(String staffType, String firstName, String secondName) {
		if (staffType.equalsIgnoreCase("DOCTOR")) {	
			System.out.println("Please provide grade and title to hire a doctor.");
			return null;
		}
		if (staffType.equalsIgnoreCase("RECEPTIONIST")) {
			return new Receptionist(firstName, secondName);
		}
		if (staffType.equalsIgnoreCase("ADMIN")) {
			return new Admin(firstName, secondName);
		}
		return null;

	}
}
