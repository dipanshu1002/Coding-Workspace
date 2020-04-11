package Vehicle;

public class Car extends  {
	int numGears;
	boolean isConvertible;
	
	public void print() {
		System.out.println("Car Color: "+ color);
		System.out.println("Car speed: "+ getMaxSpeed());
		System.out.println("Car numGears: "+ numGears);
		System.out.println("Car isConvertible: "+ isConvertible);
	}
}
