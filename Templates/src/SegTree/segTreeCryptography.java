package SegTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
import java.io.PrintWriter;  

public class segTreeCryptography {
	static int r;
	static class Matrix{
		int a1;
		int a2;
		int b1;
		int b2;
		Matrix(){
			a1 = 1;
			a2 = 0;
			b1 = 0;
			b2 = 1;
		}
		
	}
	static Matrix prod(Matrix A, Matrix B) {
		Matrix ans = new Matrix();
		ans.a1 = ((A.a1%r*B.a1%r)%r + (A.a2%r*B.b1%r)%r)%r;
		ans.a2 = ((A.a1%r*B.a2%r)%r + (A.a2%r*B.b2%r)%r)%r;
		ans.b1 = ((A.b1%r*B.a1%r)%r + (A.b2%r*B.b1%r)%r)%r;
		ans.b2 = ((A.b1%r*B.a2%r)%r + (A.b2%r*B.b2%r)%r)%r;
		return ans;
	}
	static class segTree{
		int size;
		Matrix[] mat;
		void init(int n) {
			size = 1;
			while(size<n)
				size*=2;
			mat = new Matrix[2*size - 1];
			for(int i=0;i<mat.length;i++)
				mat[i] = new Matrix();
		}
		void build(Matrix[] arr, int x, int lx, int rx) {

			if(rx-lx==1) {
				if(lx<arr.length) {
					mat[x] = arr[lx];
				}
				return;
			}
			int m = (lx+rx)/2;
			build(arr, 2*x+1, lx, m);
			build(arr, 2*x+2, m, rx);
			mat[x] = prod(mat[2*x+1], mat[2*x+2]);
		}
		void build(Matrix[] mat) {
			build(mat, 0, 0, size);
		}
		Matrix getProduct(int l, int r, int x, int lx, int rx) {

			if(rx<=l || lx>=r) {
				return new Matrix();
			}
			if(lx>=l && rx<=r) {
				return mat[x];
			}
			int m  = (lx+rx)/2;
			Matrix m1 = getProduct(l, r, 2*x+1, lx, m);
			Matrix m2 = getProduct(l, r, 2*x+2, m, rx);
			Matrix ans = prod(m1, m2);
			
			return ans;
		}
		Matrix getProduct(int l, int r) {
			return getProduct(l, r, 0, 0, size);
		}
		
	}
	
	public static void main(String[] args) {
		FastReader s = new FastReader();
		PrintWriter out = new PrintWriter(System.out);
		 r = s.nextInt();
		 int n = s.nextInt(), m = s.nextInt();
		 Matrix[] mat = new Matrix[n];
		 for(int i=0;i<n;i++) {
			 mat[i] = new Matrix();
			 mat[i].a1 = s.nextInt();
			 mat[i].a2 = s.nextInt();
			 mat[i].b1 = s.nextInt();
			 mat[i].b2 = s.nextInt();
		 }
		 segTree st = new segTree();
		 st.init(n);

		 st.build(mat);
		 for(int i=0;i<m;i++) {
			 
			 int l = s.nextInt()-1;
			 int r = s.nextInt();
			 Matrix ans = st.getProduct(l, r);
			 out.println(ans.a1+" "+ans.a2);
			 out.println(ans.b1+" "+ans.b2);
			 out.println();

		 }
		out.close();
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
