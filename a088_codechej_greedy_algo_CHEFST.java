import java.io.IOException;

public class a088_codechej_greedy_algo_CHEFST {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		str = reader.readLine();
		int t = Integer.parseInt(str);
		while(t-->0) {
			str = reader.readLine();
			String sttr[] = str.split(" ");
			int n1,n2,m;
			n1 = Integer.parseInt(sttr[0]);
			n2 = Integer.parseInt(sttr[1]);
			m = Integer.parseInt(sttr[2]);
			
			int p = m * (m+1) / 2;
			p = min( p , min(n1,n2));
			int answer = n1 + n2 - (2*p) ;
			System.out.print(answer);
		}
	}

	private static int min(int n1, int n2) {
		// TODO Auto-generated method stub
		int x = 0;
		if (n1>n2) {
			x = n2;
		}
		else {
			x = n1;
		}
		return x;
	}
	

}
