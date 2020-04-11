package Education72;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeB {
	
	static class Pair{
		long x;
		long y;
		long diff;
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			long x = s.nextLong();
			long diff = Integer.MIN_VALUE;
			long a = Integer.MIN_VALUE;
			Pair[] blow = new Pair[n];
			for(int i=0;i<n;i++) {
				long d = s.nextLong();
				long h = s.nextLong();
				diff = Math.max(diff,d-h);
				a=Math.max(a,d);
			}
			
			if(x>a && diff<=0) {
				System.out.println(-1);
				continue;
			}else if(diff==0 && x<=a){
				System.out.println(1);
			}else {
				if((x-Math.min(x,a))%diff==0) {
					long ans = (x-Math.min(x,a))/diff;
					System.out.println(ans+1);
				}else {
					long ans = (x-Math.min(x,a))/diff;
					System.out.println(ans+2);
				}
			}
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
