// This is for left rotation of array elements

public class a002_cyclic_rotation_optimized {
	
	static void rotate_by_value(int array[],int index) {
		reverse_array(array,0,index);
		reverse_array(array,index+1,array.length-1);
		reverse_array(array,0,array.length-1);
	}
	
	static void reverse_array(int array[],int start,int end) {
		int temp;
		while(start<end) {
			temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
			
		}
	}
	
	static void show_array(int array[], String str) {
	
		System.out.println(str+"\n");
		
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i]+"\t");
		}
		System.out.println("\n");
		
	}
	
	public static void main(String args[]) {
		int array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		show_array(array,"Before rotation the array is:- ");
		rotate_by_value(array,2);
		show_array(array,"After rotation the array is:- ");
	}

	
}
