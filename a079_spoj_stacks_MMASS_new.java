import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;

public class a079_spoj_stacks_MMASS_new {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		
		str = reader.readLine();
		int output = give_mass(str);
		System.out.print(output);
		
		
		/*
		BufferedReader reader;
		reader = new BufferedReader(new FileReader("MASS.IN"));
		
		String str = reader.readLine();
		int output = give_mass(str);
		
		BufferedWriter writer;
		writer = new BufferedWriter(new FileWriter("MASS.OUT"));
		
		writer.write(output);*/
	}

	private static int give_mass(String str) {
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			if (curr == '(' || curr == 'C'|| curr == 'H'|| curr == 'O' ) {
				stack1.push(curr);
				continue;
			}
			
			if (curr == '2' ||curr == '3' ||curr == '4' ||curr == '5' ||curr == '6' ||curr == '7' ||curr == '8' ||curr == '9'  ) {
				stack2.push(stack1.pop());
				int num = curr;
				num = num - 48;
				//System.out.print("-"+num+"-");
				while(stack2.isEmpty()!=true) {
					char ccc = stack2.pop();
					for (int ii = 0; ii<num; ii++) {
						stack1.push(ccc);
					}
				}
				continue;
			}
			
			if (curr == ')' ) {
				while(stack1.isEmpty() != true && stack1.peek()!='(') {
					stack2.push(stack1.pop());
				}
				stack1.pop();
				char next = str.charAt(i+1);
				if (next == '2' ||next == '3' ||next == '4' ||next == '5' ||next == '6' ||next  == '7' ||next == '8' ||next == '9'  ) {
					int num = next;
					num = num - 48;
					while(stack2.isEmpty()!=true) {
						char ccc = stack2.pop();
						for (int ii = 0; ii<num; ii++) {
							stack1.push(ccc);
						}
					}
					i++;
				}
				else {
					while(stack2.isEmpty()!=false) {
						char ccc = stack2.pop();
						stack1.push(ccc);
					}
				}
				continue;
			}
			
			else {continue;}

			
		}

		
	
		
		
	int sum = 0;
	while(stack1.isEmpty() != true) {
		char cccc = stack1.pop();
		//System.out.println(""+cccc);
		sum = sum + give_mass_for(cccc);
	}
	
	return sum;
	}
	
	private static int give_mass_for(char c) {
		if (c == 'C' || c =='c') {
			return 12;
		}
		if (c == 'O' || c == 'o') {
			return 16;
		}
		if (c == 'H' || c == 'h') {
			return 1;
		}
		return 0;
	}
	
}
