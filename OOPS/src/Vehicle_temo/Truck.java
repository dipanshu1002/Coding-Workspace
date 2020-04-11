package Vehicle_temo;

import Vehicle.Vehicle;

public class Truck extends Vehicle {
	int maxLoadingCapacity;
	public void print() {
		System.out.println("Truck capacity: " + maxLoadingCapacity);
		System.out.println("Truck color: "+ color);
	}
}
