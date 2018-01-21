
public class a018_gfg_strings_reverse_recursion {

	static void reverse(String str) {
		int str_len = str.length();
		
		if (str == null || str_len <= 1) {
			System.out.print(str);
		}
		else {
			System.out.print(str.charAt(str_len-1));
			reverse(str.substring(0,str_len-1));
		}
		
	}

	public static void main(String[] args) {
		String str = "Hello i am a string";
		System.out.println("Original : " + str);
		System.out.print("Reversed : ");
		reverse(str);
		
	}
}
