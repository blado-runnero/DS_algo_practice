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
public class a203_find_a_pair_whose_sum_is_in_pair_in_array {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = arr.length-1;
        //find out if the sum of two elements is equal to 15 or not
        int sum = 15;
        int status = 0;
        for(int i = 0; i<n; ){
            if(arr[n]+arr[i] == sum){status = 1;System.out.println("Yes the pair exist whose sum is :- "+sum+"\nNumbers are :- "+arr[i]+" and "+arr[n]);break;}
            else if(arr[n]+arr[i] > sum){n--;}
            else{i++;}
        }
        if(status == 0){
            System.out.println("No pair exit whose sum is "+sum);
        }
    }
}
