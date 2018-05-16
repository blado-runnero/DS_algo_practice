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
public class a212_lexicographicallly_permutataion_rank {
    public static void main(String args[]){
        String str = "acb";
        str = str.toLowerCase();
        System.out.println("Word :- "+str);
        System.out.println("Rank :- "+get_rank(str));
    }
    
    static int get_rank(String str){
        int rank = 1;
        char[] a = str.toCharArray();
        Arrays.sort(a);
        ArrayList<Character> aa = new ArrayList<>();
        for(int i = 0; i<a.length; i++){
            aa.add(a[i]);
        }
        int n = aa.size();
        for(int i = 0 ; i < a.length ; i++){
            char x = str.charAt(i);
            int index = aa.indexOf(x);
            rank = rank + (index*fact(n-1));
            n--;
            aa.remove(index);
        }
        
        return rank;
    }
    
    static int fact(int x){
        int a = 1;
        for(int i = 2; i<=x; i++){a=a*i;}
        return a;
    }
    
}
