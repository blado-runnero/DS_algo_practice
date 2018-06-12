/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bladeRUNNER
 */
public class a223_number_of_ways_to_form_a_max_heap {
    static int nck[][] = new int[100][100];
    static int dp[] = new int[100];
    static int log2[] = new int[100];
    static public int solve(int A) {
        if (A==1){
            return 1;
        }
        if (A==2){
            return 1;
        }
        if (A==3){
            return 2;
        }
        int n = A;
        for (int i = 0; i <= n; i++){
            dp[i] = -1;
        }

        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= n; j++){
                nck[i][j] = -1;
            }
        }
        int currLog2 = -1;
        int currPower2 = 1;
        for (int i = 1; i <= n; i++) {
            if (currPower2 == i) {
                currLog2++;
                currPower2 *= 2;
            }
            log2[i] = currLog2;
        }

        return numberOfHeaps(n);
    }
    
    static int numberOfHeaps(int n){
        if (n <= 1){
            return 1;}

        if (dp[n] != -1){
            return dp[n];}

        int left = get_left(n);
        int ans = (choose(n - 1, left) * numberOfHeaps(left)) * (numberOfHeaps(n - 1 - left));
        dp[n] = ans;
        return ans%1000000007;
    }
    
    static int get_left(int n){
        if(n==1){
            return 0;
        }
        int h = log2[n];
        int numh = (1<<h);
        int last = n - ((1<<h)-1);
        if(last>=(numh/2)){
            return (1<<h)-1;
        }else{
            return (1<<h) - 1 - ((numh/2) - last);
        }
    }
    
    static int choose (int n , int k){
        if(n<k){
            return 0;
        }
        if(n<=1){
            return 1;
        }
        if(k==0){
            return 1;
        }
        if(nck[n][k]!=-1){
            return nck[n][k];
        }
        int answer = choose(n-1, k-1) + choose(n-1,k);
        nck[n][k] = answer%1000000007;
        return answer%1000000007;
    }
    
    public static void main(String args[]) throws IOException{
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print( "Enter a number :- " );
        String str = br.readLine();
        int x = Integer.parseInt(str);
        int y = solve(x);
        System.out.println( "Total ways to form max meap with "+x+" distinct integers is :- " +y);
    }
    
}
