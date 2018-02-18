import java.io.IOException;

public class a059_codechef_CSUB {

	public static void main(String[] args) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		str = reader.readLine();
		int t = Integer.parseInt(str);
		while(--t>=0) {
			str = reader.readLine();
			int n = Integer.parseInt(str);
			str = reader.readLine();
	        str=str.replace("0","");
			long count = str.length();
			count = count++ * (count)/2;
			System.out.println(count);
			
		}
	}
	
}
			