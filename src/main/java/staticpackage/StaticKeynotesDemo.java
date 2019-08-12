package staticpackage;

public class StaticKeynotesDemo {

	public int addNum = 10;
	public static int addNumStatic = 10;

	public static void main(String[] args) {
		StaticKeynotesDemo s1 = new StaticKeynotesDemo();
		int output =s1.sum(20);
		int staticOutput = sumStatic(10);
		
		System.out.println(staticOutput);
		System.out.println(output);

	}

	public int sum(int num) {
		return num + addNum;
	}
	
	public static int sumStatic(int num) {
		return num + addNumStatic;
	}
}
