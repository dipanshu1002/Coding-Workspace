package Round560;

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
		int n = s.nextInt();
		int x = s.nextInt();
		int y = s.nextInt();
		String str = s.next();
		int len = str.length();
		int ptr = str.length()-x-1;
		int ptr2 = str.length()-y-1;
		int op=0;
		for(int i=ptr;i<str.length();i++) {
			if(i==ptr) {
				if(str.charAt(i)=='0') {
					op++;
					continue;
				}
				else {
					continue;
				}
			}
			if(i==ptr2) {
				if(str.charAt(i)=='1') {
					continue;
				}
				else {
					op++;
					continue;
				}
			}
			else{
				if(str.charAt(i)=='1') {
					op++;
					continue;
				}
				else {
					continue;
				}
			}
			
		}
		System.out.println(op);
	}
}
