package DP2;
import java.util.*;
public class LIS {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	int[] arr = new int[N];
	for(int i=0;i<N;i++) {
		arr[i]=s.nextInt();
	}
	int[] lis = new int[N];
	for(int i=0;i<N;i++) {
		lis[i]=1;
	}
	for(int i=1;i<N;i++) {
		for(int j=0;j<i;j++) {
			if(arr[i]>arr[j] && lis[i]<lis[j]+1) {
				lis[i]=lis[j]+1;
			}
		}
	}
	int max = -1;
	for(int i=0;i<N;i++) {
		if(lis[i]>max) {
			max=lis[i];
		}
	}
	System.out.println(max);
}
}
