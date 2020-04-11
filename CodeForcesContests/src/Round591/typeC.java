package Round591;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class typeC {
	static int gcd(int a, int b) {
		if(b==0)return a;
		return gcd(b,a%b);
	}
	public static long Cost(long[] arr, long n, int lcm, int a, int b, int x, int y) {
		long cost = 0;
		for(int i=0;i<n;i++) {
			if((i+1)%a==0 && arr[i]!=-1) {
				cost+=(arr[i]*(x));
			}
			if((i+1)%b==0 && arr[i]!=-1) {
				cost+=(arr[i]*y);
			}
		}
		return cost/100;
	}
	public static long[] Arrange(int n, int lcm, int a, int b,int x, int y, Long[] price) {
	
		long[] arr = new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=-1;
		}
		int j=lcm-1;
		int ptr = 0;
		while(j<n) {
			arr[j]=price[ptr];
			ptr++;
			j+=lcm;
		}
//		System.out.println(j);
		if(x>=y) {
			j=a-1;
			while(j<n) {
				if(arr[j]!=-1) {
					j+=a;
					continue;
				}else {
					arr[j]=price[ptr];
					ptr++;
					j+=a;
				}
			}
			j=b-1;
			while(j<n) {
				if(arr[j]!=-1) {
					j+=b;
					continue;
				}else {
					arr[j]=price[ptr];
					ptr++;
					j+=b;
				}
			}
		}else {
			j=b-1;
			while(j<n) {
				if(arr[j]!=-1) {
					j+=b;
					continue;
				}else {
					arr[j]=price[ptr];
					ptr++;
					j+=b;
				}
			}
			j=a-1;
			while(j<n) {
				if(arr[j]!=-1) {
					j+=a;
					continue;
				}else {
					arr[j]=price[ptr];
					ptr++;
					j+=a;
				}
			}
			
		}
		return arr;
	}
	public static void main(String[] args) {
		
		FastReader s = new FastReader();
		int q = s.nextInt();
		for(int t=0;t<q;t++) {
			int n = s.nextInt();
			Long[] price = new Long[n];
			for(int i=0;i<n;i++) {
				price[i]=s.nextLong();
			}
			Arrays.sort(price, Collections.reverseOrder());
			int x = s.nextInt();
			int a = s.nextInt();
			int y = s.nextInt();
			int b = s.nextInt();
			long k = s.nextLong();
			int gcd = gcd(a,b);
			int lcm = (a*b)/gcd;
			int min = 1;
			int max = n;
			int ans = -1;
			while(min<=max) {
				int mid = (max+min)/2;
//				System.out.println("len: "+" "+mid);
				long[] temp = Arrange(mid, lcm, a, b, x, y, price);
//				System.out.println(Arrays.toString(temp));
				long cost = Cost(temp, mid,lcm,a,b,x,y);
//				System.out.println(cost);
				if(cost>=k) {
					ans = mid;
					max = mid-1;
				}else {
					min=mid+1;
				}
			}
			System.out.println(ans);
			
			
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
