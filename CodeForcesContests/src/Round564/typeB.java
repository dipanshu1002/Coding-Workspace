package Round564;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class typeB {
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
		long N = s.nextLong();
		if(N==1) {
			System.out.println(1);
			System.out.println(1+" "+1);
			return;
		}
		int M = (int)Math.floor(N/2);
	    System.out.println((M+1));
		int count=0;
		int r=0;
		int c=1;
		for(int i=0;i<N;i++) {
			if(count==0) {
				System.out.println((r+=1)+" "+c);
		 		count=1;
		 		continue;
			}
			if(count==1) {
				System.out.println(r+" "+((c+=1)));
				count=0;
				continue;
			}
			
		}
	}
}
