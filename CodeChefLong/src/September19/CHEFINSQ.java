package September19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class CHEFINSQ {
	 static int binomialCoeff(int n, int k) 
	    { 
	    int C[][] = new int[n+1][k+1]; 
	    int i, j; 
	      
	        // Calculate  value of Binomial Coefficient in bottom up manner 
	    for (i = 0; i <= n; i++) 
	    { 
	        for (j = 0; j <= min(i, k); j++) 
	        { 
	            // Base Cases 
	            if (j == 0 || j == i) 
	                C[i][j] = 1; 
	       
	            // Calculate value using previously stored values 
	            else
	                C[i][j] = C[i-1][j-1] + C[i-1][j]; 
	          } 
	     } 
	       
	    return C[n][k]; 
	    }
	 
	 static int min(int a, int b) 
	    { 
	    return (a<b)? a: b;  
	    } 
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			int K = s.nextInt();
			int[] arr = new int[N];
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for(int i=0;i<N;i++) {
				arr[i]=s.nextInt();
				if(map.get(arr[i])==null) {
					map.put(arr[i],1);
				}else {
					int cnt = map.get(arr[i]);
					map.put(arr[i],cnt+1);
				}
			}
			int sum = 0;
			Set<Integer> set = map.keySet();
			for(int i: set) {
				int cnt = map.get(i);
				if((sum+cnt)>=K) {
					int reqd = K-sum;
					int ans = binomialCoeff(cnt,reqd);
					System.out.println(ans);
					break;
					
				}else {
					sum+=cnt;
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
