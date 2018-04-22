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
public class a183_max_sum_non_adjacent_numbers {
        public static void main(String args[]){
            int arr[] = {4,1,1,4,2,1};
            int incl = 0;
            int excl = 0;
            for(int i = 0; i<arr.length; i++){
                int excl_old = excl; 
                excl = Math.max(excl,incl);
                incl = Math.max(excl_old+arr[i],incl);
               
            }
            System.out.println(incl);
        }

}
