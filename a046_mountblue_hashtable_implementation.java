import java.util.Hashtable;

public class a046_mountblue_hashtable_implementation {

	public static void main(String args[]) {
		String inputs[] = {"sid","avi","avi","anshu","ani","avi","sid","anshu","sid"};
		
		int def = 1;
		
		Hashtable<String,Integer> out = new Hashtable<String,Integer>();
		
		for(int i = 0; i<inputs.length; i++) {
			
			if(out.containsKey(inputs[i])) {
				int x = out.get(inputs[i]);
				x++;
				out.put(inputs[i], x);
			}
			else {
				out.put(inputs[i], def);
				//System.out.println(inputs[i]+"\t"+out.containsKey(inputs[i]));
			}
			//System.out.println(inputs[i]+"\t"+out.contains(inputs[i]));
			
		}
		
		System.out.println(out);
	}
	
}
