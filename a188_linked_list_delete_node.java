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
public class a188_linked_list_delete_node {

    private Node delete(Node node, int i) {
        if ( i == 0){
            return node.next;
        }
        Node h = node;
        while(i-->1){
            node= node.next;
        }
        node.next = node.next.next;
        return h;
    }
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    void print(Node node){
        while(node!= null){
            System.out.print(node.data+"\t");
            node = node.next;
        }
    }
    
    Node head;
    public static void main(String args[]){
        a188_linked_list_delete_node ll = new a188_linked_list_delete_node();
        ll.head = new Node(0);
        ll.head.next = new Node(1);
        ll.head.next.next = new Node(2);
        ll.head.next.next.next = new Node(3);
        ll.head.next.next.next.next = new Node(4);
        ll.head.next.next.next.next.next = new Node(5);
        ll.head.next.next.next.next.next.next = new Node(6);
        ll.head.next.next.next.next.next.next.next = new Node(7);
        ll.head.next.next.next.next.next.next.next.next = new Node(8);
        ll.head.next.next.next.next.next.next.next.next.next = new Node(9);
        ll.head.next.next.next.next.next.next.next.next.next.next = new Node(10);
        ll.head.next.next.next.next.next.next.next.next.next.next.next = new Node(11);
        ll.print(ll.head);
        System.out.println();
        ll.head = ll.delete(ll.head,5);
        ll.print(ll.head);
    }
    
}
