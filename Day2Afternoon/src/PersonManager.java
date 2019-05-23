import java.util.ArrayList;
import java.util.stream.Collectors;

public class PersonManager {
	private ArrayList<Person> listOfPeople = new ArrayList<Person>();

	public void addPerson(Person p) { listOfPeople.add(p); }
	public void addPerson(String name, int age, String jobTitle)
	{
		Person p = new Person(name, age, jobTitle);
		listOfPeople.add(p);
	}
	public void addPeople(ArrayList<Person> list)
	{
		listOfPeople.addAll(list);
	}
	
	public ArrayList<Person> getList(){ return listOfPeople; }
	
	public String listAllPeople() {
		return listOfPeople.stream()
				.map(x->x.toString())
				.collect(Collectors.joining(", "));
	}
	
	public Person findPerson(String name)
	{
		return listOfPeople.stream()
				.filter(i-> i.getName().equals(name))
				.findAny().orElse(null);
	}
}
