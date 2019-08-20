package hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {

	public static void main(String[] args) {
		
		Map<Integer, String> map =new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(1, "two");
		map.put(2, "one");
		map.put(3, "one");
		
		System.out.println(map);
		System.out.println(map.containsValue("one"));
		System.out.println(map.containsKey(5));
		System.out.println(map.isEmpty());

		Set<Integer> keys =map.keySet();
		System.out.println(keys);

		Collection<String> values = map.values();
		System.out.println(values);

		for (Map.Entry entry : map.entrySet()) {
			System.out.println( entry.getKey() + " -> " + entry.getValue() );
		}


		
	}
	
}
