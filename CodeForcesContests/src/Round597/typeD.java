package Round597;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeD {
	static class Pair{
		int x;
		int y;
		int k;
		int c;
		Pair(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		Pair[] arr = new Pair[n];
		for(int i=0;i<n;i++) {
			arr[i] = new Pair(s.nextInt(), s.nextInt());
		}
		int[] c = new int[n];
		for(int i=0;i<n;i++) {
			c[i] = s.nextInt();
			arr[i].c = c[i];
		}
		int[] k = new int[n];
		for(int i=0;i<n;i++) {
			k[i]=s.nextInt();
			arr[i].k = k[i];
		}
		Arrays.sort(arr, new Comparator<Pair>() {

			public int compare(Pair a, Pair b) {
				if(a.x==b.x) {
					return a.y - b.y;
				}
				return a.x - b.x;
			}
			
		});
		
		
		
		
		
		
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
