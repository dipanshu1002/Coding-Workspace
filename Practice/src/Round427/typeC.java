package Round427;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeC {
	static class Star{
		int x;
		int y;
		int s;
		Star(int x,int y, int s){
			this.x = x;
			this.y = y;
			this.s = s;
		}
	}
	static class View{
		int t;
		int x1;
		int y1;
		int x2;
		int y2;
		View(int t,int x1, int y1, int x2, int y2){
			this.t = t;
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
		
	}
	static int Bs(Star[] arr,int x, int st) {
		int start = st;
		int end = arr.length - 1;
		int ans = -1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid].x>=x) {
				 ans = mid;
				 end = mid-1;
				 
			}else {
				start = mid+1;
			}
		}
		return ans;
	}
	static int BsUb(Star[] arr, int x, int e) {
		int start = 0;
		int end = e;
		int ans = -1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid].x>=x) {
				 ans = mid;
				 end = mid-1;
				 
			}else {
				start = mid+1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int q = s.nextInt();
		int c = s.nextInt();
		Star[] arr = new Star[n];
		View[] arr2 = new View[n];
		for(int i=0;i<n;i++) {
			arr[i]=new Star(s.nextInt(),s.nextInt(),s.nextInt());
			
		}
		for(int i=0;i<q;i++) {
			arr2[i]=new View(s.nextInt() ,s.nextInt(),s.nextInt(),s.nextInt(),s.nextInt());
			
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i].x+" "+arr[i].y+" "+arr[i].s);
		}
		System.out.println();
		Arrays.sort(arr, new Comparator<Star>() {

			@Override
			public int compare(Star arg0, Star arg1) {
				if(arg0.x - arg1.x == 0) {
					return arg0.y- arg1.y;
				}
				return arg0.x - arg1.x;
			}
			
		});
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i].x+" "+arr[i].y+" "+arr[i].s);
		}
		for(int i=0;i<q;i++) {
			int a1 = Bs(arr,arr2[i].x1,0);
			
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
