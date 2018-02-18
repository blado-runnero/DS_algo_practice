
public class a025_gfg_corting_radix_sort {

	static void radix_sort(int array[], int n) {
		int max = max_val(array);
		
		for (int i = 1; max/i > 0; i=i*10) {
			counting_sort(array,n,i);
		}
		
	}
	
	static void counting_sort(int array[],int n, int exp) {
		int arr_len = array.length;
		
		int output[] = new int[arr_len];
		int count[] = new int[10]; 
		for (int i = 0; i<arr_len; i++) {
			count[(array[i]/exp)%10]++;
		}
		
		for (int i = 1; i<count.length; i++) {
			count[i] += count[i-1];
		}
		
		 for (int i = n - 1; i >= 0; i--)
	        {
	            output[count[ (array[i]/exp)%10 ] - 1] = array[i];
	            count[ (array[i]/exp)%10 ]--;
	        }
		 for (int i = 0; i < n; i++) {
	            array[i] = output[i];
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
		radix_sort(array,array.length);
		System.out.println("\nArray after sorting : ");
		print_array(array);
		
	}
	
}
