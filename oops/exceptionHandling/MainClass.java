package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
//		try {
//			int a = 5;
//			int b = 0;
//			int c = a/b;
//			
//			System.out.println(c);
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage() + " Occured, Please check your code.");
//		}
//		
//		System.out.println("Very Important Code");
//		System.out.println("need to run");
//
		fun1();

	}
	
	static void fun1() {
		
		int a = 5;
		int b = 3;
		int c = a/b;
		
		System.out.println(c);
		
		try {
			fun2();
		}catch(Exception e) {
			System.out.println(e.getMessage()+" Occured");
		}
		
	}
	
	static void fun2() throws ArrayIndexOutOfBoundsException{
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger was coming");
		}
		
	}

}

















