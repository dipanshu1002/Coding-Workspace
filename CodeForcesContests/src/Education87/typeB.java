package Education87;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class typeB {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			String str = s.nextLine();
			int n = str.length();
			long[][] dp = new long[3][n+1];
			
			for(int i=0;i<n;i++) {
				dp[str.charAt(i)-'1'][i+1]++;
			}
			
			for(int i=0;i<3;i++){
			    for(int j=1;j<=n;j++){
			    	dp[i][j]+=dp[i][j-1];
			    }
			}
			
			long len = n+1;
			for(int i=1;i<=n-2;i++){
				int start = i;
				int end = n;
				int ans  = -1;
				while(start<=end){
					
					int mid = (start+end)/2;
					long one = dp[0][mid]-dp[0][i-1];
					long te = dp[1][mid]-dp[1][i-1];
					long th = dp[2][mid]-dp[2][i-1];
					
					if(one>=1 && te>=1 && th>=1){
						ans = mid;
						end = mid-1;
					}
					
					else
					    start = mid+1;
			
				}
				
				if(ans!=-1){
					len = Math.min(len, (ans-i+1));
				}
			}
			
			
			if(len==n+1)
			   len = 0;
			  
			  
			System.out.println(len);
			
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