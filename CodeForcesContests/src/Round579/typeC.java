package Round579;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class typeC {
	public static long gcd(long a, long b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b,a%b);
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
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		long[] arr = new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextLong();
		}
		long [] gcd = new long[n];
		gcd[0]=arr[0];
		for(int i=1;i<n;i++) {
			gcd[i]= gcd(gcd[i-1],arr[i]);
		}
		long gcdF = gcd[n-1];
	//	System.out.println(gcdF);
		long ans = 2;
		if(gcdF==1) {
			System.out.println(1);
			return;
		}
		for(long i=2;i*i<=gcdF;i++) {
			if(gcdF%i==0) {
				ans++;
				if((gcdF/i)!=i) {
					ans++;
				}
			}
			
		}
		System.out.println(ans);
		
		
	}
}
