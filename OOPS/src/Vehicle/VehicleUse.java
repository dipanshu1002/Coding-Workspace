package Vehicle;

public class VehicleUse {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.print();
		Car c = new Car();
		c.numGears = 10;
		c.color = "Black";
		c.print();
		c.setMaxSpeed(10);
		c.print();
		
	}
}
