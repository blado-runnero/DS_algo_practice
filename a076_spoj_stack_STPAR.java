import java.io.IOException;
import java.util.Stack;

public class a076_spoj_stack_STPAR {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		int n = 5;
		while (n!=0) {
			str = reader.readLine();
			n = Integer.parseInt(str);
			
			if(n==0) {break;}
			
			str = reader.readLine();
			String sttr[] = str.split(" ");
			int[] x = new int[n];
			for (int i = 0; i<sttr.length ; i++) {
				x[i] = Integer.parseInt(sttr[i]);
			}
			Stack<Integer> stack = new Stack<>();
			Stack<Integer> line = new Stack<>();
			int counter = 1;
		
			for (int i = 0; i < x.length; i++) {
				
				while(stack.isEmpty() != true && line.isEmpty() != true && stack.peek() == (line.peek()+1) ) {
					int xx = stack.pop();
					line.push(xx);
					counter++;
				}
				System.out.println(counter+"-"+i);
				
				if (x[i] != counter) {
					stack.push(x[i]);
				}
				if (x[i] == counter) {
					line.push(x[i]);
					counter++;
				}
			}
			while(stack.isEmpty() != true) {
				line.push(stack.pop());
			}
		
			int rev_count = n;
			int status = 0;
			for(int i = 0; i<n; i++) {
				int pop = line.pop();
				System.out.print("");
				if (pop == rev_count ) {
					rev_count--;
				}
				else {
					status++;
					break;
				}
			}
		
			if (status == 0) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
			
			
			
			
		}
	}

}
