import java.util.Stack;

public class a056_gfg_stacks_reverse_recursion {
	static  Stack <Character> st = new Stack<>();
	public static void main(String args[]) {
	
		st.push('a');
		st.push('b');
		st.push('c');
		st.push('d');
		st.push('e');
		
		System.out.println(st);
		reverse();
		
		System.out.println("\n\n\n\n"+st);
		
		
		
	}
	private static void reverse() {
		// TODO Auto-generated method stub
		if(st.size()>0) {
			char x = st.peek();
			st.pop();
			reverse();
			insert_at_bottom(x);
		}
	}
	private static void insert_at_bottom(char x) {
		// TODO Auto-generated method stub
		if (st.isEmpty()) {
			st.push(x);
		}
		else {
			char a = st.peek();
			st.pop();
			insert_at_bottom(x);
			st.push(a);
		}
	}
	
}
