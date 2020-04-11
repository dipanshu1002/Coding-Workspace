package May19;
import java.util.*;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
public class REDONE {
	
	static int largestPower(int n, int p) { 
        // Initialize result 
        int x = 0; 
  
        // Calculate x = n/p + n/(p^2) + n/(p^3) + .... 
        while (n > 0) { 
            n /= p; 
            x += n; 
        } 
        return x; 
    } 
  
// Utility function to do modular exponentiation. 
// It returns (x^y) % p 
    static int power(int x, int y, int p) { 
        int res = 1; // Initialize result 
        x = x % p; // Update x if it is more than or 
        // equal to p 
        while (y > 0) { 
            // If y is odd, multiply x with result 
            if (y % 2 == 1) { 
                res = (res * x) % p; 
            } 
  
            // y must be even now 
            y = y >> 1; // y = y/2 
            x = (x * x) % p; 
        } 
        return res; 
    } 
  
// Returns n! % p 
    static int modFact(int n, int p) { 
        if (n >= p) { 
            return 0; 
        } 
  
        int res = 1; 
  
        // Use Sieve of Eratosthenes to find all primes 
        // smaller than n 
        boolean isPrime[] = new boolean[n + 1]; 
        Arrays.fill(isPrime, true); 
        for (int i = 2; i * i <= n; i++) { 
            if (isPrime[i]) { 
                for (int j = 2 * i; j <= n; j += i) { 
                    isPrime[j] = false; 
                } 
            } 
        } 
  
        // Consider all primes found by Sieve 
        for (int i = 2; i <= n; i++) { 
            if (isPrime[i]) { 
                // Find the largest power of prime 'i' that divides n 
                int k = largestPower(n, i); 
  
                // Multiply result with (i^k) % p 
                res = (res * power(i, k, p)) % p; 
            } 
        } 
        return res; 
    } 
    
	
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int mod = (int)Math.pow(10,9)+7;
	    long[] dp = new long[10000001];
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<=1000000;i++) {
			dp[i]=(int)(dp[i-1]%mod+i%mod+((i%mod*dp[i-1]%mod)%mod))%mod;
		}
		
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			int N = s.nextInt();
			System.out.println(dp[N]);
			
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
