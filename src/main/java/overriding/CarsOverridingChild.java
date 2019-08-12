package overriding;

public class CarsOverridingChild extends CarsOverridingParent{
	public static void main(String[] args) {
		CarsOverridingParent c1 = new CarsOverridingChild();
		c1.increaseSpead();
		c1.engineStart(2);
	}
	@Override
	public void engineStart(int cyl) {
		super.engineStart(2);
		System.out.println("I am from the child class");
		
	}
}
