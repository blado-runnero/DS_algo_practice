
public class a112_number_combi {

	static public void combi(int arr[], int data[],int start, int end, int index, int r ) {
		if(index == r) {
			for(int j = 0; j<r;j++) {
				System.out.print(data[j] + " ");
			}
			System.out.println();
			return;
		}
		for(int i = start; i<=end && end-i+1>=r-index; i++) {
			data[index] = arr[i];
			combi(arr,data,i+1,end, index+1,r);
		}
	}
	
	static public void print_combi(int[] arr, int n , int r) {
		int data[] = new int[r];
		combi(arr,data,0,n-1,0,r);
	}
	
	public static void main(String args[]) {
		int num[] = {1,2,3,4,5};
		int r = 4;
		int n = num.length;
		print_combi(num,n,r);
	}
	
}
