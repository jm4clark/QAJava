
public class Dog extends Animal {

	private String breed;
	
	public Dog(int legs, String colour, int age, String breed) {
		super(legs, colour, age);
		this.breed = breed;
		this.species = "Dog";
	}
	
	public void eat(String food)
	{
		super.eat(food);
		System.out.println("Tasty!");
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
}