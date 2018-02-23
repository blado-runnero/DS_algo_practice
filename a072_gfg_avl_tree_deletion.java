
public class a072_gfg_avl_tree_deletion {

	class Node{
		int data,height;
		Node left, right;
		Node (int d){
			data = d;
			left = right = null;
			height = 1;
		}
	}
	
	Node root;
	int height(Node N) {
		if (N==null) {return 0;}
		return N.height;
	}
	
	int max(int a, int b) {
		return ((a>=b)?a:b);
	}
	
	Node right_rotate(Node y) {
		Node  x = y.left;
		Node t2 = x.right;
		
		x.right = y;
		y.left = t2;
		
		y.height = max(height(y.left), height(y.right))+1;
		x.height = max(height(x.left), height(x.right))+1;
		
		return x;
	}
	
	Node left_rotate(Node x) {
		Node  y = x.right;
		Node t2 = y.left;
		
		y.left = x;
		x.right = t2;
		
		y.height = max(height(y.left), height(y.right))+1;
		x.height = max(height(x.left), height(x.right))+1;
		
		return y;
	}
	
	int get_balance(Node N) {
		if (N==null) {return 0;}
		
		return height(N.left) - height(N.right);
	}
	
	void pre_order(Node node) {
		if (node != null) {
			System.out.print(node.data+" ");
			pre_order(node.left);
			
			pre_order(node.right);
		}
		
		
	}
	
	Node insert (Node node,int key) {
		if(node == null) {return (new Node(key));}
		
		if(key < node.data) {
			node.left = insert(node.left,key);
		}
		else if(key > node.data) {
			node.right = insert(node.right, key);
		}
		else {
			return node;
		}
		
		node.height = 1 + max(height(node.left), height(node.right));
		
		int balance = get_balance(node);
		
		if (balance>1 && key<node.left.data) {
			return right_rotate(node);
		}
		if (balance < -1 && key>node.right.data) {
			return left_rotate(node);
		}
		if(balance >1 && key > node.left.data) {
			node.left = left_rotate(node.left);
			return right_rotate(node);
		}
		if(balance<-1 && key < node.right.data) {
			node.right = right_rotate(node.right);
			return left_rotate(node);
		}
		
		return node;
	}
	
	Node delete(Node root , int key) {
		if(root == null) {return null;}
		if (key<root.data) {
			root.left = delete (root.left , key);
		}
		else if (key > root.data) {
			root.right = delete (root.right , key);
		}
		else {
			if(root.left == null || root.right == null ) {
				Node temp = null;
				if (temp == root.left) {
					temp = root.right;
				}
				else {
					temp = root.left;
				}
				
				if (temp == null) {
					temp = root;
					root = null;
				}
				else {
					root = temp;
				}
			}
			else {
				Node temp = min_value_node();
				root.data = temp.data;
				root.right = delete(root.right, temp.data);
			}
		}
		
		if (root == null) {
			return root;
		}
		
		root.height = max(height(root.left), height(root.right))+1;
		
		int balance = get_balance(root);
		
		if (balance>1 && get_balance(root.left)>=0) {
			return right_rotate(root);
		}
		if (balance < -1 && get_balance(root.right)<=0) {
			return left_rotate(root);
		}
		if(balance >1 && get_balance(root.left)<0) {
			root.left = left_rotate(root.left);
			return right_rotate(root);
		}
		if(balance<-1 && get_balance(root.right)>0) {
			root.right = right_rotate(root.right);
			return left_rotate(root);
		}
		
		return root;
		
		
	}
	
	Node min_value_node() {
		Node curr = root;
		while (curr.left != null) {
			curr = curr.left;
		}
		return curr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a072_gfg_avl_tree_deletion tree = new a072_gfg_avl_tree_deletion();
		tree.root = tree.insert(tree.root, 10);
		tree.root = tree.insert(tree.root, 20);
		tree.root = tree.insert(tree.root, 30);
		tree.root = tree.insert(tree.root, 40);
		tree.root = tree.insert(tree.root, 50);
		tree.root = tree.insert(tree.root, 80);
		tree.root = tree.insert(tree.root, 110);
		tree.root = tree.insert(tree.root, 210);
		tree.root = tree.insert(tree.root, 140);
		tree.root = tree.insert(tree.root, 120);
		tree.root = tree.insert(tree.root, 710);
		
		System.out.print("Preorder traversal is :  ");
		tree.pre_order(tree.root);
		
		tree.delete(tree.root, 110);
		
		System.out.print("\n\nPreorder traversal is :  ");
		tree.pre_order(tree.root);
	}

}
