

public class a050_gfg_linked_list_reverse_in_pairs {

	static Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){data = d; next = null;}
	}
	
	void append(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new_node;
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_node;
	}
	
	void print() {
		Node last = head;
		while(last!=null) {
			System.out.print("\t"+last.data);
			last = last.next;
		}
	}
	
	Node pairWiseSwap(Node node) {
		 
        // If linked list is empty or there is only one node in list
        if (node == null || node.next == null) {
            return null;
        }
 
        // Initialize previous and current pointers
        Node prev = node;
        Node curr = node.next;
 
        node = curr;  // Change head before proceeeding
 
        // Traverse the list
        while (true) {
            Node next = curr.next;
            curr.next = prev; // Change next of current as previous node
 
            // If next NULL or next is the last node
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }
 
            // Change next of previous to next next
            prev.next = next.next;
 
            // Update previous and curr
            prev = next;
            curr = prev.next;
        }
        return node;
    }
	
	
	
	public static void main(String args[]) {
		a050_gfg_linked_list_reverse_in_pairs ll = new a050_gfg_linked_list_reverse_in_pairs();
		for (int i =1; i<=11; i++) {
			ll.append(i);
		}
		ll.print();
		head = ll.pairWiseSwap(head);
		System.out.print("\n\n");
		ll.print();
	}
}
