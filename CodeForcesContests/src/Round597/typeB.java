package Round597;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeB{
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
			String str = s.nextLine();
			int cntR=0,cntP = 0,cntS = 0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='R') {
					cntR++;
				}else if(str.charAt(i)=='P') {
					cntP++;
				}else {
					cntS++;
				}
			}
			int winCase = 0;
			char[] ans = new char[n];
			for(int i=0;i<n;i++) {
				ans[i]='A';
			}
			winCase+=(Math.min(cntS,a));
			winCase+=(Math.min(cntR,b));
			winCase+=(Math.min(cntP,c));
//			System.out.println(winCase);
//			int win = Math.ceil(n/2);
	
			if(winCase>=(Math.ceil(1.0*n/2))) {
				System.out.println("YES");
				for(int i=0;i<n;i++) {
					if(str.charAt(i)=='R' && b>0) {
						ans[i]='P';
						b--;
					}else if(str.charAt(i)=='P' && c>0) {
						ans[i]='S';
						c--;
					}else if(str.charAt(i)=='S' && a>0) {
						ans[i]='R';
						a--;
					}
				}
				for(int i=0;i<n;i++) {
					if(ans[i]=='A' && a>0) {
						ans[i]='R';
						a--;
					}else if(ans[i]=='A' && b>0) {
						ans[i]='P';
						b--;
					}else if(ans[i]=='A' && c>0) {
						ans[i]='S';
						c--;
					}
				}
				for(int i=0;i<n;i++) {
					System.out.print(ans[i]);
				}
				System.out.println();
//				System.out.println(A	rrays.toString(ans));
				
			}else {
				System.out.println("NO");
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
