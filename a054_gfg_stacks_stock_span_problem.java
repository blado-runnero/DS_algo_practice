import java.util.Stack;

public class a054_gfg_stacks_stock_span_problem {

	static int[] stock_span(int[] stock) {
		int span[] = new int[stock.length];
		Stack<Integer> st = new Stack<>();
		span[0]=1;
		for(int i = 1; i<stock.length; i++) {
			for (int j = i-1; j>=0; j--) {
				if (stock[j]<stock[i]) {
					st.push(j);	
					//System.out.print("1");
					}
				else {break;}
					
				}
			
			int count = 1;
			while(!st.isEmpty()) {
				//System.out.print("1");

				count++;
				st.pop();
			}
			span[i] = count;
			
		}
		
		
		return span;
	}
	
	public static void main(String args[]) {
	int stocks[] = {10,4,5,90,120,80};
	int[] span = stock_span(stocks);
	for(int i = 0; i<span.length; i++) {
		System.out.print(stocks[i]+"\t"+span[i]+"\n");
	}
	//System.out.print("1");
	}
	
}
