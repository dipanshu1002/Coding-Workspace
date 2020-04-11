package Round578;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
 
public class typeC {
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
	public static long gcd(long a, long b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		long n = s.nextLong();
		long m = s.nextLong();
		long k = s.nextLong();
		long p = gcd(n,m);
//		System.out.println(n);
//		double angle1 = 360.0/(1.0*n);
//		double angle2 = 360/(1.0*m);
//		double angle = 360/(1.0*p);	
		HashMap<Long,Long> map = new HashMap<>();
		map.put((long)1,n);
		map.put((long)2,m);
//	System.out.println(map.get((long)1));
		for(int i=0;i<k;i++) {
			long s1 = s.nextLong();
			long s2 = s.nextLong()-1;
			long e1 = s.nextLong();
			long e2 = s.nextLong()-1;
//			System.out.println((s2/(map.get(s1)/p)));
//			System.out.println(e2/(map.get(e1)/p));
			if((s2/(map.get(s1)/p))==(e2/(map.get(e1)/p))) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
		
		
		
	}
}