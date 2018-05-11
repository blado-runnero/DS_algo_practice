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
public class a209_IB_i_in_arr_i {
    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(4);
        a.add(0);
        a.add(2);
        a.add(1);
        a.add(3);
        int n  = a.size();
        System.out.print("Before :- "+a);
        for(int i = 0; i < n; i++){
            int x = a.get(i);
            int y = a.get(a.get(i));
            int z = (y>0)?x+((y%n)*n):x;
            //System.out.println(i+" "+z+"--"+a);
            a.remove(i);
            a.add(i,z);
        }
        for(int i = 0; i < n; i++){
            int x = a.get(i);
            x = (x>0)?x/n:x;
            a.remove(i);
            a.add(i,x);
        }
        System.out.print("After :- "+a);
    }
}
