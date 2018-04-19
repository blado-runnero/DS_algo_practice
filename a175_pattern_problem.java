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
public class a175_pattern_problem {
    public static void main(String[] args){
        int n = 7;
        for(int i = 0; i<n+2;i++ ){
            if(i ==0 || i == n+1){
                for(int j = 0; j<n+2; j++){
                    System.out.print("#");
                }
            }
            else{
                System.out.print("#");
                for(int k = 0; k < n; k++){
                    System.out.print(n);
                }
                System.out.print("#");
            }
            
            System.out.println("");
        }
    }
}
