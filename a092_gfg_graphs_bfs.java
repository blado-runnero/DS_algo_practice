import java.util.Iterator;
import java.util.LinkedList;

public class a092_gfg_graphs_bfs {

	static class Graph{
		int v;
		LinkedList<Integer> adj[];
		Graph(int v){
			this.v = v;
			adj = new LinkedList[v];
			for (int i = 0; i<v; i++) {
				adj[i] = new LinkedList();
			}
		}
	}
	
	static void add_edge(Graph graph, int s, int d) {
		graph.adj[s].add(d);
	}
	
	static void BFS(Graph graph, int s) {
		boolean visited[] = new boolean[graph.v];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		while(queue.size() != 0) {
			s = queue.poll();
			System.out.print(s+" ");
			Iterator<Integer> i = graph.adj[s].listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(6);
		add_edge(graph,0,1);
		add_edge(graph,0,2);
		add_edge(graph,1,3);
		add_edge(graph,1,4);
		add_edge(graph,2,4);
		add_edge(graph,3,4);
		add_edge(graph,3,5);
		add_edge(graph,4,5);
		
		add_edge(graph,1,0);
		add_edge(graph,2,0);
		add_edge(graph,3,1);
		add_edge(graph,4,1);
		add_edge(graph,4,3);
		add_edge(graph,4,2);
		add_edge(graph,5,3);
		add_edge(graph,5,4);
		
		System.out.println("BFS taversal from vertex 2 : ");
		
		BFS(graph, 5);
		
	}

}
