package overLoading;

public class CarsOverLoading3 {

	public static void main(String[] args) {
		increaseSEatHeight(11, "1");
		increaseSEatHeight("2", 22);
	}

	public static void increaseSEatHeight(String variable1, int variable2) {
		System.out.println(variable1 + variable2);
	}

	public static void increaseSEatHeight(int variable2, String variable1) {
		System.out.println(variable1 + variable2);
	}

}
