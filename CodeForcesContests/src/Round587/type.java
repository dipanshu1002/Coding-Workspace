package Round587;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class type {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		String str = s.next();
		int[] a = new int[n];
		int[] b = new int[n];
		char[] ans = new char[n];
		int op=0;
		for(int i=1;i<n;i+=2) {
			if(str.charAt(i)=='a' && str.charAt(i-1)=='a') {
				op++;
				ans[i-1]=str.charAt(i-1);
				ans[i]='b';
			}else if(str.charAt(i)=='b' && str.charAt(i-1)=='b') {
				op++;
				ans[i-1]='b';
				ans[i]='a';
			}else {
				ans[i-1]=str.charAt(i-1);
				ans[i]=str.charAt(i);
			}
			
		}
		System.out.println(op);
		System.out.println(ans);
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
