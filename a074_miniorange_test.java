import java.io.IOException;

public class a074_miniorange_test {

	public static void main(String[] args) throws IOException {
		
		// Initialization(S)
		
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		int sum = 0;
		int max = 0;
		int status = 0;
		int maxi=0, maxj=0;
		
		
		//Time to take inputs --follow the input sequence
		
		System.out.print("Input width and height of matrix : ");
		str = reader.readLine();
		String mn[] = str.split(" ");
		int n = Integer.parseInt(mn[0]);
		int m = Integer.parseInt(mn[1]);
		System.out.print("\n\nInput Matrix with numbers from 0 to 9 : \n");
		int[][] inputs = new int[m][n];		
		for (int i = 0; i<m; i++ ) {
			str = reader.readLine();
			String[] sttr = str.split(" ");
			for (int j = 0; j< n; j++) {
				inputs[i][j] = Integer.parseInt(sttr[j]);
			}
		}
		System.out.print("\n\nInput maximum width of square submatrix (for square submatrix height and width are same) : ");
		str = reader.readLine();
		int s =Integer.parseInt(str);
		
		
		// Magic happens here
		
		for (int i = 0; i<=m-s; i++ ) {
			sum = 0;
			for (int j = 0; j<= n-s; j++) {
				for (int k = 0; k < s; k++) {
					for (int l = 0; l < s; l++) {
						
						if (k == 0 || k == s-1) {
							sum = sum + inputs[i+k][l+j];
						}
						else {
							if (status == 0) {
								sum = sum + inputs[i+k][j] + inputs[i+k][j+s-1];
								status++;
							}
						}	
					}	
				}
				status = 0;
				if (max<=sum) {
					max = sum;
					maxi = i;
					maxj = j;
				}
				sum = 0;
			}
		}
		
		
		// work hard in silence, let the OUTPUT make the noise
		
		System.out.print("\n\nMax sum of boundary of "+s+"*"+s+" submatrix is : "+max);
		System.out.print("\n\nSubmatrix with max sum is : \n");
		for (int i = maxi; i<s+maxi; i++ ) {
			for (int j = maxj; j<s+maxj; j++) {
				System.out.print(inputs[i][j]+"\t");
			}
			System.out.println();
		}

		
	}

}
