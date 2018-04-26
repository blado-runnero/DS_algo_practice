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
public class a200_get_next_bigger_int {
        static int get_next_bigger_number(int x){
        int nums[] = new int[(""+x).length()];
        int j = nums.length-1; 
        for(int i = x; i>0; i=i/10){
            nums[j] = i%10;
            j--;
        }
        j = nums.length-1;
        while(j-1 >=0 && nums[j-1]>nums[j]){j--;}
        if(j == 0){return x;}
        j--;
        int ri = j+1;
        for(int i = j+1; i<nums.length; i++){
            if(nums[i]<nums[ri]){ri=i;} 
        }
        
        int temp = nums[j];
        nums[j] = nums[ri];
        nums[ri] = temp;
        
        
        Arrays.sort(nums,j+1,nums.length);

        x = nums[0];
        
        for(int i = 1; i<nums.length; i++){
            x = x*10 + nums[i];
        }
        
        return x;
    }
    
    public static void main(String args[]){
        int x = 876538;
        System.out.println("Current number :- "+x+"\nNext Bigger Number :- "+get_next_bigger_number(x));
    }
}
