package RoundG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BookReading {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			int M = s.nextInt();
			int Q = s.nextInt();
			int[] arr = new int[N+1];
			for(int i=1;i<=N;i++) {
				arr[i]=1;
			}
			for(int i=0;i<M;i++) {
				int p = s.nextInt();
				arr[p]=-1;
			}
			long cnt = 0;
			int[] arrR = new int[N+1];
			for(int r = 1;r<=N;r++) {
				int cntR = 0;
				for(int j=r;j<=N;j+=r) {
					if(arr[j]!=-1){
						cntR++;
					}
				}
				arrR[r]=cntR;
			}
			for(int i=0;i<Q;i++) {
				int R = s.nextInt();
					cnt+=arrR[R];
				}
			
			System.out.println("Case #"+(t+1)+": "+cnt);
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
