package JulyLunch19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class SFRV {
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
	static class Triplet implements Comparable<Triplet>{
		int diff;
		int l;
		int r;
		public int compareTo(Triplet triplet) {
			return this.diff - triplet.diff;
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int N = s.nextInt();
			int[] arr = new int[N];
			ArrayList<Triplet> list = new ArrayList<>();
			int[] diff = new int[N-1];
			
			for(int i=0;i<N;i++) {
				arr[i]=s.nextInt();
				if(i==0) {
					continue;
				}
				Triplet p = new Triplet();
				p.diff = arr[i]-arr[i-1];
				p.l = i-1;
				p.r = i;
				list.add(p);
			}
			int[] visited = new int[N];
			Collections.sort(list);
			for(Triplet tr: list) {
				if(visited[tr.r]==0 && visited[tr.l]==0) {
					visited[tr.l]=1;
					visited[tr.r]=1;
					arr[tr.l] = arr[tr.l]^arr[tr.r];
					arr[tr.r] = arr[tr.l]^arr[tr.r];
					arr[tr.l] = arr[tr.l]^arr[tr.r];
				}
				System.out.println(tr.diff+" "+tr.r+" "+tr.l);
			}
			long sum = 0;
			for(int i=1;i<=N;i++) {
				sum+=arr[i-1]*i;
			}
			System.out.println(sum);
			for(int i: arr) {
				System.out.print(i+" ");
			}
		//	int[] visited = new int[N];
		}
	}
}
