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
public class a164_LIS {
    
    static int lis(int[] arr, int n){
        int lis[] = new int[n];
        int i,j,max = 0;
        
        for(i = 0; i<n; i++){lis[i] = 1;}
        
        for(i = 1; i<n; i++){
            for(j=0; j<i; j++){
                if(arr[i]>arr[j] && lis[i] < lis[j]+1){
                    lis[i] = lis[j] + 1;
                }
            }
        }
        
        for(i = 0; i<n; i++){max = Math.max(max, lis[i]);System.out.print("---"+lis[i]);}
        
        return max;
    }
    
      public static void main(String args[]){
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
        System.out.println("Longest Increasing Sequence length :- "+lis(arr,n));
    }
}
