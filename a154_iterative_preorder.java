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
public class a154_iterative_preorder {
    
    static class Node{
        int data;
        Node left, right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }
    static Node root;
    
    static void pre_order_iterative(Node node){
        Stack<Node> stack = new Stack<>();
        
        while(node != null){
            System.out.print(node.data+"\t");
            stack.push(node);
            node = node.left;
        }
        
        while(!stack.isEmpty()){
            Node n = stack.pop();
            if(n.right != null){
                n = n.right;
                 while(n != null){
                    stack.push(n);
                    System.out.print(n.data+"\t");
                    n = n.left;
                    }
            }
        }
        
    }
    
    static void pre_order_recursive_for_trial(Node node){
        if(node!=null){
            System.out.print(node.data+"\t");
            pre_order_recursive_for_trial(node.left);
            pre_order_recursive_for_trial(node.right);
        }
    }
    
    public static void main(String args[]){
       a154_iterative_preorder tree = new a154_iterative_preorder();
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
       
       pre_order_iterative(tree.root);
       System.out.println("\n\n");
       pre_order_recursive_for_trial(tree.root);
    }
    
}
