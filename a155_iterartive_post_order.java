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
public class a155_iterartive_post_order {
    static class Node{
        int data;
        Node left, right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }
    static Node root;
    
    static void post_order_iterative(Node node){
        Stack<Node> stack = new Stack<>();
        
        while(node != null){
            stack.push(node);
            node = node.left;
        }
        
        while(!stack.isEmpty()){
            Node n = stack.pop();
            if(n.right != null){
                
               
                n = n.right;
                
                 while(n != null){
                    stack.push(n);
                    
                    n = n.left;
                    }
            }
            else if(n.left != null || n.right != null){
                System.out.print(n.data+"\t");
            }
        }
        
    }
    
    static void post_order_recursive_for_trial(Node node){
        if(node!=null){
            
            post_order_recursive_for_trial(node.left);
            post_order_recursive_for_trial(node.right);
            System.out.print(node.data+"\t");
        }
    }
    
    public static void main(String args[]){
       a155_iterartive_post_order tree = new a155_iterartive_post_order();
       tree.root = new Node(1);
       tree.root.left = new Node(2);
       tree.root.right = new Node(3);
       tree.root.left.left = new Node(4);
       tree.root.left.right = new Node(5);
       tree.root.left.left.left = new Node(6);
       tree.root.left.left.right = new Node(7);
       tree.root.right.left = new Node(8);
       tree.root.right.left.left = new Node(10);
       tree.root.right.left.right = new Node(11);
       tree.root.right.right = new Node(9);
       
       post_order_iterative(tree.root);
       System.out.println("\n\n");
       post_order_recursive_for_trial(tree.root);
    }
}
