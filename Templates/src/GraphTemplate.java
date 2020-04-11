import java.util.LinkedList;
import java.util.Queue;
public class GraphTemplate {
	private int n;       // no. of vertices
	int[][] adjMatrix;  // adjacency matrix
	int edges;
	GraphTemplate(int n, int e){
		 this.n = n;
		adjMatrix = new int[n][n];
		edges = e;
	}
	//addEdge
	public void addEdge(int sv, int fv) {
		adjMatrix[sv-1][fv-1]=1;
		adjMatrix[fv-1][sv-1]=1;
	}
	//removeEdge
	public void removeEdge(int sv, int fv) {
		adjMatrix[sv-1][fv-1]=0;
		adjMatrix[fv-1][sv-1]=0;
	}
	
	//DFS + DFS_Helper
	public void DFS() {
		boolean[] visited = new boolean[n];
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				DFSHelper(i,visited);
			}
		}
	}
	public void DFSHelper(int sv,boolean[] visited) {
		visited[sv]=true;
		System.out.println(sv+1);
		for(int i=0;i<visited.length;i++) {
			if(adjMatrix[sv][i]==1 && !visited[i]) {
				DFSHelper(i,visited);
			}
		}
	}
	
	//BFS + BFS_Helper
	public void BFS() {
		boolean[] visited = new boolean[n];
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				BFSHelper(i,visited);
			}
		}
	}
	public void BFSHelper(int sv, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<>();
		visited[sv]=true;
		queue.add(sv);
		while(!queue.isEmpty()) {
			int front = queue.remove();
			System.out.println(front+1);
			for(int i=0;i<n;i++) {
				if(adjMatrix[front][i]==1 && !visited[i]) {
					queue.add(i);
					visited[i]=true;
				}
			}
		}
	}
	
	
}
