import java.math.BigDecimal;
import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	private double carBill = 0.4;
	private double bikeBill = 0.35;
	// private double hoverBill = 0.7;

	public void addVehicle(Vehicle v) {
		vehicles.add(v);
	}

	public void addVehicles(ArrayList<Vehicle> list) {
		vehicles.addAll(list);
	}

	public void removeByID(int ID) {
		vehicles.removeIf(i -> i.ID == ID);
	}

	public void removeByType(String type) {
		vehicles.removeIf(i->i.getType() == type);
	}

	public String fixVehicle(int ID) {
		Vehicle v = (Vehicle) vehicles.stream().filter(i -> i.getID() == ID).findAny().orElse(null);
		if (!v.isFixed()) {
			v.setFixed(true);
			BigDecimal bd = new BigDecimal(calculateBill(v));
			return "Vehicle was fixed. Bill is �" + bd.setScale(2) + ".";
		}
		return "Vehicle is already fixed.";
	}

	private double calculateBill(Vehicle v) {
		if (v instanceof Car) {
			return v.price * carBill;
		} else if (v instanceof Motorbike) {
			return v.price * bikeBill;
		}

		return 0;
	}

	public ArrayList<Vehicle> getList() {
		return vehicles;
	}

	public void emptyGarage() {
		vehicles.clear();
		System.out.println("The garage was emptied.");
	}

}
