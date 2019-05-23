
public abstract class Animal {
	protected int legs;
	protected String colour;
	protected int age;
	protected int hunger;
	protected String species;

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Animal(int legs, String colour, int age) {
		this.legs = legs;
		this.colour = colour;
		this.age = age;
	}

	public void eat(String food) {
		if (hunger > 0) {
			System.out.println("Ate the " + food);
			hunger--;
		}
		else
		{
			System.out.println("Not hungry. Ignored the " + food);
		}
	};
	
	public String getAllInfo() {
		return "Species: " + species + ", Legs: " + legs + 
				", Colour: " + colour + ", Age: " + age;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHunger() {
		return hunger;
	}

	public void setHunger(int hunger) {
		this.hunger = hunger;
	}

}