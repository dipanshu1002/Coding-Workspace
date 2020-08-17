package Round661;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeB {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		while(T-->0) {
			int n = s.nextInt();
			int[] can = new int[n];
			int[] or = new int[n];
			int minC = Integer.MAX_VALUE;
			int minO = Integer.MAX_VALUE;
			for(int i=0;i<n;i++) {
				can[i]=s.nextInt();
				minC = Math.min(can[i], minC);
			}
			for(int i=0;i<n;i++) {
				or[i]=s.nextInt();
				minO = Math.min(or[i], minO);
			}
			long mov = 0;
			for(int i=0;i<n;i++) {
				int a = can[i]-minC;
				int b = or[i]-minO;
				
				int mv = Math.min(can[i]-minC, or[i]-minO);
				a-=mv;
				b-=mv;
				mov+=(mv+a+b);
			}
			System.out.println(mov);
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
