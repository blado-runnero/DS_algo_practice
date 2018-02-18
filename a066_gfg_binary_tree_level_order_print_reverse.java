import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class a066_gfg_binary_tree_level_order_print_reverse {

	Node root;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a066_gfg_binary_tree_level_order_print_reverse tree = new a066_gfg_binary_tree_level_order_print_reverse();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		tree.root.left.left.left.left = new Node(10);
		tree.root.left.left.left.right = new Node(11);
		tree.root.left.right.right = new Node(15);
		tree.root.left.right.right.right = new Node(25);
		tree.root.left.right.right.right.right = new Node(35);
		tree.root.left.right.right.right.right.right = new Node(45);
		tree.root.left.right.right.right.right.right.right = new Node(55);
		//tree.level_order();
		tree.level_order_reverse();
	}


	private void level_order() {
		// TODO Auto-generated method stub
		Queue<Node> q1 = new LinkedList<Node>();
		Queue<Node> q2 = new LinkedList<Node>();
		
		Node node = root,node2;
		if (node == null) {return;}
		q1.offer(node);
		int count = 1;
		while(q1.isEmpty() == false) {
			node = q1.poll();
			System.out.print(node.data+" ");
			if(node.left != null) {q2.offer(node.left);}
			if(node.right != null) {q2.offer(node.right);}
			if(q1.isEmpty() == true && q2.isEmpty()!=true )  {
				System.out.println();
				while(q2.peek() != null ) {
					q1.offer(q2.poll());
					//System.out.println("\n"+count);
					count++;
				}
			}
			
			
		}
	}
	
	
	private void level_order_reverse() {
		// TODO Auto-generated method stub
		Queue<Node> q1 = new LinkedList<Node>();
		Queue<Node> q2 = new LinkedList<Node>();
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> numstack = new Stack<>();
		Node node = root,node2;
		if (node == null) {return;}
		q1.offer(node);
		int count = 1;
		numstack.push(count);
		while(q1.isEmpty() == false) {
			node = q1.poll();
			//System.out.print(node.data+" ");
			stack.push(node.data);
			
			if(node.left != null) {q2.offer(node.left);}
			if(node.right != null) {q2.offer(node.right);}
			if(q1.isEmpty() == true && q2.isEmpty()!=true )  {
				//System.out.println();			
				count=0;
				while(q2.peek() != null ) {
					q1.offer(q2.poll());
					//System.out.println("\n"+count);
					count++;
				}
				numstack.push(count);
			}
			
		}
		while(numstack.isEmpty() == false) {
			count = numstack.pop();
			while(count>0) {
				System.out.print(stack.pop()+" ");
				count--;
			}
			System.out.println();
		}
	}

}
