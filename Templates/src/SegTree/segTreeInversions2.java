package SegTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class segTreeInversions2 {
	static class segTree{
		int size;
		int[] sums;
		void init(int n) {
			size = 1;
			while(size<n)
				size*=2;
			sums = new int[2*size - 1];
		}
		void setInit(int[] arr, int x , int lx, int rx) {
			if(rx-lx ==1) {
				if(lx<arr.length)
					sums[x] = arr[lx];
				return;
			}
			int m = (rx+lx)/2;
			setInit(arr, 2*x+1, lx, m);
			setInit(arr, 2*x+2, m, rx);
			
			sums[x] = sums[2*x+1]+sums[2*x+2];
		}
		void setInit(int[] arr){
			setInit(arr, 0, 0,  size);
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
		
		
		
		int find(int k, int x, int lx, int rx) {
			if(k==0 && rx-lx==1 && sums[x]==1) {
				return lx+1;
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
		int n = s.nextInt();
		int[] arr = new int[n];
		Arrays.fill(arr, 1);
		segTree st = new segTree();
		st.init(n);
		st.setInit(arr);
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int[] ans = new int[n];
		for(int i=n-1;i>=0;i--) {
			int val = arr[i];
			ans[i] = st.find(i-val);
			st.set(ans[i]-1);
		}
		for(int i=0;i<n;i++)
			System.out.print(ans[i]+" ");;
		
		
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
