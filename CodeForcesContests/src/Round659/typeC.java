package Round659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		while(T-- >0) {
			int n = s.nextInt();
			char[] str1 = s.next().toCharArray();
			char[] str2 = s.next().toCharArray();
			boolean ans = true;
			int mv = 0;
			for(int i=0;i<n;i++) {
				if(str2[i]<str1[i]) {
					ans=false;
//					System.out.println(-1);
					break;
				}
					
			}
			
			int in = 0;
//			int j = 0;
			for(int i=0;i<n;i++) {
				if(str1[i]!=str2[i]) {
					char ch = str1[i];
					for(int j=i;j<n;j++) {
						if(str1[j]==ch && str1[j]!=str2[j] ) {
							str1[j]=str2[i];
						}
					}
					mv++;
				}
				
				
			}
			
			
			
			if(ans)
				System.out.println(mv);
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
