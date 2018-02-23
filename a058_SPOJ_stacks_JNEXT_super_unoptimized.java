import java.io.IOException;
import java.util.Stack;

public class a058_SPOJ_stacks_JNEXT_super_unoptimized {

	static int result = 1, status = -1;
	
	public static void main(String args[]) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		str = reader.readLine();
		int t = Integer.parseInt(str);
		
		while(t-->0){
			str = reader.readLine();
			int n = Integer.parseInt(str);
			str = reader.readLine();
			String[] sttr = str.split(" ");
			
			int x[] = new int[n];
			for(int i=0; i<n; i++) {
				
				int te = Integer.parseInt(sttr[i]);
				x[i]= te;
				//System.out.println(te);
			}
			
			Stack<Integer> st = new Stack<>();
			//int status = -1;
			
			int index_pivot = 0, num_pivot=0, num_replace,num_index = 0;
			for (int i = n-1; i>0;i--) {
				if (x[i-1]-x[i] < 0) {
					index_pivot = i-1;
					num_pivot = x[i-1];
					status++;
					break;
				}
			
			}
			int tn = 10;
			for (int i=n-1 ; i>index_pivot; i--) {
				if (x[i]>num_pivot && x[i]<tn) {
					tn = x[i];
					num_index = i;
				}
			}
			num_replace = tn;
			
			
			
			
<<<<<<< HEAD
			//for(int i=0; i<n; i++) {System.out.print(x[i]);}
=======
			//\\for(int i=0; i<n; i++) {System.out.print(x[i]);}
>>>>>>> c41480a1954afd81e5c98574f3759da5900397d4
			
			
			
			//System.out.println(""+index_pivot+"\t"+num_pivot+"\t"+num_index+"\t"+num_replace+"\t"+tn);
			x[index_pivot] = num_replace;
			x[num_index] = num_pivot;
			
			for(int i = n-1; i>index_pivot; i--) {
				sorted_insert(st,x[i]);
				//System.out.println(x[i]+"   1");
			}
			result = 0;
			for(int i = 0; i<=index_pivot; i++) {
				result = result*10 + x[i];
			}
			
			String res = ""+result; 
			String ult =""; 
			//System.out.println(st);
			while(!st.isEmpty()) {
				int xxx = st.pop();
				ult = xxx+ult;
			}
			
			
			
			if (status>=0) {System.out.println(res+ult);}
			else {System.out.println(status);}
				
			status = -1;
		}
		
		
	}

	private static void sorted_insert(Stack<Integer> s, int x) {
		// TODO Auto-generated method stub
		if (s.isEmpty() || x>s.peek()) {
			s.push(x);
			return;
		}else {
			int t = s.pop();
			sorted_insert(s,x);
			s.push(t);
		}
		
	
			
	}
	
}
