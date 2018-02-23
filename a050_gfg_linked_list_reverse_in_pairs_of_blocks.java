

public class a050_gfg_linked_list_reverse_in_pairs_of_blocks {

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
	
	  static Node reverse_in_pairs(Node head) {
		
		Node nextt = null;
		nextt.next = head;
		Node prev = nextt, current = head;
		

		while(current!=null && current.next !=null) {
			nextt = current.next.next;
			current.next.next = prev.next;
			prev.next = current.next;
			current.next = nextt;
			prev = current;
			current = prev.next;
			System.out.println("\n1");

		}
		return nextt.next;
	}
	
	public static void main(String args[]) {
		a050_gfg_linked_list_reverse_in_pairs_of_blocks ll = new a050_gfg_linked_list_reverse_in_pairs_of_blocks();
		for (int i =1; i<11; i++) {
			ll.append(i);
		}
		ll.print();
	 head = reverse_in_pairs(head);
		System.out.print("\n\n");
		ll.print();
	}
}
