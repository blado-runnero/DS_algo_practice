/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author bladeRUNNER
 */
public class a235_subsets {
    public static void main(String args[]){
        int[] num = {0,1,1}; 
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        res.add(new ArrayList<Integer>());
        Arrays.sort(num);
        int last_size = 0;
        int n = num.length;
        for(int i = 0; i < n; i++){
            int size = res.size();
            int start = (i==0 || num[i]!=num[i-1])?0:last_size;
            
            for(int j = start; j<size; j++){
                ArrayList<Integer> sol = new ArrayList<Integer>(res.get(j));
                sol.add(num[i]);
                res.add(sol);
            }
            last_size = size;
        }
        
        System.out.print(res);
        
    }
}
