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
public class a174_Right_rectangle_print_patterb {
    public static void main(String args[]){
        for(int i = 1; i<=5; i++){
            for(int j = i; j<5; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<i+1; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
