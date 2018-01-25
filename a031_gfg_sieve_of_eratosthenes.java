import java.io.IOException;

public class a031_gfg_sieve_of_eratosthenes {

	static int[] sieve_of_eratosthenes (int[] array, int start, int end){
		int output[] = new int[array.length];
		int test[]= new int[array.length];
		int counter = 0;
		int range = end - start;
		for(int i = 0; i<range; i++) {
			if(test[i]==0) {
				output[counter]=array[i];
				counter++;
				for(int j=i;j<range; j=j+array[i]) {test[j]=1;}
			}
		}
		return output;
	}
	
	static void print_array(int[] array,String str) {
		System.out.println(str);
		for (int i = 0;  array[i]>0 ; i++ ) {
			System.out.print(array[i]+"\t");
		}
	}
	
	static int[] array_fill(int[] array,int start, int end){
		for (int i = 0; i <end-start;i++) {
			array[i]=i+start;
		}
		return array;
	}
	
	public static void main(String[] args) throws IOException {
		
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		
		
		System.out.println("Enter the range : \n From : ");
		str = reader.readLine();
		final int start = 2;
		System.out.println("\n To : ");
		str = reader.readLine();
		int end = Integer.parseInt(str);
		int[] output = new int[end-start];
		output=array_fill(output,start,end);
		output = sieve_of_eratosthenes(output,start,end);
		print_array(output,"Prime numbers between "+start+" and "+end+" are : \n");
		//output = sieve_of_eratosthene(output,start,end);
		
	}
	
}
