
public class Motorbike extends Vehicle {


	public Motorbike(String colour, int topSpeed, double price, boolean isFixed) {
		super(colour, topSpeed, price, isFixed);
		this.wheels = 2;
		this.type = "Motorbike";
	}

	public void doAWheelie() {
		System.out.println("Wheeee!");
	}

}
