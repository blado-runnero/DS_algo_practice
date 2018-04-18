/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bladeRUNNER
 */
public class a162_dp_largest_sum_contiguous_array {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter space separated numbers to insert in array :- ");
        String str = br.readLine().trim();
        String sttr[] = str.split(" ");
        int arr[] = new int[sttr.length];
        for(int i = 0; i<sttr.length; i++){
            arr[i] = Integer.parseInt(sttr[i]);
        }
        
        int max_so_far = 0 , s = 0;
        int max_ending_here = 0;
        int start = 0; int end = 0;
        for(int i = 0; i < arr.length; i++){
            int num = arr[i];
            /*if(max_so_far+num > 0){
                max_so_far = max_so_far + num;
            }
            max_ending_here = Math.max(max_ending_here,max_so_far);
            max_ending_here = Math.max(max_ending_here,num);*/
            
            max_ending_here += num;
            
            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }
            
            if(max_ending_here<0){max_ending_here = 0; s = i+1;}
            
        }
        
        int result = Math.max(max_so_far,max_ending_here);
        System.out.println("Maximum contiguous sum is :-" + result+" \nStart index :- "+start+"\nEnding index :- "+end);
        
    }
}
