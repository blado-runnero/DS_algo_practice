
public class a118_merger_sort_revise {

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
		}
		
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
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
		int to_sort[] = {1,5,5,58,8,24,8,6,1,8,5,2,4,8,6,65,65,86,68,654,984,65,468,468468,684,84,6,48,8,9,4,94,9,4,9};
		print(to_sort,"\nBefore sorting :- ");
		sort(to_sort, 0,to_sort.length-1);
		print(to_sort,"\nAfter sorting :- ");
	}
	
	}
