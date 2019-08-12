package overLoading;

public class CarsOverLoadingQuestions {

	public static void main(String[] args) {
		increaseSEatHeight("2", 2);

	}
	public static void increaseSEatHeight(String variable1, int variable2) {
		System.out.println("I am the first overload");
	}
	public static int increaseSEatHeight(String variable3, String variable4) {
		System.out.println("I am the second overload");
		return 0;
	}


}
