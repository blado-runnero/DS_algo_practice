
public class a021_gfg_sorting_quick_sort {

	static int partition(int[] array, int l, int h) {
		int p = array[h];
		int i = l-1;
		for(int j=l; j<h;j++) {
			if (array[j]<=p) {
				i++;
				
				int temp = array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		
		int temp = array[i+1];
		array[i+1]=array[h];
		array[h]=temp;
		return i+1;
	}
	
	static void quick_sort(int[] array, int l, int h) {
		if (l<h) {
			int p = partition(array, l,h);
			
			quick_sort(array,l,p-1);
			quick_sort(array,p+1,h);
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
		quick_sort(array,0,array.length-1);
		System.out.println("\nArray after sorting : ");
		print_array(array);
		
	}
	
}
