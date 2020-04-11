import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int mod = (int)Math.pow(10,9)+7;
  
    // A Dynamic programming based function to count walks from u 
    // to v with k edges 
    public static void countwalks(int graph[][], int u, int v, int k, int V) 
    { 
        // Table to be filled up using DP. The value count[i][j][e] 
        // will/ store count of possible walks from i to j with 
        // exactly k edges 
        long count[][][] = new long[V][V][k+1]; 
  
        // Loop for number of edges from 0 to k 
        for (int e = 0; e <= k; e++) 
        { 
            for (int i = 0; i < V; i++)  // for source 
            { 
                for (int j = 0; j < V; j++) // for destination 
                { 
                    // initialize value 
                    count[i][j][e] = 0; 
  
                    // from base cases 
                    if (e == 0 && i == j) 
                        count[i][j][e] = 1; 
                    if (e == 1 && graph[i][j]!=0) 
                        count[i][j][e] = 1; 
  
                    // go to adjacent only when number of edges 
                    // is more than 1 
                    if (e > 1) 
                    { 
                        for (int a = 0; a < V; a++) // adjacent of i 
                            if (graph[i][a]!=0) 
                                count[i][j][e] =((count[i][j][e]%mod) + (count[a][j][e-1]%mod))%mod; 
                    } 
               } 
            } 
        } 
        for(int i=0;i<V;i++){
            int paths=0;
            for(int j=0;j<=k;j++){
                if(j%2==1){
                    paths=(int)(paths%mod+ count[u][i][j]%mod)%mod;
                }
            }
            System.out.print(paths+" ");
        }
        System.out.println();
    }
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int t=0;t<T;t++){
            int N = s.nextInt();
            int M = s.nextInt();
            int X = s.nextInt();
            int[][] edges = new int[N][N];
            for(int i=0;i<M;i++){
                int fv = s.nextInt();
                int sv = s.nextInt();
                edges[fv-1][sv-1] =1; 
            }
            int k = N;
           
            countwalks(edges,X-1,N,k,N);
            }

        }
    }


