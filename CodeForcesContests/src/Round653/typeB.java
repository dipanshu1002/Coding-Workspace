package Round653;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeB {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T  = s.nextInt();
		for(int t=0;t<T;t++) {
			long n = s.nextInt();
			long st = 0;
		  	while(n%2==0){
		  		st++;
		  		n = n/2;
		  	}
		  	
		  	long en = 0;
		  	while(n%3==0){
		  		en++;
		  		n = n/3;
		  	}
		  	
		  	if(n==1 && en>=st){
		  		long p = Math.abs(en-st);
		  		long ans = en+p;
		  		System.out.println(ans);
		  	}
		  	
		  	
		  	else
		  	 System.out.println(-1);
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
