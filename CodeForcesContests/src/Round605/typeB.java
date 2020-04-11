package Round605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class typeB {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			char[] str = s.nextLine().toCharArray();
			int countL = 0;
			int countR = 0;
			int countU = 0;
			int countD = 0;
//			System.out.println(str);
			for(int i=0;i<str.length;i++) {
				if(str[i]=='L') {
					countL++;
				}
				else if(str[i]=='R') {
					countR++;
				}
				else if(str[i]=='U') {
					countU++;
				}
				else if(str[i]=='D') {
					countD++;
				}
			}
//			System.out.println( countL);
			int min1 = Math.min(countL,countR);
			int min2 = Math.min(countU,countD);
			if(min1==0 && min2!=0) {
				System.out.println(2);
				System.out.println("UD");
				continue;
			}else if(min2==0 && min1!=0) {
				System.out.println(2);
				System.out.println("LR");
				continue;
			}
			int ans = min2*2 + min1*2;
			if(ans==0) {
				System.out.println(ans);
				continue;
			}
			System.out.println(ans);
			for(int i=0;i<min2;i++) {
				System.out.print("U");
			}
			for(int i=0;i<min1;i++) {
				System.out.print("R");
			}
			for(int i=0;i<min2;i++) {
				System.out.print("D");
			}
			for(int i=0;i<min1;i++) {
				System.out.print("L");
			}
			System.out.println();
	
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
