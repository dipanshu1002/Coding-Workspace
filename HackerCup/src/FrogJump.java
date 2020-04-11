import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//Name class as anything you want
//SOLUTION Credits - Dipanshu Munjal
 class FrogJump {
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
		long T = s.nextLong();
		for(long t=1;t<=T;t++) {
			String str = s.nextLine();
			int N = str.length();
			boolean flag=false;
			int countB=0;
			int countD=0;
			for(int i=1;i<str.length();i++) {
				if(str.charAt(i)=='.') {
					countD++;
				}
				if(str.charAt(i)=='B') {
					countB++;
				}
			}
			if(countB>=(N/2) && countB<(N-1) && countD>=1) {
				System.out.println("Case #"+t+": "+"Y");
			}else {
				System.out.println("Case #"+t+": "+"N");
			}
			
			
			
		}
	}
}
