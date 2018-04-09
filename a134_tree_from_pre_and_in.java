class Node{
	int data;
	Node left, right;
	Node(int d){
		data = d;
		left = right = null;
	}
}



public class a134_tree_from_pre_and_in{
	Node root;
	static int pre_index = 0; 
	

	Node build_tree(int in[], int pre[], int in_start, int in_end){

		
		if(in_start > in_end){
			return null;
		}
		Node node = new Node(pre[pre_index++]);
		if(in_start == in_end){
			return node;
		}
		int i_index = search(in, in_start, in_end, node.data);
	    node.left = build_tree(in, pre, in_start , i_index-1);
		node.right = build_tree(in, pre, i_index+1,in_end);
		

		return node;
	}


	void in_order(Node node){
		if(node == null){
			return;
		}
		
		in_order(node.left);
		System.out.print(node.data+ " ");
		in_order(node.right);
	}

	int search(int arr[], int start, int end, int key){
		int i;
		for(i = start; i<= end; i++){
			if(key == arr[i]){break;}
		}
		return i;
	}

	public static void main(String args[]){
		a134_tree_from_pre_and_in tree = new a134_tree_from_pre_and_in();
		int in[] =  {4,2,5,1,6,3};
		int pre[] = {1,2,4,5,3,6}; 
		int n = in.length;
		Node root = tree.build_tree(in, pre, 0,n-1);
		System.out.println("Inorder of constructed tree : ");
		tree.in_order(root);
	}
}
