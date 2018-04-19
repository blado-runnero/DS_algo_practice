/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100_days_of_code;

import java.util.Arrays;

/**
 *
 * @author bladeRUNNER
 */
public class a166_coin_change_problem {
    
    static long count_ways(int coins[], int m, int n){
        long[] table = new long[n+1];
        Arrays.fill(table, 0);
        table[0] = 1;
        for(int i = 0; i<m; i++){
            for(int j = coins[i]; j<=n; j++){
                table[j] = table[j] + table[j-coins[i]];
            }
        }
        return table[n];
    }
    
    public static void main(String args[]){
        int coins[] = {1,2,5,10};
        int m = coins.length;
        int n = 5;
        System.out.println(count_ways(coins,m,n));
    }
}
