/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

import java.util.ArrayList;

/**
 *
 * @author bladeRUNNER
 */
public class a191_median_of_2_sorted_array {
    
    static int find_median(ArrayList<Integer> arr1,ArrayList<Integer> arr2,int s1,int e1,int s2,int e2 ){
        int mid1 = (s1+e1)/2;
        int mid2 = ((e1+e2+1+3)/2) - mid1;
        System.out.println(mid1+"\t"+mid2);
        if(mid1==0||mid2==0){
            
        }
        else{
            if(arr2.get(mid2) > arr1.get(mid1-1) && arr1.get(mid1) > arr2.get(mid1-1)){
                return Math.max(arr1.get(mid1-1),arr2.get(mid2-1));
            }
            else if(arr2.get(mid2-1) < arr1.get(mid1)){
                s1 = 
            }
        }
        return 0;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i = 1; i<=9; i++){
            arr1.add(i);
        }
        
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i = 101; i<109; i++){
            arr2.add(i);
        }
        
        int median = find_median(arr1,arr2,0,arr1.size()-1,0,arr2.size()-1);
        
        
    }
}
