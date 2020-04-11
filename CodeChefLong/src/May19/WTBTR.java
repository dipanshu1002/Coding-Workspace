package May19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Restaurant {
	 long X=0;
	 long Y=0;
	 public void set(int x, int y) {
		 X=x;
		 Y=y;
	 }
}
public class WTBTR {
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
			int N = s.nextInt();
			Restaurant[] arr = new Restaurant[N];
			for(int n=0;n<N;n++) {
				arr[n] = new Restaurant();
				arr[n].X = s.nextLong();
				arr[n].Y = s.nextLong();
			}
			Restaurant A = new Restaurant();
			Restaurant B = new Restaurant();
			double minDist = Integer.MAX_VALUE;
			for(int i=0;i<N;i++) {
				for(int j=i+1;j<N;j++) {
					//double dist = Math.pow(arr[i].X-arr[j].Y,2) + Math.pow(arr[i].Y-arr[j].Y,2);
					//if(dist<minDist) {
					//	minDist = dist;
						A.X = arr[i].X;
						A.Y = arr[i].Y;
						B.X = arr[j].X;
						B.Y = arr[j].Y;
						double c_1 = (A.X+B.X)/(double)2 + (A.Y+B.Y)/(double)2;
						double c_2 = (A.Y+B.Y)/(double)2 - (A.X+B.X)/(double)2;
						double dist1 = Math.abs(A.X + A.Y - c_1);
						double dist2 = Math.abs(-A.X + A.Y - c_2);
						double ans = Math.min(dist1,dist2);
						if(ans<minDist) {
							minDist = ans;
						}
					//}
				}
			}
			
			//System.out.println(A.X+" "+A.Y+" "+B.X+" "+B.Y);
			//System.out.println(c_1+" "+c_2);
			//System.out.println(dist1+" "+dist2);
			System.out.println(minDist);
		}
	}
}
