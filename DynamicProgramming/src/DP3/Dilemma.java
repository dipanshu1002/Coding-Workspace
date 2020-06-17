package DP3;
import java.util.*;
public class Dilemma {
	static int setBit(int mask) {
		int set = 0;
		while(mask>0) {
			set+=(mask&1);
			mask/=2;
		}
		return set;
	}
	static int solve(int mask,int pos, String[] input, int[][]dp, int N, int L) {

		if(setBit(mask)==1) {
			return 0;
		}
		if(pos==L||mask==0) {
			
			return 100000;
		}
		if(dp[mask][pos]!=-1) {
			return dp[mask][pos];
		}
//		System.out.println(mask+","+pos);
		int mask1 = 0;
		int mask2 = 0;
//		int touches = 0;
		for(int i=0;i<N;i++) {
//			System.out.println("i: "+i+" "+(mask & (1<<i)));
			if((mask>>i & 1)==1){
//				touches++;
				if(input[i].charAt(pos)=='0') {
					mask1 = (mask1 | 1<<i);
				}else if(input[i].charAt(pos)=='1') {
					mask2 = (mask2 | 1<<i);
				}
			}
		}
//		System.out.println("mask1: "+mask1);
//		System.out.println("mask2: "+mask2);
		dp[mask][pos ]= Math.min(solve(mask1,pos+1,input,dp,N, input[0].length())+solve(mask2,pos+1,input,dp, N, input[0].length())+setBit(mask), solve(mask,pos+1,input, dp, N, input[0].length()));
//		System.out.println("mask,pos,ans:"+mask+", "+pos+", "+ans);
//		System.out.println(Integer.MAX_VALUE);
		return dp[mask][pos];
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String[] arr = new String[N];
		for(int i=0;i<N;i++) {
			arr[i]=s.next();
		}
		int L = arr[0].length();
		int[][] dp = new int[1<<N][L];
		for(int i=0;i<(1<<N);i++) {
			for(int j=0;j<L;j++) {
				dp[i][j]=-1;
			}
		}
//		System.out.println(13>>1);
		System.out.println(solve((1<<N)-1, 0, arr,dp,N, arr[0].length()));
		for(int i=0;i<(1<<N);i++) {
			for(int j=0;j<L;j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}

	}

}
