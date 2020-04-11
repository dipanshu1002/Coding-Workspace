package Round588;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;		
public class typeA {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int[] arr = new int[4];
		for(int i=0;i<4;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		
		if((arr[0]+arr[3])==(arr[1]+arr[2])){
			System.out.println("YES");
		}else if(arr[0]+arr[2]==(arr[1]+arr[3])) {
			System.out.println("YES");
		}else if(arr[0]+arr[1]==(arr[2]+arr[3])) {
			System.out.println("YES");
		}else if(arr[0]==(arr[1]+arr[2]+arr[3])) {
			System.out.println("YES");
		}else if(arr[3]==(arr[1]+arr[2]+arr[0])) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
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
