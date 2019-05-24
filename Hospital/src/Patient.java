
public class Patient {
	private static int counter;
	private String ID;
	private String firstName, secondName;

	public Patient(String firstName, String secondName) {
		counter++;
		ID = this.firstName.substring(0,1) + this.secondName.substring(0,1) + counter;
	}
}
