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

class Tree{
    int data;
    Tree left, right;
    Tree(int d){
        data = d;
        left = right = null;
    }
}
public class a152_tree_level_order_in_lines {
   static Tree root;
   static Stack<Tree> stack1 = new Stack<>();
   static Stack<Tree> stack2 = new Stack<>();
   static void level_order_in_lines(Tree node){
       if(node == null){
           return;
       }
       stack1.push(node);
       while(!stack1.isEmpty()){
           while(!stack1.isEmpty()){
               Tree nodee = stack1.pop();
               System.out.print(nodee.data+"\t");
               if(nodee.left != null){stack2.push(nodee.left);}
               if(nodee.right != null){stack2.push(nodee.right);}
           }
           System.out.println();
           while(!stack2.isEmpty()){
               stack1.push(stack2.pop());
           }
       }
   }
   
   public static void main(String args[]){
       a152_tree_level_order_in_lines tree = new a152_tree_level_order_in_lines();
       tree.root = new Tree(1);
       tree.root.left = new Tree(2);
       tree.root.right = new Tree(3);
       tree.root.left.left = new Tree(4);
       tree.root.left.right = new Tree(5);
       tree.root.left.left.left = new Tree(6);
       
       level_order_in_lines(tree.root);
       
   }
}
