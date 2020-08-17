package SegTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class segTreeKthOne {
	
	static class segTree{
		int size;
		int[] sums;
		void init(int n) {
			size = 1;
			while(size<n)
				size*=2;
			sums = new int[2*size - 1];
		}
		void set(int in, int x , int lx, int rx) {
			if(rx-lx ==1) {
				sums[x] ^=1;
				return;
			}
			int m = (rx+lx)/2;
			if(in<m)
				set(in, 2*x+1, lx, m);
			else
				set(in, 2*x+2, m, rx);
			
			sums[x] = sums[2*x+1]+sums[2*x+2];
		}
		void set(int in){
			set(in, 0, 0,  size);
		}
		
		void setInit(int in,int val, int x , int lx, int rx) {
			if(rx-lx ==1) {
				sums[x] = val;
				return;
			}
			int m = (rx+lx)/2;
			if(in<m)
				setInit(in, val, 2*x+1, lx, m);
			else
				setInit(in, val, 2*x+2, m, rx);
			
			sums[x] = sums[2*x+1]+sums[2*x+2];
		}
		void setInit(int in, int val){
			setInit(in, val, 0, 0,  size);
		}
		
		int find(int k, int x, int lx, int rx) {
			if(k==0 && rx-lx==1 && sums[x]==1) {
				return lx;
			}
			int m = (lx+rx)/2;
			if(sums[2*x+1]>k)
				return find(k, 2*x+1,lx,m);
			else
				return find(k-sums[2*x+1], 2*x+2, m, rx);
		}
		int find(int k) {
			return find(k, 0, 0, size);
		}
		
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt(), m = s.nextInt();
		segTree st = new segTree();
		st.init(n);
		for(int i=0;i<n;i++) {
			st.setInit(i, s.nextInt());
		}
		for(int i=0;i<m;i++) {
			int op = s.nextInt();
			if(op==2) {
				System.out.println(st.find(s.nextInt()));
			}else {
				st.set(s.nextInt());
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
