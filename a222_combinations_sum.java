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

import java.util.ArrayList;
import java.util.Collections;

public class a222_combinations_sum {
 public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Collections.sort(a);
        int cursum = 0;
        int index = 0;
        dfs(index, cursum, b, a, list, res);
        return res;
    }
    
    private void dfs(int index, int cursum, int targetsum, ArrayList<Integer> nums, 
        ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res) {
        // base case
        if (cursum == targetsum) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        
        // recursive case
        for (int i = index; i < nums.size(); i++) {
            int num = nums.get(i);
            // skip duplicates in candidate set
            if (i != index && num == nums.get(i - 1)) {
                continue;
            }
            if (cursum + num > targetsum) {
                // no need to check other siblings
                break;
            }
            path.add(num);
            dfs(i, cursum + num, targetsum, nums, path, res);
            path.remove(path.size() - 1);
        }
    }    
}
