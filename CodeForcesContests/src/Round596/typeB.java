package Round596;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeB {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int k = s.nextInt();
			int d = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			int[] type = new int[k+1];
			Queue<Integer> q = new LinkedList<>();
			for(int i=0;i<d;i++) {
				q.add(arr[i]);
				type[arr[i]]++;
			}
//			System.out.println(q);
			int size=0;
			int finalSize = 0;
			for(int i=0;i<k+1;i++) {
				if(type[i]!=0) {
					size++;
				}
			}
			finalSize=size;
			for(int i=d;i<n;i++) {
				int rem = q.remove();
				type[rem]--;
				if(type[rem]==0) {
					size--;
				}
				q.add(arr[i]);
				type[arr[i]]++;
				if(type[arr[i]]==1) {
					size++;
				}
				if(size<finalSize) {
					finalSize=size;
				}
			}
			System.out.println(finalSize);
			
//			System.out.println(sz);
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
