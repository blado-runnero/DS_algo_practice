
public class a010_gfg_linked_list_simple_implementation {

	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d) {data = d; next = null;}
	}
		
		public void printll() {
			Node n = head;
			while(n!= null) {
				System.out.print(n.data + "\t");
				n = n.next;
			}
		}
		
		public static void main(String[] args) {
			a010_gfg_linked_list_simple_implementation ll = new a010_gfg_linked_list_simple_implementation();
			ll.head = new Node(1);
			Node second  = new Node(2);
			Node third = new Node(3);
			
			ll.head.next = second ;
			second.next = third;
			
			ll.printll();
			
		}
	}

