package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class Reduction {
	static class DblEndedPQ {  
	    PriorityQueue<Integer> s;  
	    DblEndedPQ() 
	    { 
	        s= new PriorityQueue<Integer>(); 
	    } 
	    // Returns size of the queue. Works in  
	    // O(1) time  
	    int size()  
	    {  
	    return s.size();  
	    }  
	  
	    // Returns true if queue is empty. Works  
	    // in O(1) time  
	    boolean isEmpty()  
	    {  
	    return (s.size() == 0);  
	    }  
	  
	    // Inserts an element. Works in O(Log n)  
	    // time  
	    void insert(int x)  
	    {  
	        s.add(x);  
	          
	    }  
	  
	    // Returns minimum element. Works in O(1)  
	    // time  
	    int getMin()  
	    {  
	        return Collections.min(s,null);  
	    }  
	  
	    // Returns maximum element. Works in O(1)  
	    // time  
	    int getMax()  
	    {  
	        return Collections.max(s,null);  
	    }  
	      
	    // Deletes minimum element. Works in O(Log n)  
	    // time  
	    void deleteMin()  
	    {  
	        if (s.size() == 0)  
	            return ;  
	        s.remove(Collections.min(s,null));  
	          
	    }  
	  
	    // Deletes maximum element. Works in O(Log n)  
	    // time  
	    void deleteMax()  
	    {  
	        if (s.size() == 0)  
	            return ;  
	        s.remove(Collections.max(s,null)); 
	          
	    } 
	    void print() {
	    	for(int i:s) {
	    		System.out.print(i+" ");
	    	}
	    	System.out.println();
	    }
	} 
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			int k = s.nextInt();
		    DblEndedPQ q2= new DblEndedPQ();  
			long sum = 0;
			for(int i=0;i<n;i++) {
				int ele = s.nextInt();
				if(ele<=k) {
					sum+=ele;
				}else {
					q2.insert(ele);
				}
			}
			while(!q2.isEmpty()) {
				if(q2.size()==1) {
					int ele = q2.getMax();
					sum+=ele;
					continue;
				}
				q2.print();
				int max = q2.getMax();
				if(q2.size()>1) {
				q2.deleteMax();
				}
				int smax = q2.getMax();
				System.out.println("smax: "+smax);
				if(q2.size()>1) q2.deleteMax();
				q2.insert(max);
				int ele2 = q2.getMin();
				System.out.println("ele2: "+ele2);

				if(ele2>=smax) {
					smax^=ele2;
					ele2^=smax;
					smax^=ele2;
				}
//				ele2 = Math.min(ele2,smax);
				System.out.println("ele2: "+ele2);
				System.out.println(smax);
				if(q2.size()>1) q2.deleteMin();
				smax -=(ele2-k);
				if(smax>k) {
					q2.insert(smax);
				}else {
					sum+=k;
				}
				sum+=k;
			}
			System.out.println(sum);
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
