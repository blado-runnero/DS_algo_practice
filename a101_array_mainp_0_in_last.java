import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a101_array_mainp_0_in_last {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String input[] = str.split(" ");

		 
		for(int i = 0; i<input.length;i++ ) {
			int curr = Integer.parseInt(input[i]);
			if (curr==0) {
				//swap i
				for(int j = i; j<input.length; j++) {
					int to_swap = Integer.parseInt(input[j]);
					if (to_swap != 0) {
						String temp = input[i];
						input[i] = input[j];
						input[j] = temp;
						break;
					}
				}
			}
		}
		
		for(int i = 0; i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
	}


}
