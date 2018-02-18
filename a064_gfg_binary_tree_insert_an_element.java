import java.util.Stack;


public class a064_gfg_binary_tree_insert_an_element {
	Node root;
	a064_gfg_binary_tree_insert_an_element(){
		root = null;
	}
	
	void insert_short() {
		
	}
	
	void insert(int data) {
		Node new_node = new Node(data);
		Stack<Node> stack = new Stack<>();
		Node node = root;
		int status=0;
		while(status==0) {
		
		if ( node == null ) {
			node = new_node;
			return;
		}
		if (node.left == null) {
			node.left = new_node;
			return;
		}
		else {
			stack.push(node.left);
		}
		if (node.right == null) {
			node.right = new_node;
			return;
		}
		else {
			stack.push(node.right);
		}
		
		node = stack.pop();
		
		}
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
	
	private void level_order_traversal() {
		// TODO Auto-generated method stub
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++) {
			print_given_level(root,i);System.out.println();
		}
	}

		private void print_given_level(Node node, int level) {
			// TODO Auto-generated method stub
			if (node == null) {
					return;
				}
			
				if (level == 1) {
						System.out.print(node.data + " ");
						//System.out.println("");
					}
					else {
							
							print_given_level(node.left , level-1);
								print_given_level(node.right, level-1);
								//System.out.println("");		
			
		}
		
	}

	private int height(Node node) {
		if (node == null) {return 0;}
		else {
			int lheight = height(node.left);
			int rheight = height(node.right);
			
			if(lheight > rheight) {
				return (lheight+1);																																																																			
			}
			else {
				return (rheight+1) ;
			}
		}
	}	
	
	
	public static void main(String args[]) {
		a064_gfg_binary_tree_insert_an_element tree = new a064_gfg_binary_tree_insert_an_element();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		tree.insert(123);
		tree.inorder();
		
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																		
		
	}
	
}
