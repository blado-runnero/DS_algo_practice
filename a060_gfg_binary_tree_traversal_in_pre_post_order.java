 class Node{
	int data;
	Node left, right;
	Node(int d){
		data = d;
		left = right = null;
	}
}
public class a060_gfg_binary_tree_traversal_in_pre_post_order {
	
	Node root;
	
	a060_gfg_binary_tree_traversal_in_pre_post_order(){
		root = null;
	}
	
	void post_order(Node node) {
		if (node == null) {return;}
		post_order(node.left);
		post_order(node.right);
		System.out.print(node.data + " ");
	}
	
	void pre_order(Node node) {
		if (node == null) {return;}
		System.out.print(node.data + " ");
		pre_order(node.left);
		pre_order(node.right);
	}
	
	void in_order(Node node) {
		if (node == null) {return;}
		in_order(node.left);
		System.out.print(node.data + " ");
		in_order(node.right);
	}
	
	void print_pre_order() {pre_order(root);}
	void print_post_order() {post_order(root);}
	void print_in_order() {in_order(root);}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a060_gfg_binary_tree_traversal_in_pre_post_order tree = new a060_gfg_binary_tree_traversal_in_pre_post_order();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		
		System.out.println("\n\nIn order Traversal :- \n");
		tree.print_in_order();
		
		System.out.println("\n\nPre order Traversal :- \n");
		tree.print_pre_order();
		
		System.out.println("\n\nPost order Traversal :- \n");
		tree.print_post_order();
		
	}

}
