package JulyLunch19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import JulyLunch19.SFRV.FastReader;

public class SFRVRecursion {
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
	public static long getMaxSum(int[]arr,int i, int sum,long dp[]) {
		
		
		if(i>=(arr.length)) {
			dp[i]=0;
			//dp[i]=Math.max(sum+arr[i-1]*(i)+arr[i-2]*(i-1),sum+arr[i-1]*(i-1)+arr[i-2]*i);
			return dp[i];
		}
		if((i+1)==arr.length) {
			//dp[i] = arr[i]*(i+1);
			return arr[i]*(i+1);
			//return sum+arr[i]*(i+1);
		}
		if(dp[i]!=-1) {
			return dp[i];
		}
		else {
		long op1 = getMaxSum(arr,i+2,sum,dp) + arr[i]*(i+2) + arr[i+1]*(i+1);
		long op2 = getMaxSum(arr,i+1,sum,dp) +arr[i]*(i+1);
		dp[i]=Math.max(op1,op2);
		return dp[i];
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			int[] arr = new int[N];
			for(int i=0;i<N;i++) {
				arr[i]=s.nextInt();
			}
			long[]dp =  new long[N+1];
			for(int i=0;i<N;i++) {
				dp[i]=-1;
			}
			long sum = getMaxSum(arr,0,0,dp);
//			for(int i=0;i<=N;i++) {
//				System.out.print(dp[i]+" ");
//			}
//			System.out.println();
			System.out.println(dp[0]);
		}
	}
}
