import java.io.IOException;

public class a040_gfg_naive_pattern_matching {

	public static void main(String[] args) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str,pat;
		System.out.println("Enter the string to search from : ");
		str = reader.readLine();
		System.out.println("Enter the string to search : ");
		pat = reader.readLine();
		
		for(int i = 0 ; i <= str.length()-pat.length();i++ ) {
			int j;
			for(j = 0;j<pat.length();j++ )
			{
				if (str.charAt(i+j)!=pat.charAt(j)) {
					break;
				}
				if (j==pat.length()-1) {
					System.out.println("Pattern found at index : "+i);
				}
			}
		}
		
		
		
		
		
		
		
		

	}	
}
