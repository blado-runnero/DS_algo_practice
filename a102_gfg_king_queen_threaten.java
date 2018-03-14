import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a102_gfg_king_queen_threaten {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String kxy[] = str.split(" ");
		
		str = br.readLine();
		String qxy[] = str.split(" ");
		
		int kx = Integer.parseInt(kxy[0]);
		int ky = Integer.parseInt(kxy[1]);
		
		int qx = Integer.parseInt(qxy[0]);
		int qy = Integer.parseInt(qxy[1]);
		
		if (kx == qx || ky == qy || Math.abs(kx-qx) ==Math.abs(ky-qy) ) {
			System.out.print("true");
		}
		else {
			System.out.print("false");
		}
		
	}
}
