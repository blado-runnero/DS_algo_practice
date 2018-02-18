
public class a024_gfg_sorting_counting_sort {
	
	static void counting_sort(char array[]) {
		int arr_len = array.length;
		
		char output[] = new char[arr_len];
		int count[] = new int[256]; 
		for (int i = 0; i<arr_len; ++i) {
			++count[array[i]];
		}
		
		for (int i = 1; i<count.length; ++i) {
			count[i] += count[i-1];
		}
		
		for (int i = 0; i<arr_len; ++i) {
			output[count[array[i]]-1] = array[i];
			System.out.println(count[array[i]]-1);
			--count[array[i]];
		}
		
		for(int i = 0; i<arr_len; ++i) {
			array[i]=output[i];
		}
		
	}

	public static void main(String[] args) {
		char array[] = {'a','s','d','f','e','j','x','f','q','k','c','5','v','w','b','v','n','r','e','z','d','t','u','n','m'};
		
		System.out.println("Before Sorting: \n");
		for(int i = 0; i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
		
		counting_sort(array);
	
		System.out.println("\n\nAfter Sorting: \n");
		
		//Print array
		for(int i = 0; i<array.length;i++) {
			System.out.print(array[i]+"\t");
		}
		
	}
	
}
