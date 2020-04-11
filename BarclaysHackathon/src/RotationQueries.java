import java.util.*;
import java.io.*;
import java.text.*;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

  
public class RotationQueries {
	 
	
	//INPUT AND OUTPUT METHODS//
	  void p(Object o){out.print(o);}
	void pn(Object o){out.println(o);}
	 String n()throws Exception{return in.next();}
	String nln()throws Exception{return in.nextLine();}
	int ni()throws Exception{return Integer.parseInt(in.next());}
	 long nl()throws Exception{return Long.parseLong(in.next());}
	 double nd()throws Exception{return Double.parseDouble(in.next());}
	/////////////////////////////////////////////////////////////////
	static boolean multipleTC = true, memory = true;
	void run() throws Exception{
        in = new FastReader();
        out = new PrintWriter(System.out);
        //Solution Credits: Taranpreet Singh
        int T = (multipleTC)?ni():1;
        pre();for(int t = 1; t<= T; t++)solve(t);
        out.flush();
        out.close();
    }
	final int INF = (int)1e9, MX = (int)2e5+5;
	long mod = (long)1000000007, IINF = (long)1e18;
	void pre() throws Exception{}
	 void solve(int TC) throws Exception{
	        int n = ni(), k = ni();
	        long[] a = new long[n];
	        for(int i = 0; i< n; i++)a[i] = nl();
	        long ans = 0, min = IINF;
	        for(int i = 0; i+k< n; i++){
	            long d = (a[i+k]-a[i]+1)/2;
	            if(d<min){
	                ans = a[i]+d;
	                min = d;
	            }
	        }
	        pn(ans);
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
	
	 FastReader in;
	 PrintWriter out;
	public static void main(String[] args) throws Exception {
		FastReader s = new FastReader();
		int N = s.nextInt();
		int K = s.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<N;i++) {
			int preSum=0;
			int j=i;
			for(j=i;j<N;j++) {
				if(preSum+arr[j]<=K) {
					preSum+=arr[j];
				}else {
					break;
				}
			}
			arr[(i+preSum)%N]=preSum^K;
		}
		long sum=0;
		for(int i=0;i<N;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}
}
