package inheritance;

public class BMW extends Cars {
	

	public BMW(int startSpeed) {
		super(startSpeed);
	}

	@Override
	public void increaseSpeed() {
		System.out.println("Increasing speed of BMW");
	}
	
	public void headUpDisplayNavigation() {
		System.out.println("BMW specific functionality");
	}
}
