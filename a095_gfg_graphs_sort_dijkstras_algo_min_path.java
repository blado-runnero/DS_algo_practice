
public class a095_gfg_graphs_sort_dijkstras_algo_min_path {
	
	static final int V = 9;
	
	static int min_distance(int dist[], Boolean spt_set[]) {
		int min = Integer.MAX_VALUE;
		int min_index = -1;
		
		for(int v = 0; v < V; v++ ) {
			if (spt_set[v] == false && dist[v]<= min) {
				min = dist[v];
				min_index = v;
			}
		}
		return min_index;
	}
	
	static void print(int dist[],int n) {
		System.out.println("Vertex\tDistance from source");
		for(int i = 0; i < dist.length; i++) {
			System.out.println(i+" \t "+dist[i]);
		}
	}
	
	static void dijkstra(int graph[][],int src) {
		int dist[] = new int[V];
		Boolean spt_set[] = new Boolean[V];
		for (int i = 0; i<V;i++) {
			dist[i] = Integer.MAX_VALUE;
			spt_set[i] = false;
		}
		dist[src] = 0;
		for(int count = 0; count<V-1; count++) {
			int u = min_distance(dist, spt_set);
			spt_set[u] = true;
			for(int v = 0; v<V; v++) {
				if (!spt_set[v] && graph[u][v]!=0 && dist[u]!=Integer.MIN_VALUE && dist[u]+graph[u][v]<dist[v] ) {
					dist[v] = dist[u] + graph[u][v];
				}
			}
		}
		print(dist,V);
	}
	
	public static void main(String[] args) {
		int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
           };
           
           dijkstra(graph, 0);

	}

}
