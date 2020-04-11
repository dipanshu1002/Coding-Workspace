package August19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
import java.math.BigInteger;

public class DSTAPLS {
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
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			long N = s.nextLong();
			long K = s.nextLong();
			
			BigInteger n = BigInteger.valueOf(N);
			//BigInteger k = BigInteger.valueOf(K*K);
		//	n=n.mod(k);
			//System.out.println(n);
			//int l = BigInteger.valueO
			if (K==1) {
				System.out.println("NO");
			}else if(K>(long)Math.pow(10,9)){
				System.out.println("YES");
			}
			else if(N%(K*K)==0) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
	}
}
