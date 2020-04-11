package Round590;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeB{
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int k = s.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<n;i++) {
			int id = s.nextInt();
			if(q.size()<=k && set.contains(id)) {
				continue;
			}
			else {
				if(q.size()==k) {
					int a = q.remove();
					set.remove(a);
					q.add(id);
					set.add(id);
				}else {
					q.add(id);
					set.add(id);
				}
			}
		}
		System.out.println(q.size());
		int[] arr = new int[q.size()];
		int l = arr.length-1;
		
		for(int i:q) {
			arr[l]=i;
			l--;
			
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		//System.out.println(q);
		
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
