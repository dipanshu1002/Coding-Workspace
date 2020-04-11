import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class dexter {
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
	
	public static void main(String[] args) {
		FastReader s = new FastReader();
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			int a = s.nextInt();
			set1.add(a);
		}
		Set<Integer> inter = new HashSet<Integer>(set1);
		int m = s.nextInt();
		for(int i=0;i<m;i++) {
			int a = s.nextInt();
			set2.add(a);
		}
		inter.retainAll(set2);
		set1.removeAll(inter);
		set2.removeAll(inter);
		set1.addAll(set2);
		TreeSet<Integer> set = new TreeSet<Integer>(set1);
		Iterator val = set.iterator();
		while(val.hasNext()) {
			System.out.print(val.next()+" ");
		}
	}
}
