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
public class a210_find_first_missing_number_positive {
    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(-5);
        
        System.out.println(a+"       "+a.size()+"scsdc");
        
        int n = a.size();
        int[] ret = new int[n+2];
        Arrays.fill(ret,0);
        for(int i = 0; i<n; i++){
            int x = a.get(i);
            if(x<n && x>0){
                ret[x]++;
            }
        }
        int i = 0;
        int j = 0;
        for(i = 1; i<n+2; i++){
            if(ret[1]==0){System.out.println("1");}
            if(ret[i]==0){break;}
        }i++;
        System.out.println(i);
    
        
        System.out.println(a+"\n"+j);
        
     }
}
