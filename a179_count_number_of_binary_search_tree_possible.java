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
public class a179_count_number_of_binary_search_tree_possible {
    public static void main(String args[]){
        int x = 10;
        int arr[] = new int[x+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2; i <= x; i++){
            for(int j = 0; j<i; j++){
                arr[i] = arr[i] + (arr[j] * arr[i-j-1]);
            }
        }
        
        System.out.println(arr[5]);
        System.out.println(arr[x]);
    }
}
