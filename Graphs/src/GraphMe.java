import java.util.*;
public class GraphMe {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		GraphTemplate graph = new GraphTemplate(n,e);
		for(int i=0;i<e;i++) {
			int sv = s.nextInt();
			int fv = s.nextInt();
			graph.addEdge(sv,fv);
		}
		graph.DFS();
		graph.BFS();
		System.out.println(graph.hasPath(1,4));
		//System.out.println(graph.hasPath(1,5));
		graph.printPath(1,5);
		
	}
}
