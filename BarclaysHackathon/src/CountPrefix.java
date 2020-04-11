import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountPrefix {
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
			int N = s.nextInt();
			int[] arr = new int[N];
			int flag=0;
			arr[0]=s.nextInt();
			int min=arr[0];
			for(int i=1;i<N;i++) {
				arr[i]=s.nextInt();
				if( arr[i]!=arr[0])
					flag=1;
				if(arr[i]<min)
					min=arr[i];
			}
			int check=0;
			for(int i=0;i<N;i++) {
				if(arr[i]%min!=0) {
					check=1;
				}
			}
			
			int Q = s.nextInt();
			for(int i=0;i<Q;i++) {
				int L = s.nextInt();
				int R = s.nextInt();
				int K = s.nextInt();
				if(K==1||flag==0||(K==min && check==0)) {
					System.out.println(R);
					continue;
				}else {
				int start = L-1;
				int index=start-1;
				for(int j=start;j<R;j++) {
					if(arr[j]%K==0)
						index++;
					else break;
				}
				if(index>start-1)
					System.out.println(index+1);
				else System.out.println(-1);
			}
		}
}
}
