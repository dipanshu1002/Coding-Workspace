package Round605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int l = s.nextInt();
		char[] str = s.nextLine().toCharArray();
		HashSet<Character> set = new HashSet<>();
			char[] c = s.nextLine().toCharArray();
//			System.out.println(Arrays.toString(c));
			for(int j=0;j<c.length;j++) {
				set.add(c[j]);
			}
//			set.add((char)c);
		
//		System.out.println(set);
		long ans = 0;
		long len = 0;
		for(int i=0;i<str.length;i++) {
			if(set.contains(str[i])) {
				len++;
			}else {
//				System.out.println(len);
				ans+=((len*(len+1))/2);
				len = 0;
			}
		}
		ans+=((len*(len+1))/2);
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
