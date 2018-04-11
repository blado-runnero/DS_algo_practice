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
public class a145_greatest_number_in_right {
    public static void main(String[] args){
        int arr[] = {17,82,18,14,82,447,1,458,21,45,1,4,51,4,5,1,454,1,45};
        int res[] = new int[arr.length];
        res[arr.length-1] = -1;
        int max = arr[arr.length-1];
        int count = arr.length - 2;
        for(int i = arr.length-2; i>=0; i--){
            res[count] = max;
            max = (arr[i]>max)?arr[i]:max;
            count--;
        }
        
        for(int i = 0; i<res.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();System.out.println();System.out.println();
        for(int i = 0; i<res.length; i++){
            System.out.print(res[i]+"\t");
        }
    }
}
