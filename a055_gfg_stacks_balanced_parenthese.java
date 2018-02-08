import java.util.Stack;

public class a055_gfg_stacks_balanced_parenthese {

	static boolean check_for_parentheses(String exp) {
		Stack<Character> st = new Stack<>();
		
		for(int i = 0; i<exp.length();i++) {
			char c = exp.charAt(i);
			char cc;
			if (c=='{' || c=='<' || c=='(' || c=='[' ) {
				st.push(c);
			}
			if (c=='}' || c=='>' || c==')' || c==']' ) {
				cc = st.pop();
				if (is_same(c,cc) == true) {
					
				}
				else {
					return false;
				}
			}
			
			
		}
		
		return true;
	}
	
	static boolean is_same(char cc, char c) {
		if (c == '{' && cc == '}') {
			return true;
		}
		if (c == '(' && cc == ')') {
			return true;
		}
		if (c == '<' && cc == '>') {
			return true;
		}
		if (c == '[' && cc == ']') {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		String check = "{}";
		boolean is_parenthese = check_for_parentheses(check);
		System.out.print(""+is_parenthese);
		
	}
	
}
