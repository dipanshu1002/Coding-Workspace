package June19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;


import June19.KC2.FastReader;

public class RSIGNS {
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
	static class Pair{
		int x;
		int y;
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			HashSet<Long> set = new HashSet<Long>();
			long K = s.nextLong();
			long num = (long)Math.pow(10,K);
			long count=0;
			for(long i=0;i<num;i++) {
				set.clear();
				//System.out.print(i+" ");
				int flag=0;
				long n = i;
				long rev = num-i-1;
				//System.out.println(rev);
				long copy = rev;
				if(n==0) {
					set.add((long)0);
				}
				
				while(n>=1) {
					set.add(n%10);
					if(set.size()>2) {
						flag=1;
						break;
					}
					n/=10;
				}
				//System.out.println(set);
				if(flag==1)continue;
				if(copy==0) {
					set.add((long)0);
				}
				while(copy>=1) {
					set.add(copy%10);
					if(set.size()>2) {
						flag=1;
						break;
					}
					copy/=10;
					
				}
				if(flag==1)continue;
				if(flag==0 && set.size()==2) {
					System.out.println(i+" "+rev);
					System.out.println(set);
					set.clear();
					System.out.println(set);
					count++;
				}
			}
			System.out.println(count);
		}
		
	
	}
}
