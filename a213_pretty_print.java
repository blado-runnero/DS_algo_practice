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
public class a213_pretty_print {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> patt = new ArrayList<>();
        patt = pretty_print(5);
        String s = "";
        System.out.println(patt);
    }
    
    
    
    
    static ArrayList<ArrayList<Integer>> pretty_print(int A){
        int n = A;
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        if(n==1){
            ArrayList<Integer> rett = new ArrayList<>();
            rett.add(1);
            ret.add(rett);
            return ret;
        }
        System.out.println("here");
        int size = 2 * n - 1; 
        int front = 0;
        int back = size - 1;
        int a[][] = new int[size][size];
        while (n != 0) {
            for (int i = front; i <= back; i++) {
                for (int j = front; j <= back; j++) {
                    if (i == front || i == back || j == front || j == back){
                        a[i][j] = n;
                    }
                }
            }
            ++front;
            --back;
            --n;
        }
        
        for(int i = 0; i<2*A-1; i++){
            ArrayList<Integer> rett = new ArrayList<>();
            for(int j = 0; j<2*A-1; j++){
                rett.add(a[i][j]);
            }
            ret.add(rett);
        }
        
        return ret;
    }
    
}
