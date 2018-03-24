import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class a117_frequency_wise_print {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] sttr = str.split(" ");
		int num[] = new int[sttr.length];
		int n = sttr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i< n; i++) {
			int x = Integer.parseInt(sttr[i]);
			num[i] = x;
			
			if(!map.containsKey(x)) {
				map.put(x, 1);
			}else {
				int y = map.get(x);
				y++;
				map.put(x, y);
			}
		}
		int c = 0;
		int out[] = new int[n];
		int cur = 0;
		int key = 0;
		int max = 0;
		int count = map.size();
		
		while(count-->0) {
			
			Set entry = map.entrySet();
			Iterator it = entry.iterator();
			
			while(it.hasNext()) {
				 Map.Entry me = (Map.Entry) it.next();
				
				 int k = (int) me.getKey();
				 int v = (int) me.getValue();
				 if(v>max) {
					max = v;
					key = k;
				}
				 if(v==max&& key<k) {
					 key = k;
				 }
				 
				 //System.out.println(k);
				
			}
			
			 for(int i =0; i<max && c<n;i++) {
				 out[c] = key;
				 //System.out.println(key);
				 c++;
			 }
			 max = 0;
			 map.remove(key);
		
		}
		
		for(int i = 0; i<n; i++) {
			System.out.print(out[i] +" " );
		}
		
	}

}
