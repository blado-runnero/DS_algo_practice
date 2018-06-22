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
public class a227_insertion_sort_linked_list {
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
    static Node head = new Node(12);
    static Node sorted;
    public static void main(String args[]){
        a227_insertion_sort_linked_list ll = new a227_insertion_sort_linked_list();
        ll.add(head, 4);
        ll.add(head, 7);
        ll.add(head, 2);
        ll.add(head, 6);
        ll.add(head, 9);
        ll.add(head, 34);
        ll.add(head, 65);
        ll.add(head, 57);
        ll.add(head, 29);
        ll.add(head, 92);
        ll.add(head, 476);
        ll.print(head,"Before:- ");
        ll.sort(head);
        ll.print(head,"After:- ");
    }
    
    void add(Node node,int d){
        Node ew = new Node(d);
        if(node == null){
            node = ew;
        }
        while(node.next!=null){
            node = node.next;
        }
        node.next = ew;
        
    }
    
    void sort(Node node){
        sorted = null;
        Node current = node;

        while (current != null) 
        {
            Node next = current.next;
            sortedInsert(current);
            current = next;
        }
        head = sorted;
    }
    
    void sortedInsert(Node newnode) 
    {
        /* Special case for the head end */
        if (sorted == null || sorted.data >= newnode.data) 
        {
            newnode.next = sorted;
            sorted = newnode;
        }
        else
        {
            Node current = sorted;
            while (current.next != null && current.next.data < newnode.data) 
            {
                current = current.next;
            }
            newnode.next = current.next;
            current.next = newnode;
        }
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
    
}
