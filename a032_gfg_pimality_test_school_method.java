import java.io.IOException;

public class a032_gfg_pimality_test_school_method {

	static int check_prime(int test) {
		int status =0;
		
		for(int i = 2 ; i < test/2 ; i++) {
			if (test%i == 0) {status++; break;}
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
