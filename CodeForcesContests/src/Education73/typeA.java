package Education73;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeA {
	static boolean isSubsetSum(int set[], int n, int sum) 
{ 
// The value of subset[i][j] will be 
// true if there is a subset of  
// set[0..j-1] with sum equal to i 
boolean subset[][] =  
    new boolean[sum+1][n+1]; 

// If sum is 0, then answer is true 
for (int i = 0; i <= n; i++) 
	subset[0][i] = true; 

// If sum is not 0 and set is empty, 
// then answer is false 
for (int i = 1; i <= sum; i++) 
	subset[i][0] = false; 

// Fill the subset table in botton 
// up manner 
for (int i = 1; i <= sum; i++) 
{ 
	for (int j = 1; j <= n; j++) 
	{ 
		subset[i][j] = subset[i][j-1]; 
		if (i >= set[j-1]) 
			subset[i][j] = subset[i][j] ||  
			subset[i - set[j-1]][j-1]; 
	} 
} 

/* // uncomment this code to print table 
for (int i = 0; i <= sum; i++) 
{ 
for (int j = 0; j <= n; j++) 
System.out.println (subset[i][j]); 
} */

return subset[sum][n]; 
} 
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int[] arr = new int[n];
			String ans = "NO";
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
				if(arr[i]==2048) {
					ans = "YES";
					
				}
			}
			int sum = 2048;
			if(isSubsetSum(arr,n,sum)==true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
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
