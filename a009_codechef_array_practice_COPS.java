import java.io.IOException;

public class a009_codechef_array_practice_COPS {


	public static void main(String args[]) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		str = reader.readLine();
		int t = Integer.parseInt(str);
		while(--t>=0) {
			str = reader.readLine();
			String mxy[] = str.split(" ");
			int m,x,y;
			m = Integer.parseInt(mxy[0]);
			x = Integer.parseInt(mxy[1]);
			y = Integer.parseInt(mxy[2]);
			str = reader.readLine();
			String l[] = str.split(" ");
			int ll[] = new int [m];
			int e[] = new int [100];

			for (int i = 0 ; i<m ;i++) {
				ll[i] = Integer.parseInt(l[i]);
				int sta = ll[i]-(x*y);
				int start = (sta>=1)?sta:1;
				int en = ll[i]+(x*y);
				int end = (en<=100)?en:100;
				//System.out.println(start+""+end);

				
				for (int j = start; j<=end; j++ ) {
					e[j-1]=1;
				}
			}
			
			int out = 0 ; 
			for (int kk=0; kk<100;kk++) {if (e[kk]==0) {out++;}}
			System.out.println(""+out);
		}
	}
	

	
}
