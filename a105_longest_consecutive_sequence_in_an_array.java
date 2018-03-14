import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class a105_longest_consecutive_sequence_in_an_array {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int t = Integer.parseInt(s);
		while (t-->0) {
			s = br.readLine();
			String sttr[] = s.split(" ");
			int n = sttr.length;
			int max = 0; 
			int count = 0;
			HashSet<Integer> has = new HashSet<Integer>();
			for (int i = 0; i < n; i++) {
				int tt = Integer.parseInt(sttr[i]);
				if(!has.contains(tt)){
					has.add(tt);
				}
			}
			
			for (int i = 0; i < n; i++) {
				int tt = Integer.parseInt(sttr[i]);
				if(has.contains(tt)) {
					count++;
					tt++;
					count = find_max(tt,count,has);
				}
				if(max<count) {
					max = count;
				}
				count = 0; 
			}
			
			System.out.print(max);
		}
	}

	private static int find_max(int i, int count, HashSet<Integer> has) {
		if(has.contains(i)) {
			count++;
			i++;
			int x = find_max(i, count, has);
			return x;
		}
		else {
			return count;
		}
		
	}
	


}
