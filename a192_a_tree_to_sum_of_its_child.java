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
public class a192_a_tree_to_sum_of_its_child {
 static Node root;

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

    void print_tree(String str,String stt){
        System.out.println(str);
        in_order_recursive(root);
        System.out.println();
        int x = convert_to_its_sum_tree(root);
        System.out.println(stt);
        in_order_recursive(root);
    }
    
    int convert_to_its_sum_tree(Node node){
        if(node == null){
            return 0;
        }
        int data = node.data;
        node.data = convert_to_its_sum_tree(node.left) + convert_to_its_sum_tree(node.right);
        return node.data+data;
    }
    
    void in_order_recursive(Node node){
        if(node == null){return;}
        in_order_recursive(node.left);
        System.out.print(node.data+"\t");
        in_order_recursive(node.right);
    }
    
    public static void main(String args[]){
        a192_a_tree_to_sum_of_its_child tree = new a192_a_tree_to_sum_of_its_child();
        tree.insert_in_tree(1);
        tree.insert_in_tree(2);
        tree.insert_in_tree(3);
        tree.insert_in_tree(4);
        tree.insert_in_tree(5);
        tree.print_tree("Before :- ","After :- ");
    }
    
}
