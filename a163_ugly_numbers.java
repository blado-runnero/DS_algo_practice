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
public class a163_ugly_numbers {
    
    static int find_nth_ugly(int n){
        int n2 = 2,n3=3,n5=5;
        int count = 1;
        int ugly[] = new int[n+5];
        int curr_ugly = 5;
        int i2 = 0, i3 = 0, i5 = 0;
        for(int i = 1; i<n; i++){
            curr_ugly = Math.min(n2, Math.min(n3, n5));
            ugly[i] = curr_ugly;
            count++;
            if(n2 == curr_ugly){
                i2++;
                n2 = ugly[i2] * 2;
            }
            if(n3 == curr_ugly){
                i3++;
                n3 = ugly[i3] * 3; 
            }
            if(n5 == curr_ugly){
                i5++;
                n5 = ugly[i5] * 5;
            }
        }
        return curr_ugly;
    }
    
   public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter n>5 and I will tell you n'th ugly number :- ");
        int n = Integer.parseInt(br.readLine());
        int ugly = find_nth_ugly(n);
        System.out.println("\n"+n+"th ugly number is :- "+ugly);
   } 
}
