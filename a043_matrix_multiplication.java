
public class a043_matrix_multiplication {

	public static void main(String[] args) {
		int matrix1[][] = {{1,2,3,4,5},{1,2,3,4,5}};
		int matrix2[][] = {{1,2,3},{1,2,3},{1,2,3},{1,2,3},{1,2,3}};
		int sum = 0,r1=2,c1=5,r2=5,c2=3;
		int matrix3[][] = new int[r1][c2];
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++ ) {
				for (int k=0; k<c1 //or r2 (both are same)
						;k++) {
					sum =sum + (matrix1[i][k] * matrix2[k][j]);
				}
				matrix3[i][j] = sum; 
				sum = 0;
			}
			
			
		}
		// matrix will multiply only if { c1 == r2 }
		// and new matrix will be of dimension { r1 x c2 }

	
	
	for(int i = 0 ; i<r1; i++) {
		for(int j=0; j<c2;j++) {
			System.out.print(matrix3[i][j]+"\t");
		}
		System.out.print("\n");
	}
	
	}
}
