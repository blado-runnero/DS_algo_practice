import java.io.IOException;

public class a005_codechef_array_practice_SALARY {

	
	public static void main(String args[]) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		str = reader.readLine();
		int t = Integer.parseInt(str);
		for (int x = 0; x<t; x++) {
			str = reader.readLine();
			int n = Integer.parseInt(str);
			str = reader.readLine();
			int sum = 0;
			int min;
			String w[] = str.split(" ");
			min = Integer.parseInt(w[0]);
			for (int i = 0 ; i<n ;  i++) {
				
				
				int numi = Integer.parseInt(w[i]);
				sum = sum + numi;
				if (numi < min) {
					min = numi;
				}
			}
			int z = sum - (n*min);
			System.out.println(z);
			
		}
		
	}
	
}
