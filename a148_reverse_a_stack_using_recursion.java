/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100_days_of_code;

import java.util.Stack;

/**
 *
 * @author bladeRUNNER
 */
public class a148_reverse_a_stack_using_recursion {
    
    static void insert_at_bottom(Stack<Integer> stack, int x){
        if(!stack.isEmpty()){
            int xx = stack.pop();
            insert_at_bottom(stack,x);
            stack.push(xx);
        }else{
            stack.push(x);
        }
    }
    
    static void reverse(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int x = stack.pop();
            reverse(stack);
            insert_at_bottom(stack,x);
        }
    }
    
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();
        for(int i = 10; i>0; i--){
            stack.push(i);
        }
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }
}
