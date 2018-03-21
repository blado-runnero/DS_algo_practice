
public class a113_number_permutation {
	
	static public String swap(String a, int i, int j) {
		char temp ;
		char[] char_array = a.toCharArray();
		temp = char_array[i];
		char_array[i] = char_array[j];
		char_array[j] = temp;
		return String.valueOf(char_array);
	}
	
	static void permute(String str, int l, int r) {
		if(l==r) {
			System.out.println(str);
		}
		else {
			for(int i = l; i<=r; i++) {
				str = swap(str,l,i);
				permute(str,l+1,r);
				str = swap(str,l,i);
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "123";
		int n = str.length();
		permute(str,0,n-1);
	}
}
