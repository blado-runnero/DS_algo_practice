/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

/**
 *
 * @author bladeRUNNER
 */
public class a199_number_of_island_in_a_tree {
    static int find_island(int[][] island, int m, int n){
        int count_island = 0;
        Boolean visited[][]=new Boolean[m+2][n+2];
        for(int i = 0; i<m+2; i++){for(int j = 0; j<n+2; j++){visited[i][j]=false;}}
         for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(island[i][j] ==1){
                    i++;
                    j++;
                    if(visited[i-1][j-1]==true ||visited[i-1][j+1]==true||visited[i-1][j]==true||visited[i][j-1]==true||visited[i][j+1]==true||visited[i+1][j-1]==true||visited[i+1][j]==true||visited[i+1][j+1]==true){
                        visited[i][j] = true;
                    }
                    else{
                        visited[i][j] = true;
                        count_island++;
                    }
                    i--;
                    j--;
                }
            }
         }
        
        return count_island;
    }
    
    public static void main(String args[]){
        int arr[][] = {
                {1,1,0,0,0},
                {0,1,0,0,1},
                {1,0,0,1,1},
                {0,0,0,0,0},
                {1,0,1,0,1},
        };
        int m = 5,n=5;
        System.out.println("Number of islands are :- "+find_island(arr,m,n));
    }
}
