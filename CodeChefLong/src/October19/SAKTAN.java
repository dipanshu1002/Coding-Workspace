package October19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SAKTAN {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			int M = s.nextInt();
			int Q = s.nextInt();
			int[] row = new int[N];
			int[] col = new int[M];
			long cntOddRow = 0;
			long cntEvenCol = 0;
			for(int i=0;i<Q;i++) {
				int x = s.nextInt();
				row[x-1]++;
				int y = s.nextInt();
				col[y-1]++;
			}
			for(int i=0;i<N;i++)if(row[i]%2!=0)cntOddRow++;
			for(int i=0;i<M;i++)if(col[i]%2==0)cntEvenCol++;
			long ans = 0;
			ans+=(long)(cntOddRow*cntEvenCol);
			ans+=(long)((N-cntOddRow)*(M-cntEvenCol));
			System.out.println(ans);
			
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
