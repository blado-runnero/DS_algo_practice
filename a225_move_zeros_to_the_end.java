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
public class a225_move_zeros_to_the_end {
    public static void main(String args[]){
        int arr[] = {1,3,0,5,0,66,0,5,0,8,0,5,0,5,5,0,5,0,5,0,4,0,4,20,5,0};
        print(arr,"Before:- ");
        move_to_end(arr);
        print(arr,"After:- ");
    }
    
    static void move_to_end(int[] arr){
        int n = arr.length;
        int x = 0;
        for(int i = 0; i<n; i++){
            if( arr[i]!=0 ){
                int temp = arr[i];
                arr[i] = arr[x];
                arr[x] = temp;
                x++;
            }
        }
            
    }
    
    static void print(int[] arr,String str){
        System.out.println(str);
        int n = arr.length;
        for(int i = 0;i<n; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}
