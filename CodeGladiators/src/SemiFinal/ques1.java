package SemiFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class ques1 {
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
			long T = s.nextLong();
			for(long t=0;t<T;t++) {
				int r = s.nextInt();
				int c = s.nextInt();
				int[] row = new int[r];
				int[] col = new int[c];
				int sumRow=0;
				int sumCol=0;
				int count1=0;
				int count2=0;
				int occurC=0;
				int occurR=0;
				for(int i=0;i<r;i++) {
					
					row[i]=s.nextInt();
					if(row[i]==0) {
						count1++;
					}
					if(row[i]==c) {
						occurC++;
					}
					sumRow+=row[i];
				}
				for(int i=0;i<c;i++) {
					col[i]=s.nextInt();
					if(col[i]==0) {
						count2++;
					}
					if(col[i]==r) {
						occurR++;
					}
					sumCol+=col[i];
				}
				Arrays.sort(row);
				Arrays.sort(col);
				if(sumRow!=sumCol || row[r-1]>(c-count2) || row[0]<occurR) {
					System.out.println("NO");
				}else if(col[c-1]>(r-count1) || col[0]<occurC) {
					System.out.println("NO");
				}
				else {
					System.out.println("YES");
				}
				
				
			}
		}
}
