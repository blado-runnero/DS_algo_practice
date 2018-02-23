import java.io.IOException;
import java.util.Stack;

public class a080_gfg_stacks_length_of_longest_valid_substr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		str = reader.readLine();
		int t = Integer.parseInt(str);
		while(--t>=0) {
			str = reader.readLine();
			int status = check_for_balanced_parenthesis(str);
			System.out.print(status);
		}
	}

	private static int check_for_balanced_parenthesis(String str) {
		Stack<Character> stack = new Stack<>();
		int max = 0;
		int sum = 0;
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			if (c=='(' ) {stack.push(c); continue;}
			if (c ==')' ) {
				if (stack.isEmpty() == false) {
					sum++;
					sum++;
					stack.pop();
					
				}
				if (max<=sum) {max = sum;}
				if (stack.isEmpty() == true) {
					sum = 0; 
				}
			}
			
		}
		
		return max;
	}

}
