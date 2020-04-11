	package Round568;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.*;
	public class typeA {
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
	
		public static void main(String[] args) {
			FastReader s = new FastReader();
			long[] arr = new long[3];
			for(int i=0;i<3;i++) {
				arr[i]=s.nextLong();
			}
			Arrays.sort(arr);
			long d = s.nextLong();
			long t = 0;
			long t1 = (long)Math.max(0,d-(arr[2]-arr[1]));
			long t2 = (long)Math.max(0,d-Math.abs((arr[0]-arr[1])));
			System.out.println(t1+t2);
			
			
		}
	}
