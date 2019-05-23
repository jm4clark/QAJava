
public class Car extends Vehicle {

	private boolean automatic;
	private int currentGear = 1;

	public Car(String colour, int topSpeed, double price, boolean automatic, boolean isFixed) {
		super(colour, topSpeed, price, isFixed);
		this.wheels = 4;
		this.automatic = automatic;
		this.type = "Car";
	}

	public void OpenBoot() {
	};
	
	public String ChangeGear(int gear) {
		if(this.automatic)
			return "Can't change gear; it's an automatic!";
		else if (this.currentGear++ == gear || this.currentGear-- == gear)
		{
			return "Gear changed! (" + gear + ")";
		}
		
		return "Can't change gear.";
	}
}
