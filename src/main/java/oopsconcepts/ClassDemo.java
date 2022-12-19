package oopsconcepts;

public class ClassDemo {
	public static void main(String[] args) {
		Car bmw	= new Car(); 
		bmw.setMake("bmw");
		System.out.println(bmw.getMake());
		
		Car benz = new Car();
		benz.setModel("c300");
		System.out.println(benz.getModel());
		
		benz.setYear(2020);
		System.out.println(benz.getYear());
		
	}
}
