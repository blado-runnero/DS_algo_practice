

public class a051_gfg_linked_list_reverse_blocks_ok_k_nodes {


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
	
	void print(Node head) {
		Node last = head;
		while(last!=null) {
			System.out.print("\t"+last.data);
			last = last.next;
		}
	}
	
	static Node reverse_in_blocks_recursive(Node head, int k) {
		
		Node current = head, next = null, prev = null;
		int count = k;
		
		//reverse k nodes
		while(current!=null && count>0) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
			count--;
			
		}
		
		if (next!=null) {
			head.next = reverse_in_blocks_recursive(next,k);
		}
		return prev;
		
	}
	
	
	static Node reverse_in_blocks(Node hhead,int k) {
		 Node current = hhead;
		Node prevtail = null;
		 Node prevcurr = null;
		while(current!=null) {
			int count = k;
			Node tail = null;
			while(current!=null && count >0) {
				Node next = current.next;
				current.next = tail;
				tail = current;
				current = next;
				count--;
			}
			if (prevtail != null) {
				prevtail.next = tail;
			}else {
				hhead = tail;
			}
			prevtail = prevcurr;
			prevcurr = current;
			
		}
		return hhead;
	}
	
	public static void main(String args[]) {
		a051_gfg_linked_list_reverse_blocks_ok_k_nodes ll = new a051_gfg_linked_list_reverse_blocks_ok_k_nodes();
		for (int i =1; i<=12; i++) {
			ll.append(i);
		}
		ll.print(head);
		head = reverse_in_blocks_recursive(head,3);
		System.out.print("\n\n");
		ll.print(head);
	}
	
}
