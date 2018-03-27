
public class a120_binary_search_revisited {

	static int binary_search(int[] arr, int l, int r,int key) {
		
		if(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid] == key) {
				return mid;
			}
			else if(key<arr[mid]) {
				return binary_search(arr, l, mid-1, key);
			}
			else {
				return binary_search(arr, mid+1, r, key);
			}
		}
		
		
		
		return -1;
	}
	
	public static void main(String args[]) {
		int[] arr = {1,4,6,8,10,45,67,90,123,179,246,345,678,1234,4555,6777,12355};
		int n = arr.length;
		int status = binary_search(arr,0,n-1,10);
		System.out.print(status);
	}
}
