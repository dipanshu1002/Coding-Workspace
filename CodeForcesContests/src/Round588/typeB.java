package Round588;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;		
public class typeB{
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int k = s.nextInt();
		String str = s.next();
		int[]arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=str.charAt(i)-'0';
		}
		if(k==0) {
			System.out.println(str);
			return;
		}
		if(n==1 && k==1) {
			System.out.println(0);
			return;
		}else {
			int cnt = 0;
			if(arr[0]>1) {
				arr[0]=1;
				cnt++;
			}
			int j=1;
			while(cnt<k) {
				if(j>=n) {
					break;
				}
				if(arr[j]>0) {
					arr[j]=0;
					cnt++;
					j++;
				}else {
					j++;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
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
