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
public class a238_spiral_print {
    public static void main(String args[]){
        int[][] arr = new int[4][4];
        int m = 4 , n = 4 , count = 1;
        for(int i = 0; i < m; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = count;
                System.out.print(arr[i][j]+"\t");
                count++;
            }
        }
        
        System.out.println("\n\n");
        
        int x = Math.min(m, n);
        double y = x/2.0;
        int c = (int)Math.ceil(y);
         for(int k = 0; k<c ;k++){
             if(m<=0 || n<=0){
                 break;
             }
             
             if(m==1){
                 for(int i = 0; i<n; i++){
                     System.out.print(arr[k][k+i]+"\t");
                 }
             }
             if(n == 1){
                 for(int i = 0; i<m; i++){
                     System.out.print(arr[k+i][k]+"\t");
                 }
             }
             else {
                 for(int i = 0; i<n; i++){
                     System.out.print(arr[k][k+i]+"\t");
                 }
                 for(int i = 1; i<m; i++){
                     System.out.print(arr[k+i][k+n-1]+"\t");
                 }
                 for(int i = n-2; i>=0; i--){
                     System.out.print(arr[k+m-1][k+i]+"\t");
                 }
                 for(int i = m-2; i>0; i--){
                     System.out.print(arr[k+i][k]+"\t");
                 }
             }
             
             m=m-2;
             n=n-2;
         }
        
        /*
         1  2   3   4
         5  6   7   8
         9  10  11  12
         13 14  15  16
         */
    }
}
