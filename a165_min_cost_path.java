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
public class a165_min_cost_path {
    
    static int min(int a , int b, int c){
        return Math.min(a, Math.min(c, b));
    }
    
    public static void main(String args[]){
        int cost[][] = {{1,2,7,6,4,6},{5,4,6,3,4,6},{8,1,3,7,6,5},{1,6,4,2,8,2},{1,2,3,8,7,4}};
        int m = 5;
        int n = 6;
        
        int min_cost_path[][] = new int[m][n];
        
        min_cost_path[0][0] = cost[0][0];
        
        for(int i = 1; i < m; i++){
            min_cost_path[i][0] = min_cost_path[i-1][0] + cost[i][0];
        }
        
        for(int j = 1; j < n; j++){
            min_cost_path[0][j] = min_cost_path[0][j-1] + cost[0][j];
        }
        
        for(int i = 1 ; i<m; i++){
            for(int j = 1; j<n; j++){
                min_cost_path[i][j] = cost[i][j] + min(min_cost_path[i-1][j-1],min_cost_path[i-1][j],min_cost_path[i][j-1] );
            }
        }
        
        System.out.println();
        for(int i = 0 ; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(cost[i][j]+"\t");
            }
            System.out.println();
        }
        
        System.out.println();
        for(int i = 0 ; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(min_cost_path[i][j]+"\t");
            }
            System.out.println();
        }
        
    }
}
