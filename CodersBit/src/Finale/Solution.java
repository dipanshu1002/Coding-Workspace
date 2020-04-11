package Finale;

import Finale.Solution.Graph;
import java.util.*;
public class Solution {
    static class Graph{
        private int V;
         private ArrayList<Integer> adj[];
         int time = 0;
         static final int NIL = -1;
            Graph( int v){
                V = v;
                adj = new ArrayList[v];
                for(int i=0;i<v;i++){
                    adj[i]=new ArrayList();
                }
            }
            
            void addEdge(int v, int w){
                adj[v].add(w);
                adj[w].add(v);
            }
            void APUtil(int u, boolean visited[], int disc[], int low[], int parent[], boolean ap[]){
                int children = 0;
                visited[u]=true;
                if(adj[u].size()==0){
                    ap[u]=true;
                }
                disc[u]=low[u]=++time;
                Iterator<Integer> i = adj[u].iterator();
                while(i.hasNext()){
                    int v = i.next();
                    if(!visited[v]){
                        children++;
                        parent[v]=u;
                        APUtil(v,visited,disc,low,parent,ap);
                        low[u]=Math.min(low[u],low[v]);
                        if(parent[u]==NIL && children > 1){
                            ap[u]=true;
                        }
                        if(parent[u]!=NIL && low[v]>=disc[u]){
                            ap[u]=true;
                        }
                    }
                    else if(v!=parent[u]){
                        low[u]=Math.min(low[u],disc[v]);
                    }
                }
            }
            @SuppressWarnings("deprecation")
			void removeVertex(int v) {
            	Iterator<Integer> i = adj[v].iterator();
            	while(i.hasNext()) {
            		int k = i.next();
            		adj[k].remove(new Integer(v));
            		adj[v].remove(k);
            	}
            	x
            	
            	
            }
            HashSet<Integer> AP(){
                boolean visited[] = new boolean[V];
                int disc[] = new int[V];
                int low[] = new int[V];
                int parent[] = new int[V];
                boolean ap[] = new boolean[V];
                for(int i=0;i<V;i++){
                    parent[i]=NIL;
                    visited[i]=false;
                    ap[i]=false;
                }
                for(int i=0;i<V;i++){
                    if(visited[i]==false){
                        APUtil(i, visited, disc, low, parent, ap);
                    }
                }
                HashSet<Integer> set = new HashSet<Integer>();
                for(int i=0;i<V;i++){
                    if(ap[i]==true){
                        set.add(i);
                    }
                }
                return set;
            }
    }
    public static int[] solve(int A, int[][] B, int[] C) {
        Graph g = new Graph(A);
        int N = B.length;
        int[] arr = new int[A];
        for(int i=0;i<N;i++){
            g.addEdge(B[i][0]-1,B[i][1]-1);
        }
        for(int i=0;i<A;i++){
           HashSet<Integer> set =  g.AP();
           System.out.println(set);
           g.removeVertex(C[i]-1);
           if(set.contains(C[i]-1)){
               arr[i]=0;
           }else{
               arr[i]=1;
           }
        }
        return arr;
    }
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int M = s.nextInt();
		int[][] B = new int[M][2];
		int[] C = new int[A];
		for(int i=0;i<M;i++) {
			B[i][0]=s.nextInt();
			B[i][1]=s.nextInt();
		}
		for(int i=0;i<A;i++) {
			C[i]=s.nextInt();
		}
		int[] solve = solve(A,B,C);
		System.out.println(Arrays.toString(solve));
		
	}
}
