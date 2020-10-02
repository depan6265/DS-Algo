package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
		ad.push(12);
		ad.push(32);
		System.out.println(ad.peek());

	}

}
