import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class a117_frequency_wise_print {

	public static <V> void main(String[] args) throws IOException {
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
		
		
		Iterator iter = (Iterator) map.entrySet().iterator();	
		Map.Entry entry ;
		int count = map.size();
		
		while(count-->0) {
			while(iter.ha)
		}
		
	}

}
