package June19;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class SUMAGCDUp {
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
	
	public static long gcd(long a, long b) {
		if(b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	}
	static class Pair{
		long x;
		long y;
	}
	
	public static void main(String[] args) {
		FastReader s = new FastReader();
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			int N = s.nextInt();
			Pair p = new Pair();
			long[] arr = new long[N];
			for(int i=0;i<N;i++) {
				arr[i]=s.nextLong();
			}
			if(N==1) {
				System.out.println(arr[0]);
				continue;
			}else if(N==2) {
				System.out.println(arr[0]+arr[1]);
				continue;
			}
			long[] arrCopy = new long[N];
			arrCopy = arr;
			Arrays.sort(arrCopy);
			if(arrCopy[0]==arrCopy[N-1]){
				System.out.println(2*arrCopy[N-1]);
				continue;
			}
			
			long max = arrCopy[N-1];
			long smax=0;
			int po = N-2;
			while(po>=0){
				if(arrCopy[po]!=arrCopy[po+1]){
					smax= arrCopy[po];
					break;
				}
				po--;
				
			}
			long gcd1 = 0;
			for(int i=0;i<N;i++) {
				if(arrCopy[i]!=max)
			    	gcd1 = gcd(gcd1,arrCopy[i]);
			}
		   	long gcd2 = 0;
			for(int i=0;i<N;i++) {
				if(arrCopy[i]!=smax)
			    	gcd2 = gcd(gcd2,arrCopy[i]);
			}
		//	long gcd2 = gcd(gcd1,smax);
			long gcd3 = gcd(gcd1,max);
			long sum1 = gcd1+max;
			long sum2 = gcd2+smax;
			System.out.println((long)Math.max(sum1,sum2));
		}
	}
}