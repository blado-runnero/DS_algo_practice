import java.util.Stack;

<<<<<<< HEAD
=======
class Node{
	int data;
	Node left, right;
	Node(int d){
		data = d;
		right = left = null;
	}
}

>>>>>>> c41480a1954afd81e5c98574f3759da5900397d4

public class a062_gfg_binary_tree_inorder_traversal_wo_recursion {

	Node root;
	a062_gfg_binary_tree_inorder_traversal_wo_recursion(){
		root = null;
	}
	
	void inorder() {
		if (root==null) {
			return;
		}
		
		Stack<Node> stack = new Stack<>();
		Node node = root;
		
		while(node!=null) {
			stack.push(node);
			node = node.left;
		}
		
		while(stack.size() > 0) {
			node = stack.pop();
			System.out.print(node.data+" ");
			if (node.right != null) {
				node = node.right;
				while(node!= null) {
					stack.push(node);
					node = node.left;
				}
			}
			
		}
	}
	
	public static void main(String args[]) {
		a062_gfg_binary_tree_inorder_traversal_wo_recursion tree = new a062_gfg_binary_tree_inorder_traversal_wo_recursion();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		
		tree.inorder();
	}
	
}
