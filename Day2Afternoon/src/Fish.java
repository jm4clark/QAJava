
public class Fish extends Animal{

	public Fish(int legs, String colour, int age) {
		super(legs, colour, age);
		this.species = "Fish";
	}
	
	public void swim() {
		System.out.println("Keep on swimming.");
		hunger++;
	}
	
	public void eat(String food)
	{
		if(food.equals("Fish Food"))
			super.eat(food);
		else
			System.out.println("The fish ignored it...");
	}
}