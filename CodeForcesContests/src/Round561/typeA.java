package Round561;

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
		int[] arr = new int[26];
		for(int i=0;i<n;i++) {
			String str = s.next();
			str = str.toLowerCase();
			int j = str.charAt(0)-97;
			//System.out.println(j);
			arr[j]++;
		}
		int[] c1 = new int[26];
		int[] c2 = new int[26];
		int total = 0;
		for(int i=0;i<arr.length;i++) {
			c1[i] = (arr[i]+1)/2;
			//System.out.println(c1[i]);
			c2[i]=arr[i]-c1[i];
			total += ((c1[i]*(c1[i]-1))/2 + (c2[i]*(c2[i]-1))/2);
		}
		System.out.println(total);
		
	}
}
