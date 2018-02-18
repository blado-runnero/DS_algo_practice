
public class a022_gfg_sorting_heap_sort {

	static void heap_sort(int[] array) {
		int arr_len = array.length;
		for (int i = (arr_len/2)-1; i>=0; i--) {
			heapify(array,arr_len,i);
		}
		for(int i=arr_len-1;i>=0;i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			heapify(array,i,0);
		}
	}
	
	static void heapify(int array[], int n, int i) {
			int largest = i;
			int l = 2*i + 1;
			int r = 2*i + 2;
			
			if (l < n && array[l] > array[largest]) {
				largest = l;
			}
			if (r < n && array[r] > array[largest]) {
				largest = r;
			}
			if (largest != i) {
				int swap = array[i];
				array[i] = array[largest];
				array[largest] = swap;
				heapify(array,n,largest);
			}
			
			
	}
	
	static void print_array(int[] array) {
		int arr_len = array.length;
		for (int i  = 0; i<arr_len; i++) {
			System.out.print(array[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1,4,3,7,2,86,12,56,233,7886,324,66,0,35,76,235,667,33,7,4,34,56,6,5};
		//int[] array = {5,7,6};
		System.out.println("Array Before sorting : ");
		print_array(array);
		heap_sort(array);
		System.out.println("\nArray after sorting : ");
		print_array(array);
		
	}
	
}
