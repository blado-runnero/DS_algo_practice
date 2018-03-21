import java.util.Stack;

public class a115_remove_adjacent_if_they_are_same {
	public static void main(String[] args) {
		String str = "ABCCBCBA";
		char[] char_array = str.toCharArray();
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		int n = char_array.length;
		for(int i = 0; i <n; i++) {
			stack1.push(char_array[i]);
		}
		str = "";
		while(!stack1.isEmpty()) {
			char c = stack1.pop();
			if(stack1.isEmpty()==false && stack1.peek() == c) {
				stack1.pop();
				continue;
			}
			if(stack2.isEmpty()==false && stack2.peek()==c) {
				stack2.pop();
			}
			else {
				stack2.push(c);
			}
		}
		
		while(!stack2.isEmpty()) {
			str = str + stack2.pop();
		}
		
		System.out.print(str);
			
	}
}
