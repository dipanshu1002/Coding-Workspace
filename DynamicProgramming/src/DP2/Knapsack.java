package DP2;
import java.util.*;
public class Knapsack {
	public static int knapsackR(int[] weight, int[] value, int W, int n) {
		
		if((n-1)<=0 && weight[0]<=W) {
			return value[0];
		}
		else if((n-1)<=0) {
			return 0;
		}
		int wi = weight[n-1];
		int vi=value[n-1];
		if(wi>W) {
			return knapsackR(weight,value,W,n-1);
		}
		else {
			int ans1 = vi + knapsackR(weight,value,W-wi,n-1);
			int ans2 = knapsackR(weight,value,W,n-1);
			return Math.max(ans1,ans2);
		}
	}
	public static int knapsackDP(int[] weight,int[] value,int W) {
		int[][] storage = new int[W+1][weight.length+1];
		for(int i=0;i<weight.length+1;i++) {
			storage[0][i]=0;
		}
		for(int i=0;i<W+1;i++) {
			storage[i][0]=0;
		}
		for(int i=1;i<=W;i++) {
			for(int j=1;j<=weight.length;j++) {
				if(weight[j-1]<=i) {
					storage[i][j]=Math.max(value[j-1]+storage[(i-weight[j-1])][j-1],storage[i][j-1]);
				}
				else {
					storage[i][j]=storage[i][j-1];
				}
			}
		}
		return storage[W][weight.length];
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] weight = new int[N];
		int[] value = new int[N];
		for(int i=0;i<N;i++) {
			weight[i]=s.nextInt();
		}
		for(int i=0;i<N;i++) {
			value[i]=s.nextInt();
		}
		int W = s.nextInt();
		int ans = knapsackR(weight,value,W,N);
		int ans2 = knapsackDP(weight,value,W);
		System.out.println(ans2);
		System.out.println(ans);
	}
}
