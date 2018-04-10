package pkg100_days_of_code;


import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bladeRUNNER
 */


public class a142_copy_linked_list {
    
    a142_copy_linked_list(Node head){
        this.head = head;
    }
    
     
static class Node{
        int data;
        Node next,random;
        Node(int d){
            data = d;
            random = next = null;
        }
        
    }
     
    Node head;
    
    public void push(int d){
        Node n = new Node(d);
        n.next = head;
        head = n;
    }
    
    public void print(Node node, String str){
        System.out.println(str);
        while(node != null){
            Node random = node.random;
            int randomData = (random != null)? random.data: -1;
            System.out.print("NEXT DATA = "+node.data + "\tRandom data = "+randomData+"\n");
            node = node.next;
        }
        System.out.println();
    }
    
    public  a142_copy_linked_list clone(){
        Node orig_curr = this.head,  clone_curr = null;
        Map<Node,Node> map = new HashMap<Node,Node>();
        while(orig_curr != null){
            clone_curr = new Node(orig_curr.data);
            map.put(orig_curr, clone_curr);
            orig_curr = orig_curr.next;
        }
        orig_curr = this.head;
        while(orig_curr != null){
            clone_curr = map.get(orig_curr);
            clone_curr.next   = map.get(orig_curr.next);
            clone_curr.random = map.get(orig_curr.random);
            orig_curr = orig_curr.next;
        }
        return new a142_copy_linked_list(map.get(this.head));
    }
    
     public static void main(String args[]){
        a142_copy_linked_list list = new a142_copy_linked_list(new Node(5));
        /*for(int i = 10; i >0; i--){
            ll.push(i);
        }
        int n = 4;
        */
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
 
        // Setting up random references.
        list.head.random = list.head.next.next;
        list.head.next.random =
            list.head.next.next.next;
        list.head.next.next.random =
            list.head.next.next.next.next;
        list.head.next.next.next.random =
            list.head.next.next.next.next.next;
        list.head.next.next.next.next.random =
            list.head.next;

        list.print(list.head,"\nBefore :- ");
         a142_copy_linked_list l2 = list.clone();
        list.print(l2.head,"\nAfter :- ");
    } 
    
    
}
