import java.io.IOException;

public class a038_gfg_recursion_factorial {

	static int find_factorial(int num) {
		if (num == 0) {
			return 1;
		}
		else {
			return num * find_factorial(num-1);
		}
	}
	
	public static void main(String[] args) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		System.out.println("Enter the number : ");
		str = reader.readLine();
		int num1 = Integer.parseInt(str);

		int factorial = find_factorial(num1);	
		
		System.out.println("\n\nFactorial of "+" is : "+factorial);
		
	
}
	
}
