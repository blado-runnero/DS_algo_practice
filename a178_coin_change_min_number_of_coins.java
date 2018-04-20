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
public class a178_coin_change_min_number_of_coins {
    static int find_min_coins(int coins[], int sum){
        int[] tab1 = new int[sum+1];
        int[] tab2 = new int[sum+1];
        for(int i = 0 ; i<tab1.length; i++){
            tab1[i] = Integer.MAX_VALUE-1;
            tab2[i] = -1;
        }
        tab1[0] = 0;
        for(int i = 0; i <coins.length; i++){
            for(int j = 1; j<=sum; j++){
                if(j>=coins[i]){
                    if(tab1[j-coins[i]]+1 < tab1[j]){
                        tab1[j] = tab1[j-coins[i]] + 1;
                        tab2[j] = i;
                    }
                }
            }
        }
        
        return tab1[sum-1];
    }
    
    public static void main(String args[]){
        int coins[] = {1,2,5,10};
        int sum = 100;
        int min_coins = find_min_coins(coins, sum);
        System.out.println(min_coins);
    }
}
