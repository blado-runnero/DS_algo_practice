
public class a047_gfg_linked_list_search_for_an_element {

	static Node head;
	
	static class Node {
		int data;
		Node next;
		Node(int d){data = d; next = null;}
	}
	
	static void append(int d) {
		Node newnode = new Node(d);
		if (head==null) {
			head = newnode;
			return;
		}
		newnode.next=null;
		Node last = head; 
		
			while(last.next!=null){
				last = last.next;
			}
			
			last.next = newnode;
			
			return;
			
		
	}
	
	static void print() {
		Node traverse = head;
		while(traverse!=null) {
			System.out.println(traverse.data);
			traverse = traverse.next;
		}
	}
	
	static int search_element(int search_data) {
		Node tra = head;
		int out = -1;
		while(tra!=null) {
			if(tra.data==search_data) {
				out = tra.data;
				return out;
				
			}
			tra=tra.next;
			}
		
		return out;
	}
	
	public static void main(String args[]) {
		a047_gfg_linked_list_search_for_an_element ll = new a047_gfg_linked_list_search_for_an_element();
		
		for(int i = 1; i<39; i++) {
		ll.append(i);
		}
		
		//ll.print();
		
		int search = ll.search_element(32);
		//System.out.println("sd"+search);
		System.out.println((search>=0)?"true":"false");
	}
	
}
