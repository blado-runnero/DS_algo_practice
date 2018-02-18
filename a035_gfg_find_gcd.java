import java.io.IOException;

public class a035_gfg_find_gcd {


	static int find_gcd(int num1 , int num2) {

		int output = 1;
		while(num1%2 == 0 && num2%2 == 0) {
			num1 = num1 / 2;
			num2 = num2 / 2;
			output = output*2;
			System.out.println(output);
		}
		int min = num1<num2?num1:num2;
		for(int i=3; num1>2 && num2>2 && i <= min ;i=i+2) {
			if(num1 % i == 0 && num2 % i == 0) {
				num1 = num1 / i;
				num2 = num2 / i;
				output = output * i;
				System.out.println(output);

			}
		}
		
		return output;
		
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
