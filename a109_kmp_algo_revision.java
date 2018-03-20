import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a109_kmp_algo_revision {

	public static void kmp_search(String text,String pattern) {
		int m = pattern.length();
		int n = text.length();
		
		int lps[] = new int[m];
		int j = 0; 
		compute_prefix_array(pattern,m,lps);
		int i = 0;
		while(i<n) {
			if(pattern.charAt(j) == text.charAt(i)) {
				j++; i++;
			}
			if (j==m) {
				System.out.println("Pattern found at index "+(i-j));
				j = lps[j-1];
			}
			else if(i<n && pattern.charAt(j) != text.charAt(i)) {
				if(j!=0) {
					j = lps[j-1];
				}else {
					i = i+1;
				}
			}
		}
		
	}
	
	static void compute_prefix_array(String pattern, int m, int[] lps) {
		int len = 0; int i = 1;
		lps[0] = 0;
		
		while(i<m) {
			if(pattern.charAt(i) == pattern.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			}
			else {
				if(len!=0) {
					len = lps[i-1];
				}else {
					lps[i] = len;
					i++;
				}
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = br.readLine();
		String pattern = br.readLine();
		kmp_search(text,pattern);
	}

}
