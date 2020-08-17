package SegTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class segTreeMinCount {
	static class Pair{
		long min;
		long count;
		Pair(long min, long count){
			this.min = min;
			this.count = count;
		}
	}
	static class segTree{
		int size;
		long[] mins;
		long[] counts;
		void init(int n) {
			size = 1;
			while(size<n)
				size*=2;
			mins = new long[2*size - 1];
			counts = new long[2*size - 1];
		}
		void set(int in,int val, int x, int lx, int rx) {
			if(rx-lx==1) {
				mins[x]=val;
				counts[x]=1;
				return;
			}
			int m = (lx + rx)/2;
			if(in<m)
				set(in, val, 2*x+1,lx,m);
			else
				set(in, val, 2*x+2, m, rx);
			
			mins[x]=Math.min(mins[2*x+1], mins[2*x+2]);
			if(mins[2*x+1]==mins[2*x+2]) {
				counts[x]=counts[2*x+1]+counts[2*x+2];
			}else {
				if(mins[2*x+1]<mins[2*x+2])
					counts[x]=counts[2*x+1];
				else
					counts[x]=counts[2*x+2];
			}
			
		}
		void set(int in, int val) {
			set(in, val, 0, 0, size);
		}
		
		Pair min(int l, int r, int x, int lx, int rx) {
			if(rx<=l || lx>=r) return new Pair(Long.MAX_VALUE, -1);
			if(lx>=l && rx<=r) return new Pair(mins[x], counts[x]);
			int m = (lx+rx)/2;
			Pair p1 = min(l, r, 2*x+1, lx, m);
			Pair p2 = min(l, r, 2*x+2, m, rx);
			if(p1.min==p2.min) {
				return new Pair(p1.min, p1.count+p2.count);
			}else {
				if(p1.min<p2.min)
					return p1;
				else
					return p2;
			}
 
		}
		Pair min(int l, int r) {
			return min(l, r, 0, 0, size);
		}
		
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int m = s.nextInt();
		segTree st = new segTree();
		st.init(n);
		for(int i=0;i<n;i++) {
			int v = s.nextInt();
			st.set(i,v);
		}
		
		for(int i=0;i<m;i++) {
			int op = s.nextInt();
			if(op == 1) {
				int in = s.nextInt(), v = s.nextInt();
				st.set(in, v);
			}
			else {
				int l = s.nextInt(), r = s.nextInt();
				Pair min = st.min(l, r);
				System.out.println(min.min+" "+min.count);
			}
			
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
