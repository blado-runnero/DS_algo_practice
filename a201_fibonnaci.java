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
public class a201_fibonnaci {
    static long get_fib_with_recursion(long n){
        if(n == 1||n==0){
            return 1;
        }
         return get_fib_with_recursion(n-1)+get_fib_with_recursion(n-2);
    }
    
    static long get_fib_with_dp(long n){
        long a = 1;
        long b = 1;
        long c = 2;
        while(n-->2){
            a = b;
            b = c;
            c = a+b;
        }
        return c;
    }
    
    public static void main(String args[]){
        long x = 42;
        System.out.println("Welcome to hell");
        System.out.println("Recursion :- "+get_fib_with_recursion(x));
        System.out.println("Dynamic :- "+get_fib_with_dp(x));
    }
}
