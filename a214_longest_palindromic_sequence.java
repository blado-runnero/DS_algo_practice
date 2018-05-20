/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

import java.util.ArrayList;

public class a214_longest_palindromic_sequence {
    public static void main(String args[]){
        String x = "arpitip";
        System.out.println("Word :- "+x);
        System.out.println("LPS length :- "+lps(x));
        System.out.println("LPS word :- "+lps_string(x));
        
    }
    
    static int lps(String x){
        int n = x.length();
        int[][] lps = new int[n][n];
        for(int i =0; i < n ; i++){
            lps[i][i] = 1;
        }
        
        int max = 0;
        for(int i = 2; i<=n; i++){
            for(int j = 0; j<n-i+1; j++){
                int k = j + i - 1;
                if(x.charAt(j) == x.charAt(k) && i==2){
                    lps[j][k] = 2;
                }
                else if(x.charAt(j) == x.charAt(k)){
                    lps[j][k] = lps[j+1][k-1] + 2;
                }
                else{
                    lps[j][k] = Math.max(lps[j][k-1],lps[j+1][k]);
                }
                max = Math.max(max,lps[j][k]);
            }
        }
        return max;
    }
    
    static String reverse(String y){
        String x = "";
        for(int i = 0; i < y.length(); i++){
            x = y.charAt(i)+x;
        }
        return x;
    }
    
    static String lps_string(String X){
        String Y = reverse(X); 
         int m = X.length();
         int n = Y.length();
 
         int L[][] = new int[m+1][n+1];
 
         for (int i=0; i<=m; i++)
            {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X.charAt(i-1) == Y.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
            }
 
        int index = L[m][n];
 
        String lcs = "";
     
         int i = m, j = n;
         while (i > 0 && j > 0)
         {
            if (X.charAt(i-1) == Y.charAt(j-1))
            {
            
                lcs = lcs+X.charAt(i-1);
                i--;
                j--;
                index--;
        }
 
        else if (L[i-1][j] > L[i][j-1]){
            i--;
        }
        else{
            j--;
        }
    }
 
    return lcs;
    }
    
}
