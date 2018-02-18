import java.io.IOException;

public class a026_gfg_searching_linear_search {

	
	
	static int linear_search(int[] array, int key) {
		int status = -1;
		
		for (int i = 0; i<array.length; i++) {
			if (key == array[i]) {
				return i;
			}
		}
		
		return -1;
	}
	
	
	static void print_array(int[] array,String str) {

		System.out.println(str);
		for (int i = 0; i < array.length ; i++ ) {
			System.out.print(array[i]+"\t");
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		
		
		int[] array = {23,1,6,3,78,45,2,56,2,90,65,34,16,32,67};
		print_array(array,"Array to be searched : \n");
		System.out.println("\n\nEnter the query to be searched : ");
		str = reader.readLine();
		int key = Integer.parseInt(str);
		int search_status = linear_search(array,key);
		System.out.println((search_status==-1)?key+" : not found":key+" : found at index "+search_status);
	}
	
}
