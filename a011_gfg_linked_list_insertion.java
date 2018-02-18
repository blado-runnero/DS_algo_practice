
public class a011_gfg_linked_list_insertion {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d) {data = d; next =  null;}
	}
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void insert_after(Node prev_node , int new_data) {
		if (prev_node==null) {
			System.out.println("The given previous node can't be null");
			return;
		}
		Node new_node = new Node (new_data);
		new_node.next = prev_node.next;
		prev_node.next =  new_node;
	}
	
	public void append(int new_data) {
		Node new_node = new Node(new_data);
		if(head==null) {
			head = new_node;
			return;
		}
		new_node.next = null;
		
		Node last = head;
		while(last.next != null) {last = last.next;}
		last.next = new_node;
		return;
	}
	
	public void print() {
		Node tnode = head;
		while ( tnode != null ) {
			System.out.print(tnode.data + "\t");
			tnode = tnode.next;
		}
	}
		
		public static void main(String[] args) {
				
			a011_gfg_linked_list_insertion ll = new a011_gfg_linked_list_insertion();
			
			ll.append(6);
			ll.push(7);
			ll.push(1);
			ll.append(4);
			ll.insert_after(ll.head.next, 8);
			
			System.out.println("\n Created Linked List is :- \n \n");
			ll.print();
			
			
			
			
		}
		
	}


