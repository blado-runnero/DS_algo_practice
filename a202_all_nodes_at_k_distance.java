/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

import java.util.Stack;

/**
 *
 * @author bladeRUNNER
 */
public class a202_all_nodes_at_k_distance {
    static class Node{
        int data;
        Node left, right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }
    
    static void print_k_node_down(Node node, int k){
        if(node == null || k<0){return;}
            if(k==0){
                System.out.println(node.data);
                return;
            }
        print_k_node_down(node.left, k - 1);
        print_k_node_down(node.right, k - 1);
        
    }
    
    static int print_k_distance_node(Node node, Node target, int k){
        if(node == null){return -1;}
        if(node == target){print_k_node_down(node,k); return 0;}
        int dl = print_k_distance_node(node.left, target, k);
        if(dl != -1){
            if(dl+1 == k){
                System.out.println(node.data);
            }
            else{
                print_k_node_down(node.right,k-dl-2 );
            }
            return dl+1;
        }
        int dr = print_k_distance_node(node.right, target, k);
        if(dr != -1){
            if(dr+1 == k){
                System.out.println(node.data);
            }
            else{
                print_k_node_down(node.left,k-dr-2 );
            }
            return dr+1;
        }
        return -1;
    }
    
    static Node root;
    static void insert_in_tree(int i,Node node){
        Node new_node = new Node(i);
        if(node ==null ){root = new_node;return;}
        Stack<Node> q = new Stack<>();
        Stack<Node> qq = new Stack<>();
        if(node.left==null){node.left=new_node; return;}
        else{
            q.add(node.left);
            if(node.right==null){node.right=new_node; return;}
            else{q.add(node.right);
        }
            
            while(!q.isEmpty()){
                qq.add(q.pop());
            }
            while(!qq.isEmpty()){
                Node nodee = qq.pop();
                if(nodee.left==null){nodee.left=new_node; return;}
                else{
                    q.add(nodee.left);
                    if(nodee.right==null){nodee.right=new_node; return;}
                    else{q.add(nodee.right);
                        }
                    }
                
                if(qq.size()==0){
                    while(!q.isEmpty()){
                        qq.add(q.pop());
                    }
                }
            }
        }
    }
    
    public static void main(String args[]){
        insert_in_tree(1,root);
        insert_in_tree(2,root);
        insert_in_tree(3,root);
        insert_in_tree(4,root);
        insert_in_tree(5,root);
        insert_in_tree(6,root);
        insert_in_tree(7,root);
        insert_in_tree(8,root);
        insert_in_tree(9,root);
        insert_in_tree(10,root);
        insert_in_tree(11,root);
        insert_in_tree(12,root);
        insert_in_tree(13,root);
        insert_in_tree(14,root);
        insert_in_tree(15,root);
        insert_in_tree(16,root);
        insert_in_tree(17,root);
        insert_in_tree(18,root);
        insert_in_tree(19,root);
        insert_in_tree(20,root);
        
        Node target = root.left.right.left.left;
        
        print_k_distance_node(root,target,7);
        
    }
}
