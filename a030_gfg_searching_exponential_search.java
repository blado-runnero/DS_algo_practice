import java.io.IOException;

public class a030_gfg_searching_exponential_search {

	static int status = -1;
	
	static void binary_search(int[] array,int key,int start, int end) {
		
		
		int m = (start+end)/2;
		if(start<=end) {if (key == array[m]) {
			status = m;System.out.println("1");
		}
		else if (key < array[m]) {
			binary_search(array,key,start,m-1);System.out.println("2");
			

		}else {
			binary_search(array,key,m+1,end);System.out.println("3");
			
		}}
	}
	
	static void exponential_search(int[] array, int key) {
				
		if(array[0]==key) {status =0;System.out.println("4");}
		int i = 1;
		while(i<array.length && array[i]<=key) {i=i*2;}
		i=i/2;
		binary_search(array,key,i/2,i);
		
	}
	
	static int min(int a, int b) {
		if (a<b) {return a;}
		else {return b;}
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
		exponential_search(array,key);
		int search_status = status;
		System.out.println((search_status==-1)?key+" : not found":key+" : found at index "+search_status);
	}
	
}
