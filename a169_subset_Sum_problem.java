/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100_days_of_code;

import java.io.IOException;

/**
 *
 * @author bladeRUNNER
 */
public class a169_subset_Sum_problem {
    
    static Boolean is_sum_subset_possible(int set[],int n,int sum){
        boolean subset[][] = new boolean[sum+1][n+1];
        for(int i = 0; i<=n; i++){
            subset[0][i] = true;
        }
        for(int i = 1; i<=sum; i++){
            subset[i][0] = false;
        }
        
        for(int i = 1; i<= sum; i++){
            for(int j = 1; j<=n; j++){
                subset[i][j] = subset[i][j-1];
                if(i>=set[j-1]){
                    subset[i][j] = subset[i][j] || subset[i-set[j-1]][j-1];
                }
            }
        }
         for(int i = 0; i<= sum; i++){
            for(int j = 0; j<=n; j++){
                System.out.print(subset[i][j]+"\t");
            }
            System.out.println();
         }
        return subset[sum][n];
    }
    
    public static void main(String[] args) throws IOException{ 
        int set[] = {3,34,4,5,2,3,6,9,2,4,98};
        int sum = 21;
        int n = set.length;
        if(is_sum_subset_possible(set,n,sum)){
            System.out.println("Yes a subset with given sum exists.");
        }else{
            System.out.println("NO a subset with given sum doesn't exists.");
        }
    }
}
