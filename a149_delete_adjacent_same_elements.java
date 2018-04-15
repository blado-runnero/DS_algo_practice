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
public class a149_delete_adjacent_same_elements {
    public static void main(String args[]){
        int arr[] = {1,9,6,8,8,8,0,1,1,0,6,5};
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< arr.length; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }
            else{
                if(arr[i] == stack.peek()){
                    int x = stack.pop();
                    while(i+1<arr.length &&  arr[i+1] == x){
                        i++;
                    }
                }
                else{
                    stack.push(arr[i]);
                }
            }
            System.out.println(stack);
        }
        System.out.print(stack);
    }
}
