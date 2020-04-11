package Round568;
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

	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int m = s.nextInt();
		int[] arr = new int [n];
		int[] pre = new int[n];
		arr[0]=s.nextInt();
		pre[0]=arr[0];
		for(int i=1;i<n;i++) {
			arr[i]=s.nextInt();
			pre[i]=pre[i-1]+arr[i];
		}
		int index = 0;
		int[] fail = new int[n];
		int start=0;
		while( start<n && pre[start]<=m) {
			fail[start]=0;
			start++;
		}
		
		for(int i=start;i<n;i++) {
			if(pre[i]-pre[index]<=m) {
				fail[i]=index+1;
			}
			else {
				while(pre[i]-pre[index]>m) {
					index++;
				}
				fail[i]=index+1;
			}
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(fail[i]+" ");
		}
		/*
		 5 100
		 [80,40,40,40,60]
		 [80,120,160,200,260]
		(0),(1),(1),(2),(3)
		
		7 160
		[40,50,30,15,65,90,20]
		[40,90,120,135,200,290,310]
		
		[0,0,0,0,1,4,5]
		 */
		
		
	}
}
