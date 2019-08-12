package practice;

public class AllClass extends SubClass {

	

	public static void main(String[] args) {
		AllClass ac = new AllClass();
		Object ca = ac;
		AllClass cc = (AllClass)ca;
		cc.print();
		
		
		
	}
	
	
	public void print() {
		System.out.println("something");
	}

}
