package hash;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSets {

	public static void main(String[] args) {

		Set<String> hashSet = new HashSet<String>();
		hashSet.add("two");
		hashSet.add("one");

		hashSet.add("four");
		hashSet.add("one");
		System.out.println(hashSet);

		Set<String> linkedhashSet = new LinkedHashSet<String>();

		linkedhashSet.add("one");
		linkedhashSet.add("two");
		linkedhashSet.add("four");
		linkedhashSet.add("one");
		System.out.println(linkedhashSet);

		Set<String> treeSet = new TreeSet<String>();

		treeSet.add("one");
		treeSet.add("two");
		treeSet.add("four");
		treeSet.add("one");
		System.out.println(treeSet);

	}

}
