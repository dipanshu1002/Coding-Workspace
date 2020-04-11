package Round580;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
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
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		if(n%2==1) {
			ArrayList<Integer> set1 = new ArrayList<>();
			long sum1=0;
			long sum2=0;
			ArrayList<Integer> set2 = new ArrayList<>();
			int set = 0;
			int[] arr = new int[2*n+1];
			for(int i=1;i<arr.length;i++) {
				arr[i]=i;
			}
			int i = 1;
			int j = 2*n;
			while(i<=j) {
			if(set==0) {
					if(sum1<sum2) {
						set1.add(arr[i+1]);
						sum1+=arr[i+1];
						set2.add(arr[i]);
						sum2+=arr[i];
						i+=2;
						set=1;
					}else {
						set1.add(arr[i]);
						sum1+=arr[i];
						set2.add(arr[i+1]);
						sum2+=arr[i+1];
						i+=2;
						set=1;
					}
				}
			else if(set==1) {
					if(sum1<sum2) {
						set1.add(arr[j]);
						sum1+=arr[j];
						set2.add(arr[j-1]);
						sum2+=arr[j-1];
						j-=2;
						set=0;
					}else {
						set1.add(arr[j-1]);
						sum1+=arr[j-1];
						set2.add(arr[j]);
						sum2+=arr[j];
						j-=2;
						set=0;
					}
				}
			}
			System.out.println("YES");
			for(int x: set1) {
				System.out.print(x+" ");
			}
			for(int x: set2) {
				System.out.print(x+" ");
			}
		
			
		}else {
			System.out.println("NO");
		}
	}
}