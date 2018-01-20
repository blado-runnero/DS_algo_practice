import java.io.IOException;

public class a007_codechef_array_practice_RAINBOW {

	public static void main(String args[]) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		str = reader.readLine();
		int t = Integer.parseInt(str);
		for (int i = 0 ; i<t; i++) {
			str = reader.readLine();
			int n = Integer.parseInt(str);
			str = reader.readLine();
			String ai[] = str.split(" ");
			int order = 1;
			int status = 0 ;
			int start = 0, end = n-1;
			int count[] = {0,0,0,0,0,0,0};

			for (int j = 0 ; j <= (n+1)/2; j++)
			{
				int now = Integer.parseInt(ai[j]);
				//System.out.println("     "+now);
				if (now<=7) {
					count[now-1]= count[now-1]+1 ;}
				else {status++;}
			}



			for (int k = 0 ; k < 7 ; k++) {


				if (count[k] > 0) {}
				else {status++;}
			}
			while (start<=end && status == 0) {
				int vs = Integer.parseInt(ai[start]);
				int ve = Integer.parseInt(ai[end]);
				start++;
				end--;
				if (vs==ve && vs<8 && (vs == order || vs == order+1)) {
					if (order <vs) {order++;}else{}

				}
				else {status++;}
			}

			System.out.println((status==0)?"yes":"no");

		}

	}
}