/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *
 * @author bladeRUNNER
 */
public class a151_number_of_times_a_character {
    
    static String output(String input){
    String output = "";
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i<input.length(); i++ ){
        if(i==0 && !Character.isLetter(input.charAt(i)) ){
            return "wrong input format";
        }
        if(i<input.length() && Character.isLetter(input.charAt(i)) ){
            while(!stack.isEmpty()){
                output = output + stack.pop();
            }
            stack.push(input.charAt(i));
        }else{
           int j = i;
           int start = i;
           while(j<input.length() && !Character.isLetter(input.charAt(j))){
               j++;i++;
           }
           i--;
           int end = j;
           int num_of_times = Integer.parseInt(input.substring(start,end));
           for(int k = 0; k < num_of_times; k++){
                output = output + stack.peek();
           }  
           stack.pop();
        }
    }
     while(!stack.isEmpty()){
                output = output + stack.pop();
            }
    return output;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            System.out.print("Input :- ");
            String input = br.readLine();
            System.out.println("Output :- "+output(input.toLowerCase()));
        }
    }
}
