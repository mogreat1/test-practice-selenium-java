package oopsconcepts;

public class InheritanceDemo {

	public static void main(String[] args) {
		int speed = 0;
		InheritanceCars c1 = new InheritanceCars(speed);
		c1.increaseSpeed();
		c1.decreaseSpeed();
		
		InheritanceBMW bmw = new InheritanceBMW(speed, "model");
		bmw.increaseSpeed();
		bmw.headupDispayNavigation();
	}
}
