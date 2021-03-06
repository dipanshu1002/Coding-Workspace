import java.util.*;
public class GraphUse {
	
	//DFS - Recursion implementation.
	//PrintGraph Driver - Optional. (See Main implementation)
	//Either construct boolean here or construct boolean in main(** prefer here **)
	public static void DFS(int[][]edges) {
		boolean[] visited = new boolean[edges.length];
		for(int i=0;i<edges.length;i++) {
			if(!visited[i])
				printDFSHelper(edges,i,visited);
		}
	}
	
	//DFS Helper
	public static void printDFSHelper(int[][]edges, int startV,boolean[] visited) {
		visited[startV] =true;
		System.out.println(startV);
		int n = edges.length;
		for(int i=0;i<n;i++ ) {
			
			if(edges[startV][i]==1 && !visited[i]) {
				printDFSHelper(edges,i,visited);
			}
		}
	}
	
	
	//BFS - Queue using LL implementation.
	public static void BFS(int[][]edges) {
		int n = edges.length;
		boolean[] visited = new boolean[n];
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				BFSHelper(edges,i,visited);
			}
		}
	}
	
	//BFS Helper
	public static void BFSHelper(int[][]edges,int startV,boolean[] visited) {
		int n=edges.length;
		Queue<Integer> bfs = new LinkedList<>();
		bfs.add(startV);
		visited[startV]=true;
		while(!bfs.isEmpty()) {
			int front = bfs.remove();
			System.out.println(front);
			for(int i=0;i<n;i++) {
				if(edges[front][i]==1 && !visited[i]) {
					bfs.add(i);
					visited[i]=true;
				}
			}
		}
		
	}
	
	//Has Path
	public static boolean hasPath(int[][] edges, int sv, int fv) {
		boolean visited[] = new boolean[edges.length];
//		if(edges[sv][fv]==1) {
//			return true;
//		}
		visited[sv]=true;
		boolean ans = hasPathHelper(edges,sv,fv,visited);
		return ans;
	}
	
	//HasPath Helper
	public static boolean hasPathHelper(int[][]edges,int sv, int fv, boolean[] visited) {
		boolean ans=false;
		//base case
		if(edges[sv][fv]==1) {
			ans = true;
			return ans;
		}else {
		for(int i=0;i<edges.length;i++) {
			if(edges[sv][i]==1 && !visited[i]) {
				visited[i]=true;
				ans = hasPathHelper(edges,i,fv,visited);
			}
			if(ans==true) {
				break;
			}
		}
		return ans;
		}
	}
	
	//Get Path - DFS ( Print path in reverse order )
	public static void getPathDFS(int[][] edges, int sv, int fv) {
		boolean[] visited = new boolean[edges.length];
		ArrayList<Integer> list = new ArrayList<>();
		list = getPathDFSHelper(edges,sv,fv,visited,list);
		if(list.size()==0) {
			System.out.println("null");
		}
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
	//Get Path  - DFS Helper (Print path in reverse order )
	public static ArrayList<Integer> getPathDFSHelper(int[][] edges,int sv,int fv, boolean[] visited,ArrayList<Integer> list){
		if(sv==fv) {
			list.add(sv);
			return list;
		}
		visited[sv]=true;
		for(int i=0;i<edges.length;i++) {
			if(edges[sv][i]==1 && !visited[i]) {
				visited[i]=true;
				list = getPathDFSHelper(edges,i,fv,visited,list);
				if(list.contains(fv)) {
					list.add(sv);
					return list;
				}
			}
		}
		return list;
	}
	
	//Get Path - BFS

	public static void getPathBFS(int[][]edges, int sv, int fv) {
		boolean[] visited = new boolean[edges.length];
		getPathBFSHelper(edges,sv,fv,visited);
		
		
	}
	
	//Get Path - BFS Helper
	//Queue Maintenance, Map also maintained.
	//Print path in reverse order. Using MAP.
	public static void getPathBFSHelper(int[][]edges,int sv,int fv,boolean[] visited) {
		HashMap<Integer,Integer> map = new HashMap<>();
		Queue<Integer> queue  = new LinkedList<>();
		visited[sv]=true;
		queue.add(sv);
		boolean done = false;
		while(!queue.isEmpty() && !done) {
			int front = queue.remove();
			for(int i=0;i<edges.length;i++) {
				if(edges[front][i]==1 && !visited[i]) {
					queue.add(i);
					visited[i]=true;
					map.put(i,front);
					if(i==fv) {
						done=true;
						break;
					}
				}
			}
		}
		if(!done) {
			return;
		}else {
			int i = fv;
			while(i!=sv) {
				System.out.print(i+" ");
				i=map.get(i);
			}
			System.out.println(i);
			}
	}
	
	//IS CONNECTED - DFS 
	
	public static boolean isConnectedDFS(int[][]edges) {
		boolean[] visited = new boolean[edges.length];
		isConnectedDFSHelper(edges,0,visited);
		for(int i=0;i<edges.length;i++) {
			if(visited[i]==false) {
				return false;
			}
		}
		return true;
	}
	public static void isConnectedDFSHelper(int[][] edges, int sv, boolean[] visited) {
		visited[sv]=true;
		for(int i=0;i<edges.length;i++) {
			if(edges[sv][i]==1 && !visited[i]) {
				isConnectedDFSHelper(edges,i,visited);
			}
		}
	}
	//Return Connected Components
	
	public static void connectedComponents(int[][]edges) {
		int n = edges.length;
		ArrayList<ArrayList<Integer>> list  = new ArrayList<ArrayList<Integer>>();
		boolean[] visited = new boolean[n];
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				ArrayList<Integer> component = new ArrayList<Integer>();
				connectedComponentsHelper(edges,i,visited,component);
				Collections.sort(component);
				list.add(component);
			}
		}
		for(ArrayList<Integer> l : list) {
			for(Integer i : l) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void connectedComponentsHelper(int[][]edges, int sv, boolean[] visited,ArrayList<Integer> component) {
		visited[sv]=true;
		component.add(sv);
		for(int i=0;i<edges.length;i++) {
			if(edges[sv][i]==1 && !visited[i]) {
				connectedComponentsHelper(edges,i,visited,component);
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[][]edges = new int[N][N];
		//boolean[] visited = new boolean[N];
		//System.out.println(visited[0]);
		int edge = s.nextInt();
		for(int i=0;i<edge;i++) {
			int fv = s.nextInt();
			int sv = s.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
		
		//To check for unconnected components
//		for(int i=0;i<visited.length;i++) {
//			if(!visited[i])
//				printDFSHelper(edges,i,visited);
//		}
		//DFS(edges);
//		BFS(edges);
//		for(int i=0;i<N;i++) {
//			for(int j=0;j<N;j++) {
//				System.out.print(edges[i][j]);
//			}
//			System.out.println();
//		}
//		int T= s.nextInt();
//		for(int t=0;t<T;t++) {
//		int svc = s.nextInt();
//		int fvc = s.nextInt();
//		boolean ans = hasPath(edges,svc,fvc);
//		System.out.println(ans);
//		}
//		ArrayList<Integer> list=null;
//		System.out.println(list==null);
//		printGraph(edges, visited);
//		getPathBFS(edges,svc,fvc);
//		boolean ans = isConnectedDFS(edges);
//		System.out.println(ans);
//		connectedComponents(edges);
	}
}
