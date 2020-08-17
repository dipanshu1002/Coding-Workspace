package Education93;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeB {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		while(T-- > 0) {
			char[] str = s.next().toCharArray();
			PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
			int cnt = 0;
			for(int i=0;i<str.length;i++) {
				if(str[i]=='1') {
					cnt++;
				}else {
					q.add(cnt);
					cnt = 0;
				}
			}
			q.add(cnt);
			int i = 0;
			long sum = 0;
			while(!q.isEmpty()) {
				if(i%2==0) {
					sum+=q.remove();
					i^=1;
				}else {
					q.remove();
					i^=1;
				}
			}
			System.out.println(sum);
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
