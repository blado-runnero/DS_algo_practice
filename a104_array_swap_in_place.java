
public class a104_array_swap_in_place {

	static void swap(int[] arr,int a , int b) {
		int x = arr[a];
		arr[a] = arr[b];
		arr[b] = x;
	}
	
	static void print(int arr[],String s) {
		System.out.println(""+s);
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9}; 
		int f = 0; 
		int b = arr.length-1;
		print(arr,"Before : \n");
		for (int i = 0; i < arr.length; i++ ) {
			if(f<b) {
				swap(arr,f,b);
				f++;
				b--;
			}else {
				break;
			}			
		}
		
		print(arr,"\n\nAfter : \n");
	}

}
