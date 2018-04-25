/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bladeRUNNER
 */
public class a194_HIST2 {
    static int find_sum(String sttr[]){
       int sum = 2*(sttr.length);
       int prev = 0;
       for(int i = 0; i<sttr.length ;i++){
           int x = Integer.parseInt(sttr[i]);
           if(i ==0 || i ==sttr.length-1){
               sum = sum + x;
           }
           if(i != 0){
               sum = sum + Math.abs(x - prev);
           }
           
           prev = x;
       }
       return sum;
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String sttr[] = str.split(" ");
        System.out.println(find_sum(sttr));
    }
}
