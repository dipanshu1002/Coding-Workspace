package Round501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeD {
	static long pos(long cur, long step, long n) {
		if(cur+step<=n) return cur+step;
		else return cur-step;
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		long n = s.nextInt();
		long k = s.nextInt();
		long d = s.nextLong();
		long cur = 1;
		if(k*(n-1)<d || k>d) {
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
		while(k>0) {
			long step = Math.min(n-1,d-k+1);
			long end = pos(cur, step,n);
			cur = end;
			System.out.print(cur+" ");
			k--;
			d-=step;
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
