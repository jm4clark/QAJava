
public class Vehicle {
	protected int wheels;
	protected String colour;
	protected int topSpeed;
	protected int ID;
	protected double price;
	private boolean isFixed;
	protected String type = "";
	
	private static int counter = 0;

	public Vehicle( String colour, int topSpeed, double price, boolean isFixed) {
		counter++;
		this.colour = colour;
		this.topSpeed = topSpeed;
		this.ID = counter;
		this.price = price;
		
		this.isFixed = isFixed;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public boolean isFixed() {
		return isFixed;
	}

	public void setFixed(boolean isFixed) {
		this.isFixed = isFixed;
	}

	@Override
	public String toString()
	{
		return "ID: " + ID + ", Vehicle: " + type + ", Colour: " + colour;
	}

	public int getWheels() { return wheels;	}

	public void setWheels(int wheels) {	this.wheels = wheels; }

	public String getColour() {	return colour; }

	public void setColour(String colour) { this.colour = colour; }

	public int getTopSpeed() { return topSpeed; }

	public void setTopSpeed(int topSpeed) { this.topSpeed = topSpeed; }

	public int getID() { return ID;	}

	public void setID(int iD) {	ID = iD; }

	public double getPrice() { return price; }

	public void setPrice(double price) { this.price = price; }

}
