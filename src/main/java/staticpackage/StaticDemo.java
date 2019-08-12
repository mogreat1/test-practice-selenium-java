package staticpackage;

public class StaticDemo {

	public static void main(String[] args) {
	
		StaticExampleClass s1 = new StaticExampleClass("bmw", "black");
		System.out.println(s1.getMake());
		System.out.println(StaticExampleClass.getInstanceNum());
		
		StaticExampleClass s2 = new StaticExampleClass("benz", "white");
		System.out.println(s2.getMake());
		System.out.println(StaticExampleClass.getInstanceNum());
	}

}
