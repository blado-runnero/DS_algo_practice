import java.io.IOException;
import java.util.Stack;

public class a077_spoj_stacks_ONP {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		str = reader.readLine();
		int n = Integer.parseInt(str);
		while(n-->0) {
			str = reader.readLine();
			System.out.println(infix_to_postfix(str));
		}
	}

	
	static int prec(char c) {
		switch(c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
			
		}
		return -1;
	}
	
	static String infix_to_postfix(String str) {
        String result = new String("");
		
        Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i<str.length();++i) {
			char c = str.charAt(i);
			
			if(Character.isLetterOrDigit(c)) {
				result+=c;
			}
			else if (c=='(') {
				stack.push(c);
				
			}
			else if (c==')') {
				while(!stack.isEmpty() && stack.peek() != '(') {
					result  += stack.pop();
				}
				if (!stack.isEmpty() && stack.peek() != '(') {
					return "Invalid Expression";
				}
				else {  stack.pop()
;					}
				
				
			}
			else {
				while(!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
					result += stack.pop();
				}
				stack.push(c);
				
			}
			
			
		
	}
		
		while(!stack.isEmpty()) {
			result+=stack.pop();
			
		}
		
		return result;
	}
	
}
