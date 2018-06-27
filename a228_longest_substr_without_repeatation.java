/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author bladeRUNNER
 */
public class a228_longest_substr_without_repeatation {
    public static void main(String args[]){
        String x = "bbbbbbbbbbbbbbbb";
        String y = find_substr(x);
        System.out.println(y);
    }
    
    static String find_substr(String x){
        char[] c = x.toCharArray();
        HashMap<Character,Integer> set = new HashMap<>();
        if(c.length == 0){
            return "";
        }
        int start= 0; int end = 0; int max = 0; int max_s =0; int max_e=0;
        for(int i = 0; i < c.length; i++){
            char curr = c[i]; 
            if(set.containsKey(curr)){
                end = i-1;
                if((end - start ) > max){
                    max_s = start;
                    max_e = end;
                    max = end - start;
                }
                start = set.get(curr) + 1;
                set.remove(curr);
                set.put(curr,i);
            }
            else{
                set.put(curr, i);
                if(i == c.length-1 ){
                    end = i;
                    if((end - start ) > max){
                    max_s = start;
                    max_e = end;
                    max = end - start;
                }
                }
            }

        }
        
        String ret = x.substring(max_s,max_e+1);
        return ret;
    } 
    
}
