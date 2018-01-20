import java.io.IOException;

public class a004_codechef_array_practice_CNOTE {

	public static void main(String args[]) throws IOException {
		
		
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		int out = 0 ;
		str = reader.readLine();
		int test_cases = Integer.parseInt(str);
		for (int i = 0; i<test_cases; i++) {
				
			str = reader.readLine();
			String inputs[] = str.split(" ");
			int x = Integer.parseInt(inputs[0]);
			int y = Integer.parseInt(inputs[1]);
			int k = Integer.parseInt(inputs[2]);
			int n = Integer.parseInt(inputs[3]);
			out=0;
		    for (int kkk = 0; kkk<n; kkk++) {
		    
		    	str = reader.readLine();
		    
		    	String npc[] = str.split(" ");
		    	int z = x-y;
		    	int p = Integer.parseInt(npc[0]);
		    	int c = Integer.parseInt(npc[1]);
				if (p>=z && c<=k) {
					out++;
					
				}
			}
			System.out.println((out>0)?"LuckyChef":"UnluckyChef");
			
		    }
		
				
	}
	
}
