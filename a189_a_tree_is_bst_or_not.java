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
public class a189_a_tree_is_bst_or_not {

    Node root;
    
   
    
    static class Node{
        int data;
        Node left, right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }
   
    static Boolean is_bst(Node node){
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        Boolean return_value = is_bst_recursive(node,min,max);
        
        return return_value;
    }
    
    static Boolean is_bst_recursive(Node node, int min, int max){
        
        if(node.data >max || node.data<min){
            return false;
        }
        Boolean left , right;
        if(node.left != null){
            left = is_bst_recursive(node.left, min, node.data-1);
        }else{
            left = true;
        }
        
        if(node.right != null){
            right = is_bst_recursive(node.right, node.data+1, max);
        }else{
            right = true;
        }
        return left && right;
    }
    
    void insert_in_tree(int x){
        root = insert_in_tree_recursive(x,root);
    }
    
    Node insert_in_tree_recursive(int x,Node node){
        if(node == null){
            node = new Node(x);
            return node;
        }
        if(x<node.data){
            node.left = insert_in_tree_recursive(x,node.left);
        }
        else if(x>node.data){
            node.right = insert_in_tree_recursive(x,node.right);
        }
        return node;
    }
    
    void print_leaf_only(){
        System.out.println("\n\nLeaves of this tree are :- ");
        print_leaves_recursive(root);
        System.out.println();
    }
    
    void print_leaves_recursive(Node node){
        if(node == null){return;}
        print_leaves_recursive(node.left);
        if(node.left == null && node.right == null){System.out.print(node.data+"\t");}
        print_leaves_recursive(node.right);
    }
    
    void print_in_order(){
        System.out.println("\n\nInorder traversal of the tree is :- ");
        print_in_order_recursive(root);
        System.out.println();
    }
    
    void print_in_order_recursive(Node node){
        if(node == null){return;}
        print_in_order_recursive(node.left);
        System.out.print(node.data+"\t");
        print_in_order_recursive(node.right);
    }
    
    public static void main(String args[]){
        a189_a_tree_is_bst_or_not tree = new a189_a_tree_is_bst_or_not();
        tree.insert_in_tree(100);
        tree.insert_in_tree(90);
        tree.insert_in_tree(110);
        tree.insert_in_tree(80);
        tree.insert_in_tree(50);
        tree.insert_in_tree(85);
        tree.insert_in_tree(95);
        tree.insert_in_tree(93);
        tree.insert_in_tree(97);
        tree.insert_in_tree(105);
        tree.insert_in_tree(150);
        tree.insert_in_tree(101);
        tree.insert_in_tree(107);
        tree.insert_in_tree(130);
        tree.insert_in_tree(170);

        tree.print_in_order();
        System.out.println("Is this tree1 a valid bst? :- "+is_bst(tree.root));
        
        a189_a_tree_is_bst_or_not tree2 = new a189_a_tree_is_bst_or_not();
        tree2.root = new Node(5);
        tree2.root.left = new Node(6);
        tree2.root.right = new Node(4);
        tree2.print_in_order();
        System.out.println("Is this tree2 a valid bst? :- "+is_bst(tree2.root));
        
        tree.print_leaf_only();
        tree2.print_leaf_only();
        
    }
}
