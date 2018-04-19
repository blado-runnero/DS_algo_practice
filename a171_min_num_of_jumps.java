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
public class a171_min_num_of_jumps {
    
    static int min_jumps(int arr[], int n){
        int jumps[] = new int[n];
        int i,j;
        if(n==0||arr[0]==0){
            return Integer.MAX_VALUE;
        }
        jumps[0] = 0;
        
        for(i = 1; i<n; i++ ){
            jumps[i] = Integer.MAX_VALUE;
            for(j =0; j<i; j++){
                if(i<=j+arr[j] && jumps[j] != Integer.MAX_VALUE){
                    jumps[i] = Math.min(jumps[i],jumps[j]+1);
                    break;
                }
            }
        }
        
        return jumps[n-1];
    }
    
    public static void main(String[] args){
        int arr[] = {1,1,3,4,6,7,2,1,2,4,8,5,2,5,3,5,2,2,2,5,6,7,2,6,3,1};
        System.out.println("Minimum number of jumps from start to end is"+min_jumps(arr,arr.length));
    }
}
