package Round572;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class typeCSparseTable {
	
	static class Pair{
		int digit;
		int ans;
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
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int[] arr = new int[n+1];
		for(int i=1;i<=n;i++) {
			arr[i]=s.nextInt();
		}
		Pair[][] dp = new Pair[n+1][20];
		for(int i=1;i<=n;i++) {
			dp[i][0]= new Pair();
			dp[i][0].digit=arr[i];
			dp[i][0].ans=0;
		}
		for(int j=1;j<20;j++) {
			for(int i=1;i<=(n- ((int)Math.pow(2,j)-1));i++) {
				dp[i][j] = new Pair();
				int ans = dp[i][j-1].digit + dp[(int)(Math.pow(2,j-1)+i)][j-1].digit;
				dp[i][j].digit = ans%10;
				if(ans>=10) {
					dp[i][j].ans=dp[i][j-1].ans + dp[(int)(Math.pow(2,j-1)+i)][j-1].ans + 1;
				}else {
					dp[i][j].ans=dp[i][j-1].ans + dp[(int)(Math.pow(2,j-1)+i)][j-1].ans;
				}
			}
		}
		int q = s.nextInt();
		for(int i=0;i<q;i++) {
			int l = s.nextInt();
			int r = s.nextInt();
			int re = (int)(Math.log(r-l+1)/Math.log(2));
			//System.out.println(re);
			System.out.println(dp[l][re].ans);
		}
//		for(int i=1;i<=n;i++) {
//			for(int j=0;j<20;j++) {
//				if(dp[i][j]==null) {
//					continue;
//				}
//				System.out.print(dp[i][j].ans+" ");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=n;i++) {
//			for(int j=0;j<20;j++) {
//				if(dp[i][j]==null) {
//					continue;
//				}
//				System.out.print(dp[i][j].digit+" ");
//			}
//			System.out.println();
//		}
	}
}
