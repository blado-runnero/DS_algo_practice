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
public class a140_reverse_in_given_size {
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
    
    void reverse(Node node,int n){
        int count = n;
        int status = 0;
        Node reset;
        Node prev=null,curr,next=null;
        curr = node;
        while(curr!=null){
           
           reset = curr;
          
           System.out.println("-----"+reset.data+" "+curr.data);
           while(count-->0 && curr != null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
           
           }
           if(status == 0){
               head = prev;
               status++;}
           prev = reset;
           reset.next = curr;
           print(head,"during");
           count = n;
           
        }
        
    }
    
    public static void main(String args[]){
        a140_reverse_in_given_size ll = new a140_reverse_in_given_size();
        for(int i = 10; i >0; i--){
            ll.push(i);
        }
        int n = 4;
        ll.print(head,"\nBefore :- ");
        ll.reverse(head,n);
        ll.print(head,"\nAfter :- ");
    } 
}
