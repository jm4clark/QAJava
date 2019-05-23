import java.util.ArrayList;

public class User {
	private static int counter = 0;
	private int ID;
	private String name;
	private int age;
	private boolean hasLibraryCard;
	//private int maxWithdraws;
	private ArrayList<Media> withdrawals = new ArrayList<Media>();

	public User(String name, int age, boolean hasLibraryCard) {
		this.name = name;
		this.age = age;
		this.hasLibraryCard = hasLibraryCard;
		counter++;
		ID = counter;
	}
	
	public int getMaxWithdraws() {
		if(hasLibraryCard)
			return 10;
		return 5;
	}

	public boolean hasLibraryCard() {
		return hasLibraryCard;
	}

	public void setHasLibraryCard(boolean hasLibraryCard) {
		this.hasLibraryCard = hasLibraryCard;
	}
	public String getCurrentWithdrawals() {
		if(withdrawals.stream().count() > 0)
				return withdrawals.toString();
		return "none";
	}

	public ArrayList<Media> getWithdrawals() {
		return withdrawals;		
	}

	public void addWithdrawal(Media withdrawal) {
		this.withdrawals.add(withdrawal);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}
	
	public String toString() {
		return "Name: " + name + ", Age: "  + age + ", Library Card: " + hasLibraryCard + ", Current checkouts: " + getCurrentWithdrawals();
	}
	
}