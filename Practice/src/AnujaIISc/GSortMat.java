package AnujaIISc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GSortMat {
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
	
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int[][] dp = new int[n+1][n+1];
		dp[0][0]=1;
		for(int i=1;i<n;i++) {
			if(arr[0][i]>arr[0][i-1]) {
			dp[0][i]=dp[0][i-1]+1;
			}else {
				dp[0][i]=1;
			}
		}
		for(int i=1;i<n;i++) {
			if(arr[i][0]>arr[i-1][0]) {
				dp[i][0]=dp[i-1][0]+1;
			}else {
				dp[i][0]=1;
			}
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(arr[i][j]<arr[i-1][j-1] && arr[i][j]<arr[i-1][j] && arr[i][j]<arr[i][j-1]) {
					dp[i][j]=1;	
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
	}
}
