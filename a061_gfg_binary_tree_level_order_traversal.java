

<<<<<<< HEAD
=======
class Node{
	int data;
	Node left, right;
	Node(int d){
		data = d;
		left = right = null;
	}
}
>>>>>>> c41480a1954afd81e5c98574f3759da5900397d4

public class a061_gfg_binary_tree_level_order_traversal {

	Node root;
	public a061_gfg_binary_tree_level_order_traversal () {
		root = null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a061_gfg_binary_tree_level_order_traversal tree = new a061_gfg_binary_tree_level_order_traversal ();
		
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);
		tree.root.left.left.right = new Node(9);
		
		System.out.println("Level order traversal :- \n");
		tree.level_order_traversal();
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
}
