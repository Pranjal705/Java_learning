package oops;
// Concept Studied in this example
// Constructor, Default Constructor, Parameterized Constructor, This keyword
class Vehicle
{
	int wheels, headLights;
	String Color;

	Vehicle()
	{

	} // Default Constructor

	Vehicle(int wheels)
	{
		this.wheels = wheels;
		this.headLights = 2;
	}

	Vehicle(int wheels, String Color)
	{
		this.wheels = wheels;
		this.Color = Color;
		this.headLights = 2;
	}
}

public class MyConstructors {

	public static void main(String[] args) {
		Vehicle car = new Vehicle(4);
		Vehicle Erickshaw = new Vehicle(3,"Blue");

		System.out.println(car.wheels);
		System.out.println(car.headLights);
		System.out.println(car.Color);

		System.out.println(Erickshaw.wheels);
		System.out.println(Erickshaw.headLights);
		System.out.println(Erickshaw.Color);	
	}

}
