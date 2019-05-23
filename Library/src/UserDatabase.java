import java.util.ArrayList;
import java.util.stream.Collectors;

public class UserDatabase {
	ArrayList<User> listOfUsers = new ArrayList<User>();
	
	public void addUser(User u) {
		listOfUsers.add(u);
	}
	public void addUsers(ArrayList<User> list)	{
		listOfUsers.addAll(list);
	}
	public void removeUserByID(int ID) {
		listOfUsers.removeIf(i -> i.getID() == ID);
	}
	
	public void registerUser(String name, int age, boolean hasLibraryCard)	{
		User user = new User(name, age, hasLibraryCard);
		listOfUsers.add(user);
	}
	
	public void deleteUser(int ID)	{
		listOfUsers.removeIf(i->i.getID() == ID);
	}
	
	public void deleteUser(String name)	{
		listOfUsers.removeIf(i->i.getName().equals(name));
	}
	
	public ArrayList<User> getAllUsers(){
		return (ArrayList<User>) listOfUsers.stream()
				.collect(Collectors.toList());
	}
}
