package Education93;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeD {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int r = s.nextInt();
		int g = s.nextInt();
		int b = s.nextInt();
		PriorityQueue<Long> r1 = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Long> g1 = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Long> b1 = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<r;i++)
			r1.add(s.nextLong());
		for(int i=0;i<g;i++)
			g1.add(s.nextLong());
		for(int i=0;i<b;i++)
			b1.add(s.nextLong());
		
		long ar = 0;
		while(!r1.isEmpty() && !g1.isEmpty() && !b1.isEmpty()) {
			long r2 = r1.peek();
			long g2 = g1.peek();
			long b2 = b1.peek();
			
			//R greatest
			if(r2>=g2 && r2>=b2) {
				r1.poll();
				if(g2>=b2) {
					g1.poll();
					ar+=(r2*g2);
					
				}else {
					b1.poll();
					ar+=(r2*b2);
					
				}
				//G greatest
			}else if(g2>=b2 && g2>=r2) {
				g1.poll();
				if(b2>=r2) {
					b1.poll();
					ar+=(b2*g2);
					
				}else {
					r1.poll();
					ar+=(r2*g2);
					
				}
				//B greatest
			}else {
				b1.poll();
				if(g2>=r2) {
					g1.poll();
					ar+=(b2*g2);
					
				}else {
					r1.poll();
					ar+=(r2*b2);
				}
			}
			
		}
		
		if(r1.isEmpty()) {
			while(!b1.isEmpty() && !g1.isEmpty()) {
				ar+=(b1.poll()*g1.poll());
			}
		}
		else if(g1.isEmpty()) {
			while(!r1.isEmpty() && !b1.isEmpty()) {
				ar+=(b1.poll()*r1.poll());
			}
		}
		else if(b1.isEmpty()) {
			while(!r1.isEmpty() && !g1.isEmpty()) {
				ar+=(r1.poll()*g1.poll());
			}
		}
		System.out.println(ar);
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
