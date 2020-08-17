package Round664;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		
			int n = s.nextInt();
			int m = s.nextInt();
			long[] a = new long[n];
			long[] b = new long[m];
			for(int i=0;i<n;i++)
				a[i]=s.nextInt();
			for(int i=0;i<m;i++)
				b[i]=s.nextInt();
			
			long[] c = new long[n];
			for(int i=0;i<n;i++) {
				long min = a[i]&b[0];
				for(int j=0;j<m;j++) {
					min = Math.min(a[i]&b[j], min);
				}
				c[i]=min;
			}
			System.out.println(Arrays.toString(c));
			long ans = 0;
			for(int i=0;i<n;i++) {
				ans=ans|c[i];
			}
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
