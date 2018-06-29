/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

import java.util.Arrays;

/**
 *
 * @author bladeRUNNER
 */
public class a237_lis_practice {
     public static void main(String args[]){
        int[] nums = {1,5,4,8,7,9,11,33}; 
        
        int n = nums.length;
        int[] lis = new int[n];
        Arrays.fill(lis, 1);
        
        for(int i = 1; i<n; i++){
            for(int j = 0; j < i; j++){
                if(nums[i]>nums[j]){
                    if(lis[i]<=lis[j]+1){
                        lis[i] = lis[j]+1;
                    }
                }       
            }
        }
        
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+"\t");
        }
        
            System.out.println();   
            
        for(int i = 0; i < n; i++){
            System.out.print(lis[i]+"\t");
        }
        
     }
}
