import java.io.IOException;
import java.util.Stack;



public class a083_spoj_strings_ANARC09C {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str="()()()";
		
		int kk = 1;
		while(str.charAt(0)!='-') {
			str = reader.readLine();
			if (str.charAt(0)=='-') {
				break;
			}
			int output = 0;
			Stack<Character> stack = new Stack<>();
			Stack<Character> stack2 = new Stack<>();
			
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c == '{') {
					stack.push(c);
				}
				if (c == '}') {
					if (stack.isEmpty() == true) {
						stack2.push(c);
					}
					if (stack.isEmpty() == false) {
						stack.pop();
					}
				}
			}
			
			while(stack.isEmpty() == false) {
				stack2.push(stack.pop());
			}
			int op = 0, cl = 0;
			while(stack2.isEmpty() == false) {
				char c = stack2.pop();
				//System.out.println(stack2.pop());
				if (c == '{') {
					op++;
				}
				if (c == '}') {
					cl++;
				}
			}
			
			if (op == 1) {output++;} else {if(op%2 != 0) {
				op--;
				output++;
				output = output + (op/2);
			}else {
				output = output + (op/2);
			}}
			if (cl == 1) {output++;} else {if(cl%2 != 0) {
				cl--;
				output++;
				output = output + (cl/2);
			}else {
				output = output + (cl/2);
			}}
			
			System.out.print(kk+". "+output);
			kk++;
		}
	}

}
