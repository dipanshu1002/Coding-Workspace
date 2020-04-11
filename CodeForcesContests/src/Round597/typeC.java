package Round597;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeC {
	static long[] fib = new long[1000001];
	static long mod = 1000000007;
	public static void fibbo() {
		fib[0]=1;
		fib[1]=1;
		for(int i=2;i<=100000;i++) {
			fib[i]=(fib[i-1]+fib[i-2])%mod;
		}
	}
	
	public static void main(String[] args) {
//		System.out.println(fib[1]);
		FastReader s = new FastReader();
		String str = s.nextLine();
		int n = str.length();
		boolean check = false;
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='m'||str.charAt(i)=='w') {
				check = true;
				break;
			}
		}
//		System.out.println(check);
		if(check) {
			System.out.println(0);
			return;
		}
		ArrayList<Integer> v = new ArrayList<>();
		int c = 1;
		for(int i=1;i<n;i++) {
			if(str.charAt(i)==str.charAt(i-1) && str.charAt(i-1)=='u') {
				c++;
			}else {
				if(c!=1) {
					v.add(c);
					c=1;
				}
			}
		}
		if(c!=1) {
			v.add(c);
		}
		c=1;
		for(int i=1;i<n;i++) {
			if(str.charAt(i)==str.charAt(i-1) && str.charAt(i-1)=='n') {
				c++;
			}else {
				if(c!=1) {
					v.add(c);
					c=1;
				}
			}
		}
		if(c!=1){
			v.add(c);
		}
		long ans = 1;
//		System.out.println(v);
		fibbo();
		for(int i=0;i<v.size();i++) {
//			System.out.println(fib[v.get(i)]);
			ans = (ans*fib[v.get(i)])%mod;
		}
		System.out.println(ans);
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
