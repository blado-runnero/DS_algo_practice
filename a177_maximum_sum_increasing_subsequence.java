/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100_days_of_code;

import static pkg100_days_of_code.a164_LIS.lis;

/**
 *
 * @author bladeRUNNER
 */
public class a177_maximum_sum_increasing_subsequence {
    
    static int sum_lis(int[] arr,int n){
        int lis[] = new int [n];
        int sum[] = new int [n];
        
        for(int i = 0; i<n; i++){lis[i]=1;sum[i]=arr[i];}
        
        for(int i = 1; i<n;i++){
            for(int j = 0; j<i; j++){
                if(arr[i]>arr[j] /*&& lis[i]<lis[j]+1*/ && sum[i] < sum[j]+arr[i]){
                    //lis[i] = lis[j]+1;
                    sum[i] = sum[j] + arr[i];
                }
            }
        }
       int max = 0;
       int max_sum =0;
       for(int i = 0; i<n; i++){
            max_sum = (sum[i] > max_sum)?sum[i]:max_sum;
       }
        //return max;
        return max_sum;
    }
   
    public static void main(String[] args){
          int arr[] = { 1,101,2,3,4,100 };
        int n = arr.length;
        System.out.println("\nLongest Increasing Sequence length's sum is :- "+sum_lis(arr,n));
    }
}
