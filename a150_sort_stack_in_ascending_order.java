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
public class a150_sort_stack_in_ascending_order {
    
    static void place_x_in_place(Stack<Integer> stack , int x){
        if(stack.isEmpty() || x > stack.peek()){
            stack.push(x);
        } else {
            int y = stack.pop();
            place_x_in_place(stack,x);
            stack.push(y);
        }
        
    }
    
    static void sort_in_ascending(Stack<Integer> stack){
        if(!stack.isEmpty()){
            int x = stack.pop();
            sort_in_ascending(stack);
            place_x_in_place(stack,x);
        }
    }
    
    public static void main(String args[]){
        int arr[] = {1,4,2,5,8,3,6,8,2,5,7,3,5,67,34,23,45,67,8,74,34,56,75};
        Stack<Integer> stack = new Stack<>();
        
        for( int i : arr){
            stack.push(i);
        }
        System.out.println(stack);
        
        sort_in_ascending(stack);
        
        System.out.println(stack);
        
    }
    
}
