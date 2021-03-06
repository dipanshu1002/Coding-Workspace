package DP1;
import java.lang.Math;
import java.util.*;

public class minStepto1 {
	
	public static int minStepR(int n) {
		if(n==1||n==2||n==3) {
			
			return 1;
		}
		else {
			int ans1 = 1 + minStepR(n-1);
			int ans2=Integer.MAX_VALUE;
			if(n%2==0) {
				ans2 = 1 + minStepR(n/2);
			}
			int ans3 = Integer.MAX_VALUE;
			if(n%3==0) {
				ans3 = 1 + minStepR(n/3);
			}
			
			return Math.min(ans1,Math.min(ans2,ans3));
		}
		
	}
	public static int minStepDP(int n) {
		int[] arr=new int[n+1];
		arr[0]=0;
		arr[1]=1;
		arr[2]=1;
		arr[3]=1;
		for(int i=4;i<n+1;i++) {
			int ans1=1+arr[i-1];
			int ans2= Integer.MAX_VALUE;
			int ans3 = Integer.MAX_VALUE;
			if(i%2==0) {
				ans2=1+arr[i/2];
			}
			if(i%3==0) {
				ans3=1+arr[i/3];
			}
			arr[i]=Math.min(ans1,Math.min(ans2,ans3));
		}
		return arr[n];
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(minStepDP(n));
		System.out.println(minStepR(n));
		
	}
}
