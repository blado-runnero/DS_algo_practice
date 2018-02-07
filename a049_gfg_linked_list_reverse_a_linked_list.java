
public class a049_gfg_linked_list_reverse_a_linked_list {

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
	
	Node reverse(Node node,Node m) {
		Node curr = node, prev = null, next = null;
		while ( curr != null ) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			//if(next!=null){System.out.print("\n"+prev.data+"\t"+curr.data+"\t"+next.data);}
		}
		node = prev;
		return node;
	}
	
	Node reverse_recursion(Node curr, Node prev) {
		if (curr.next==null) {
			head = curr;
			curr.next=prev;
			return null;
		}
		Node next = curr.next;
		curr.next=prev;
		reverse_recursion(next,curr);
		return head;
	}
	
	public static void main(String args[]) {
		a049_gfg_linked_list_reverse_a_linked_list ll = new a049_gfg_linked_list_reverse_a_linked_list();
		for (int i =1; i<11; i++) {
			ll.append(i);
		}
		ll.print();
		head = ll.reverse_recursion(head,null);
		System.out.print("\n\n");
		ll.print();
	}
	
}
