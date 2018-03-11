import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class a100_amazon_find_k_most_frequent_elements {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println(" : ");
		String str = br.readLine();
		String input[] = str.split(" ");
		str = br.readLine();
		int k = Integer.parseInt(str);
		
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int temp = 0; 
		for(int i = 0; i < input.length; i++) {
			temp = Integer.parseInt(input[i]);
			if (map.containsKey(temp)) {
				int value = map.get(temp);
				value++;
				map.put(temp, value);
			}
			else {
				map.put(temp, 1);
			}
		}
		
		System.out.print(map);
		for(int i = 0; i<k ; i++) {
			int maxk = 0, maxv=0; 
			java.util.Iterator<Entry<Integer, Integer>> it =  map.entrySet().iterator();
			while(it.hasNext()) {
				Map.Entry entry = it.next();
				int value = (int) entry.getValue();
				int key = (int) entry.getKey();
				if (value>maxv) {
					maxv = value;
					maxk = key;
				}
			}
			System.out.println(maxk);
			map.remove(maxk);
			
		}
		
		
	}

}
