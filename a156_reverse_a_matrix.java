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
public class a156_reverse_a_matrix {
    static int m = 4, n = 4;
    static void print(int[][] mat){
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++ ){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }

    static void reverse_column(int[][] mat){
        int s = 0;
        int e = n-1;
        while(s<e){
        for(int i = 0; i<m; i++){
            int temp = mat[s][i];
            mat[s][i] = mat[e][i];
            mat[e][i] = temp;
        }
        s++;
        e--;
        }
    }
    
    static void find_transpose(int[][] mat){
        int k = 1;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<k; j++ ){
                
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
            k++;
        }
    }
    
    public static void main(String args[]){
        int mat[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       
        print(mat);
        find_transpose(mat);
        System.out.println("\n\n");
        print(mat);
        reverse_column(mat);
        System.out.println("\n\n");
        print(mat);
    }
}
