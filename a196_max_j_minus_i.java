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
public class a196_max_j_minus_i {
    static int mini,maxi;
    static int find_max_diff(int[] arr){
        int max_diff = -1;
        int i, j;
        int lmin[] = new int[arr.length];
        int rmax[] = new int[arr.length];
        lmin[0] = arr[0];
        for(i = 1; i<lmin.length; i++){lmin[i] = Math.min(lmin[i-1], arr[i]);}
        rmax[rmax.length-1] = arr[arr.length-1];
        for(j = rmax.length-2; j>=0; j--){rmax[j] = Math.max(rmax[j+1], arr[j]);}
        i = j = 0;
        while(i < arr.length && j < arr.length){
            if(lmin[i] < rmax[j]){
                if(j-i>max_diff){
                    max_diff = j-1;
                    mini = i;
                    maxi = j;
                }
                j++;
            }
            else{i++;}
        }
        return max_diff;
    }
    
    public static void main(String args[]){
        int arr[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int max_diff = find_max_diff(arr);
        System.out.println(max_diff);
        System.out.println(arr[mini]);
        System.out.println(arr[maxi]);
    }
}
