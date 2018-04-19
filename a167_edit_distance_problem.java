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
public class a167_edit_distance_problem {
    
    static int min(int a, int b, int c){
        return Math.min(a, Math.min(c, b));
    }
    
    static int edit_distance_min_number(String str1, String str2){
        int m = str1.length(), n = str2.length();
        int dp[][] = new int[m+1][n+1];
        
        for(int i = 0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i==0){
                    dp[i][j] = j;
                }
                else if(j==0){
                    dp[i][j] = i;
                }
                else if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = 1 + min(dp[i][j-1],dp[i-1][j-1],dp[i-1][j]);
                }
            }
        }
        
          for(int i = 0; i<=m; i++){
            for(int j=0; j<=n; j++){
                System.out.print(dp[i][j]+"\t");
            }System.out.println();}
        
        return dp[m][n];
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter 1st string :- ");
        String str1 = br.readLine();
        System.out.print("Enter 2nd string :- ");
        String str2 = br.readLine();
        System.out.print("We can reach from "+str1+" to "+str2+" in minumum "+edit_distance_min_number(str1,str2)+" steps.");
    }
}
