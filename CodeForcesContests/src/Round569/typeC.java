package Round569;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;



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
	
	static class Query{
		int a;
		int b;
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int q = s.nextInt();
		Deque<Integer> deque = new LinkedList<Integer>();
		int max = Integer.MIN_VALUE;
		int index = -1;
		for(int i=0;i<n;i++) {
			int a = s.nextInt();
			if(a>max) {
				max=a;
				index = i;
			}
			deque.add(a);
		}
		Query[] ans = new Query[index+1];
//		System.out.println(deque);
//		System.out.println(index);
		for(int i=0;i<index;i++) {
			int a = deque.pollFirst();
			int b = deque.pollFirst();
			Query abc = new Query();
			abc.a = a;
			abc.b = b;
			ans[i+1]=abc;
			if(b>a) {
				deque.addFirst(b);
				deque.addLast(a);
			}
			else {
				deque.addFirst(a);
				deque.addLast(a);
			}
		}
	System.out.println(index);
	System.out.println(deque);
		int eleIndex = 0;
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		Iterator itr = deque.iterator();
		while(itr.hasNext()) {
			map.put(eleIndex,(int)itr.next());
			eleIndex++;
		}
	System.out.println(map);
		for(int i=0;i<q;i++) {
			long m = s.nextLong();
			if(m<=index) {
				System.out.println(ans[(int)m].a+" "+ans[(int)m].b);
			}
			else {
				//int k = (m-index)%(n-1);
				long k = (m-(index+1)+(n-1))%(n-1);
				System.out.println("K: "+ k);
				System.out.println(map.get(0)+" "+map.get((int)k+1));
			}
		}
		
		
	}
}
