import java.io.IOException;

public class a033_gfg_primality_test_fermat_method {

	
	
	static int check_prime(int test) {
		int status =0; // prime
		for(int i = 1 ; i < test-1 ; i++) {
			if (Math.pow(i, test-1) % test != 1) {status++; break;}
		}
		return status;
	}
	
	
	public static void main(String[] args) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		System.out.println("Enter the number to check for prime : ");
		str = reader.readLine();
		int test = Integer.parseInt(str);
		int status = check_prime(test);
		System.out.println((status==0)?test+" : Prime": test+" : Not Prime");
	}
	
}
