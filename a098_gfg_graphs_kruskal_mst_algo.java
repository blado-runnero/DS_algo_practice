import java.util.Arrays;

public class a098_gfg_graphs_kruskal_mst_algo {
	
	class Edge implements Comparable<Edge>{
		int src , dest, weight;
		public int compareTo(Edge arg0) {
			return this.weight-arg0.weight;
		}
	}
	
	class subset {
		int parent, rank;
	}
	
	int v,e;
	Edge edge[];
	
	a098_gfg_graphs_kruskal_mst_algo(int vv, int ee){
		v=vv;
		e=ee;
		edge = new Edge[e];
		for(int i = 0; i<e; i++) {
			edge[i] = new Edge();
		}
	}
	
	int find(subset subsets[], int i) {
		if(subsets[i].parent != i) {
			subsets[i].parent = find(subsets, subsets[i].parent);
		}
		return subsets[i].parent;
	}
	
	void union(subset subsets[],int x, int y ) {
		int xroot = find(subsets,x);
		int yroot = find(subsets,y);
		if(subsets[xroot].rank < subsets[yroot].rank) {
			subsets[xroot].parent = yroot;
		}else if(subsets[xroot].rank > subsets[yroot].rank) {
			subsets[yroot].parent = xroot;
		}else {	
			subsets[yroot].parent = xroot;
			subsets[xroot].rank++;
		}
	}
	
	void kruskal_algo() {
		Edge result[] = new Edge[v];
		int e = 0;
		int i = 0;
		for(i=0; i<v;i++) {
			result[i] = new Edge();
		}
		Arrays.sort(edge);
		subset subsets[] = new subset[v];
		for(i =0; i<v; i++) {
			subsets[i] = new subset();
		}
		for(i=0; i<v; i++) {
			subsets[i].parent = i;
			subsets[i].rank = 0;
		}
		i=0;
		while(e<v-1) {
			Edge next_edge = new Edge();
			next_edge = edge[i++];
			
			int x = find(subsets, next_edge.src);
			int y = find(subsets, next_edge.dest);
			
			if(x!= y) {
				result[e++] = next_edge;
				union(subsets, x, y);
			}
		}
		System.out.println("Following are the constructed edge in MST");
		for(i=0; i<e;i++) {
			System.out.println(result[i].src+" -- " + result[i].dest+" == " + result[i].weight);
		}
	
	}
	
	public static void main(String[] args) {
		 int V = 4;  // Number of vertices in graph
	        int E = 5;  // Number of edges in graph
	        a098_gfg_graphs_kruskal_mst_algo graph = new a098_gfg_graphs_kruskal_mst_algo(V, E);
	 
	        // add edge 0-1
	        graph.edge[0].src = 0;
	        graph.edge[0].dest = 1;
	        graph.edge[0].weight = 10;
	 
	        // add edge 0-2
	        graph.edge[1].src = 0;
	        graph.edge[1].dest = 2;
	        graph.edge[1].weight = 6;
	 
	        // add edge 0-3
	        graph.edge[2].src = 0;
	        graph.edge[2].dest = 3;
	        graph.edge[2].weight = 5;
	 
	        // add edge 1-3
	        graph.edge[3].src = 1;
	        graph.edge[3].dest = 3;
	        graph.edge[3].weight = 15;
	 
	        // add edge 2-3
	        graph.edge[4].src = 2;
	        graph.edge[4].dest = 3;
	        graph.edge[4].weight = 4;
	 
	        graph.kruskal_algo();

	}

}
