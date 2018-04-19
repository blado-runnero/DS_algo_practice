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
public class a173_matrix_multiplication_cost {
    
    static int matrix_cost(int arr[]){
        int temp[][] = new int[arr.length][arr.length];
        int q = 0;
        for(int l = 2; l<arr.length; l++){
            for(int i = 0; i<arr.length-l; i++){
                int j = i+l;
                temp[i][j] = Integer.MAX_VALUE;
                for(int k = i+1; k<j; k++){
                    q = temp[i][k]+temp[k][j]+arr[i]*arr[k]*arr[j];
                    if(q<temp[i][j]){
                        temp[i][j] = q;
                    }
                }
            }
        }
         for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                System.out.print(temp[i][j]+"\t");
            }
            System.out.println();
         }
        
        return temp[0][arr.length-1];
    }
    
    public static void main(String[] args){
        int arr[] = {2,3,6,4,5};
        int cost = matrix_cost(arr);
        System.out.println(cost);
    }
}
