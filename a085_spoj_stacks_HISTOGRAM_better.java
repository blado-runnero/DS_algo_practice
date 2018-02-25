import java.io.IOException;
import java.util.Stack;

public class a085_spoj_stacks_HISTOGRAM_better {

	public static void main(String[] args) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		int loop = 9;
		while (loop>0) {
			str = reader.readLine();
			String sttr[] = str.split(" ");
			long n = Integer.parseInt(sttr[0]);
			if (n==0) {
				break;
			}
			
			Stack<Integer> stack = new Stack<>();
			long  max = 0;
			int i = 0;
			long sum = 0;
			int top = 0;
			
			while(i<=n) {
				if(stack.empty() || Integer.parseInt(sttr[stack.peek()]) <= Integer.parseInt(sttr[i])) {
					stack.push(i);
					i++;
				}
				
				else {
					top = stack.peek();
					stack.pop();
					//System.out.println(i+""+""+top+"");
					sum = Integer.parseInt(sttr[top]) * (stack.empty() ? i : i - stack.peek()-1 );
					
					max = sum>=max? sum : max;
				}
			}
			while (stack.empty() == false) {
				top = stack.peek();
				stack.pop();
				//System.out.println(i+""+""+top+"");
				sum = Integer.parseInt(sttr[top]) * (stack.empty() ? i : i - stack.peek() -1);
				max = sum>=max ? sum : max;
			}
			
			System.out.println(max);
			
		}
	}
	
}