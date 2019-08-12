package oopsconcepts;

public class InterfaceDemo implements InterfaceCars, InterfaceBMW {

	public void engineStart(String engineType, boolean isKeyLees) {
		System.out.println("This is the implementation");

	}

	public void headsUpNavigation() {
		System.out.println("This is the headsup navigation");
	}

}
