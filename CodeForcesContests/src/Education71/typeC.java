package Education71;

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
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int a = s.nextInt();
			int b = s.nextInt();
			String str = s.nextLine();
//			System.out.println(a);
			long cost = 0;
			int height = 1;
			if(str.length()==2) {
				cost+=(2*a+3*b);
//				System.out.println(cost);
//				continue;
			}else {
			for(int i=0;i<str.length()-1;i++) {
					if(str.charAt(i+1)=='0' && height==1) {
				//	System.out.println("enter: 1");
					cost+=a;
					cost+=b;
			//		System.out.println("cost: "+cost);
				}else if(str.charAt(i+1)=='1' && height==1) {
			//		System.out.println("enter: 2");
					cost+=2*a;
					cost+=2*b;
					height=2;
				//	System.out.println("cost: "+cost);
				}else if(str.charAt(i+1)=='0' && height==2) {
					cost+=a;
					cost+=2*b;
				//	System.out.println("enter: 3");
					if((a+2*b)<=(2*a+b)) {
						cost+=(a+2*b);
						i++;
				//		System.out.println("cost: "+cost);
					}else {
						height=1;
						cost+=(2*a+b);
						i++;
				//		System.out.println("cost: "+cost);
					}
				}else if(str.charAt(i+1)=='1' && height==2) {
				//	System.out.println("enter: 4");
					cost+=a;
					cost+=2*b;
				//	System.out.println("cost: "+cost);
//				}el) {
//				//	System.out.println("enter: 5");
//					cost+=2*a;
//					cost+=b;
//				//	System.out.println("cost: "+cost);
//				}else if((i+1)==(n-1) && height==1) {
//					cost+=a;
//					cost+=b;
//				}
			}
					
			
			}
			if(height==2) {
				cost+=(2*a+b);
				cost+=b;
			}else {
				cost+=(a+2*b);
			}
			
		}
		System.out.println(cost);
	}
	}
}
