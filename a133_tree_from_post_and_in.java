class Node{
	int data;
	Node left, right;
	Node(int d){
		data = d;
		left = right = null;
	}
}

class Index{
	int index;
}

public class a133_tree_from_post_and_in{

	Node build_util(int in[], int post[], int in_start, int in_end, Index p_index){
		if(in_start > in_end){
			return null;
		}
		Node node = new Node(post[p_index.index]);
		(p_index.index)--;
		if(in_start == in_end){
			return node;
		}
		int i_index = search(in, in_start, in_end, node.data);
		node.right = build_util(in, post, i_index+1,in_end,p_index);
		node.left = build_util(in, post, in_start , i_index-1,p_index);

		return node;
	}

	Node build_tree(int in[], int post[], int n){

		Index p_index = new Index();
		p_index.index = n-1;
		return build_util(in , post, 0 , n-1, p_index);
	}

static int index = 0;
	static void pre_order(Node node){
		if(node == null){
			return;
		}
		arr[index]=node.data;
		index++;
		pre_order(node.left);
		pre_order(node.right);
	}

	int search(int arr[], int start, int end, int key){
		int i;
		for(i = start; i<= end; i++){
			if(key == arr[i]){break;}
		}
		return i;
	}
	static int arr[] = new int[8];
	public static void main(String args[]){
		a133_tree_from_post_and_in tree = new a133_tree_from_post_and_in();
		int in[] = {4,8,2,5,1,6,3,7};
		int post[] = {8,4,5,2,6,7,3,1}; 
		int pre[] = {1,2,4,8,5,3,6,7};
		int n = in.length;
		Node root = tree.build_tree(in, post, n);
	
		pre_order(root);
		Boolean status = true;
		for(int i = 0; i < n; i++){
			if(arr[i] != pre[i]){status = false;}
			System.out.println(arr[i]+"-"+pre[i]);
		}
		System.out.print(status);
	}
}
