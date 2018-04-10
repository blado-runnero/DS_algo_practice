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
public class a141_reverse_in_given_size_gfg {
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
    
     Node reverse(Node node,int n){
         Node curr = node,next,prev;
         next = prev = null;
         int count = 0;
         while(count<n && curr != null){
             next = curr.next ;
             curr.next = prev;
             prev = curr;
             curr = next ;
             count++;
         }
         if(next != null){
             node.next = reverse(next,n);
         }
         return prev;
     }
    
     public static void main(String args[]){
        a141_reverse_in_given_size_gfg ll = new a141_reverse_in_given_size_gfg();
        for(int i = 10; i >0; i--){
            ll.push(i);
        }
        int n = 4;
        ll.print(head,"\nBefore :- ");
        head = ll.reverse(head,n);
        ll.print(head,"\nAfter :- ");
    } 
}
