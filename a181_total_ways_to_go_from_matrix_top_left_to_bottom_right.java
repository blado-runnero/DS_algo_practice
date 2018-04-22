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
public class a181_total_ways_to_go_from_matrix_top_left_to_bottom_right {
    public static void main(String args[]){
        int n = 8;
        int ways_matrix[][] = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                if(i==0 || j==0){
                    ways_matrix[i][j] = 1;
                }
                else{
                    ways_matrix[i][j] = ways_matrix[i-1][j] + ways_matrix[i][j-1];
                }
            }
        }
        System.out.println(ways_matrix[n-1][n-1]);
        System.out.println(ways_matrix[3][3]);
    }
}
