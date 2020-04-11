package Education73;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeD {
	static class Pair {
		long height;
		long cost;
	}
	public static long cost(Pair[] arr, int i, long cost) {
		
		if(dp[i]!=-1)
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int Q = s.nextInt();
		for(int q=0;q<Q;q++) {
			int n = s.nextInt();
			Pair[] arr = new Pair[n];
			for(int i=0;i<n;i++) {
				arr[i]=new Pair();
				arr[i].height = s.nextLong();
				arr[i].cost = s.nextLong();
			}
			long[] dp = new long[n];
			for(int i=0;i<n;i++) {
				dp[i]=-1;
			}
			long ans = 0;
			for(int i=1;i<n;i++) {
				if(arr[i].height==arr[i-1].height) {
					
				}
			}
			
		}
		
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
