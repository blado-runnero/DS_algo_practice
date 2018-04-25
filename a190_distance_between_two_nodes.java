/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package new_package;

import java.util.ArrayList;

/**
 *
 * @author bladeRUNNER
 */
public class a190_distance_between_two_nodes {
    static Node root;

    static class Node{
        int data;
        Node left, right;
        Node(int d){
            data = d;
            left = right = null;
        }
    }
    
    void insert_in_tree(int x){
        root = insert_in_tree_recursive(x,root);
    }
    
    Node insert_in_tree_recursive(int x,Node node){
        if(node == null){
            node = new Node(x);
            return node;
        }
        if(x<node.data){
            node.left = insert_in_tree_recursive(x,node.left);
        }
        else if(x>node.data){
            node.right = insert_in_tree_recursive(x,node.right);
        }
        return node;
    }
    
    static ArrayList<Integer> path1 = new ArrayList<>(); 
    static ArrayList<Integer> path2 = new ArrayList<>(); 
    
    static Boolean find_path(int n,ArrayList<Integer> path, Node node){
        if(node == null){return false;}
        path.add(node.data);
        if(node.data == n){return true;}
        if(node.left != null && find_path(n,path,node.left)){return true;}
        if(node.right != null && find_path(n,path,node.right)){return true;}
        path.remove(path.size()-1);
        return false;
    }
    
    private static void find_distance_between(int n1, int n2) {
            find_path(n1,path1,root);
            find_path(n2,path2,root);
            System.out.print(path1+"\t"+path1.size());
            System.out.print(path2+"\t"+path2.size());
            int j = 0;
            int min = Math.min(path1.size(), path2.size());
            while(min!=0 && path1.get(0)==path2.get(0) ){   
                path1.remove(0); 
                path2.remove(0); 
                min =Math.min(path1.size(), path2.size());
                System.out.println("\n"+path1+"\n"+path2);
            }
            
           // System.out.println("\n"+path1+"\n"+path2);
            int dist = path1.size() + path2.size() ;
            
            System.out.print("distance between "+n1+" and "+n2+" is "+dist);
    }
    
    public static void main(String args[]){
        a190_distance_between_two_nodes tree = new a190_distance_between_two_nodes();
        tree.insert_in_tree(100);
        tree.insert_in_tree(90);
        tree.insert_in_tree(110);
        tree.insert_in_tree(80);
        tree.insert_in_tree(50);
        tree.insert_in_tree(85);
        tree.insert_in_tree(95);
        tree.insert_in_tree(93);
        tree.insert_in_tree(97);
        tree.insert_in_tree(105);
        tree.insert_in_tree(150);
        tree.insert_in_tree(101);
        tree.insert_in_tree(107);
        tree.insert_in_tree(130);
        tree.insert_in_tree(170);
        
        find_distance_between(50,100);
        System.out.println();
    }
}
