package October19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class EVEDG {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			int M = s.nextInt();
			HashSet<Integer>[] list = new HashSet[N];
			for(int i=0;i<N;i++)list[i] = new HashSet<>();
			int a =0;
			int b = 0;
			for(int i=0;i<M;i++) {
				int sv = s.nextInt()-1;
				int fv = s.nextInt()-1;
				a = sv;
				b = fv;
				list[sv].add(fv);
				list[fv].add(sv);
			}
			int[] deg = new int[N];
			for(int i=0;i<N;i++)deg[i]=list[i].size();
//			int oddFlag = 0;
			int index = -1;
			for(int i=0;i<N;i++) {
				if(deg[i]%2==1) {
					index = i;
					break;
				}
			}
			if(M%2==0) {
				System.out.println(1);
				for(int i=0;i<N;i++)System.out.print(1+" ");
				System.out.println();
			}else if(index!=-1) {
//				System.out.println(index);
				System.out.println(2);
				for(int i=0;i<N;i++) {
					if(i==index)System.out.print(2+" ");
					else System.out.print(1+" ");
					
				}
			}else if(index==-1) {
				System.out.println(3);
				for(int i=0;i<N;i++) {
					if(i==a)System.out.print(1+" ");
					if(i==b)System.out.print(2+" ");
					else System.out.print(3+" ");
				}
				System.out.println();
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
