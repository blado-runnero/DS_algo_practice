
public class a132_binary_index_tree_tushar_roy {

	    public void updateBinaryIndexedTree(int binaryIndexedTree[], int val, int index){
	        while(index < binaryIndexedTree.length){
	            binaryIndexedTree[index] += val;
	            index = getNext(index);
	        }
	    }

	    public int getSum(int binaryIndexedTree[], int index){
	        index = index + 1;
	        int sum = 0;
	        while(index > 0){
	            sum += binaryIndexedTree[index];
	            index = getParent(index);
	        }
	        return sum;
	    }
	    
	    public int[] createTree(int input[]){
	        int binaryIndexedTree[] = new int[input.length+1];
	        for(int i=1; i <= input.length; i++){
	            updateBinaryIndexedTree(binaryIndexedTree, input[i-1], i);
	        }
	        return binaryIndexedTree;
	    }

	    private int getParent(int index){
	        return index - (index & -index);
	    }

	    private int getNext(int index){
	        return index + (index & -index);
	    }
	    
	    public static void main(String args[]){
	        int input[] = {3,2,-1,6,5,4,-3,3,7,2,3};
	        a132_binary_index_tree_tushar_roy ft = new a132_binary_index_tree_tushar_roy();
	        int binaryIndexedTree[] = ft.createTree(input);
	       /* assert 3 == ft.getSum(binaryIndexedTree, 0);
	        assert 2 == ft.getSum(binaryIndexedTree, 1);
	        assert -1 == ft.getSum(binaryIndexedTree, 2);
	        assert 6 == ft.getSum(binaryIndexedTree, 3);
	        assert 5 == ft.getSum(binaryIndexedTree, 4);
	        assert 4 == ft.getSum(binaryIndexedTree, 5);
	        assert -3 == ft.getSum(binaryIndexedTree, 6);
	        assert 3 == ft.getSum(binaryIndexedTree, 7);
	        assert 7 == ft.getSum(binaryIndexedTree, 8);
	        assert 2 == ft.getSum(binaryIndexedTree, 9); */
	        System.out.print(ft.getSum(binaryIndexedTree, 10));
	        
	    }
	
	
	
}
