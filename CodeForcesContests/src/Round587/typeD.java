package Round587;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeD {
	public static long gcd(long a, long b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
	public static long lcm_of_array_elements(long[] element_array) 
    { 
        long lcm_of_array_elements = 1; 
        int divisor = 2; 
          
        while (true) { 
            int counter = 0; 
            boolean divisible = false; 
              
            for (int i = 0; i < element_array.length; i++) { 
  
                // lcm_of_array_elements (n1, n2, ... 0) = 0. 
                // For negative number we convert into 
                // positive and calculate lcm_of_array_elements. 
  
                if (element_array[i] == 0) { 
                    return 0; 
                } 
                else if (element_array[i] < 0) { 
                    element_array[i] = element_array[i] * (-1); 
                } 
                if (element_array[i] == 1) { 
                    counter++; 
                } 
  
                // Divide element_array by devisor if complete 
                // division i.e. without remainder then replace 
                // number with quotient; used for find next factor 
                if (element_array[i] % divisor == 0) { 
                    divisible = true; 
                    element_array[i] = element_array[i] / divisor; 
                } 
            } 
  
            // If divisor able to completely divide any number 
            // from array multiply with lcm_of_array_elements 
            // and store into lcm_of_array_elements and continue 
            // to same divisor for next factor finding. 
            // else increment divisor 
            if (divisible) { 
                lcm_of_array_elements = lcm_of_array_elements * divisor; 
            } 
            else { 
                divisor++; 
            } 
  
            // Check if all element_array is 1 indicate  
            // we found all factors and terminate while loop. 
            if (counter == element_array.length) { 
                return lcm_of_array_elements; 
            } 
        } 
    } 
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		long[] arr = new long[n];
		long[] arrC = new long[n];
		long[] di = new long[n];
		long[] di2 = new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextLong();
			arrC[i]=arr[i];
		}
		if(n==2) {
			System.out.print(1+" ");
			Arrays.sort(arr);
			System.out.print(arr[1]-arr[0]);
		}else {
			
//			for(int i=1;i<n;i++) {
//				gcd=gcd(gcd,arr[i]);
//			}
			Arrays.sort(arr);
			long diff = 0;
			di2[n-1]=0;
			for(int i=0;i<n-1;i++) {
				di2[i]=(arr[n-1]-arr[i]);
				diff+=(arr[n-1]-arr[i]);
			}
			long gcd = di2[0];
			for(int i=1;i<n-1;i++) {
				gcd=gcd(gcd,di2[i]);
			}
			long num = diff/gcd;
//			
//			long diff2 = 0;
//			for(int i=0;i<n;i++) {
//				//System.out.println(arr[i]);
//				di[i]=(lcm-arr[i]);
//				diff2+=di[i];
//			}
//			//System.out.println(Arrays.toString(di));
//			//System.out.println(diff2);
//			long gcd2 = di[0];
//			for(int i=1;i<n;i++) {
//				gcd2 = gcd(gcd2,di[i]);
//			}
//			long num2 = diff2/gcd2;
//			if(num2<num) {
//				System.out.println(num2+" "+gcd2);
//			}else {
			System.out.println(num+" "+gcd);
//			}
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
