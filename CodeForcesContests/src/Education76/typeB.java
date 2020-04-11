package Education76;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeB{
	static long mod = (long)Math.pow(10,9)+7;
	public static long power(long a, long n) {
		if(n==0) {
			return 1;
		}
		if(n%2==0) {
			return power((a*a)%mod,n/2);
		}
		else {
			return (a%mod*power((a*a)%mod,n/2)%mod)%mod;
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int t = s.nextInt();
		for(int T = 0; T<t;T++) {
			long x = s.nextLong();
			long y = s.nextLong();
			long a = (long)((double)Math.log(x)/(double)Math.log(2));
//			System.out.println(a);
			if(x==y) {
				System.out.println("Yes");
			}
			else {
				if(x>3) {
					System.out.println("Yes");
				}else if(x==2||x==3) {
					if(y==1 || y==2 || y==3) {
						System.out.println("Yes");
					}else {
						System.out.println("No");
					}
				}else {
					System.out.println("No");
				}
			
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
