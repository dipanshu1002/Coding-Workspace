package NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sieve {
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
	
	static int[] euler_sieve(){
		int[] arr = new int[17000001];
		for(int i =0;i<arr.length;i++)arr[i]=-1;
		arr[0]=-1;
		arr[1]=-1;
		for(int i=2;i*i<=arr.length;i++) {
			if(arr[i]==-1) {
				arr[i]=i;
				for(int j=i*i;j<arr.length;j+=i) {
					if(arr[j]==-1)arr[j]=i;
				}
			}
		}
		return arr;
	}
	public static int[] sieve(int n) {
		//Array Size - 10^7+1
		int[] arr = new int[n+1];
		
		// 0 - true , 1 - false
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i*i<=n;i++) {
			if(arr[i]==0) {
				for(int j=i*i;j<arr.length;j+=i) 
					arr[j]=1;
				
			}
		}
		int count=0;
		// count primes till n
		for(int i=0;i<=n;i++) {
			if(arr[i]==0) count++;
			
		}
	//	System.out.println(count);
		return arr;
		
		
		
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int[] sieve = sieve(n);
			for(int i: sieve) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}
