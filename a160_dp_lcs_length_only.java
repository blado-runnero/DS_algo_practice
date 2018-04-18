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
public class a160_dp_lcs_length_only {
    static int lcs(String str1, String str2){
        int l1 = str1.length();
        int l2 = str2.length();
        String lcs = "";
        int count = 0;
        char cstr1[] = str1.toCharArray();
        char cstr2[] = str2.toCharArray();
        int c[][] = new int[l1+1][l2+1];
        for(int p = 0; p<2; p++){
            for(int i = 0; i<=l1; i++){
            for(int j = 0; j<=l2; j++){
                if(i==0 || j==0){
                    c[i][j] = 0;
                }
                else if(cstr1[i-1] == cstr2[j-1] ){
                    c[i][j] = c[i-1][j-1] + 1; 
                    if( p == 1 && c[i][j-1] < c[i][j] && count <= Math.min(l1, l2) && (c[i][j] == count+1 || c[i][j] == count)  ){
                        if(i+1<=l1 && j+1<l2&& c[i][j]+1 == c[i+1][j+1]){
                            char x = lcs.charAt(lcs.length()-1);
                            char y = cstr2[j-1];
                            //System.out.print("--"+x+"--"+count+"--"+i+" "+j+"--");
                            if(x!=y)
                            {String str = lcs.substring(0,lcs.length()-1);
                            lcs = str;}
                            if(x==y){}
                        }
                        lcs = lcs + cstr2[j-1];
                        //System.out.println(lcs+c[i][j]+cstr1[i-1]+cstr2[j-1]);
                        count++;
                    }
                }
                else{
                    c[i][j] = Math.max(c[i-1][j], c[i][j-1]);
                }
            }
        }
        }
        //System.out.print(c[l1][l2]);
        return c[l1][l2];
    }
    
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String 1 :- ");
        String str1 = br.readLine().trim();
        System.out.print("\nEnter String 2 :- ");
        String str2 = br.readLine().trim();
        System.out.println("Length of Longest Common Substring is :- "+lcs(str1,str2));
    }
}
