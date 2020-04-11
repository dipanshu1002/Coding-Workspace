package Round577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

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
		int n  = s.nextInt();
		int m = s.nextInt();
		//s.nextLine();
		String[] arr = new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextLine();
		}
		int[][] answer = new int[5][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				answer[arr[i].charAt(j)-'A'][j]+=1;
			}
		}
		int[] point = new int[m];
		for(int i=0;i<m;i++) {
			point[i]=s.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<m;i++) {
			int max = answer[0][i];
			int ch = 0;
			for(int j=0;j<5;j++) {
				if(answer[j][i]>max) {
					max = answer[j][i];
					ch = j;
				};
				
			}
			map.put(i,ch);
			
		}
		int ans = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<m;j++) {
				if((arr[i].charAt(j)-'A')==map.get(j)) {
					ans+=point[j];
				}
			}
		}
		System.out.println(ans);
		
			
	}
}
