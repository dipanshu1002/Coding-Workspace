package Round642;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class typeB {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int k = s.nextInt();
			long sumA = 0;
			long sumB = 0;
			PriorityQueue<Integer> A = new PriorityQueue<>();
			for(int i=0;i<n;i++) {
				int a = s.nextInt();
				sumA+=a;
				A.add(a);
			}
			PriorityQueue<Integer> B = new PriorityQueue<>(Collections.reverseOrder());
			for(int i=0;i<n;i++) {
				int a = s.nextInt();
				sumB+=a;
				B.add(a);
			}
			while(B.size()>0 && A.size()>0 && A.peek()<B.peek() && k>0) {
				k--;
				sumA+=(B.poll()-A.poll());
			}
			System.out.println(sumA);
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