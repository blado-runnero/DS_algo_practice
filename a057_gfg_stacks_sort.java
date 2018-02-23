import java.util.Random;
import java.util.Stack;

public class a057_gfg_stacks_sort {

	static Stack<Integer> s = new Stack<>(); 
	
	public static void main(String args[]) {
		Random r = new Random();
		
		for(int i=0; i<15; i++) {
			s.push(r.nextInt(100));
		}
		
		System.out.println(s);
		
		sort(s);
		
		System.out.println(s);
		
	}

	private static void sort(Stack<Integer> s) {
		// TODO Auto-generated method stub
		if(!s.isEmpty()) {
			int x = s.pop();
			sort(s);
			sorted_insert(s,x);
		}
	}

<<<<<<< HEAD
	private static void sorted_insert(Stack<Integer> s, int x) {
=======
	private static void sorted_insert(Stack<Integer> ss, int x) {
>>>>>>> c41480a1954afd81e5c98574f3759da5900397d4
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
