package basics;

public class ThisDemo {
// I want to print the sum of the local and global variable which have the same name
	int a = 2;

	public void getData() {
		int a = 3;
		int b = a +this.a;
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		ThisDemo td = new ThisDemo();
		td.getData();
		
	}

}
