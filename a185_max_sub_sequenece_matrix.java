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
public class a185_max_sub_sequenece_matrix {
    public static void print(int[][] matrix,int n, int m,String str){
       System.out.println(str);
       for(int i = 0; i<n; i++){
           for(int j = 0 ; j<m; j++){
               System.out.print(matrix[i][j] + "\t");
           }
           System.out.println();
       }
    }
    
    static int min(int a,int b, int c){
        return Math.min(c, Math.min(a, b));
    }
    
    public static void main(String args[]){
        int matrix[][] = {{0,0,1,1,1,1},{1,0,1,1,1,1},{0,1,1,1,1,1},{1,0,1,1,1,1},{1,1,1,1,1,1}};
        int n = 5; int m = 6;
        int max = 0;
        int ss_matrix[][] = new int[n+1][m+1];
        for(int i = 0 ; i<=n; i++){
            for(int j = 0 ; j<=m; j++){
                if(i==0 || j==0){
                    ss_matrix[i][j] = 0;
                }
                else if(matrix[i-1][j-1] == 1){
                    ss_matrix[i][j] = 1 + min(ss_matrix[i][j-1], ss_matrix[i-1][j], ss_matrix[i-1][j-1]);
                }
                else if(matrix[i-1][j-1] == 0){
                    ss_matrix[i][j] = 0;
                }
                max = Math.max(max, ss_matrix[i][j]);
            }
        }
        print(matrix,n,m,"Given Matrix :- ");
        System.out.println("Maximum square matrix with all 1's in it is :- "+ss_matrix[n][m]);
    }
    
}
