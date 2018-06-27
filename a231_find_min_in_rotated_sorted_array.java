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
public class a231_find_min_in_rotated_sorted_array {
    public static void main(String args[]){
        int[] val = {4,5,6,7,8,9};
        int n = val.length;
        int min = find_min_index(val,0,n-1,n);
        System.out.println(val[min]);
    }
    
    static int find_min_index(int[] val, int min, int max,int n){
        if(min>max){
            return 0;
        }
        int mid = (max + min) / 2;
        if(val[mid]<val[(mid-1)%n] && val[mid] < val[(mid+1)%n]){
            return mid;
        }
        else if(val[mid]<val[min]){
            return find_min_index(val,min,mid-1,n);
        }
        else {
            return find_min_index(val,mid+1, max,n);
        }
        
    }
    
}
