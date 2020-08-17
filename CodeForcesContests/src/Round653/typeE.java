package Round653;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeE {
	static class Book{
		int t;
		int a;
		int b;
		Book(int t,int a,int b){
			this.t = t;
			this.a = a;
			this.b = b;
		}
		
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
//		int T  = s.nextInt();
//		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int k = s.nextInt();
			Book[] arr = new Book[n];
			PriorityQueue<Integer> alice = new PriorityQueue<>();
			PriorityQueue<Integer> bob = new PriorityQueue<>();
			PriorityQueue<Integer> common = new PriorityQueue<>();
			
			for(int i=0;i<n;i++) {
				int ti = s.nextInt();
				int a = s.nextInt();
				int b = s.nextInt();
				if(a==1 && b==0) {
					alice.add(ti);
				}
				else if(a==0 && b==1) {
					bob.add(ti);
				}else if(a==1 && b==1) {
					common.add(ti);
				}				
			}
//			System.out.println(alice.size()+" "+bob.size()+" "+common.size());

			long time = 0;
			int tot=0;
			int min = k-Math.min(alice.size(),bob.size());
//			System.out.println(min);
			for(int i=0;i<min;i++) {
				if(common.size()>0) {
				int get = common.poll();
				time+=get;
				tot++;
				}
			}
//			System.out.println(tot);
			while(tot<k && alice.size()>0 && bob.size()>0) {
				
				if(common.size()>0 && alice.peek()+bob.peek()>=common.peek()) {
					int get = common.poll();
					time+=get;
					tot++;
				}else {
					int geta = alice.poll();
					int getb = bob.poll();
					time+=(geta+getb);
					tot++;
				}
			}
//			System.out.println(tot);
			if(tot<k) {
				System.out.println(-1);
			}
			else
				System.out.println(time);
			
			
			
		}
//	}
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
