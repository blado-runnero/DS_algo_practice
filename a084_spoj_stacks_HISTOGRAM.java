import java.io.IOException;
import java.util.Stack;

public class a084_spoj_stacks_HISTOGRAM {

	public static void main(String[] args) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		int loop = 9;
		while (loop>0) {
			str = reader.readLine();
			String sttr[] = str.split(" ");
			int n = Integer.parseInt(sttr[0]);
			if (n==0) {
				break;
			}
			int hist[] = new int[n]; 
			for(int i = 1 ; i<=n; i++ ) {
				hist[i-1] = Integer.parseInt(sttr[i-1]);
			}
			Stack<Integer> stack = new Stack<>();
			int status = 0;
			int max = 0;
			int sum = 0;
			int i = 0;
			for(;;) {
				if (i<=n) {
					if (stack.isEmpty() == true) {
						stack.push(i);
						i++;
						continue;
					}
					if (stack.isEmpty() == false ) {
						if(hist[i] >= stack.peek()) {
							stack.push(i);
						}	
						else {
							while(stack.peek() >  hist[i] ) {
								if (stack.size() > 1) {
									sum = hist[stack.pop()] * (i - stack.peek() - 1 );
								}
								if (stack.size() == 1) {
									sum = hist[stack.pop()] * i ;
								}
								max = (sum>max)?sum:max;
								if(i<=n) {
									stack.push(i);
								}
							}
						}
					}
					
					i++;
					if (stack.isEmpty() == true && i == n) {break;}
				}
				if (i==n) {
					while(stack.isEmpty() == false) {
					if (stack.size() > 1) {
						sum = hist[stack.pop()] * (i - stack.peek() - 1 );
					}
					if (stack.size() == 1) {
						sum = hist[stack.pop()] * i ;
					}
					max = (sum>max)?sum:max;
					}
				}
			}
			System.out.print(max);
		}
	}

}
