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
public class a236_min_jumps_to_reach_end {
    public static void main(String args[]){
        int[] steps = {2,3,1,1,2,4,2,0,1,1}; 
        int n = steps.length;
        int[] jumps = new int[n];
        Arrays.fill(jumps, 0);
        for(int i = 1; i<n; i++){
            for(int j = 0; j < i; j++){
                if(j+steps[j] >= i){
                    if(jumps[i] >= jumps[j]+1 || jumps[i] == 0){
                        jumps[i] = jumps[j]+1;
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(steps[i]+"\t");
        }
            System.out.println();       
        for(int i = 0; i < n; i++){
            System.out.print(jumps[i]+"\t");
        }
        
    }
}
