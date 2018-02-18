import java.io.IOException;

public class a029_gfg_searching_interpolation_search {

	static int status = -1;
	
	static void interpolation_search(int array[],int key) {
		int start = 0; int end = array.length-1;
		while (start<=end) {
			int pos = start + ((end-start)*(key-array[start])/(array[end]-array[start]));
			if (pos<=end) {
				if(array[pos]==key) {status = pos; break;}
				else if (array[pos]>key){end = pos-1;}
				else {start = pos + 1;}
			}
			else {break;}
		}
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
		int[] array = {1,2,3,4,5,6,7,8,9};
		print_array(array,"Array to be searched : \n");
		System.out.println("\n\nEnter the query to be searched : ");
		str = reader.readLine();
		int key = Integer.parseInt(str);
		interpolation_search(array,key);
		int search_status = status;
		System.out.println((search_status==-1)?key+" : not found":key+" : found at index "+search_status);
	}
	
}
