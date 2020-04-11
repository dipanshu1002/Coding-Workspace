package June19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
import java.math.BigInteger;

public class KC2 {
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
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			long N = s.nextLong();
			HashSet<Integer> set = new HashSet<Integer>();
			set.add(0);
			set.add(1);
			set.add(2);
			set.add(3);
			set.add(4);
			set.add(5);
			set.add(6);
			set.add(7);
			set.add(8);
			set.add(9);
			
			long num = N*10;
			String str="";
			str+=N;
			
			int sum;
			for(sum=0;N>0;sum+=N%10,N/=10) {}
			
			for(int i:set) {
				if((sum+i)%10==0) {
					str+=i;
					break;
				}
			}
			System.out.println(str);
		}
	}
}
