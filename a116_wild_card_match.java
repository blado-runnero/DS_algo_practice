
public class a116_wild_card_match {

	public static boolean wild_match(String text, String pattern) {
		
		int len_text = text.length();
		int len_pattern = pattern.length();
		if(len_text == 0 && len_pattern == 0) {
			return true;
		}
		int i =0, j =0;
		int start_text = -1, start_pattern = -1;
		while(i<len_text) {
			if(j<len_text && (text.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '?')) {
				i++;
				j++;
			}
			else if(j <len_pattern && pattern.charAt(j) == '*') {
				while(j <len_pattern && pattern.charAt(j) == '*') {
					j++;
				}
				if(j == len_pattern) {
					return true;
				}
				start_pattern = j;
				start_text = i;
			}
			else if(j>= len_pattern || text.charAt(i) != pattern.charAt(j) && start_pattern > -1) {
				start_text++;
				j = start_pattern;
				i = start_text;
			}
			else {
				return false;
			}
		}
		
		while(j < len_pattern) {
			if(pattern.charAt(j) != '*') {
				return false;
			}
			j++;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aab";
		String sttr = "*??";
		
		System.out.println(wild_match(str,sttr)+"");
	}

}
