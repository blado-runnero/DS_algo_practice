/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bladeRUNNER
 */

class Node{
    int data;
    Node left, right;
    Node(int d){
        data = d;
        left = right = null;
    }
}
public class a137_find_lca_less_complexity {
    Node root;
    public static void main(String args[]){
         a137_find_lca_less_complexity tree = new a137_find_lca_less_complexity();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);
        
        Node out = tree.find_lca(tree.root, 6, 8);
        System.out.println(out.data);
    }
    
    
    Node find_lca(Node node, int n1, int n2){
        if(node == null){
            return null;
        }
        if(node.data == n1 || node.data == n2){
            return node;
        }
        Node left_lca = find_lca(node.left, n1,n2);
        Node right_lca = find_lca(node.right, n1, n2);
        
        if(left_lca != null && right_lca != null){
            return node;
        }
        
        Node to_return = (left_lca == null)?right_lca:left_lca;
        
        return to_return;
    }
    
}
