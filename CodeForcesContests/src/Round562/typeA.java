package Round562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class typeA {
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
		int n =s.nextInt();
		int a = s.nextInt();
		int x = s.nextInt();
		int b = s.nextInt();
		int y = s.nextInt();
		int flag=0;
		if(a==b) {
			System.out.println("YES");
			return;
		}
		else {
			while(a!=b && a!=x && b!=y) {
				if(a==n) {
					a=0;
				}
				if(b==1) {
					b=n+1;
				}
				a++;
				b--;
				
				if(a==b) {
					System.out.println("YES");
					return;
				}
				
			}
			if(a==x||b==y && x!=y) {
				System.out.println("NO");
			}
		}
			
	}
}
