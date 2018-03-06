import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class a094_gfg_graphs_topological_sort {

	static class Graph{
		int v;
		LinkedList<Integer> adj[];
		Graph(int v){
			this.v = v;
			adj = new LinkedList[v];
			for(int i = 0; i< v; i++) {
				adj[i] = new LinkedList();
			}
		}
	}
	
	static void add_edge(Graph graph, int s, int d) {
		graph.adj[s].add(d);
	}
	
	static void topological_sort(Graph graph) {
		Stack stack = new Stack();
		boolean visited[] = new boolean[graph.v];
		for (int i = 0; i<graph.v; i++) {
			visited[i] = false;
		}
		for (int i = 0; i<graph.v; i++) {
			if (!visited[i]) {
				topological_sort_util(graph, i,visited, stack);
			}
		}
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
	
	private static void topological_sort_util(Graph graph, int v, boolean[] visited, Stack stack) {
		visited[v] = true;
		Integer i;
		Iterator<Integer> iter = graph.adj[v].listIterator();
		while(iter.hasNext()) {
			i = iter.next();
			if(!visited[i]) {
				topological_sort_util(graph, i,visited, stack);
			}
		}
		
		stack.push(new Integer(v));
		
	}

	public static void main(String[] args) {
		
		Graph graph = new Graph(6);
		add_edge(graph,5,2);
		add_edge(graph,5,0);
		add_edge(graph,4,0);
		add_edge(graph,4,1);
		add_edge(graph,2,3);
		add_edge(graph,3,1);
		
		System.out.println("Topological sort of the graph is : " );
		
		topological_sort(graph);
		
	}

}
