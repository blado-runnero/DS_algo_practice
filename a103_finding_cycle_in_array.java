import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a103_finding_cycle_in_array {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int t = Integer.parseInt(s);
	
		while(t-->0) {
		
			s = br.readLine();
			String sttr[] = s.split(" ");
			int n = sttr.length;
			int a=0,b=0;
			int num[] = new int[n];
			
			for(int i = 0; i< n ; i++) {
				num[i] = Integer.parseInt(sttr[i]);
			}
			
			int status = 0;
			while(n-->0) {
				
				int p_a = a;
				a = a+(num[a]%n); 	if (num[p_a]%n == 0) {break;}	a = a%n;
				if(a==b ) {status++; break;} 
				
				p_a =a;
				a = a+(num[a]%n);	if (num[p_a]%n == 0) {break;} a = a%n;
				if(a==b ) {status++; break;}
				
				p_a = b;
				b = b+(num[b]%n);	if (num[b]%n == 0) {break;}	b = b%n;
				if(a==b) {status++; break;}
				
				
			}
			
			if(status>0) {
				System.out.print("Cycle exists\n\n");
			}
	
			if(status==0) {
				System.out.print("No cycle exists\n\n");
			}
		
		}
	}
}
