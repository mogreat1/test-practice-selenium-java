package hash;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		
		Map<Integer, String> map =new HashMap<Integer, String>();
		map.put(1, "one");
		map.put(1, "two");
		map.put(2, "one");
		map.put(3, "one");
		
		System.out.println(map);
		
	}
	
}
