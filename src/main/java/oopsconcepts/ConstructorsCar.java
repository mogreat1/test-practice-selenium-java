package oopsconcepts;

public class ConstructorsCar {

	private String make;
	int speed;
	int gear;

	public ConstructorsCar() {
		this.speed = 0;
		this.gear = 0;
	}
	
	public ConstructorsCar(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

}
