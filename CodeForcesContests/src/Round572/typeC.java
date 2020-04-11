package Round572;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class typeC {
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
	static long ans=0;
	public static long candies(int[] arr, int l, int r) {
		int mid = l + (r-l)/2;
		if(l==r) {
			return arr[l];
		}
		long ans1 = candies(arr,l,mid);
	
		long ans2 = candies(arr,mid+1,r);
		if((ans1+ans2)>=10) {
			ans++;
		}
		long ans3 = (ans1+ans2)%10;
		return (ans1+ans2)%10;
	}
	
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int[] arr = new int[n+1];
		for(int i=1;i<=n;i++) {
			arr[i]=s.nextInt();
		}
		int q = s.nextInt();
		for(int i=0;i<q;i++) {
			int l = s.nextInt();
			int r = s.nextInt();
			long abc =candies(arr,l,r);
			System.out.println(ans);
			ans=0;
		}
	}
}
