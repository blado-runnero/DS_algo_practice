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
public class a204_find_max_val_of_sum_i_arr_i_rotation_allowed {
    static int max_sum(int arr[]){
        int max_sum = 0,curr_sum = 0; 
        int arr_sum = 0;
        for(int i = 0; i<arr.length; i++){
            arr_sum = arr_sum + arr[i];
            curr_sum = curr_sum + (i*arr[i]);
        }
        
        max_sum = curr_sum;
        System.out.println(curr_sum);
        for(int i = 1; i <arr.length; i++){
            curr_sum = curr_sum + arr_sum - arr.length*arr[arr.length-i];
            System.out.println(curr_sum);
            max_sum = Math.max(max_sum,curr_sum);
        }
        
        return max_sum;
    }
    public static void main(String args[]){
        int arr[] = {10,1,2,3,4,5,6,7,8,9};
        System.out.println("Max sum from the array is :- "+max_sum(arr));
    }
    
}
