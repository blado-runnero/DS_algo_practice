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
public class a216_gfg_combi_of_given_size {
     static void combinationUtil(int arr[], int data[], int s,int e, int i, int r)
    {
        if (i == r)
        {
            for (int j=0; j<r; j++)
                System.out.print(data[j]+"");
            System.out.println("");
            return;
        }
        for (int k=s; k<=e && e-k+1 >= r-k; k++)
        {
            data[i] = arr[k];
            combinationUtil(arr, data, k+1, e, i+1, r);
        }
    }
     
    static void printCombination(int arr[], int n, int r)
    {
        int data[]=new int[r];
        combinationUtil(arr, data, 0, n-1, 0, r);
    }
 
    public static void main (String[] args) {
        int arr[] = {1, 2, 3};
        int r = 3;
        int n = arr.length;
        for(int i = 1; i <= arr.length; i++){
            printCombination(arr, n, i);
        }
        
        
    }
}
