package Education69;
import java.util.*;
public class typeC {
	public static long cal(long[][] dp, int[] arr, int id, int n, int k) {
		if(id==n) {
			return Integer.MAX_VALUE;
		}
		if(dp[id][k]!=0) {
			return dp[id][k];
		}
		if(k==1) {
			dp[id][k]=arr[n-1]-arr[id];
			return arr[n-1]-arr[id];
		}
		
		
		long p = Integer.MAX_VALUE;
		for(int i=id;i<n;i++) {
			long mini = arr[i]-arr[id];
			long ans = mini+ cal(dp,arr,i+1,n,k-1);
			if(ans<p) {
				p=ans;
				
			}
			
		}
		dp[id][k]=p;
		return p;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		long[][] dp = new long[n+1][k+1];
		long ans = cal(dp,arr,0,n,k);
		System.out.println(ans);
		
	}
}
