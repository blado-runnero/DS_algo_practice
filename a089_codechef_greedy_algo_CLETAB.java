import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class a089_codechef_greedy_algo_CLETAB {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		java.io.BufferedReader reader = new java.io.BufferedReader (new java.io.InputStreamReader (System.in));
		String str;
		str = reader.readLine();
		int t = Integer.parseInt(str);
		while ( t-->0 ) {
			str = reader.readLine();
			String nm[] = str.split(" ");
			int n = Integer.parseInt(nm[0]);
			int m = Integer.parseInt(nm[1]);
			str = reader.readLine();
			int ar[] = new int[m];
			LinkedList<Integer>[] queue = new LinkedList[401];
			for(int i = 0; i<401; i++) {
				queue[i] = new LinkedList<>();
			}
			
			String ms[] = str.split(" ");
			for(int i = 0; i<m; i++) {
				ar[i] = Integer.parseInt(ms[i]);
				queue[ar[i]].add(i);
				
			}
			
			TreeSet<Integer> table = new TreeSet<>();
			int count = 0;
			for(int i = 0; i<m;i++) {
				queue[ar[i]].removeFirst();
				if (!table.contains(ar[i])) {
					count++;
					if (table.size()>=n) {
						int max = Integer.MIN_VALUE;
						int index = -1;
						for(Integer j : table) {
							if (queue[j].isEmpty()) {
								index = j;
								break;
							}
							if(queue[j].getFirst()>max) {
								index = j;
								max = queue[j].getFirst();
							}
						}
						table.remove(index);
					}
					table.add(ar[i]);
				}
			}
			
			
			System.out.print(count);
		}
	}

}
/*

for(int i=0;i<m;i++){
    queue[ar[i]].removeFirst();
    if(!table.contains(ar[i])){
      count++;
      if(table.size()>=n){
          int max=Integer.MIN_VALUE;
          int idx=-1;
          for(Integer j:table){
              if(queue[j].isEmpty()){
                  idx=j;
                  break;
              }
              if(queue[j].getFirst()>max){
                  max=queue[j].getFirst();
                  idx=j;
              }
          }
          table.remove(idx);
      }
      table.add(ar[i]);
    }     
}

*/