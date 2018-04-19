/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100_days_of_code;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author bladeRUNNER
 */
public class a170_print_all_subset_with_given_sum {
    static boolean dp[][];
    static int count = 0;
    static void display(ArrayList<Integer> p){System.out.println(p);count++;}
    static void print_subset_rec(int[] arr, int n, int sum, ArrayList<Integer> p){
        if(n==0 && sum!=0 && dp[0][sum]){
            p.add(arr[n]);
            display(p);
            p.clear();
            return;
        }
        
        if(n==0 && sum == 0){
            display(p);
            p.clear();
            return;
        }
        
        if(dp[n-1][sum]){
            ArrayList<Integer> b = new ArrayList<>();
            b.addAll(p);
            print_subset_rec(arr,n-1,sum,b);
        }
        
        if(sum>= arr[n] && dp[n-1][sum-arr[n]]){
            p.add(arr[n]);
            print_subset_rec(arr,n-1,sum-arr[n],p);
        }
        
    }
    
    static void print_all_subset(int arr[], int n , int sum ){
        if(n==0 || sum == 0){
            return;
        }
        dp = new boolean[n][sum+1];
        for(int i = 0; i<n; i++){
            dp[i][0] = true;
        }
        if(arr[0] <= sum){
            dp[0][arr[0]] = true;
        }
        for(int i = 1; i<n; i++){
            for(int j = 0; j<=sum; j++){
                dp[i][j] = (arr[i]<=j) ? (dp[i-1][j] || dp[i-1][j-arr[i]]) : dp[i-1][j];
            }
        }
        if(dp[n-1][sum] == false){
            System.out.println("There are no possible subset with given sum.");
            return;
        }
        ArrayList<Integer> p = new ArrayList<>();
        print_subset_rec(arr,n-1,sum,p);
        System.out.println("Total number of subsets :- "+count);
    }
    
    public static void main(String[] args) throws IOException{ 
        int set[] = {3,34,4,5,2,3,6,9,2,4,98};
        int sum = 21;
        int n = set.length;
        print_all_subset(set,n,sum);
     }
}
