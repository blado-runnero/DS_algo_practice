

public class a012_gfg_linked_list_deleteing_node {
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
	
	public void delete_key(int key) {
		Node temp = head , prev = null;
		
		if(temp != null && temp.data == key){
			head = temp.next;
			return;
		}
		while(temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		
		if(temp==null) {return;}
		
		prev.next = temp.next;
		
	}

	public void delete_position(int position) {
		if (head == null) {return;}
		Node temp = head;
		if (position ==0) {head=temp.next;  return;}
		for(int i = 0; temp!=null && i<position-1; i++) {
			temp= temp.next;
		}
		if (temp == null || temp.next == null) {
			return;
		}
		
		Node next = temp.next.next;
		
		temp.next = next;
	}
	
	public void print() {
		Node tnode = head;
		while ( tnode != null ) {
			System.out.print(tnode.data + "\t");
			tnode = tnode.next;
		}
	}
		
		public static void main(String[] args) {
				
			a012_gfg_linked_list_deleteing_node ll = new a012_gfg_linked_list_deleteing_node();
			
			ll.push(1);
			ll.push(76);
			ll.push(3);
			ll.push(34);
			ll.push(8);
			ll.push(6);
			
			
			System.out.println("\n Created Linked List is :- \n \n");
			ll.print();
			
			ll.delete_key(34);
			System.out.println("\n After deleteing Linked List is :- \n \n");
			ll.print();

			ll.delete_position(1);
			System.out.println("\n After deleteing Linked List is :- \n \n");
			ll.print();
			
			
		}
		
	}


