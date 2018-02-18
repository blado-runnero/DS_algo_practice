import java.io.IOException;

public class a028_gfg_searching_jump_search {

	static int status = -1;
	static int statuss = 0;
	
	static void jump_search(int[] array,int key ) {
		int jump = (int) Math.sqrt(array.length);
		int n = array.length;
		for (int i = 0 ; i< n; ) {
			if (statuss== 0) {
				if(array[i]==key) {status = i; break;}
				
				else if(array[i] < key){
					if (i+jump < array.length) {
						i=i+jump;
					}
						else 
							{
								i++;
							}
				

						continue;
				}
				else if(array[i] > key) {
					i=i-jump+1;
					}
				}
			
			else {			
				if(array[i]==key) {status = i;}
				i++;
				}	
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
		jump_search(array,key);
		int search_status = status;
		System.out.println((search_status==-1)?key+" : not found":key+" : found at index "+search_status);
	}

	
}
