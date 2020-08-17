package SegTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class segTreeMaxPairSum {
	static class Pair{
		long sum;
		int max;
		Pair(){
			sum = Long.MIN_VALUE;
			max = Integer.MIN_VALUE;
		}
		Pair(long sum, int max){
			this.sum = sum;
			this.max = max;
		}
	}
	static class segTree{
		int size;
		Pair[] nodes;
		void init(int n) {
			size = 1;
			while(size<n)
				size*=2;
			nodes = new Pair[2*size - 1];
			for(int i=0;i<nodes.length;i++)
				nodes[i]= new Pair();
		}
		void set(int in,int val, int x, int lx, int rx) {
			if(rx-lx==1) {
				nodes[x].sum = val;
				nodes[x].max = val;
				return;
			}
			int m = (lx + rx)/2;
			if(in<m)
				set(in, val, 2*x+1,lx,m);
			else
				set(in, val, 2*x+2, m, rx);
			nodes[x].sum = Math.max(nodes[2*x+1].sum,Math.max(nodes[2*x+2].sum, nodes[2*x+1].max+nodes[2*x+2].max));
//			nodes[x].sum=nodes[2*x+1].max+nodes[2*x+2].max;
			nodes[x].max = Math.max(nodes[2*x+1].max, nodes[2*x+2].max);
			
		}
		void set(int in, int val) {
			set(in, val, 0, 0, size);
		}
		
		Pair maxSum(int l, int r, int x, int lx, int rx) {
			if(rx<=l || lx>=r) return new Pair(Long.MIN_VALUE,Integer.MIN_VALUE);
			if(lx>=l && rx<=r) return nodes[x];
			int m = (lx+rx)/2;
			Pair p1 = maxSum(l, r, 2*x+1, lx, m);
			Pair p2 = maxSum(l, r, 2*x+2, m, rx);
			Pair p3 = new Pair(Math.max(p1.sum, Math.max(p2.sum,p1.max+p2.max)), Math.max(p1.max, p2.max));
			return p3;
		}
		Pair maxSum(int l, int r) {
			return maxSum(l, r, 0, 0, size);
		}
		
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		
		segTree st = new segTree();
		st.init(n);
		for(int i=0;i<n;i++) {
			int v = s.nextInt();
			st.set(i,v);
		}
		int m = s.nextInt();
//		for(int i=0;i<st.nodes.length;i++) {
//			System.out.println("Node "+i+": "+st.nodes[i].sum+" "+st.nodes[i].max);
//		}
		for(int i=0;i<m;i++) {
			String op = s.next();
			if(op.charAt(0) == 'U') {
				int in = s.nextInt()-1, v = s.nextInt();
				st.set(in, v);
			}
			else {
				int l = s.nextInt()-1, r = s.nextInt();
				Pair max = st.maxSum(l, r);
				System.out.println(max.sum);
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
