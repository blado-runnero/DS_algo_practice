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
public class a207_sort_in_waves {
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
        int arr[] = {8,15,17,19,190,188,9,10,11,12,1,2,3,4,5,6,7};
        print_array(arr,"Before :- ");
        for(int i = 0; i<arr.length; i=i+2){
            if(i>0 && arr[i-1]>arr[i]){swap(i,i-1,arr);}
            if(i<arr.length-1 && arr[i]<arr[i+1]){swap(i,i+1,arr);}
        }
        print_array(arr,"After :- ");
    }
}
