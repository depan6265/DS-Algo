package linkedLists;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		
//		List<Integer> ll = new LinkedList<>();
//		List<Integer> al = new ArrayList<>();
//		
//		getTimeOff(ll);
//		getTimeOff(al);
		
		MyLinkedList<Integer> myLL = new MyLinkedList<>();
		myLL.add(3);
		myLL.add(12);
		
		myLL.print();
		
	}
	
//	static void getTimeOff(List<Integer> list) {
//		long start = System.currentTimeMillis();
//		for(int i = 0;i<100000; i++) {
//			list.add(0,i);
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.println(list.getClass().getName()+" --> "+(end - start));
//	}

}
