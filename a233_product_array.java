/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

/**
 *
 * @author bladeRUNNER
 */
public class a233_product_array {
    static final double EPS = 1e-9;
    public static void main(String args[]){
        double[] val = {1,2,3,4,5}; 
        int n = val.length;
        double sum = 0;
        for(int i = 0; i < n; i++){
            System.out.print(val[i]+"\t");
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            sum = sum + Math.log10(val[i]);
        }
        for(int i = 0; i < n; i++){
            val[i] = (int)( EPS+Math.pow(10.00,sum-Math.log10(val[i])));
        }
        for(int i = 0; i < n; i++){
            System.out.print(val[i]+"\t");
        }
    }
}
