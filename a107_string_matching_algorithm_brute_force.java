import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a107_string_matching_algorithm_brute_force {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String sttr = br.readLine();
		int count = 0;
		int status =0;
		for(int i = 0; i<str.length(); i++) {
			if (status == 1) {break;}
			for(int j = 0; j<sttr.length(); j++) {
				if (str.charAt(i+j) == sttr.charAt(j)) {
					count++;
				}
				else {
					break;
				}
				
				if ((count+1) == sttr.length()) {
					System.out.println("Pattern found.");
					status = 1;
				}
				
				if (status == 1) {break;}
			}
			count=0;
		}
		if (status == 0) {
			System.out.println("Pattern not found");
		}
	}
	
}
