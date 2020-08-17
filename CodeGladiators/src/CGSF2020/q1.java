package CGSF2020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class q1 {
	static long helper(long[][]dp, int[][] arr, int bit , int id ,int n, int m){
	    if(id==m)
	         return 0;
	         
	    if(bit==((1<<n)-1))
	       return 100000;  
	       
	       
	    if(dp[bit][id]!=-1)
	       return dp[bit][id];

	      long ans = Integer.MAX_VALUE;;
	      for(int i=0;i<n;i++){
	        if((bit&(1<<i))==0){
	          long  tot=0;
	          for(int j=id;j<m;j++){
	            tot = tot + arr[i][j];
	            long temp  = tot + helper(dp,arr,(bit|1<<i),j+1,n,m);
	            ans = Math.min(ans,temp);
	          }
	        }
	      }

	      dp[bit][id]=ans;
	      return ans;
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int m = s.nextInt(), n = s.nextInt();
		   int[][] arr = new int[n][m];
		    for(int i=0;i<n;i++){
		    	for(int j=0;j<m;j++)
		    	    arr[i][j]=s.nextInt();
		    }
		    long[][] dp=new long[1025][m+1];
		    for(int i=0;i<=1024;i++){
		      for(int j=0;j<=m;j++)
		        dp[i][j]=-1;
		    }

		    long ans = helper(dp,arr,0,0,n,m);
		    System.out.println(ans);
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
