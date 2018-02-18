
public class a020_gfg_sorting_merge_sort {

	static void merge_sort(int array[],int l,int r) {
		if (l<r) {
			int m = (l+r) / 2 ;
			merge_sort(array,l,m);
			merge_sort(array,m+1,r);
			merge(array,l,m,r);
		}
	}
	
	static void merge(int[] array, int l, int m, int r) {
		int i,j,k;
		int n1 = m-l+1;
		int n2 = r-m;
		
		int L[] = new int[n1],R[] = new int[n2];
		
		for(int ii=0; ii<n1; ii++) {
			L[ii]=array[ii+l];
		}
		for(int ii=0; ii<n2; ii++) {
			R[ii]=array[ii+m+1];
		}
		
		i=0; j=0; k=l;
		while(i<n1 && j<n2) {
			if(L[i] <= R[j]) {
				array[k] = L[i]; i++;
			}else {
				array[k] = R[j]; j++;
			}
			k++;
		}
		
		while(i<n1) {
			array[k] = L[i]; k++; i++;
		}
		
		while(j<n2) {
			array[k] = R[j]; k++; j++;
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
		merge_sort(array,0,array.length-1);
		System.out.println("\nArray after sorting : ");
		print_array(array);
		
	}
	
}
