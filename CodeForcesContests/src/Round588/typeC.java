package Round588;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;	
import java.util.LinkedList;
import java.util.Queue;
public class typeC{
	static class Pair {
		int x;
		int y;
	}
	
	static class GraphTemplate {
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
		public int degree(int sv) {
			int cnt = 0;
			for(int i=0;i<n;i++) {
				if(adjMatrix[sv-1][i]==1) {
					cnt++;
				}
			}
			return cnt;
		}
		
		
	}

	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int m = s.nextInt();
		GraphTemplate graph = new GraphTemplate(n,m);
		for(int i=0;i<m;i++) {
			int sv = s.nextInt();
			int fv = s.nextInt();
			graph.addEdge(sv,fv);
		}
		HashSet<Pair> set = new HashSet<Pair>();
		for(int i=1;i<=6;i++) {
			for(int j=i;j<=6;j++) {
				Pair p = new Pair();
				p.x = i;
				p.y = j;
				set.add(p);
			}
		}
		//System.out.println(set.size());
		int[] deg = new int[n];
		for(int i=0;i<n;i++) {
			deg[i]=graph.degree(i+1);
		}
		System.out.println(Math.min(m,16));
		//System.out.println(Arrays.toString(deg));
		
	}
	
	static class FastReader 
	
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	
}
