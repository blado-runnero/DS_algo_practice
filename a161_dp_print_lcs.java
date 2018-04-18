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
public class a161_dp_print_lcs {
    static int lcs(String str1, String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        char cstr1[] = str1.toCharArray();
        char cstr2[] = str2.toCharArray();
        int c[][] = new int[l1+1][l2+1];
       
            for(int i = 0; i<=l1; i++){
            for(int j = 0; j<=l2; j++){
                if(i==0 || j==0){
                    c[i][j] = 0;
                }
                else if(cstr1[i-1] == cstr2[j-1] ){
                    c[i][j] = c[i-1][j-1] + 1; 
                }
                else{
                    c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
                }
            }
        }
        return c[l1][l2];
    }
    
    static String print_lcs(String str1, String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        char cstr1[] = str1.toCharArray();
        char cstr2[] = str2.toCharArray();
        int c[][] = new int[l1+1][l2+1];
       
            for(int i = 0; i<=l1; i++){
            for(int j = 0; j<=l2; j++){
                if(i==0 || j==0){
                    c[i][j] = 0;
                }
                else if(cstr1[i-1] == cstr2[j-1] ){
                    c[i][j] = c[i-1][j-1] + 1; 
                }
                else{
                    c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
                }
            }
        }
            String lcs = "";
       int count = c[l1][l2];
       for(int i = l1; i>=0; i--){
           for(int j = l2; j>=0; j--){
               if(count == 0){
                   break;
               }
               if(c[i][j]==count && c[i-1][j-1] == count-1){
                   count--;
                   lcs = cstr2[j-1] + lcs;
               }
           }
           
       }
            
            
            
        return lcs;
    }
    
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String 1 :- ");
        String str1 = br.readLine().trim();
        System.out.print("\nEnter String 2 :- ");
        String str2 = br.readLine().trim();
        System.out.println("Length of Longest Common Substring is :- "+lcs(str1,str2)+" and lcs is :- "+print_lcs(str1,str2));
    }
}
