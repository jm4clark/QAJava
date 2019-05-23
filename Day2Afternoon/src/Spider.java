
public class Spider extends Animal {

	private boolean venomous;

	public Spider(int legs, String colour, int age, boolean venomous) {
		super(legs, colour, age);
		this.venomous = venomous;
		this.species = "Spider";
	}
	
	public void eat(String food)
	{
		if(food.equals("Fly"))
			super.eat(food);
		else
			System.out.println("Not interested...");
	}
	
	public void bite() {
		if(venomous)
			System.out.println("Poisoned.");
		else
			System.out.println("Not poisoned, but still hurt");
	}

	public void makeWeb() {
		System.out.println("Made a web.");
		hunger++;
	}

	public boolean isVenomous() {
		return venomous;
	}

	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}
	
	@Override
	public String getAllInfo() {
		return super.getAllInfo() + ", Venomous: " + venomous;
	}
}