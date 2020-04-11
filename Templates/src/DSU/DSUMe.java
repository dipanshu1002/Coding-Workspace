package DSU;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class DSUMe {
	static class DSU{
		////// FUNCTIONS IMPLEMENTED /////
		/*
		 * DSU(~ constructor)
		 * union ( does union by size )
		 * makeSet ( makes the set - parent of it is itself )
		 * find ( does find by using path compression technique )
		 * size ( takes a node(integer) and returns the size(no. of nodes) of the component it is part of. )
		 */
		int n;
		int[] parent;
		int[] size;
		DSU(int n){
			this.n = n;
			parent = new int[n];
			for(int i=0;i<n;i++){
				parent[i]=i;
			}
			size = new int[n];
			for(int i=0;i<n;i++) {
				size[i]=1;
			}
		}
		
		// UNION BY SIZE
		void union(int v1, int v2) {
			int p1 = find(parent, v1);
			int p2 = find(parent, v2);
			if(p1!=p2) {
				if(size[p2]<=size[p1]) {
					size[p1]+=size[p2];
					parent[p2]=p1;
				}else {
					size[p2]+=size[p1];
					parent[p1]=p2;
				}
			}else if(p1==p2) {
				return;
			}
		}
		
		
		
		//UNION SET
		void unionSet(int v1, int v2){
			int p1 = find(parent, v1);
			int p2 = find(parent, v2);
			if(p1!=p2){
				
			}
		}
		
		//MAKE SET
		void makeSet(int[] parent,int v){
			parent[v]=v;
		}
		
		// FIND BY PATH COMPRESSION
		int find(int[] parent,int v){
			if(parent[v]==v){
				return v;
			}
			else{
				parent[v]=find(parent,parent[v]);
				return parent[v];
			}
		}
		
		// SHOW SIZE (I.E NO OF NODES IN A CONNECTED COMPONENT
		int size(int v1) {
			int p1 = find(parent,v1);
			return size[p1];
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int e = s.nextInt();
		DSU dsu = new DSU(n);
		for(int i=0;i<e;i++) {
			int v1 = s.nextInt();
			int v2 = s.nextInt();
			dsu.union(v1,v2);
		}
		System.out.println(Arrays.toString(dsu.parent));
		int q = s.nextInt();
		for(int i=0;i<q;i++) {
			int t = s.nextInt();
			System.out.println(dsu.size(t));
		}
		
	}
	
	/*
	 *          0
	 *         / \
	 *        3   4      ,  5-9 ,  10
	 *       /   / \
	 *      1   6   7
	 *         /     \
	 *        8       2
	 */
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
