package SegTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class segTreeFirstAboveX {

	static class segTree {
		int size;
		int[] nodes;
		
		void init(int n) {
			size = 1;
			while(size<n)
				size*=2;
			nodes = new int[2*size - 1];
			
		}
		void build(int[] arr, int x, int lx, int rx) {
			if(rx-lx ==1) {
				if(lx<arr.length) {
					nodes[x] = arr[lx];
				}
				return;
			}
			int m = (rx+lx)/2;
			build(arr, 2*x+1, lx, m);
			build(arr, 2*x+2, m, rx);
			nodes[x] = Math.max(nodes[2*x+1], nodes[2*x+2]);
			
		}
		void build(int[] arr) {
			build(arr, 0, 0, size);
		}
		void set(int in, int val, int x, int lx, int rx) {
			if(rx - lx == 1) {
				nodes[x] = val;
				return;
			}
			int m = (lx+rx)/2;
			if(in<m)
				set(in, val, 2*x+1, lx, m);
			else
				set(in, val, 2*x+2, m, rx);
			
			nodes[x] = Math.max(nodes[2*x+1], nodes[2*x+2]);
			
		}
		void set(int in, int val) {
			set(in, val, 0, 0, size);
		}
		int first_above(int k, int x, int lx, int rx) {
			if(nodes[x]<k)
				return -1;
			if(rx - lx == 1) return lx;
				
			int m = (lx+rx)/2;
			int res = first_above(k, 2*x+1, lx, m);
			if(res == -1) res = first_above(k, 2*x+2, m, rx);
			
			return res;
		}
		int first_above(int k) {
			return first_above(k, 0, 0, size);
		}
		int first_above_B(int val, int l, int x, int lx, int rx) {
			if(rx<=l) return -1;
			if(nodes[x]<val) return -1;
			if(rx - lx == 1) return lx;
				
			int m = (lx+rx)/2;
			int res = first_above_B(val, l, 2*x+1, lx, m);
			if(res == -1)
				res = first_above_B(val, l, 2*x+2, m, rx);
		
			return res;
		}
		int first_above_B(int val, int l) {
			return first_above_B(val, l, 0, 0, size);
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt(), m = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		segTree st = new segTree();
		st.init(n);
		st.build(arr);
		for(int i=0;i<m;i++) {
			int op = s.nextInt();
			if(op==2) {
				System.out.println(st.first_above_B(s.nextInt(), s.nextInt()));
			}else {
				st.set(s.nextInt(), s.nextInt());
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
