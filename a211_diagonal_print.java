/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

import java.util.ArrayList;

/**
 *
 * @author bladeRUNNER
 */
public class a211_diagonal_print {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> A = new ArrayList<>(); 
        int arr[][] = new int[3][3]; int x = 1;
         for(int i = 0; i<3; i++){
             ArrayList<Integer> aa = new ArrayList<>();
             for(int j =0; j<3; j++){
                 arr[i][j] = x;
                 aa.add(j,x);
                 x++;
             }
             A.add(i,aa);
         }
         //print_diagonal(arr);
         print_diagonal_arraylist(A);
         
    }
    
    static void print_diagonal(int[][] arr){
        for(int i = 0; i <1; i++){
            for(int j = 0; j<3; j++){
                System.out.print(arr[i][j]+"\t");
                int ii = i+1,jj = j-1;
                while(ii>=0 && ii<3 && jj<3 && jj>=0){
                    System.out.print(arr[ii][jj]+"\t");
                    ii=ii+1;
                    jj=jj-1;
                }
                System.out.println();
            }
        }
        for(int i = 1; i <3; i++){
            for(int j = 2; j<3; j++){
                System.out.print(arr[i][j]+"\t");
                int ii = i+1,jj = j-1;
                while(ii>=0 && ii<3 && jj<3 && jj>=0){
                    System.out.print(arr[ii][jj]+"\t");
                    ii=ii+1;
                    jj=jj-1;
                }
                System.out.println();
            }
        }
        
    }

/*static void print_diagonal_arraylist(ArrayList<ArrayList<Integer>> A){
    ArrayList<ArrayList<Integer>> ret = new ArrayList<>();    
    int n = A.size();
    for(int i = 0; i <1; i++){
        for(int j = 0; j<n; j++){
                ArrayList<Integer> aa = new ArrayList<>();
                //System.out.print(A.get(i).get(j)+"\t");
                aa.add(aa.size(),A.get(i).get(j));
                int ii = i+1,jj = j-1;
                while(ii>=0 && ii<n && jj<n && jj>=0){
                    aa.add(aa.size(),A.get(ii).get(jj));
                    //System.out.print(A.get(ii).get(jj)+"\t");
                    ii=ii+1;
                    jj=jj-1;
                }
                //System.out.println();
                ret.add(aa);
                //aa.clear();
            }
        }
        for(int i = 1; i <n; i++){
            for(int j = 2; j<n; j++){
                ArrayList<Integer> aa = new ArrayList<>();
                aa.add(aa.size(),A.get(i).get(j));
                //System.out.print(A.get(i).get(j)+"\t");
                int ii = i+1,jj = j-1;
                while(ii>=0 && ii<n && jj<n && jj>=0){
                    aa.add(aa.size(),A.get(ii).get(jj));
                    //System.out.print(A.get(ii).get(jj)+"\t");
                    ii=ii+1;
                    jj=jj-1;
                }
                //System.out.println();
                ret.add(aa);
                
                //aa.clear();
            }
        } 
    }*/

static void print_diagonal_arraylist(ArrayList<ArrayList<Integer>> A){
    ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
    int n = A.size();
     for (int line = 1; line <= n+n-1; line++) {
        ArrayList<Integer> aa = new ArrayList<>();
        int start_col = Math.max(0, line - n);
        int count = Math.min(line,Math.min ((n - start_col), n));
        for (int j = 0; j < count; j++)
        {
           aa.add(0,A.get(Math.min(n, line) - j - 1).get(start_col + j));
         }
        ret.add(ret.size(),aa);
     }
    
    System.out.println(ret);
    
    
}

    
}
