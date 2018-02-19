
public class a070_gfg_binary_search_tree {

	
	
	Node root;
	a070_gfg_binary_search_tree(){
		root = null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a070_gfg_binary_search_tree tree = new a070_gfg_binary_search_tree();
		tree.root = new Node(4);
		tree.root.left = new Node(2);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(3);
		
		if(tree.is_bst()) {
			System.out.print("Tree is BST.");
		}else {
			System.out.print("Tree is not a BST. ");
		}
		
	}

	private boolean is_bst() {
		// TODO Auto-generated method stub
		
		return bst_util(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean bst_util(Node node, int min, int max) {
		// TODO Auto-generated method stub
		if (node==null) {
			return true;
		}
		
		if(node.data<min || node.data>max) {
			return false;
		}
		
		
		return (bst_util(node.left, min, node.data-1) && bst_util(node.right, node.data+1, max));
	}

}
