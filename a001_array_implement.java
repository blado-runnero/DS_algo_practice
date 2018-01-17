
public class a001_array_implement {
	
	static int len_array = 20;
	
	static void insert_array_item(int array[],int index,int value) {
		int array_len = len_array;
		
		for (int i = array_len; i>=index; i--) {
			array[i+1] = array[i];
		}
		array[index] = value;
		
	}

	static void delete_array_item(int array[],int index) {
		int array_len = len_array;
		
		for (int i = index; i<array_len; i++) {
			array[i] = array[i+1];
		}
		len_array--;
		
	}
	

	
	
	static void show_array(int array[]) {		
		for (int i = 0 ; i<=len_array; i++) 
		{
			System.out.print(array[i]+"\t");
			}
		System.out.println(" ");
	}
	
	public static void main(String args[]) {
		int array[] = new int[55];
		for (int i = 0 ; i<len_array; i++) {array[i]=i;}
		show_array(array);
		insert_array_item(array,4,110);
		show_array(array);
		delete_array_item(array,9);
		show_array(array);
	}

}
