import java.util.Stack;

public class a053_gfg_stacks_infix_to_postfix {

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
	
	public static void main(String[] args) 
    {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infix_to_postfix(exp));
    }
	
	
}
