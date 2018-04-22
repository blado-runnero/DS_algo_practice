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
public class a182_bitonic_sequence {
    
    static int[] lis(int arr[]){
        int lis[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++){lis[i] = 1;}
        for(int i = 1; i<arr.length; i++){
            for(int j = 0; j<i; j++){
                if(arr[i]>arr[j] && lis[i] < lis[j] + 1){
                    lis[i] = lis[j]+1;
                }
            }
        }
        return lis;
    }
    
    static int[] reverse(int[] arr){
        int rev_arr[] = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1; i>=0; i--){
            rev_arr[j] = arr[i];
            j++;
        }
        return rev_arr;
    }
    
    public static void main(String args[]){
        int arr[] = {1,2,-1,4,3,4,5,4,-1,3,2,1};
        int[] lisl = new int[arr.length];
        lisl = lis(arr);
        int[] lisr = new int[arr.length];
        arr = reverse(arr);
        lisr = lis(arr);
        int max = 0;
        for(int i = 0;i<arr.length ;i++){
            lisl[i] = lisl[i] + lisr[i];
            max = Math.max(lisl[i],max);
        }
        System.out.println(max);
    }
}
