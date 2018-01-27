import java.io.IOException;

public class a036_gfg_simple_gcd {
	
	static int find_gcd(int num1,int num2) {
		if (num1==0 || num2==0) {return 0;}
		else if (num1 == num2) {return num1;}
		else {
			int max = num1>num2?num1:num2;
			int min = num1<num2?num1:num2;
			return find_gcd(max-min , min);
		}
	}

	public static void main(String[] args) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		System.out.println("Enter the number to find gcd of : ");
		str = reader.readLine();
		int num1 = Integer.parseInt(str);
		str = reader.readLine();
		int num2 = Integer.parseInt(str);

		int gcd = find_gcd(num1,num2);	
		
		System.out.println("\n\ngcd of "+num1+" and "+num2+" is : "+gcd+".");
		
	
}
	
}
