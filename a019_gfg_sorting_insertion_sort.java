
public class a019_gfg_sorting_insertion_sort {

	static void insert_sort(int[] array) {
		int arr_len = array.length;
		for (int i = 1 ; i<arr_len; i++) {
			int key = array[i];
			int j = i-1;
			while( j>=0 && array[j]>key ) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
	}
	
	static void print_array(int[] array) {
		int arr_len = array.length;
		for (int i  = 0; i<arr_len; i++) {
			System.out.print(array[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1,4,3,7,2,86,12,56,233,7886,324,66,35,76,235,667,33,7,4,34,56,6,5};
		//int[] array = {5,7,6};
		System.out.println("Array Before sorting : ");
		print_array(array);
		insert_sort(array);
		System.out.println("\nArray after sorting : ");
		print_array(array);
		
	}
	
}
