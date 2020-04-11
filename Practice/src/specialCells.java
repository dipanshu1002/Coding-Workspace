import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class specialCells {
	static long mod = (long)Math.pow(10,9)+7;
	public static long binomialCoeff(int n, int k) 
    { 
        long C[] = new long[k + 1]; 
         
        // nC0 is 1 
        C[0] = 1;   
       
        for (int i = 1; i <= n; i++) 
        { 
            // Compute next row of pascal  
            // triangle using the previous row 
            for (int j = Math.min(i, k); j > 0; j--) 
                C[j] = (C[j]%mod + C[j-1]%mod)%mod; 
        } 
        return (int)C[k]; 
    } 
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			int M = s.nextInt();
			int K = s.nextInt();
			long ans = 0;
			for(int i=0;i<K;i++) {
				int X = s.nextInt();
				int Y = s.nextInt();
				int P = s.nextInt();
				System.out.println(binomialCoeff(6,3));
				long ways = binomialCoeff((N-X+1)+(M-Y+1)-2,(M-Y+1)-1);
				ans+=((ways%mod*P%mod)%mod)%mod;
			}
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
