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
public class a232_find_duplicate {
     public static void main(String args[]){
        int[] val = {8,7,1,4,3,2,6,8,5,9}; 
        int n = val.length;
        int dup_index = find_duplicate(val,n);
        System.out.println(dup_index);
     }
     
     static int find_duplicate(int[] val, int n){
         int a = 0; int b = 0;
         do{
             a = val[val[a]];
             b = val[b];
         }while(a!=b);
         
         b = 0;
         
         while(a!=b){
             a = val[a];
             b = val[b];
         }
         
         return b;
         
         
         
     }
     
}
