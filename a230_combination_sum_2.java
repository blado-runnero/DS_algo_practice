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
public class a230_combination_sum_2 {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    public static void main(String args[]){
        int[] val = {1,1,1,1,1,1,2,3,4,5,6,7,8,9};
        int target = 10;
        Arrays.sort(val);
        helper(val,target,0,new ArrayList<Integer>());
        print();
        //System.out.println(res);
    }
    
    static void print(){
        int n = res.size();
        for(int i = 0; i < n; i++ ){
            System.out.println(res.get(i));
        }
    }
    
    static void helper(int[] val, int target, int idx, ArrayList<Integer> sol){
        if(target == 0){
             res.add(new ArrayList<Integer>(sol));
            return;
        }
        if(target < 0 || idx == val.length){
            return;
        }
        
        for(int i = idx; i < val.length; i++){
            sol.add(val[i]);
            helper ( val , target-val[i] , i+1 , sol );
            sol.remove(sol.size()-1);
        }
        
    }
}
