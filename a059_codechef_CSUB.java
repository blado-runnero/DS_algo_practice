import java.io.IOException;

public class a059_codechef_CSUB {

	public static void main(String[] args) throws IOException {
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		str = reader.readLine();
		int t = Integer.parseInt(str);
		while(--t>=0) {
			str = reader.readLine();
			int n = Integer.parseInt(str);
			str = reader.readLine();
<<<<<<< HEAD
	        str=str.replace("0","");
			long count = str.length();
			count = count++ * (count)/2;
			System.out.println(count);
			
		}
	}
	
}
			
=======
			String ns[] = str.split("");
			int count = 0;
			for (int i = 0 ; i < ns.length; i++) {
				String s = ns[i];
				//System.out.println("1"+s);
				if (s.equals("1")) {
					count++;
					for (int j = i+1 ; j < ns.length; j++) {
						if (ns[j].equals(s)) {
							//System.out.println(count);
							count++;
						}
					}
				}
			}
			
			System.out.println(count);
		}
	}

}
>>>>>>> c41480a1954afd81e5c98574f3759da5900397d4
