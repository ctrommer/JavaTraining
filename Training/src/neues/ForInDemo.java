package neues;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ForInDemo {

	public static void main(String[] args) {

		int[] numberArray = new int[] { 1, 2, 3, 4, 5 };		
		for (int i : numberArray) {
			System.out.println(i);
		}
		
		Collection<String> stringCollection = Arrays.asList("aa", "bb", "cc");
		for (String string : stringCollection) {
			System.out.println(string);
		}
		
		Map<String, Integer> map = new HashMap<>();
		map.put("aa", 1);
		map.put("bb", 2);
		map.put("cc", 3);
		map.put("dd", 4);
		
		for (Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue() );			
		}
	}	
}
