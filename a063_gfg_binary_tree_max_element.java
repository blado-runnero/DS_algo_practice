import java.util.Stack;

class Node{
	int data;
	Node left, right;
	Node(int d){
		data = d;
		left = right = null;
	}
}
public class a063_gfg_binary_tree_max_element {

	Node root;
	int status = -1;
	int max() {
		int max = 0;
		Stack<Node> stack = new Stack<>();
		
		Node node = root;
		stack.push(node);
		while (stack.empty() == false) {
		node = stack.peek();
		stack.pop();
		if (max<=node.data) { max = node.data; }
		if(node.right!=null) {
			stack.push(node.right);
		}
		if(node.left!=null) {
			stack.push(node.left);
		} 
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a063_gfg_binary_tree_max_element tree = new a063_gfg_binary_tree_max_element();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(16);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		int max = tree.max();
		System.out.println(max);
		
	}

}
