/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100_days_of_code;

/**
 *
 * @author bladeRUNNER
 */
public class a180_subrectangular_sum_in_immutable_2d_array {
    public static void main(String args[]){
        int matrix[][] = {{2,0,-3,4},{6,3,2,-1},{5,4,7,3},{2,-6,8,1}};
        int n = 4;
        int sum_matrix[][] = new int[n+1][n+1];
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=n; j++){
                if(i==0 || j==0){
                    sum_matrix[i][j] = 0;
                } 
                else{
                    sum_matrix[i][j] = sum_matrix[i-1][j] + sum_matrix[i][j-1] - sum_matrix[i-1][j-1]+matrix[i-1][j-1];
                }
                System.out.print(sum_matrix[i][j]+"\t");
            }
            System.out.println();
        }
        int r1 = 1, c1 = 1;
        int r2 = 3, c2 = 2;
        r1++;r2++;c1++;c2++;
        int sum = sum_matrix[r2][c2] - sum_matrix[r2][c1-1] - sum_matrix[r1-1][c2] + sum_matrix[r1-1][c1-1];
        System.out.println(sum);
        
    }
}
