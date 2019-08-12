package oopsconcepts;

public class InheritanceCars {
	
	public InheritanceCars(int startSpeed) {
		
	}
	
	public InheritanceCars(int startSpeed, String model) {
		
	}
	
	int speed;
	
	public void increaseSpeed() {
		speed++;
		System.out.println("Increasing Speed of Cars");
		
	}
	
	public void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing Speed of Cars");
		
	}

}
