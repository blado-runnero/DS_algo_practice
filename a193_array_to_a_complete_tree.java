/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

import java.util.Queue;
import java.util.Stack;
import new_package.a192_a_tree_to_sum_of_its_child.Node;

/**
 *
 * @author bladeRUNNER
 */
public class a193_array_to_a_complete_tree {
    Node root;
    public static void main(String args[]){
        a193_array_to_a_complete_tree tree = new a193_array_to_a_complete_tree();
        tree.insert_in_tree(1,tree.root);
        tree.insert_in_tree(2,tree.root);
        tree.insert_in_tree(3,tree.root);
        tree.insert_in_tree(4,tree.root);
        tree.insert_in_tree(5,tree.root);
        tree.insert_in_tree(6,tree.root);
        tree.insert_in_tree(7,tree.root);
        tree.print();
    }
    
    void print(){
        in_order_recursive(root);
    }
    
    void in_order_recursive(Node node){
        if(node == null){return;}
        in_order_recursive(node.left);
        System.out.print(node.data+"\t");
        in_order_recursive(node.right);
    }

    private void insert_in_tree(int i,Node node){
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
}
