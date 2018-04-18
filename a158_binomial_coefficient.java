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
public class a158_binomial_coefficient {
    
 static int bin(int n , int k){
      if(n == k || k == 0){
          return 1;
      }  
      return (bin(n-1, k-1) + bin(n-1,k));
    }
    
    
    
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Welcome to Binomial Theorem Problem\n\n\nEnter n :- ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("\nEnter k :- ");
        int k = Integer.parseInt(br.readLine());
        System.out.println("Power of x^"+k+" in expansion of (1+x)^"+n+" is :- "+bin(n,k));
     }
}
