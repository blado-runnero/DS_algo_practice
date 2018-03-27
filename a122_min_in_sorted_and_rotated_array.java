
public class a122_min_in_sorted_and_rotated_array {

	public static void main(String[] args) {
		int input[] = {4,1};
		int x = find_min(input, 0, input.length-1);
		System.out.print(x);
	}

	private static int find_min(int[] arr, int l, int r) {
		if(r>=l+2) {
		
		int m = l+r;
		m = m / 2;
		if(arr[m] < arr[m+1] && arr[m]<arr[m-1]) {
			return arr[m];
		}
		else {
			if (arr[m] > arr[r]) {
				return find_min(arr,m,r);
			}else {
				return find_min(arr,l,m);
			}
		}
		}
		else {
			if(arr[l]<arr[r]) {
				return arr[l];
			}
			else if(arr[r]<arr[l]) {
				return arr[r];
			}
			else {return arr[l];}
			
		}
	}

}
