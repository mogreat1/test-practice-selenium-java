package overLoading;

public class CarsOverLoading1 {

	public static void main(String[] args) {
		increaseSEatHeight(10);
		increaseSEatHeight(12, true);

	}
	public static void increaseSEatHeight(int heightToIncrease) {
		System.out.println("Increase seat height by " + heightToIncrease);
	}
	public static void increaseSEatHeight(int heightToIncrease, boolean rememberHeight) {
		System.out.println("Increase seat height by " + heightToIncrease);
		if(rememberHeight) {
			System.out.println("Your selection is saved");
		} else {
			System.out.println("Your selection is not saved");
		}
	}

}
