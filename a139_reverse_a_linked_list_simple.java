/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100_days_of_code;

/**
 *
 * @author bladeRUNNER
 */
public class a139_reverse_a_linked_list_simple {
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    static Node head;
    public void push(int d){
        Node n = new Node(d);
        n.next = head;
        head = n;
    }
    
    public void print(Node node, String str){
        System.out.println(str);
        while(node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
    
    Node reverse(Node node){
        Node prev=null,curr,next=null;
        curr = node;
        while(curr!=null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;          
        }
        return prev;
    }
    
    public static void main(String args[]){
        a139_reverse_a_linked_list_simple ll = new a139_reverse_a_linked_list_simple();
        for(int i = 1; i < 11; i++){
            ll.push(i);
        }
        ll.print(head,"\nBefore :- ");
        head = ll.reverse(head);
        ll.print(head,"\nAfter :- ");
    }
    
}
