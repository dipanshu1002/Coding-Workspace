package Round584;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class typeB {
	static long LCM(Pair arr[], int n) { 
        // Find the maximum value in arr[]  
        int max_num = 0; 
        for (int i = 0; i < n; i++) { 
            if (max_num < arr[i].b) { 
                max_num = arr[i].b; 
            } 
        } 
  
        // Initialize result  
        long res = 1; 
  
        // Find all factors that are present in  
        // two or more array elements.  
        int x = 2; // Current factor.  
        while (x <= max_num) { 
            // To store indexes of all array  
            // elements that are divisible by x.  
            Vector<Integer> indexes = new Vector<>(); 
            for (int j = 0; j < n; j++) { 
                if (arr[j].b % x == 0) { 
                    indexes.add(indexes.size(), j); 
                } 
            } 
  
            // If there are 2 or more array elements  
            // that are divisible by x.  
            if (indexes.size() >= 2) { 
                // Reduce all array elements divisible  
                // by x.  
                for (int j = 0; j < indexes.size(); j++) { 
                    arr[indexes.get(j)].b = arr[indexes.get(j)].b / x; 
                } 
  
                res = res * x; 
            } else { 
                x++; 
            } 
        } 
  
        // Then multiply all reduced array elements  
        for (int i = 0; i < n; i++) { 
            res = res * arr[i].b; 
        } 
  
        return res; 
    } 
	static class Pair{
		int a;
		int b;
		Pair(int a, int b){
			this.a = a;
			this.b = b;
		}
	}
	static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		String str = s.nextLine();
		Pair[] arr = new Pair[n];
		for(int i=0;i<n;i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			arr[i]=new Pair(a,b);
			
		}
		//System.out.println(str);
		long[] dp = new long[50000];
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='0') {
				int s1 = arr[i].a;
				int e1 = arr[i].b;
				int count = 0;
				int x = 1;
				for(int j=e1;j<50000;j++) {
					if(x==1) {
						dp[j]++;
					}
					count++;
					if(count==s1) {
						x=x^1;
						count=0;
					}
				}
			}
			else if(str.charAt(i)=='1'){
				int s1 = arr[i].a;
				int e1 = arr[i].b;
				long count = 0;
				long x = 0;
				for(int j=0;j<e1;j++) {
					dp[j]++;
				}
				for(int j=e1;j<50000;j++) {
					if(x==1) {
						dp[j]++;
					}
					count++;
					if(count==s1) {
						x=x^1;
						count=0;
						
					}
				}
			}
		}
		long ans = 1;
	//	System.out.println();
		for(int i=0;i<50000;i++) {
			ans = Math.max(ans,dp[i]);
		}
		System.out.println(ans);
		
		
		
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
