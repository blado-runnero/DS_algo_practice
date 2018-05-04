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
public class a205_array_rearange {
    static void rearrange(int arr[]){
        int i = -1;
        int temp = 0; 
        for(int j = 0; j<arr.length; j++){
            if(arr[j]<0){
                i++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int pos = i+1;
        int neg = 0;
        while(pos<arr.length && neg<pos && arr[neg]<0){
            temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            pos++;
            neg++; neg++;
        }
    }
    static void print_array(int arr[], String str){
        System.out.println(str);
        for(int i = 0; i<arr.length; i++){System.out.print(arr[i]+"\t");}
        System.out.println();
    }
    public static void main(String args[]){
        int[] arr = {-5,5,4,-6,7,2,91,61,81,51,-51,-5,61,48,-5,21,8};
        print_array(arr,"Before :- ");
        rearrange(arr);
        print_array(arr,"After :- ");
    }
}
