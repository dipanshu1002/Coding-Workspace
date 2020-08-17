package Round661;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		while(T-->0) {
			int n = s.nextInt();
			int[] arr = new int[n];
			int ans = 0;
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			for(int sum = 2;sum<=101;sum++) {
//				System.out.println(sum);
				int count = 0;
				boolean[] visited = new boolean[n];
				Arrays.fill(visited, false);
				for (int i = 0; i < arr.length; i++) {
					if(!visited[i]) {
						for (int j = i + 1; j < arr.length; j++) {
			                if ((arr[i] + arr[j]) == sum && !visited[j]) {
			                	count++;
			                	visited[j]=true;
			                	break;
			                }
			                     
						}
					}
					
				}
//		        System.out.println("sum: "+sum+"count: "+count);   
			ans = Math.max(count,ans);
			}
			System.out.println(ans);;
		
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
