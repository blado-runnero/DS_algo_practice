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
public class a184_string_interleaving {
    public static void main(String args[]){
        String str1 = "abc";
        String str2 = "xyz";
        String pat1 = "abxyzc";
        String pat2 = "abxcyz";
        Boolean is_pat1_string_leaving = string_leaving(str1,str2,pat1);
        Boolean is_pat2_string_leaving = string_leaving(str1,str2,pat2);
        System.out.println("String 1 = " + str1 + "\nString 2 = "+str2+"\n\nPattern 1 = "+pat1+"\nIs pat1 an interleaving combi of str1 and str 2 :- "+is_pat1_string_leaving );
        System.out.println("\n\nPattern 2 = "+pat2+"\nIs pat2 an interleaving combi of str1 and str 2 :- "+is_pat2_string_leaving );
    }

    private static Boolean string_leaving(String str1, String str2, String pat) {
        int l1 = str1.length();
        int l2 = str2.length();
        if(l1+l2 != pat.length()){return false;}
        Boolean truth_table[][] = new Boolean[1+l1][1+l2];
        for(int i = 1; i <l1; i++){
            truth_table[i][0] = (str1.charAt(i-1)==pat.charAt(i-1))?true:false; 
        }
         for(int i = 1; i <l2; i++){
             truth_table[0][i] = (str2.charAt(i-1)==pat.charAt(i-1))?true:false;
         }
        for(int i = 1; i<=l1; i++){
            for(int j = 1; j<=l2; j++){
                if(pat.charAt(i+j-1) == str1.charAt(i-1)){
                    truth_table[i][j] = truth_table[i-1][j];
                }
                else if(pat.charAt(i+j-1) == str2.charAt(j-1)){
                    truth_table[i][j] = truth_table[i][j-1];
                }
                else {
                    truth_table[i][j] = false;
                }
            }
            
        }
        
        return truth_table[l1][l2];
    }
}
