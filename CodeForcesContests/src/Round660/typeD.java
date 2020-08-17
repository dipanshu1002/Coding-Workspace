package Round660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeD {
	static class Pair{
		int val;
		int in;
		Pair(int val, int in){
			this.val = val;
			this.in = in;
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		Pair[] a = new Pair[n];
		int[] b = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = new Pair(s.nextInt(), i);
		}
		for(int i=0;i<n;i++) {
			b[i] = s.nextInt();
		}
//		Arrays.sort(a, new Comparator<Pair>() {
//
//			@Override
//			public int compare(Pair p1, Pair p2) {
//				if(p1.val==p2.val)
//					return p1.in - p2.in;
//				return p2.val - p1.val;
//			}
//			
//		});
//		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>(n);
		for(int i=0;i<n;i++) {
			list.add(new ArrayList<>());
		}
		for(int i=0;i<n;i++) {
			list.get(i).add(i);
			int j = b[i];
			while(j!=-1) {
				list.get(i).add(j);
				j = b[j];
			}
		}
		for(int i = 0; i<n;i++) {
			System.out.println(list.get(i));
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i].val+" "+a[i].in);
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
