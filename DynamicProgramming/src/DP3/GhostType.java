package DP3;
import java.util.*;
public class GhostType {
	static long solve(long[]dp,int mask, int N) {
		if(mask==((1<<N)-1)) {
			return 1;
		}
		if(dp[mask]!=-1) {
			return dp[mask];
		}
		else {
			long ans = 0;
			for(int i=0;i<N;i++) {
				if((mask & (1<<i))==0){
					int flag = 0;
					for(int j=0;j<N;j++) {
						if(((i+1)&(j+1))==(i+1) && (mask & 1<<j)!=0) {
							flag = 1;
						}
					}
					if(flag==0) {
						ans+=solve(dp,(mask|(1<<i)),N);
					}
				}
			}
			dp[mask]=ans;
			return ans;
			
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		long[] dp = new long[(1<<N)-1];
		for(int i=0;i<dp.length;i++) {
			dp[i]=-1;
		}
		
		System.out.println(solve(dp,0,N));
	}
}
