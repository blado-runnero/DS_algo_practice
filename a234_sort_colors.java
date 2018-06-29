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
public class a234_sort_colors {
    public static void main(String args[]){
        int[] val = {0,1,2,1,2,0}; 
        int n = val.length, i = -1, j = 0, k = n-1;
        
        while(j<k){
            if(val[j]==1){
                j++;
            }
            else if (val[j]==0){
                i++;
                swap(val,i,j);
                j++;
            }else {
                
                swap(val,k,j);
                k--;
            }
        }
        
        for(int l = 0; l < n; l++){
            System.out.print(val[l]);
        }
    }
    
    static void swap(int a[], int b, int c){
        int temp = a[b];
        int temp2 = a[c];
        a[b] = temp2;
        a[c] = temp;
    }
}
