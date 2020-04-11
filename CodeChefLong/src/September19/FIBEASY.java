package September19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class FIBEASY {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			long N = s.nextLong();
			long k = (long)((1.0*(Math.log(N)))/(double)Math.log(2));
			long[] arr = new long[] {2,3,0,9};
			
			long ans = 0;
			while(N>1) {
				N/=2;
				ans++;
			}
			long num = (long)Math.pow(2,ans);
		//	System.out.println(ans);
			if(num%60==1) {
				System.out.println(0);
			}
			else if(num%60==2) {
				System.out.println(1);
			}
			else if(num%60==4) {
				System.out.println(2);
			}else if(num%60==8) {
				System.out.println(3);
			}else if(num%60==16) {
				System.out.println(0);
			}else if(num%60==32) {
				System.out.println(9);
			}
//				System.out.println(k);
//				System.out.println(num);
//			
		//	System.out.println(Long.MAX_VALUE);
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
