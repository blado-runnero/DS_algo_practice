
public class a123_count_inversions {

	static int inv_count = 0;
	
	static void sort(int[] arr, int l, int r) {
		if(l<r) {
			int m = l+r;
			m = m/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			merge(arr, l,m,r);
		}
	}
	
	static void merge(int[] arr, int l, int m, int r) {
		int i = 0, j = 0;
		int k = l;
		int n1 = m-l+1;
		int n2 = r-m;
		int[] L = new int[n1];
		int[] R = new int[n2];
		int x = l+r;
		x = x / 2;
		for(int p = 0; p<n1; p++) {
			L[p] = arr[p+l];
		}
		
		for(int p = 0; p<n2; p++) {
			R[p] = arr[p+m+1];
		}
		
		while(i<n1 && j<n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
				k++;
				
			}
			else {
				arr[k] = R[j];
				j++;
				k++;
			}
			
			inv_count = inv_count + (x-i); 
			
		}
		
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
			//inv_count = inv_count + (x-i); 
			//inv_count = inv_count + (x-i);
		}
		while(j<n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		
		
	}
	
	static void print(int arr[] , String str) {
		System.out.println(str);
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	
	public static void main(String args[]) {
		int to_sort[] = {1,20,6,4,5};
		print(to_sort,"\nBefore sorting :- ");
		sort(to_sort, 0,to_sort.length-1);
		print(to_sort,"\nAfter sorting :- ");
		System.out.println("\n\nIversion count = "+inv_count);
	}
	
	}
