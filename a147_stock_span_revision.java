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
public class a147_stock_span_revision {
    
    public static void main(String args[]){
        int stock[] = {10,4,5,90,120,80};
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int result[] = new int[stock.length];
        result[0] = 1;
        for(int i =1; i<stock.length; i++){
            while(!stack.isEmpty() && stock[stack.peek()]<=stock[i]){stack.pop();}
            //System.out.println(stack);
            result[i] = (stack.isEmpty())?i+1:i-stack.peek();
            stack.push(i);
        }
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+"\t");
        }
    }
    
}
