package Round428;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeB {
	
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int k = s.nextInt();
		Integer[] arr = new Integer[k];
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<k;i++) {
			int a=s.nextInt();
			q.add(a);
		}
		//System.out.println(q);
		int tot_seats = 8*n;
		int c1 = 2*n;
		int c2 = n;
		while(!q.isEmpty() && c2>0 && q.peek()>=4) {
			int ele = q.remove();
			int temp = ele;
			if(temp>=4) {
				int qu = temp/4;
				int rem = Math.min(qu,c2);
				c2-=rem;
				temp-=(rem*4);
				if(temp>0)q.add(temp);
				}	
		}
		
//		System.out.println(c2);
//		System.out.println(q);
		
		//QUEUE got EMPTY
		if(q.isEmpty()) {
			System.out.println("YES");
			return;
		}
		
		//C2 got finished, adjust in C1, whole queue can be adjusted here.
		if(q.peek()>=4 && c2<=0) {
			while(c1>0 && !q.isEmpty()) {
			int ele = q.remove();
			int rem = Math.min(c1,(ele+1)/2);
			c1-=rem;
			ele-=(2*rem);
			if(ele>0)q.add(ele);
			}
			if(q.isEmpty()) {
				System.out.println("YES");
				return;
			}else {
				System.out.println("NO");
				return;
			}
		}
//		System.out.println(q.peek());
		// Top element < 4.
		
		while(!q.isEmpty() && q.peek()==3 && (c2>0 || c1>0)) {
			
			if(c2>0) {
				int ele = q.remove();
				c2--;
			}
			else if(c1>0) {
				int ele = q.remove();
				c1-=1;
				q.add(1);
			}
		}
		// queue becomes empty.
		if(q.isEmpty()) {
			System.out.println("YES");
			return ;
		}
		//C1 and C2 both finished.
		if(!q.isEmpty() && q.peek()==3 && c1<=0 && c2<=0) {
			System.out.println("NO");
			return;
		}
		
		// Elements left are < 3.
		while(!q.isEmpty() && c1>0) {
			q.remove();
			c1--;
			
		}
		// queue is empty
		if(q.isEmpty()) {
			System.out.println("YES");
			return;
		}
		// C1 is finished.
		int cnt1 = 0;
		int cnt2 = 0;
		while(!q.isEmpty()) {
			if(q.remove()==2) {
				cnt2++;
			}else cnt1++;
		}
		if(cnt2>c2) {
			System.out.println("NO");
			return;
		}
		c2-=cnt2;
		cnt1-=cnt2;
		if(cnt1<=0) {
			System.out.println("YES");
			return;
		}
		if(2*c2<cnt1)
		{
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
		return;
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
