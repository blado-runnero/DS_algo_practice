/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

import java.util.HashMap;

/**
 *
 * @author bladeRUNNER
 */
public class a224_lru_cache {
    
    
        
    public class Node{
    int key;
    int value;
    Node pre;
    Node next;
    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}
    
    
    private int capacity;
    private HashMap<Integer, Node> map = new HashMap<Integer, Node>();
    private Node head = null;
    private Node end = null;
    public a224_lru_cache(int capacity) {
         this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }
        return -1;
    }
    
    public void set(int key, int value) {
        if(map.containsKey(key)){
            Node old = map.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        }
        else{
            Node created = new Node(key, value);
            if(map.size() >= capacity){
                //System.out.println("Removing : ");
                map.remove(end.key);
                remove(end);
                setHead(created);
            }
            else{
                setHead(created);
            }
            map.put(key, created);
        }
        
    }
    
    public void setHead(Node n){
        n.next = head;
        n.pre = null;
        if(head != null)
            head.pre = n;
        head = n;
        if(end == null)
            end = head;
    }
    
    public void remove(Node n){
        if(n.pre != null)
            n.pre.next = n.next;
        else
            head = n.next;
        
        if(n.next != null)
            n.next.pre = n.pre;
        else
            end = n.pre;
    }


      public static void main(String[] args){
        System.out.println("Main function");
        a224_lru_cache l = new a224_lru_cache(5);
        
        l.set(1, 10);
        l.set(5, 12);
        System.out.println(l.get(5));
        System.out.println(l.get(1));
        l.set(6, 14);
        
        l.set(7, 15);
        l.set(8, 16);
        l.set(9, 17);
        
        
        System.out.println(l.get(5));
    }
    
    
}
