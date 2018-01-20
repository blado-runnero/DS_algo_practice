import java.io.*;
import java.util.*;

public class a015_gfg_stacks_implementation_stack_class {

	static void stack_push(Stack<Integer> stack) {
		for (int i = 0; i<5 ; i++) {
			stack.push(i);
		}
	}
	
	static void stack_pop(Stack<Integer> stack) {
		System.out.println("Pop : ");
		for (int i = 0; i <5 ; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}
	
	static void stack_peek(Stack<Integer> stack) {
		Integer element = (Integer) stack.peek();
		System.out.println("Element on top of array : "+ element);
	}
	
	static void stack_search(Stack<Integer> stack, int element) {
		Integer pos = (Integer) stack.search(element);
		System.out.println((pos==-1)?"Element not found":"Element found at position "+pos);
	}
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		stack_push(s);
		stack_pop(s);
		stack_push(s);
		stack_peek(s);
		stack_search(s,2);
		stack_search(s,6);
	}
	
}
