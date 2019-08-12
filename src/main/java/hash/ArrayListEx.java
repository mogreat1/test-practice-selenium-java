package hash;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("1q");
		a.add("2w");
		a.add("2w");
		System.out.println(a);
		a.add(0, "J1");
		System.out.println(a);
		a.remove(1);
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("J1"));
		System.out.println(a.size());

	}

}
