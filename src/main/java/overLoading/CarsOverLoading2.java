package overLoading;

public class CarsOverLoading2 {

	public static void main(String[] args) {
		increaseSEatHeight(10);
		increaseSEatHeight("meter");
		

	}
	public static void increaseSEatHeight(int heightToIncrease) {
		System.out.println("Increase seat height by " + heightToIncrease);
	}
	public static void increaseSEatHeight(String heightToIncrease) {
		System.out.println("Increase seat height by " + heightToIncrease);
	}

}
