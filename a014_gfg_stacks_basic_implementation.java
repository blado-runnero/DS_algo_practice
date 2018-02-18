public class a014_gfg_stacks_basic_implementation {

	
	
		static final int max = 1000;
		int top;
		int a[] = new int [max];
		
		boolean isEmpty() {
			return (top<0);
		}
		a014_gfg_stacks_basic_implementation(){top = -1;}
		
		boolean push (int x) {
			if (top >= max) {
				System.out.println("Stack overflow");
				return false;
			}else {
				a[++top] = x;
				return true;
			}
		}
		
		int pop() {
			if (top<0) {
				System.out.println("Stack underflow");
				return 0;
			}else {
				int x = a[top--];
				return x;
			}
		}
		
	


	
	
	public static void main(String[] args) {
		a014_gfg_stacks_basic_implementation ss = new a014_gfg_stacks_basic_implementation();
		ss.push(45);
		ss.push(23);
		ss.push(324);
		System.out.println(ss.pop()+" popped from stack");
	}
	
}



