import java.io.IOException;

public class a041_palindrome_detection_regular_expression {

	public static boolean pali(String testMe){
		return testMe.matches("|(?:(.)(?<=(?=^.*?(\\1\\2?)$).*))+(?<=(?=^\\2$).*)");
	}
	
	public static void main(String[] args) throws IOException {
		
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str,pat;
		System.out.println("Enter the string to detect palindrome : ");
		str = reader.readLine();
		boolean is_palindrome = pali(str);
		System.out.println("Is "+str+" boolean ? "+is_palindrome);
		
	}
	
}
