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
public class a157_dp_fibonnaci_numbers {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number :- ");
        int n = Integer.parseInt(br.readLine());
        long a = 1;
        long b = 1;
        long c = a + b;
        if(n>2){
        for(int i = 0; i < n-2; i++ ){
            a = b;
            b = c;
            c = a + b;
        }
            System.out.println("\nFibonnaci number :- "+c);
            }
        else if (n==1 || n ==2){
            System.out.println("\nFibonnaci number :- "+1);
        }
    }
}
