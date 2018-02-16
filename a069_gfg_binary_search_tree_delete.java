/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class a069_gfg_binary_search_tree_delete
{
	class Node{
		int data;
		Node left , right;
		Node(int d ){
			data = d;
			left = right = null;
		}
	}
	
	Node root;
	
	a069_gfg_binary_search_tree_delete(){
		root = null;
	}
	
	void delete_key(int key){
		root = delete_recursive(root, key);
	}
	
	Node delete_recursive(Node root, int key){
		if (root == null){
			return root;
		}
		
		if (key < root.data){
			root.left = delete_recursive(root.left, key);
		}
		else if (key > root.data){
			root.right = delete_recursive(root.right, key);
		}
		else{
			if (root.left == null ){
				return root.right;
			}
			else if (root.right == null){
				return root.right;
			}
			root.data = min_value(root.right);
			
			root.right = delete_recursive(root.right, root.data);
		}
		
		return root;
	}
	
	int min_value(Node root){
		int minv = root.data;
		while(root.left != null){
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}
	
	void insert (int key){
		root = insert_recursive(root, key);
	}
	
	Node insert_recursive(Node root, int key){
		if(root == null){
			root = new Node (key);
			return root;
		}
		
		if (key < root.data){
			root.left = insert_recursive(root.left, key);
		}
		else if (key> root.data){
			root.right = insert_recursive(root.right , key);
		}
		return root;
	}
	
	void inorder(){
		inorder_recursive(root);
	}
	
	void inorder_recursive(Node root){
		if (root!= null){
			inorder_recursive(root.left);
			System.out.print(root.data+" ");
			inorder_recursive(root.right);
		}
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		a069_gfg_binary_search_tree_delete tree = new a069_gfg_binary_search_tree_delete();
		
		tree.insert(5065);
		tree.insert(70324);
		tree.insert(3032);
		tree.insert(501);
		tree.insert(570);
		tree.insert(150);
		tree.insert(530);
		tree.insert(540);
		tree.insert(5320);
		tree.insert(5430);
		tree.insert(5760);
		tree.insert(5900);
		System.out.println("Inorder traversal : \n");
		tree.inorder();
		System.out.println("\nDeleting key 501 : \n");
		tree.delete_key(501);
		System.out.println("\nInorder after deleting 501 is : \n");
		tree.inorder();
		System.out.println("\nDeleting key 540 : \n");
		tree.delete_key(540);
		System.out.println("\nInorder after deleting 540 is : \n");
		tree.inorder();
		
	}
}