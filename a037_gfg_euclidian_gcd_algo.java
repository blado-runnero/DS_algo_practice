import java.io.IOException;

public class a037_gfg_euclidian_gcd_algo {

	static int find_gcd(int num1, int num2) {
	int max = num1 >= num2 ? num1 : num2;
	int min = num2 == max ? num1 : num2;

		while(min!=0 ) {
			int rem = max % min;
			max = min;
			min = rem;
		}
		return max;
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
