
public class a110_trie_data_structure {

	static final int ALPHABET_SIZE = 26;
	
	static class Trie{
		Trie children[] = new Trie[ALPHABET_SIZE];
		Boolean is_end_of_word;
		Trie() {
			is_end_of_word = false;
			for(int i = 0; i < ALPHABET_SIZE; i++) {
				children[i] = null;
			}
		}
	}
	
	static Trie root;
	
	static void insert(String key) {
		int level;
		int length = key.length();
		int index;
		Trie pcrawl = root;
		for(level = 0; level<length; level++){
			index = key.charAt(level) - 'a';
			if(pcrawl.children[index] == null) {
				pcrawl.children[index] = new Trie();
			}
			pcrawl = pcrawl.children[index];
		}
		pcrawl.is_end_of_word = true;
	}
	
	static boolean search(String key) {
		int level;
		int length = key.length();
		int index;
		Trie pcrawl = root;
		for(level = 0; level<length; level++){
			index = key.charAt(level) - 'a';
			if(pcrawl.children[index] == null) {
				return false;
			}
			pcrawl = pcrawl.children[index];
		}
		return (pcrawl != null && pcrawl.is_end_of_word);
	}
	
	static void display() {
		int level;
		char[] str = new char[20];
		Trie pcrawl = root;
		
		if(is_leaf(pcrawl)) {
			//str[level] = '\0';
		}
		
	}
	
	static boolean is_leaf(Trie node) {
		return node.is_end_of_word!= false;
	}
	
	public static void main(String[] args) {
		String keys[] = {"anshu","man","is","a","the","there","their","are"};
		String[] output = {"Not present in Trie","Present in Trie"};
		root = new Trie();
		for(int i = 0; i <keys.length; i++) {
			insert(keys[i]);
		}
		
		  if(search("anshu") == true)
	            System.out.println("anshu --- " + output[1]);
	        else System.out.println("anshu --- " + output[0]);
	         
	        if(search("these") == true)
	            System.out.println("these --- " + output[1]);
	        else System.out.println("these --- " + output[0]);
	         
	        if(search("their") == true)
	            System.out.println("their --- " + output[1]);
	        else System.out.println("their --- " + output[0]);
	         
	        if(search("thaw") == true)
	            System.out.println("thaw --- " + output[1]);
	        else System.out.println("thaw --- " + output[0]);
	        
		
	}
	
}
