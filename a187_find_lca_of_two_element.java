/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

import java.util.ArrayList;

/**
 *
 * @author bladeRUNNER
 */
public class a187_find_lca_of_two_element {

    static Boolean if_in_tree_non_bst(int n,Node node){
        if(node==null){
            return false;
        }
        if(node.data == n){
            return true;
        }
        if(node.left != null && if_in_tree_non_bst(n,node.left)){
            return true;
        }
        if(node.right != null && if_in_tree_non_bst(n,node.right)){
            return true;
        }
        return false;
    }
    
    static Boolean if_in_tree(int n,Node node){
        if(node == null){return false;}
        if(node.data == n){return true;}
        else{
            if(n < node.data  ){
                return if_in_tree(n,node.left);
            }
            else{
                return if_in_tree(n,node.right);
            }
        }
    }
    static ArrayList<Integer> path1 = new ArrayList<Integer>();
    static ArrayList<Integer> path2 = new ArrayList<Integer>();

    static void find_path(int n, ArrayList<Integer> path,Node node){
        path.add(node.data);
        if(node.data == n){
            return;
        }
        else if(n < node.data){
            find_path(n,path,node.left);
        }
        else if(n > node.data){
            find_path(n,path,node.right);
        }
    }
    
    static Boolean find_path_non_bst(int n,ArrayList<Integer> path,Node node ){
        if(node==null){ return false; }
        path.add(node.data);
        if(node.data == n){ return true; }
        if(node.left!=null && find_path_non_bst(n,path,node.left)){return true;}
        if(node.right!=null && find_path_non_bst(n,path,node.right)){return true;}
        path.remove(path.size()-1);
        return false;
    }
    
    private static void find_lca(int n1, int n2) {
        if(if_in_tree(n1,root) && if_in_tree(n2,root)){
            find_path(n1,path1,root);
            find_path_non_bst(n2,path2,root);
            int i = 0;
            while(path1.get(i)==path2.get(i)){ i++; }
            i--;
            System.out.println("lca for "+n1+" and "+n2+" is "+path1.get(i));
            System.out.println(path1);
            System.out.println(path2);
        }
        else{
            System.out.print("Both elements are not the part of the tree.");
        }
    }
    static class Node{
        int data;
        Node left, right;
        Node(int d){
            data = d;
            left = right = null;
        }
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
    
    void print_in_order(){
        System.out.println("Inorder traversal of the tree is :- ");
        print_in_order_recursive(root);
        System.out.println();
    }
    
    void print_in_order_recursive(Node node){
        if(node == null){return;}
        print_in_order_recursive(node.left);
        System.out.print(node.data+"\t");
        print_in_order_recursive(node.right);
    }
    
    static Node root;
    public static void main(String args[]){
        a187_find_lca_of_two_element tree = new a187_find_lca_of_two_element();
        tree.insert_in_tree(100);
        tree.insert_in_tree(50);
        tree.insert_in_tree(150);
        tree.insert_in_tree(10);
        tree.insert_in_tree(110);
        tree.insert_in_tree(40);
        tree.insert_in_tree(90);
        tree.insert_in_tree(140);
        tree.insert_in_tree(190);
        tree.insert_in_tree(500);
        tree.insert_in_tree(23);
        tree.insert_in_tree(734);
        tree.insert_in_tree(376);
        tree.insert_in_tree(87);
        tree.insert_in_tree(8934);
        tree.print_in_order();
        
        find_lca(500,470);
        
        System.out.print("\n\n"+if_in_tree_non_bst(40,tree.root));
        
    }
}
