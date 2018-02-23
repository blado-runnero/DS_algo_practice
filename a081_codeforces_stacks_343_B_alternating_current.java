import java.io.IOException;
import java.util.Stack;

public class a081_codeforces_stacks_343_B_alternating_current {

	public static void main(String[] args) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		str = reader.readLine();
		int t = Integer.parseInt(str);
		while(--t>=0) {
			Stack<Character> stack = new Stack<>();
			str = reader.readLine();
			
			for (int i = 0; i<str.length(); i++) {
				char c = str.charAt(i);
				if (stack.isEmpty() == true) {
					stack.push(c);
				}
				else {
					if (stack.peek() == c) {
						stack.pop();
					}
					else {
						stack.push(c);
					}
				}
			}
			
			if (stack.isEmpty() == true) {
				System.out.print("yes");
			}
			else {
				System.out.print("no");
			}
			
		}

	}

}
