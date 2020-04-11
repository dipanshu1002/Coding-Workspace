package Round511;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeA {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		long n = s.nextLong();
		long b = (n-1)/2;
		long c = (n-1) - b;
		if(b%3==0 && c%3==0) {
			b+=2;
			c-=2;
		}else if(b%3==0 && c%3==2) {
			b+=1;
			c-=1;
		}else if(b%3==0 && c%3==1) {
			b-=1;
			c+=1;
		}else if(c%3==0 && b%3==2) {
			b-=1;
			c+=1;
		}else if(c%3==0 && b%3==1) {
			b+=1;
			c-=1;
	}
		System.out.println(1+" "+b+" "+c);
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
