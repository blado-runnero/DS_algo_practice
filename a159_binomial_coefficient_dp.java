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
public class a159_binomial_coefficient_dp {
     static int bin_dp_space_efficient(int n , int k){
      int c[] = new int[k+1];
      c[0] = 1;
      for(int i = 1; i<=n; i++){
          for(int j = Math.min(i, k); j>0; j--){
              c[j] = c[j]+c[j-1];
          }
      }
      return c[k];
    }
    
     static int bin_dp(int n , int k){
      int c[][] = new int[n+1][k+1];
      c[0][0] = 1;
      for(int i = 0; i<=n; i++){
          for(int j = 0; j<=Math.min(i,k); j++){
              if(i==0 || j==0){
                  c[i][j] = 1;
              }
              else{
                  c[i][j] = c[i-1][j-1]+c[i-1][j];
              }
          }
      }
      return c[n][k];
    }
    
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Welcome to Binomial Theorem Problem\n\n\nEnter n :- ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("\nEnter k :- ");
        int k = Integer.parseInt(br.readLine());
        System.out.println("Power of x^"+k+" in expansion of (1+x)^"+n+" is :- "+bin_dp(n,k));
     }
}
