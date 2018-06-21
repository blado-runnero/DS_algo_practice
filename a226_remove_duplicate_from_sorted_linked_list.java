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
public class a226_remove_duplicate_from_sorted_linked_list {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
        Node(int d,Node node){
            data = d;
            next = node;
        }
    }
    Node head;
    public static void main(String args[]){
        a226_remove_duplicate_from_sorted_linked_list ll = new a226_remove_duplicate_from_sorted_linked_list();
        ll.head = new Node(1);
        ll.head.next = new Node(1);
        ll.head.next.next = new Node(1);
        ll.head.next.next.next = new Node(2);
        ll.head.next.next.next.next = new Node(3);
        ll.head.next.next.next.next.next = new Node(4);
        ll.head.next.next.next.next.next.next = new Node(4);
        ll.head.next.next.next.next.next.next.next = new Node(5);
        ll.head.next.next.next.next.next.next.next.next = new Node(5);
        ll.head.next.next.next.next.next.next.next.next.next = new Node(5);
        ll.head.next.next.next.next.next.next.next.next.next.next = new Node(5);
        ll.head.next.next.next.next.next.next.next.next.next.next.next = new Node(5);
        ll.head.next.next.next.next.next.next.next.next.next.next.next.next = new Node(5);
        ll.print(ll.head,"Before:- ");
        ll.remove(ll.head);
        ll.print(ll.head,"After:- ");
    }
    
    void print(Node node,String str){
        Node nodee = node;
        System.out.println(str);
        while(nodee!=null){
            System.out.print(nodee.data+"\t");
            nodee = nodee.next;
        }
        System.out.println();
    }
    
    void remove(Node node){
        Node curr = node.next;
        Node prev = node;
        while(curr!=null){
            if(prev.data == curr.data){
                curr = curr.next;
            }
            else{
                prev.next = curr;
                prev = curr;
                curr = curr.next;
            }
        }
        prev.next = null;
    }
    
}
