package DP1;
import java.util.*;
public class numBBT {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[] arr = new long[n+1];
		if(n==1) {
			System.out.println(n);
			return;
		}
		arr[0]=0;
		arr[1]=1;
		arr[2]=3;
		for(int i=3;i<=n;i++) {
			arr[i]=arr[i-1]*arr[i-1] + 2*arr[i-1]*arr[i-2];
		}
		System.out.println(arr[n]);
	}
}
