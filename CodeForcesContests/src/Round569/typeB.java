package Round569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class typeB {
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
		int n = s.nextInt();
		long[] arr = new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextLong();
		}
		int flag=0;
		long[] arr2 = new long[n];
		int count=0;
		int max = Integer.MIN_VALUE;
		int index = -1;
		int countZ = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]>=0) {
				arr[i]= -(arr[i]+1);
				if(Math.abs(arr[i])>max) {
					max = (int)Math.abs(arr[i]);
					index = i;
				}
				count++;
			}
			else if(arr[i]<0) {
				if(Math.abs(arr[i])>max) {
					max = (int)Math.abs(arr[i]);
					index = i;
				}
				count++;
			}
			
			
		}
		if(count%2==0) {
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}else {
			arr[index] = -(arr[index]+1);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}
}
