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
public class a195_extract_leaves_into_a_doubly_linked_list {
    dlNode prev; dlNode next;
    private Node make_leaf_to_dll(Node node) {
        if(node == null){return null;}
        if(node.left == null && node.right == null){
            if(head == null){
                dlNode newdl = new dlNode(node.data);
                head = newdl;
                prev = newdl;
            }else{
                dlNode newdl = new dlNode(node.data);
                prev.next = newdl;
                newdl.prev = prev;
                prev = newdl;
            }
            return null;
        }
        node.left = make_leaf_to_dll(node.left);
        node.right = make_leaf_to_dll(node.right);
        return node;
    }
    static class dlNode{
        int data;
        dlNode next, prev;
        dlNode(int d){
            data = d;
            next = prev = null;
        }
        dlNode(int d, dlNode node){
            data = d; 
        }
    }
    static class Node{
        int data;
        Node left,right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }
    
    void in_order(Node node){
        if(node==null){return;}
        in_order(node.left);
        System.out.print(node.data+"\t");
        in_order(node.right);
    }
    
    void print_dll(dlNode node){
        if(node == null){return;}
        dlNode last = null;
        while(node != null){
            System.out.print(node.data+"\t");
            last = node;
            node = node.next;
        }
    }
    
    Node root;
    dlNode head;
    public static void main(String args[]){
        a195_extract_leaves_into_a_doubly_linked_list tree = new a195_extract_leaves_into_a_doubly_linked_list();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.left.left = new Node(7);
        tree.root.left.right= new Node(5);
        tree.root.left.left.right= new Node(8);
        tree.root.right.right = new Node(6);
        tree.root.right.right.right = new Node(10);
        tree.root.right.right.left= new Node(9);
        tree.in_order(tree.root);
        System.out.println("\n\n");
        
        tree.make_leaf_to_dll(tree.root);
        tree.in_order(tree.root);
        System.out.println("\n\n");
        
        tree.print_dll(tree.head);
    }
    
}
