import java.io.IOException;

public class a003_codechef_array_practice_LECANDY {

	public static void main(String args[]) throws IOException {
		
		
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		str = reader.readLine();
		int test_cases = Integer.parseInt(str);
		for (int i = 0; i<test_cases; i++) {
				
			str = reader.readLine();
			String inputs[] = str.split(" ");
			int num_elephant=Integer.parseInt(inputs[0]) , total_candy=Integer.parseInt(inputs[1]);
			str = reader.readLine();
			String inputs_each_elephant[] = str.split(" ");
			int total=0;
			for (int j = 0; j<num_elephant ; j++) {
				total = total + Integer.parseInt(inputs_each_elephant[j]);
			}
			System.out.println((total<=total_candy)?"Yes":"No");
			
			
		}
				
	}
	
}
