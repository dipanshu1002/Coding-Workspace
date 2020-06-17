package Education88;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
import java.math.BigDecimal; 

public class typeC {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int h = s.nextInt();
			int c = s.nextInt();
			int d = s.nextInt();
			if(d==h) {
				 System.out.println(1);
	           	 continue;
			}
	        else if((2*d)==(h+c)){
	           	System.out.println(2);
	           	continue;
	        }
			
			BigDecimal x1 = new BigDecimal(Math.ceil((c-d)/(double)(h+c-2*d)));
//			System.out.println(x1);
			BigDecimal x2 = new BigDecimal(Math.floor((c-d)/(double)(h+c-2*d)));
		    BigDecimal y1 = x1.subtract(new BigDecimal(1));
			BigDecimal y2 = x2.subtract(new BigDecimal(1));
			BigDecimal a1 = x1.multiply(new BigDecimal(h));
			BigDecimal a2 = y1.multiply(new BigDecimal(c));
			a1=a1.add(a2);
			BigDecimal a3 = x1.add(y1);
			a1 = a1.divide(a3);
//			BigDecimal avg1 =new BigDecimal((x1*h + y1*c)/(double)(x1+y1));
//			System.out.println(avg1);
			BigDecimal b1 = x2.multiply(new BigDecimal(h));
			BigDecimal b2 = y2.multiply(new BigDecimal(c));
			b1 = b1.add(b2);
			BigDecimal b3 = x2.add(y2);
			b1 = b1.divide(b3);
//			BigDecimal avg2 = new BigDecimal((x2*h + y2*c)/(double)(x2+y2));
//			System.out.println(avg2);
			a1 = a1.subtract(new BigDecimal(d)).abs();
//			System.out.println(avg1);
			b1 = b1.subtract(new BigDecimal(d)).abs();
//			System.out.println(avg2);
			long ans = 0;
			if(b1.compareTo(b2)<0) {
				
				ans = x1.add(y1).longValue();
			}else {
				ans = x2.add(y2).longValue();
			}
			if(ans<=0) ans = 1;
			if(ans==1) {
				BigDecimal avg = new BigDecimal((h+c)*(double)0.5);
//				System.out.println(avg);
				avg = avg.subtract(new BigDecimal(d)).abs();
//				System.out.println(avg);
				BigDecimal ch2 = new BigDecimal((d-h)).abs();
//				System.out.println(ch2);
				if(avg.compareTo(ch2)<0) {
					ans = 2;
				}
			}
			System.out.println(ans);
	    
	          
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
