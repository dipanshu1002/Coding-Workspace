import java.util.*;
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
	
	//Has Path + HasPath_Helper
	public boolean hasPath(int sv, int fv) {
		boolean ans;
		boolean[] visited = new boolean[n];
		visited[sv]=true;
		ans = hasPathHelper(sv-1,fv-1,visited);
		return ans;
	}
	
	public boolean hasPathHelper(int sv, int fv,boolean[] visited) {
		boolean ans = false;
		if(adjMatrix[sv][fv]==1) {
			ans = true;
		}else {
			for(int i=0;i<n;i++) {
				if(adjMatrix[sv][i]==1 && !visited[i]) {
					visited[i]=true;
					ans  = hasPathHelper(i,fv,visited);
				}
				if(ans==true) {
					break;
				}
			}
		}
		return ans;
	}
	
	// Print Path + Print_Path_Helper
	public void printPath(int sv, int fv) {
		boolean[] visited = new boolean[n];
		ArrayList<Integer> list = new ArrayList<>();
		list = printPathHelper(sv-1,fv-1,visited,list);
		if(list.size()==0) {
			System.out.println("No path");
		}
		else {
			int[] arr = new int[list.size()];
			int j = arr.length-1;
			for(int i: list) {
				arr[j]=i;
				j--;
			}
			for(int i: arr) {
				System.out.print((i+1)+" ");
			}
			System.out.println();
		}
		
	}
	public ArrayList<Integer> printPathHelper(int sv, int fv, boolean[] visited,ArrayList<Integer> list){
		visited[sv]=true;
		if(sv==fv) {
			list.add(fv);
			return list;
		}else {
			for(int i=0;i<n;i++) {
				if(adjMatrix[sv][i]==1 && !visited[i]) {
					list = printPathHelper(i,fv,visited,list);
					if(list.contains(fv)) {
						list.add(sv);
						return list;
					}
				}
				
			}
		}
		return list;
	}
	
	
	
}
