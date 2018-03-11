import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a099_amazon_overlapping_rectangles {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter rectangle 1 dimension : ");
		String str = br.readLine();
		String r1[] = str.split(" ");
		System.out.println("Enter rectangle 2 dimension : ");
		str = br.readLine();
		String r2[] = str.split(" ");
		int p11 = Integer.parseInt(r1[0]);
		int p12 = Integer.parseInt(r1[1]);
		int p13 = Integer.parseInt(r1[2]);
		int p14 = Integer.parseInt(r1[3]);
		
		int p21 = Integer.parseInt(r2[0]);
		int p22 = Integer.parseInt(r2[1]);
		int p23 = Integer.parseInt(r2[2]);
		int p24 = Integer.parseInt(r2[3]);
		int status = 0;
		if ((p11 -p21 > 0) || (p11 -p23 > 0)|| (p13 -p21 > 0)||(p13 -p23 > 0) ) {
			status++;
		}
		else if ((p12 -p22 > 0) || (p12 -p24 > 0)|| (p14 -p22> 0)||(p14 -p24 > 0) ) {
			status++;
		}
		else {
			status = 0;
		}
		
		int p31 = max(p21 , p11);
		int p33 = min(p23 , p13);
		int p32 = max(p22 , p12);
		int p34 = min(p24 , p14);
		
		int length = p31 - p33;
		int breadth = p32 - p34;
		
		length = Math.abs(length);
		breadth = Math.abs(breadth);
		
		int area = length * breadth ;
		
		System.out.println("Area of common is "+area);
	}
	
	static int max(int a , int b) {
		if (a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	static int min(int a , int b) {
		if (a>b) {
			return b;
		}
		else {
			return a;
		}
	}
	
}
