package maps;

import java.util.*;
import java.util.Map.Entry;

public class MainClass {

	public static void main(String[] args) {
		
//		Map<String, Integer> numbers = new HashMap<>();
//		
//		numbers.put("One", 1);
//		numbers.put("Two", 2);
//		numbers.put("Three", 3);
//		
//		System.out.println(numbers.get("Two"));
//		System.out.println(numbers.keySet());
//		System.out.println(numbers.values());
//		System.out.println( numbers.entrySet());
//		
//		Set<Entry<String, Integer>> entries = numbers.entrySet();
//		
//		for(Entry<String, Integer> entry: entries) {
//			entry.setValue(entry.getValue() * 100);
//		}
//		
//		System.out.println(numbers);
		
		System.out.println(getHash("BALL"));

	}
	
	public static int getHash(String s) {
		
		int hash = 0;
		for(int i = 0;i<s.length();i++) {
			hash += s.charAt(i);
		}
		return hash;
		
	}

}
