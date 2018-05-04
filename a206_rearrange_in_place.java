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
public class a206_rearrange_in_place {
    
    static void print_array(int arr[], String str){
        System.out.println(str);
        for(int i = 0; i<arr.length; i++){System.out.print(arr[i]+"\t");}
        System.out.println();
    }
    
    public static void main(String args[]){
        int arr[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        print_array(arr,"Before :- ");
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != -1 && arr[i]!=i ){
                int x = arr[i];
                while(arr[x]!=-1 && arr[x]!=x ){
                    int y = arr[x];
                    arr[x] = x;
                    x = y;
                }
                arr[x] = x;
                if(arr[i]!=i){
                    arr[i] = -1;
                }
            }
        }
        print_array(arr,"After :- ");
    }
    
}
