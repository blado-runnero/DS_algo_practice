
public class a067_gfg_binary_tree_root_to_leaf_path_print {

	Node root;
	
	void print_paths(Node node) {
		int path[] = new int[1000];
		print_path_recursively(node, path, 0);
	}
	
	void print_path_recursively(Node node, int[] path, int pathLen) {
		if (node == null) {
			return;
		}
		
		path[pathLen] = node.data;
		pathLen++;
		
		if(node.left == null && node.right == null ) {
			printArray(path,pathLen);
		}
		else {
			print_path_recursively(node.left, path, pathLen);
			print_path_recursively(node.right, path, pathLen);
		}
	}
	
	void printArray(int[] path, int pathLen) {
		for(int i = 0; i<pathLen; i++) {
			System.out.print(path[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		a067_gfg_binary_tree_root_to_leaf_path_print tree = new a067_gfg_binary_tree_root_to_leaf_path_print();
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
		
		tree.print_paths(tree.root);
	}
	
}
