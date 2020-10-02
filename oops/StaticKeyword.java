package oops;

import oops.A.B;
import oops.A.C;

public class StaticKeyword {
	
	static {
		
		System.out.println("In Block 1");
		
	}
	
	static {
		
		System.out.println("In Block 2");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Inside Main");
		
	}
	
static {
		
		System.out.println("In Block 3");
		
	}
	

}
