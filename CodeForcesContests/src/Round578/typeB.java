package Round578;

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
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int m = s.nextInt();
			int k = s.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			int flag = 0 ;
			int i = 0;
			
			for(i=0;i<n-1;i++) {
				if(arr[i]<arr[i+1]) {
					if((arr[i+1]-arr[i])<=k) {
						if(k>=arr[i+1]) {
							m+=arr[i];
						}else {
							int a = arr[i]-(arr[i+1]-k);
							m+=Math.min(arr[i],a);
						}
					}
					else if((arr[i+1]-arr[i])>k) {
						if(m>=(arr[i+1]-k-arr[i])) {
							m-=(arr[i+1]-k-arr[i]);
						}else {
							break;
						}
					}
				}
					if(arr[i]>=arr[i+1]) {
						if((arr[i]-arr[i+1])>k) {
							int a = arr[i]-arr[i+1]+k;
							m+=Math.min(arr[i],a);
	//						if(k>=arr[i]) {
	//							m+=arr[i];
	//						}else if(k<arr[i]) {
	//							m+=(arr[i]-arr[i+1]+k);
	//						}
						}else if((arr[i]-arr[i+1])<=k) {
							m+=Math.min(arr[i],arr[i]-arr[i+1]+k);
						}
					}
				}
			if(i==(n-1)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			

			
		}
	}
}
