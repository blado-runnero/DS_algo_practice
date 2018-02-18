
public class a048_gfg_linked_list_swap_nodes {

	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}

	static void append(int new_data) {
		Node new_node = new Node(new_data);
		if (head==null) {
			head = new_node;
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next!=null) {
			last = last.next;
		}
		last.next=new_node;
	}

	public void print(String str) {
		System.out.print(str+"\n");
		Node last = head;
		System.out.print(last.data);
		last = last.next;
		while(last!=null) {
			
			System.out.print(" -> "+last.data);
			last = last.next;
		}
	
		
	}
	
	public void swap(int n1, int n2) {
		int max = 0,min=0;
		if (n1>n2) {
			max = n1;min = n2;
		}else {max = n2; min = n1;}
		n1=max; n2=min;
		Node l1_prev=null,l1_next=null,l1 = null;
		Node l2_prev=null,l2_next=null,l2=null;
		if(head==null) {
			return;
		}
		 if(head.data==n1 || head.data==n2) {
			if(head.data == n1) {
				l1_prev = null;
				l1=head;
				//System.out.println("1");
				l1_next = head.next;
			}else {
				l2_prev = null;
				l2=head;
				//System.out.println("2");
				l2_next = head.next;
			}
		}
		if(1==1) {
		Node traverse = head.next;
		Node traverse_prev = head;
		
		while(traverse!=null) {
			if(traverse.data==n1) {
				l1_prev = traverse_prev ;
				l1_next = traverse.next;
				l1=traverse;
				System.out.println("3");
			}
			if (traverse.data==n2) {
				l2_prev = traverse_prev;
				l2_next = traverse.next;
				l2=traverse;
				System.out.println("4");
			}
			traverse=traverse.next;
			traverse_prev = traverse_prev.next;
		}
		}
		
		
		
		
		if (l2_prev!=null) { l2_prev.next = l1; }
		else {head = l1; l1 = l1;}
		
		if (l2_next != null) {
			l1.next=l2_next;
		}else {
			
		}
		
		if (l1_prev!=null) {l1_prev.next = l2;}
		else {head = l2; l2 = l2;}
		

		if (l2.next != null) {
			l2.next=l1_next;
		}else {
				
		}
		
		
		
		//System.out.print("\n"+l2.next.data+"\n"+l1_next.data);
		
		
		
	}
	
	public static void main(String args[]) {
		a048_gfg_linked_list_swap_nodes ll = new a048_gfg_linked_list_swap_nodes();
		
		for(int i = 1;i<12; i++ ) {
			ll.append(i);
		}
		ll.print("Before swap : ");
		
		ll.swap(1,11);
		
		ll.print("\n\nAfter swap : ");
		
	}
	
}
