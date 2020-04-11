package Round608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeC {
	static class Point{
		int x;
		int y;
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int a=0,b=0,c=0,d=0;
		  long sx = s.nextLong();
		  long sy = s.nextLong();
//		  cin>>sx>>sy;
		  for(int i=0;i<n;i++){
		  	long p = s.nextLong();
		  	long q = s.nextLong();
//		  	cin>>p>>q;
		  	if(p>=(sx+1) ){
		  		a++;
		  	}
	 
		  	if( q>=(sy+1)){
		  		b++;
		  	}
	 
		  	if(p<=(sx-1) ){
		  		c++;
		  	}
	 
		  	if( q<=(sy-1)){
		  		d++;
		  	}
	 
	 
		  }
	 
	 
		  	if(a>=b && a>=c && a>=d){
		  		System.out.println(a);
//		  			cout<<a<<endl;
		  		System.out.println((sx+1)+" "+sy);
		  	}
	 
		  	else if(a<=b && b>=c && b>=d){
		  		System.out.println(b);
//		  		cout<<b<<endl;
		  		System.out.println(sx+" "+(sy+1));
		  	}
	 
		  	else if(c>=a && c>=b && c>=d){
		  			System.out.println(c);
		  		System.out.println((sx-1)+" "+sy);
		  	}
		  	else{
		  		System.out.println(d);
//		  		cout<<d<<endl;
	 
		  	   System.out.println(sx+" "+(sy-1));
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
