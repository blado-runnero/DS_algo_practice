import java.util.LinkedList;

public class a091_gfg_graphs_adjacency_representation {

	static class Graph{
		int v;
		LinkedList<Integer> adj_array[];
		Graph (int v){
			this.v = v;
			adj_array = new LinkedList[v];
			for(int i = 0; i<v; i++) {
				adj_array[i] = new LinkedList<>();
			}
		}
	}
	
	static void add_edge(Graph graph, int src, int dest) {
		graph.adj_array[src].addFirst(dest);
		graph.adj_array[dest].addFirst(src);
	}
	
	static void print_graph(Graph graph) {
		for (int i = 0; i < graph.v; i++) {
			System.out.println("Adjacency list of vertex "+ i);
			System.out.print("head");
			for (int j : graph.adj_array[i]) {
				System.out.print(" -> "+j);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v = 5;
		Graph graph = new Graph(v);
		add_edge(graph, 0, 1);
		add_edge(graph, 0, 4);
		add_edge(graph, 1, 2);
		add_edge(graph, 1, 3);
		add_edge(graph, 1, 4);
		add_edge(graph, 2, 3);
		add_edge(graph, 3, 4);
		print_graph(graph);
	}

}
