
public class a023_gfg_sorting_bucket_sort {

	static void bucket_sort(int[] array, int max) {
		int bucket[] = new int[max+1];
		for (int i = 0; i<array.length; i++) {
			bucket[array[i]]++;
		}
		int outpos = 0;
		for(int i = 0 ;  i<bucket.length ;i++) {
			for(int j = 0; j<bucket[i]; j++) {
				array[outpos++] = i;
			}
		}
		
	}
	
	static int max_val(int[] array) {
		int max_value = array[0];
		for(int i = 1; i<array.length;i++) {
			if (array[i]>max_value) {
				max_value = array[i];
			}
		}
		return max_value;
	}
	
	static void print_array(int[] array) {
		int arr_len = array.length;
		for (int i  = 0; i<arr_len; i++) {
			System.out.print(array[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1,4,3,7,2,86,12,56,233,99,7886,324,66,0,35,76,235,667,33,7,4,34,56,6,5};
		//int[] array = {5,7,6};
		System.out.println("Array Before sorting : ");
		print_array(array);
		int max = max_val(array);
		bucket_sort(array,max);
		System.out.println("\nArray after sorting : ");
		print_array(array);
		
	}
	
	
}
