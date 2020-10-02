package vectorAndStacks;


public class MainClass {

	public static void main(String[] args) throws Exception {
		
//		Vector<Integer> v = new Vector<>();
//		v.add(12);
//		v.add(32);
		
		MyStack<Integer> stack = new MyStack<>();
		
		stack.push(12);
		stack.push(43);
		stack.push(32);
		int popped = stack.pop();
		
		System.out.println(popped);
		
		int peeked = stack.peek();
		System.out.println(peeked);
	}

}
