
public class StackClientDemo {

	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		Stack stack = new Stack(10);
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println("peek action:" + stack.peek());
		System.out.println("pop action:" + stack.pop());
		System.out.println("pop action:" + stack.pop());
		System.out.println("pop action:" + stack.pop());
		System.out.println("pop action:" + stack.pop()); // stack underflow
		
	}

}
