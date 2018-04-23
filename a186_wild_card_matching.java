/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100_days_of_code;

/**
 *
 * @author bladeRUNNER
 */
public class a186_wild_card_matching {
     public static void main(String args[]){
        String pat = "a*b?c";
        String str1 = "acvfdcbdc";
        String str2 = "acvfdcbc";
        String str3 = "acvfdcbbbdc";
        String str4 = "acvfdcbddc";
        String str5 = "abdc";
        Boolean is_str1_a_valid_pattern = is_valid_pattern(pat,str1);
        Boolean is_str2_a_valid_pattern = is_valid_pattern(pat,str2);
        Boolean is_str3_a_valid_pattern = is_valid_pattern(pat,str3);
        Boolean is_str4_a_valid_pattern = is_valid_pattern(pat,str4);
        Boolean is_str5_a_valid_pattern = is_valid_pattern(pat,str5);
        System.out.println("Pattern is :- "+pat);
        System.out.println("\nString :- "+str1+"\nQuestion :- Fits Pattern ? (Expected :- True)\nAnswer :- "+is_str1_a_valid_pattern);
        System.out.println("\nString :- "+str2+"\nQuestion :- Fits Pattern ? (Expected :- False)\nAnswer :- "+is_str2_a_valid_pattern);
        System.out.println("\nString :- "+str3+"\nQuestion :- Fits Pattern ? (Expected :- True)\nAnswer :- "+is_str3_a_valid_pattern);
        System.out.println("\nString :- "+str4+"\nQuestion :- Fits Pattern ? (Expected :- False)\nAnswer :- "+is_str4_a_valid_pattern);
        System.out.println("\nString :- "+str5+"\nQuestion :- Fits Pattern ? (Expected :- True)\nAnswer :- "+is_str5_a_valid_pattern);
        
     }

     public static void print(Boolean[][] matrix,int n, int m,String str){
       System.out.println(str);
       for(int i = 0; i<n; i++){
           for(int j = 0 ; j<m; j++){
               System.out.print(matrix[i][j] + "\t");
           }
           System.out.println();
       }
    }
     
    private static Boolean is_valid_pattern(String pat,String str) {
        int n = str.length();
        int m = pat.length();
        Boolean pattern_table[][] = new Boolean[n+1][m+1];
        pattern_table[0][0] = true;
        char star = '*';
        for(int i = 1; i<=n; i++){pattern_table[i][0] = false;}
        for(int i = 1; i<=m; i++){pattern_table[0][i] = false;}
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=m; j++){
                if(str.charAt(i-1) == pat.charAt(j-1)){
                    pattern_table[i][j] = pattern_table[i-1][j-1];
                }
                else if (pat.charAt(j-1) == '?') {
                    pattern_table[i][j] = pattern_table[i-1][j-1];
                }
                else if (pat.charAt(j-1) == '*') {
                    pattern_table[i][j] = pattern_table[i][j-1] || pattern_table[i-1][j];
                }
                else{
                    pattern_table[i][j] = false;
                }
                
            }
        }
        //print(pattern_table,n+1,m+1,"truth_table :- \n");
        return pattern_table[n][m];
    }
}
