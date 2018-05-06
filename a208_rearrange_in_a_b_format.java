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
public class a208_rearrange_in_a_b_format {
    static void swap(int a, int b, int arr[]){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
   static void print_array(int arr[], String str){
        System.out.println(str);
        for(int i = 0; i<arr.length; i++){System.out.print(arr[i]+"\t");}
        System.out.println();
    }
    
   public static void main(String args[]){
       int arr[] = {1,2,9,15};
       int i = 0; int j = arr.length/2;
       print_array(arr,"Before :- ");
       while(j<arr.length){
           for(int k = j; k>i+1; k--){swap(k,k-1,arr);}
           i = i+2;
           j++;
       }
       print_array(arr,"After :- ");
   }
}
