package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int k = s.nextInt();
			PriorityQueue<Integer> q1 = new PriorityQueue<>();
			PriorityQueue<Integer> q2 = new PriorityQueue<>();
			for(int i=0;i<n;i++) {
				int ele = s.nextInt();
				if(ele<=k) {
					q1.add(ele);
				}else {
					q2.add(ele);
				}
			}
			while(!q2.isEmpty()) {
				if(q2.size()==1) {
					int ele = q2.remove();
					q1.add(ele);
					continue;
				}
				int ele1 = q2.remove();
				int ele2 = q2.remove();
				ele1--;
				ele2--;
				if(ele1<=k)q1.add(ele1);
				else q2.add(ele1);
				if(ele2<=k) q1.add(ele2);
				else q2.add(ele2);
			}
			long sum = 0;
			for(int i:q1) {
				sum+=i;
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
