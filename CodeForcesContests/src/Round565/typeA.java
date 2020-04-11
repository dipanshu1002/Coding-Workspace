package Round565;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeA {
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
		public static long divide(long n,long op) {
			//System.out.println(op);
			if(n==1) {
				return op;
			}
			long ans1=Integer.MAX_VALUE;
			long ans2=Integer.MAX_VALUE;
			long ans3=Integer.MAX_VALUE;
			if(n%2==0) {
				ans1=divide(n/2,op+1);
			}
			if(n%3==0) {
				ans2 = divide(2*n/3,op+1);
			}
			if(n%5==0) {
				ans3 = divide(4*n/5,op+1);
			}
			if(ans1==Integer.MAX_VALUE && ans2==Integer.MAX_VALUE && ans3==Integer.MAX_VALUE) {
				return -1;
			}else {
			return (long)Math.min(ans1,Math.min(ans2,ans3));
			}
		}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int q = s.nextInt();
		for(int t=0;t<q;t++) {
			long n = s.nextLong();
			long a=0;
			long b=0;
			long c=0;
			while(n%2==0 && n!=1) {
				n=n/2;
				a++;
			}
			while(n%3==0 && n!=1) {
				n=n/3;
				b++;
			}
			while(n%5==0 && n!=1) {
				n=n/5;
				c++;
			}
			if(n!=1) {
				System.out.println(-1);
			}else {
			long ans = a+2*b+3*c;
			System.out.println(ans);
			}
			
		}
		
	}
}
