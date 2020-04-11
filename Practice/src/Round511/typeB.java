package Round511;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class typeB {
	static int[] euler_sieve(){
		int[] arr = new int[17000001];
		for(int i =0;i<arr.length;i++)arr[i]=-1;
		arr[0]=-1;
		arr[1]=-1;
		for(int i=2;i*i<=arr.length;i++) {
			if(arr[i]==-1) {
				arr[i]=i;
				for(int j=i*i;j<arr.length;j+=i) {
					if(arr[j]==-1)arr[j]=i;
				}
			}
		}
		return arr;
	}
	static int gcd(int a, int b) {return (b==0)? a:gcd(b,a%b);}
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int[] arr = new int[n];
		HashMap<Integer, Set<Integer>> map = new HashMap<>();
		ArrayList<Integer> ch = new ArrayList<>();
		arr[0]=s.nextInt();
		int gcdI = arr[0];
		for(int i=1;i<n;i++) {
			
			arr[i]=s.nextInt();
			gcdI = gcd(gcdI,arr[i]);
		}
		for(int i=0;i<n;i++) {
			arr[i]/=gcdI;
			if(!map.containsKey(arr[i]))map.put(arr[i],new HashSet<>());
			}
		int cnt=0;
		for(int i=0;i<n;i++)if(arr[i]==1)cnt++;
		
		if(cnt==n)System.out.println(-1);
		else {
			int max = 0;
			int[] sieve = euler_sieve();
			int[] freq = new int[17000001];
			for(int i=0;i<n;i++) {
				int temp = arr[i];
				while(sieve[temp]!=-1) {
					map.get(arr[i]).add(sieve[temp]);
					temp/=sieve[temp];
				}
				if(temp!=1)map.get(arr[i]).add(temp);
				for(int k: map.get(arr[i])) {
					freq[k]++;
					if(freq[k]>max)max=freq[k];
				}
			}
			System.out.println(n-max);
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
