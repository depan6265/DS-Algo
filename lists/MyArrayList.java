package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		List<String> fruits = new LinkedList<>();
//		List<String> vegetables = new ArrayList();
	
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Hi");
		
//		fruits.clear();
		
//		List<String> toRemove = new ArrayList();
//		toRemove.add("Apple");
//		toRemove.add("Hi");
//		
//		fruits.removeAll(toRemove);
//		
		
//		fruits.remove(2);
		
//		vegetables.add("Potato");
//		vegetables.add("Tomato");
//		vegetables.add("Carrot");
//		
//		fruits.addAll(vegetables);
//		
//		Pair<String, Integer> p1 = new Pair("Anuj", 457);
//		Pair<Boolean, String> p2 = new Pair(true, "Hello");
//		
//		p1.getDescription();
		
//		fruits.set(1,"Banana");
		
		String temp[] = new String[fruits.size()];
		
		fruits.toArray(temp);
		
		for(String e:temp) {
			System.out.println(e);
		}

	}

}



