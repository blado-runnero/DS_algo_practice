/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100_days_of_code;

import java.io.IOException;

/**
 *
 * @author bladeRUNNER
 */
public class a168_cutting_the_rod {
    
    static int cut_the_rod(int arr[], int n){
        int val[] = new int[n+1];
        val[0] = 0;
        for(int i = 1; i<=n; i++){
            int max_val = Integer.MIN_VALUE;
            for(int j=0; j<i; j++){
                max_val = Math.max(max_val , arr[j]+val[i-j-1]);
                if(max_val == 22){
                    
                    //System.out.print(i+"=="+j);
                }
            }
            val[i] = max_val;
        }
        
        for(int i = 0; i<=n; i++){
         //   System.out.print(val[i]+"\t");
        }
        
        return val[n];
    }
    
    public static void main(String[] args) throws IOException{
        int arr[] = {1,5,8,9,10,17,17,20};
        int n = arr.length;
        System.out.println("Maximum obtainable value is " + cut_the_rod(arr,n));
    }
}
