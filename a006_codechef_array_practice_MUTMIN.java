import java.io.IOException;

public class a006_codechef_array_practice_MUTMIN {

	public static void main(String args[]) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		str = reader.readLine();
		int t = Integer.parseInt(str);
		while(--t>=0) {
			str = reader.readLine();
			String nk[] = str.split(" ");
			int n = Integer.parseInt(nk[0]);
			int k = Integer.parseInt(nk[1]);
			str = reader.readLine();
			String ns[] = str.split(" ");
			int div = 0;
			for (int i = 0; i<n; i++) {
				int nss = Integer.parseInt(ns[i])+k;
				if (nss%7 == 0) {div++;}
			}
			System.out.println(div);
		}
	}
	
}
