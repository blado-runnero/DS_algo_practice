import java.io.IOException;

public class a042_gfg_kmp_algorithm {

	static void KMP(String str, String pat) {
		
		int m = pat.length();
		int n = str.length();
		
		int lps[] = new int[m];
		int j = 0;
		
		preprocess_lps_array(pat,m,lps);
		int i = 0;
		
		while(i<n) {
			if(pat.charAt(j) == str.charAt(i)) {
				i++; j++;
			}
			if (j==m) {
				System.out.println("pattern found at : " + (i-j));
			}
			else if (i<n && pat.charAt(j) != str.charAt(i)) {
				if(j!=0) {
					j = lps[j-1];
				} else {
					i++;
				}
			}
		}
	}
	
	static void preprocess_lps_array(String pat, int m, int[] lps) {
		
		int len = 0;
		lps[0] = 0;
		int i = 1;
		
		while(i<m) {
			if(pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}
			else {
				if(len != 0) {
					len = lps[len-1];
				}
				else {
					lps[i] = len;
					i++;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
	
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str,pat;
		System.out.println("Enter the string to search from : ");
		str = reader.readLine();
		System.out.println("Enter the string to search : ");
		pat = reader.readLine();
		
		KMP(str,pat);
		
	}
	
}
