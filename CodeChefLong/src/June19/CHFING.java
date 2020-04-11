package June19;
//10
//2 100000000000000000
//
//635000014

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class CHFING {
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


static long mod = (long)Math.pow(10,9)+7;
public static long power(long a, long n) {
	if(n==0) {
		return 1;
	}
	if(n%2==0) {
		return power((a*a)%mod,n/2);
	}
	else {
		return (a%mod*power((a*a)%mod,n/2)%mod)%mod;
	}
}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			long N = s.nextLong();
			long K = s.nextLong();
			//AP
			// C.D = N-1
			//First term - a1 = K-1
			//Last term - aN =  a1 + (N-1)*CD
			// Sum - n/2 * (a1 + aN)
			long cd = (N-1);
			long a1 = (K-1);
			long n = (a1/cd + 1);
			long an = (a1 - (n-1)*cd);
			//long sum = n/2*(a1+an);
			long ans = (long)((((n%mod)*(500000004)%mod)%mod)*((a1%mod+an%mod)%mod))%mod;
			System.out.println(ans%mod);
			
			
		}
	}
}
