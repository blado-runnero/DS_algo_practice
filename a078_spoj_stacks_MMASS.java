import java.util.Stack;

public class a078_spoj_stacks_MMASS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "((CH)2(OH2H)(C(H))O)3";
		int output = give_mass(str);
		System.out.print(output);
	}

	private static int give_mass(String str) {
		
		Stack<Character> stack = new Stack<>();
		int sum = 0;
		int status = 0;
		String refined_str = "" ;
		for (int i = 0; i<str.length(); i++) {
			
			if (status == 0) {
				if (str.charAt(i) == 'C' || str.charAt(i) == 'H' || str.charAt(i) == 'O') {
					refined_str += str.charAt(i);
					continue;
				}
				if (str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4'|| str.charAt(i) == '5'|| str.charAt(i) == '6'|| str.charAt(i) == '7'|| str.charAt(i) == '8'|| str.charAt(i) == '9' )
				{
					int c = str.charAt(i);
					c = c-48;
					char ccc = refined_str.charAt(refined_str.length()-1);
					for (int j = 1; j< c; j++) {
						
						refined_str = refined_str + ccc;
					}
					
					continue;
				}
			}
			
			/*
			if ((str.charAt(i) == ')') && (str.charAt(i+1) == '2' || str.charAt(i+1) == '3' || str.charAt(i+1) == '4'|| str.charAt(i+1) == '5'|| str.charAt(i+1) == '6'|| str.charAt(i+1) == '7'|| str.charAt(i+1) == '8'|| str.charAt(i+1) == '9' ) ) {
				status--;
				int c = str.charAt(i+1);
				c = c-48;
				String str_stack = "";
				while(stack.isEmpty() != true) {str_stack+=stack.pop();}
				for (int j = 1; j< c; j++) {
					refined_str = refined_str + str_stack;
				}
				i++;
				continue;
				
			}
			
			
			
			if (str.charAt(i) == ')' && (str.charAt(i+1) == '(' || str.charAt(i+1) == 'C' || str.charAt(i+1) == 'H'|| str.charAt(i+1) == 'O') ) {
				status--;
				continue;
				
			}*/
			
			if (str.charAt(i) == '(') {
				status++;
			}
			
			if (status > 0) {
				if (str.charAt(i) == 'C' || str.charAt(i) == 'H' || str.charAt(i) == 'O') {
					refined_str += str.charAt(i);
					stack.push(str.charAt(i));
					continue;
				}
				if (str.charAt(i) == '2' || str.charAt(i) == '3' || str.charAt(i) == '4'|| str.charAt(i) == '5'|| str.charAt(i) == '6'|| str.charAt(i) == '7'|| str.charAt(i) == '8'|| str.charAt(i) == '9' )
				{
					int c = str.charAt(i);
					c = c-48;
					for (int j = 1; j< c; j++) {
						refined_str = refined_str + refined_str.charAt(refined_str.length()-1);
						stack.push(refined_str.charAt(refined_str.length()-1));
					}
					
					continue;
				}
				if ((str.charAt(i) == ')') && (str.charAt(i+1) == '2' || str.charAt(i+1) == '3' || str.charAt(i+1) == '4'|| str.charAt(i+1) == '5'|| str.charAt(i+1) == '6'|| str.charAt(i+1) == '7'|| str.charAt(i+1) == '8'|| str.charAt(i+1) == '9' ) ) {
					status--;
					int c = str.charAt(i+1);
					c = c-48;
					String str_stack = "";
					while(stack.isEmpty() != true) {str_stack+=stack.pop();}
					for (int j = 1; j< c; j++) {
						refined_str = refined_str + str_stack;
					}
					System.out.println(refined_str);
					continue;
					
				}
				if (str.charAt(i) == ')' && (str.charAt(i+1) == '(' || str.charAt(i+1) == 'C' || str.charAt(i+1) == 'H'|| str.charAt(i+1) == 'O') ) {
					status--;
					continue;
					
				}
			}
			
			
			
		}
		for(int l = 0; l < refined_str.length(); l++ ) {
			sum = sum + give_mass_for(refined_str.charAt(l));
			//System.out.print(refined_str.charAt(l));
			
		}
		//System.out.println();
		return sum;
	}
	
	private static int give_mass_for(char c) {
		if (c == 'C') {
			return 12;
		}
		if (c == 'O') {
			return 16;
		}
		if (c == 'H') {
			return 1;
		}
		return 0;
	}
	
}