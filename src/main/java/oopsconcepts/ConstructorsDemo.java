package oopsconcepts;

public class ConstructorsDemo {
	public static void main(String[] args) {
		ConstructorsCar c1	= new ConstructorsCar(); 
		
		c1.setMake("bmw");
		System.out.println(c1.getMake());
		
		System.out.println(c1.speed);		
		System.out.println(c1.gear);
		
		ConstructorsCar c2 = new ConstructorsCar(10, 1);
		System.out.println(c2.speed);
		System.out.println(c2.gear);

		
		
	}


}
