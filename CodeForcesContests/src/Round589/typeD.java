package Round589;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeD {
	static class Edge{
		int x;
		int y;
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int m = s.nextInt();
		HashSet<Edge> set = new HashSet<>();
		Edge[] arr = new Edge[m];
		
		//ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		ArrayList<Integer>[] list = new ArrayList[n+1];
		for(int i=0;i<m;i++) {
			Edge e = new Edge();
			e.x = s.nextInt();
			e.y = s.nextInt();
			list[e.x].add(e.y);
			list[e.y].add(e.x);
			arr[i]=e;
			set.add(e);
		}
		Arrays.sort(arr, new Comparator<Edge>(){

			@Override
			public int compare(Edge arg0, Edge arg1) {
				// TODO Auto-generated method stub
				return arg0.x - arg1.x;
			}
		});
		for(int i=0;i<m;i++) {
			System.out.println(arr[i].x+" "+arr[i].y);
		}
		HashSet<Integer> set1 = new HashSet<>();
		HashSet<Integer> set2 = new HashSet<>();
		HashSet<Integer> set3 = new HashSet<>();
		for(Edge e : arr) {
			if(set1.isEmpty()) {
				set1.add(e.x);
				for(e)
			}
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
