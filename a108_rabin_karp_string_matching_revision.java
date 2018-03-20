import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a108_rabin_karp_string_matching_revision {
	
	public static final int d = 256;
	
	public static void search(String text, String pattern, int prime ) {
		int m = pattern.length();
		int n = text.length();
		int i,j;
		int p =0;
		int t = 0;
		int h = 1;
		int status = 0;
		
		for (i = 0; i<m-1; i++) {
			h=(h*d)%prime;
		}
		
		for(i=0; i<m; i++) {
			t = (d*t + text.charAt(i))%prime;
			p = (d*p + pattern.charAt(i))%prime;
		}
		
		for (i = 0; i<=n-m; i++) {
			if(p==t) {
				for(j=0; j<m; j++) {
					if(text.charAt(i+j) != pattern.charAt(j)) {
						break;
					}
				}
				if(j==m) {
					System.out.println("pattern found at index "+i);
					status = 1;
				}
			}
			if(i<n-m) {
				t = (d*(t-text.charAt(i)*h) + text.charAt(i+m)) % prime;
				
				if(t<0) {
					t = t + prime;
				}
			}
		}
		if(status ==0) {
			System.out.println("Pattern not found");
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String sttr = br.readLine();
		String str_prime = br.readLine();
		int prime  = Integer.parseInt(str_prime);
		search(str,sttr,prime);
	}

}
