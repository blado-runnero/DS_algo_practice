
public class a097_gfg_graphs_prims_mst_algo {
	
	private static final int v = 5;
	
	static int min_key(int key[], Boolean mst_set[]) {
		int min = Integer.MAX_VALUE; 
		int min_key = -1;
		
		for (int i = 0; i<key.length; i++) {
			if (mst_set[i] == false && key[i]<min) {
				min = key[i];
				min_key = i;
			}
		}
		return min_key;
	}
	
	static void prims_algo(int graph[][]) {
		int parent[] = new int[v];
		int key[] = new int [v];
		Boolean mst_set[] = new Boolean[v];
		for(int i = 0; i<v; i++) {
			key[i] = Integer.MAX_VALUE;
			mst_set[i] = false;
		}
		key[0] = 0;
		parent[0] = -1;
		for (int count = 0; count <v-1; count++) {
			int u = min_key(key, mst_set);
			mst_set[u] = true;
			for(int i=0; i<v; i++) {
				if(graph[u][i] != 0 && mst_set[i] == false && graph[u][i] < key[i]) {
					parent[i] = u;
					key[i] = graph[u][i];
				}
			}
		}
		print_mst(parent, v , graph);
	}
	
	static void print_mst(int[] parent, int v, int[][] graph) {
		System.out.println("Edge\tWeight");
		for(int i = 1; i<v;i++) {
			System.out.println(parent[i]+" - "+i+"   "+graph[i][parent[i]] );
		}
	}
	
	public static void main(String[] args) {
		 int graph[][] = new int[][] {{0, 2, 0, 6, 0},
             {2, 0, 3, 8, 5},
             {0, 3, 0, 0, 7},
             {6, 8, 0, 0, 9},
             {0, 5, 7, 9, 0},
            };
            
            
          prims_algo(graph);
	}

}
