
public class a111_trie_from_book {
	
	static class Trie{
		private static final int ALPHABETS = 26;
		private Trie[] links;
		private boolean is_end_of_string;
		public Trie() {
			links = new Trie[ALPHABETS];
			is_end_of_string = false;
		}
		
		 void add(String s) {
			Trie t = this;
			int k;
			int limit = s.length();
			for(k = 0; k<limit; k++) {
				int index = s.charAt(k) - 'a';
				if(t.links[index] == null) {
					t.links[index] = new Trie();
				}
				t = t.links[index];
			}
			t.is_end_of_string = true;
		}
		 
		 void print(String s , Trie t) {
			 if(t!=null) {
				 if(t.is_end_of_string) {
					 System.out.println(s);
				 }
				 int k ;
				 for(k=0; k<ALPHABETS; k++) {
					 if(t.links[k]!=null) {
						 print(s+(char) (k+'a'),t.links[k]);
					 }
				 }
			 }
		 }
		 
		 boolean is_end_of_string(String s) {
			 Trie t = this;
			 int k;
			 int limit = s.length();
			 for(k=0; k<limit; k++) {
				 int index = s.charAt(k)-'a';
				 if(t.links[index] == null) {
					 //System.out.println("why");
					 return false;
					
				 }
				 t = t.links[index];
			 }
			 return t.is_end_of_string;
		 }
		 
		 boolean is_end_of_string() {
			 return is_end_of_string;
		 }
		 
		 Trie child_at(char c) {
			 return links[c-'a'];
		 }
		 
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		
		t.add("car");
		t.add("care");
		t.add("caree");
		t.add("career");
		t.add("careerm");//
		t.add("careermonk");

		t.print("", t);
		
		//System.out.println("is cartoon included? "+ t.is_end_of_string("cartoon"));
		//System.out.println("is career included? "+ t.is_end_of_string("career"));
	
	}

}
