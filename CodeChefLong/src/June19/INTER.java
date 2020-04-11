package June19;
import java.util.*;
public class INTER {

	//========SOLUTION CREDIT : GeeksForGeeks======//
	static class Graph{
		int V;
		LinkedList<Integer> adjList[];
		Graph(int V) 
        { 
            this.V = V; 
              
            // define the size of array as  
            // number of vertices 
            adjList = new LinkedList[V]; 
              
            // Create a new list for each vertex 
            // such that adjacent nodes can be stored 
            for(int i = 0; i < V ; i++){ 
                adjList[i] = new LinkedList<>(); 
            } 
        } 
  
		
	}
	static void addEdge(Graph graph, int src, int dest) 
    { 
        // Add an edge from src to dest.  
        graph.adjList[src].add(dest); 
          
        // Since graph is undirected, add an edge from dest 
        // to src also 
        graph.adjList[dest].add(src); 
    } 
	
	static void printGraph(Graph graph) 
    {        
        for(int v = 0; v < graph.V; v++) 
        { 
            System.out.println("Adjacency list of vertex "+ v); 
            System.out.print("head"); 
            for(Integer pCrawl: graph.adjList[v]){ 
                System.out.print(" -> "+pCrawl); 
            } 
            System.out.println("\n"); 
        } 
    } 
	
	//========SOLUTION CREDIT : GeeksForGeeks======//
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T  = s.nextInt();
		for(int t=0;t<T;t++) {
		int N = s.nextInt();
		int Q = s.nextInt();
		Graph graph = new Graph(N);
		for(int i=0;i<N;i++) {
			int src = s.nextInt();
			int dest = s.nextInt();
			addEdge(graph,src-1,dest-1);
		}
		printGraph(graph);
		
		
		
		}
		
		}
}
