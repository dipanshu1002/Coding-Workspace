package SegTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class segTreeMaxSegmentSum {
	static class Node{
		long maxSegSum;
		long maxPrefSum;
		long maxSuffSum;
		long sum;
		Node(){
			maxSegSum = Integer.MIN_VALUE;
			maxPrefSum = Integer.MIN_VALUE;
			maxSuffSum = Integer.MIN_VALUE;
			sum = 0;
		}
		Node(long maxSegSum, long maxPrefSum, long maxSuffSum, long sum){
			this.maxSegSum = maxSegSum;
			this.maxPrefSum = maxPrefSum;
			this.maxSuffSum = maxSuffSum;
			this.sum = sum;
		}
		
	}
	static class segTree{
		int size;
		Node[] nodes;
		void init(int n) {
			size = 1;
			
			while(size<n)
				size*=2;
			nodes = new Node[2*size - 1];
			
			for(int i=0;i<nodes.length;i++)
				nodes[i]= new Node();
			
		}
		void set(int in, int val, int x, int lx, int rx) {
			if(rx-lx==1) {
				nodes[x].maxSegSum = val;
				nodes[x].maxPrefSum = val;
				nodes[x].maxSuffSum = val;
				nodes[x].sum = val;
				return;
			}
			int m = (lx+rx)/2;
			if(in<m)
				set(in, val, 2*x+1, lx, m);
			else
				set(in, val, 2*x+2, m, rx);
			
			nodes[x].maxSegSum = Math.max(nodes[2*x+1].maxSegSum, Math.max(nodes[2*x+2].maxSegSum, nodes[2*x+1].maxSuffSum+nodes[2*x+2].maxPrefSum));
			nodes[x].maxPrefSum = Math.max(nodes[2*x+1].sum + nodes[2*x+2].maxPrefSum, nodes[2*x+1].maxPrefSum);
			nodes[x].maxSuffSum = Math.max(nodes[2*x+2].sum + nodes[2*x+1].maxSuffSum, nodes[2*x+2].maxSuffSum);
			nodes[x].sum = nodes[2*x+ 1].sum + nodes[2*x+2].sum;

		}
		void set(int in, int val) {
			set(in, val, 0, 0, size);
		}
		
		Node maxSegSum(int l, int r, int x, int lx, int rx) {
			if(rx<=l || lx>=r) return new Node();
			if(lx>=l && rx<=r) return nodes[x];
			int m = (lx+rx)/2;
			Node n1 = maxSegSum(l, r, 2*x+1, lx, m);
			Node n2 = maxSegSum(l, r, 2*x+2, m, rx);
			Node n3 = new Node();
			n3.maxSegSum = Math.max(n1.maxSegSum, Math.max(n2.maxSegSum, n1.maxSuffSum + n2.maxPrefSum));
			n3.maxPrefSum = Math.max(n1.maxPrefSum, n1.sum + n2.maxPrefSum);
			n3.maxSuffSum = Math.max(n2.maxSuffSum, n2.sum + n1.maxSuffSum);
			n3.sum = n1.sum + n2.sum;
			return n3;

		}
		Node maxSegSum(int l, int r) {
			return maxSegSum(l, r, 0, 0, size);
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt(), m = s.nextInt();
		segTree st = new segTree();
		st.init(n);
		for(int i=0;i<n;i++) {
			int val = s.nextInt();
			st.set(i, val);
		}
		

		for(int i=0;i<m;i++) {
			int op = s.nextInt();
			if(op==1) {
				int in = s.nextInt();
				int val = s.nextInt();
				st.set(in, val);
			}
			else {
				int l = s.nextInt();
				int r = s.nextInt();
				Node ans = st.maxSegSum(l, r);
				if(ans.maxSegSum<0) 
					System.out.println(0);
				else
					System.out.println(ans.maxSegSum);
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
