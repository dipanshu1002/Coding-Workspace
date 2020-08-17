package Round657;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeB{
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		while(T-- > 0) {
			
		    long l=s.nextLong(), r = s.nextLong(), m = s.nextLong();	    
		    long min = (r-l);
		    long a = -1 , b=-1,c = -1;
		    for(long i=l;i<=r;i++){
		     	long lo = (m/i)*i;
		     	long up = (m/i  + 1)*i;
		     	
		     	long sub1 = (m-lo);
		     	long  sub2 = (up-m);
		     	
		     	if(sub1<=min  && (m/i)!=0){
		     		a = i;
		     		b = l+sub1;
		     		c = l;
		     		break;
		     	}
		     	
	             if(sub2<=min){
		     		a = i;
		     		b = l;
		     		c = l+sub2;
		     		break;
		     	}
		    }
		    System.out.println(a+" "+b+" "+c);
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
