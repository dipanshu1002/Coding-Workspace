package Round643;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class typeA {
	static class Pair{
		long max;
		long min;
	}
	
	public static Pair find(long num){
		Pair p = new Pair();
		p.max = 0;
		p.min = 9;
		 while(num != 0)  
		    { 
		        long r = num % 10; 
		  
		        // Find the largest digit 
		        p.max = Math.max(r, p.max); 
		  
		        // Find the smallest digit 
		        p.min = Math.min(r, p.min); 
		  
		        num = num / 10; 
		    } 
		 return p;
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			long n = s.nextLong();
			long k = s.nextLong();
			k--;
			while(k>0) {
				long ans = n + find(n).max*find(n).min;
				if(n==ans)
					break;
				n=ans;
				k--;
			}
			System.out.println(n);
			
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