import java.util.Stack;

public class a068_gfg_binary_search_tree_insertion {
	class Node {
		int data ;
		Node left, right;
		Node(int d ){
			data = d;
			left = right = null;
			
		}
	}	
	Node root;
		
	a068_gfg_binary_search_tree_insertion(){
		root = null;
	}
		
	void insert(int key) {
		root = insert_rec(root, key);
	}
	
	Node insert_rec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.data) {
			root.left = insert_rec(root.left, key);
		}
		else if (key > root.data) {
			root.right = insert_rec(root.right, key);
		}
		
		return root;
		
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a068_gfg_binary_search_tree_insertion tree = new a068_gfg_binary_search_tree_insertion();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(400);
		tree.insert(50);
		tree.insert(360);
		tree.insert(70);
		tree.insert(80);
		tree.insert(90);
		tree.insert(100);
		
		tree.inorder();
		
	}

}
