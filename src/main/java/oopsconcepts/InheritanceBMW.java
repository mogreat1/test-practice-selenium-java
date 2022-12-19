package oopsconcepts;

public class InheritanceBMW extends InheritanceCars {



	public InheritanceBMW(int startSpeed, String model) {
		super(startSpeed, model);
	}

	@Override
	public void increaseSpeed() {
		System.out.println("Increasing speed of bmw");
	}

	@Override
	public void decreaseSpeed() {
		super.decreaseSpeed();
	}
	
	public void headupDispayNavigation() {
		System.out.println("bmw specific functionality");
	}
}
