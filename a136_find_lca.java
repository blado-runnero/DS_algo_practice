
package pkg100_days_of_code;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bladeRUNNER
 */

class Node{
    int data;
    Node left, right;
    Node(int d){
        data = d;
        left = right = null;
    }
}
public class a136_find_lca {
    Node root;
    List<Integer> path1 = new ArrayList<Integer>();
    List<Integer> path2 = new ArrayList<Integer>();
    
    int find_lca(Node root, int n1, int n2){
    path1.clear();
    path2.clear();
    
    return find_lca_internal(root, n1, n2);    
    }
    
    int find_lca_internal(Node node, int n1, int n2){
        if(!find_path(path1, root, n1) ||!find_path(path2, root, n2) ){
            System.out.println((path1.size()>0)?n1+" is present":n1+" is absent");
            System.out.println((path2.size()>0)?n2+" is present":n2+" is absent");
            return -1;
        }
        int i;
        for(i =0; i < path1.size() && i < path2.size() ; i++){
            if(!path1.get(i).equals(path2.get(i))){
                break;
            }
        }
        return path1.get(i-1);
    }
    
    Boolean find_path(List<Integer> path, Node node, int n){
        if(node == null){
            return false;
        }
        path.add(node.data);
        
        if(node.data == n){
            return true;
        }
        if(root.left != null && find_path(path, node.left, n )){
            return true;
        }
        if(root.right != null && find_path(path, node.right, n )){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    
    public static void main(String[] args){
        a136_find_lca tree = new a136_find_lca();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.right = new Node(9);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(11);
        
        int out = tree.find_lca(tree.root, 9, 10);
        System.out.println((out > 0)?"lca is : "+out:"no key not found");
        
    }
}
