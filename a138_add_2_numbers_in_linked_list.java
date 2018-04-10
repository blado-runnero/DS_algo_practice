/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100_days_of_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bladeRUNNER
 */
/*
class Node{
    int data; 
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}*/
public class a138_add_2_numbers_in_linked_list {
 
    
    class Node{
    int data; 
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
 
    Node head;
    
 void push(int d){
     Node new_node = new Node(d);
     new_node.next = head;
     head = new_node;
 }
 
 static void make_ll_from_num(a138_add_2_numbers_in_linked_list ll, int num){
     for(int i = num; i>0 ; i=i/10){
         ll.push(i%10);
     }
 }
 
 static int sum(a138_add_2_numbers_in_linked_list l1, a138_add_2_numbers_in_linked_list l2){
     int result = 0;
     int pass = 0;
     Node n1 = l1.head;
     Node n2 = l2.head;
     while(n1 != null || n2 != null){
        int temp = 0;
         if(n1 != null && n2!= null){
             temp = n1.data + n2.data + pass;
         }
         else{
             temp = (n1==null)?n2.data + pass:n1.data + pass;
         }
            result =  result*10  + temp%10;
            temp = temp / 10;
            pass = temp;
         n1 = n1.next;
         n2 = n2.next;
     }
     return result;
 }
 
 public static void main(String args[]) throws IOException{
     a138_add_2_numbers_in_linked_list l1 = new a138_add_2_numbers_in_linked_list();
     a138_add_2_numbers_in_linked_list l2 = new a138_add_2_numbers_in_linked_list();
     
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String str = br.readLine();
     int n1 = Integer.parseInt(str);
     str = br.readLine();
     int n2 = Integer.parseInt(str);
     make_ll_from_num(l1,n1);
     make_ll_from_num(l2,n2);
     System.out.print(sum(l1,l2));
 }
 
 
}
