package Round584;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeC {
	 static int GetCeilIndex(int arr[], int T[], int l, int r, int key) { 

	while (r-l>1) {
		int m = l + (r - l) / 2; 
		if (arr[T[m]] >= key) 
		 r = m; 
		else
		 l = m; 
		} 
	return r; 
	} 

static int LongestIncreasingSubsequence(int arr[], int n) 
{ 
	// Add boundary case, when array n is zero 
	// Depend on smart pointers 
	int tailIndices[] = new int[n]; 
	// Initialized with 0 
	Arrays.fill(tailIndices, 0); 
	int prevIndices[] = new int[n]; 
	// initialized with -1 
	Arrays.fill(prevIndices, -1); 
	// it will always point to empty 
	// location 
	int len = 1; 
	for (int i = 1; i < n; i++) { 
	if (arr[i] <= arr[tailIndices[0]]) 
	 // new smallest value 
	 tailIndices[0] = i; 
	else if (arr[i] >= arr[tailIndices[len - 1]]) { 
	 // arr[i] wants to extend 
	 // largest subsequence 
	 prevIndices[i] = tailIndices[len - 1]; 
	 tailIndices[len++] = i; 
	} 
	else {
	 // arr[i] wants to be a potential 
	 // condidate of future subsequence 
	 // It will replace ceil value in 
	 // tailIndices 
	 int pos = GetCeilIndex(arr, 
	                        tailIndices, -1, len - 1, arr[i]); 
	
	 prevIndices[i] = tailIndices[pos - 1]; 
	 tailIndices[pos] = i; 
	} 
	} 
	
//	System.out.println("LIS of given input"); 
	
	for (int i = tailIndices[len - 1]; i >= 0; 
	i = prevIndices[i]) {
	System.out.print(arr[i] + " "); 
	arr[i]=-1;
	}
//	System.out.println(); 
	
	return len; 
} 
	public static void main(String[] args) {
		int arr3[] = { 0, 0, 0, 7, 11, 8, 10, 13, 6 }; 
        int n2 = arr3.length; 
  
        System.out.print("LIS size\n" + LongestIncreasingSubsequence(arr3, n2));
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			String str = s.nextLine();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=(int)str.charAt(i);
				
			}
			ArrayList<Integer> list = new ArrayList<Integer>();
			int len = LongestIncreasingSubsequence(arr,n);
			for(int i=0;i<len;i++) {
				if(arr[i]==-1) {
					arr[i]=1;
					continue;
				}
				else {
					arr[i]=2;
					list.add(arr[i]);
				}
			}
			int[] arr2 = new int[list.size()];
			int j=0;
			for(Integer i: list) {
				arr2[j]=i;
				j++;
			}
			int len2 = LongestIncreasingSubsequence(arr2,arr2.length);
			if(len2==arr2.length) {
				for(int i=0;i<n;i++) {
					System.out.print(arr[i]+" ");
				}
			}else {
				System.out.println("-");
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
