
public class a106_print_path_from_root_to_leaf {
	
	static Node head;
	
	static class Node{
		int data;
		Node left, right;
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	
	
	static void print_path(Node node) {
		int path[] = new int[1000];
		print_path_recursive(node, path,0);
	}
	
	static void print_path_recursive(Node node, int[] path,int path_len) {
		if (node == null) {return;}
		path[path_len] = node.data;
		path_len++;
		
		if(node.left == null && node.right == null) {
			for (int i = 0; i<path_len; i++) {
				System.out.print(path[i]+" ");
			}
			System.out.println();
		}
		else {
			print_path_recursive(node.left , path,path_len);
			print_path_recursive(node.right, path,path_len);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		head = new Node(1);
		head.left = new Node(2);
		head.right = new Node(3);
		head.left.left = new Node(4);
		head.left.right = new Node(5);
		head.right.left = new Node(6);
		head.right.right = new Node(7);
		head.left.right.left = new Node(8);
		
		print_path(head);
	}

}
