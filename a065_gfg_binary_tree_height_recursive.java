
public class a065_gfg_binary_tree_height_recursive {
	Node root;
	int height_recursive(Node node) {
		if (node == null) {
			return 0;
		}
		int lh = height_recursive(node.left);
		int rh = height_recursive(node.right);
		return ((lh>=rh)?lh+1:rh+1);
	}
	
	public static void main(String args[]) {
		a065_gfg_binary_tree_height_recursive tree = new a065_gfg_binary_tree_height_recursive();
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
		int height = tree.height_recursive(tree.root);
		System.out.println(height);
	}
	

		
}
