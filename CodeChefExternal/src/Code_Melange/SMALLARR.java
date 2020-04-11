package Code_Melange;

import java.util.*;
public class SMALLARR {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int X = s.nextInt();
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		double segSum=0;
		double totSum=0;
		double maxSum=0;
		for(int i=0;i<N;i++) {
			if(arr[i]<0) {
				if(segSum>maxSum) {
					totSum+=maxSum;
					maxSum=segSum;
					segSum=0;
					totSum+=arr[i];
					continue;
				}
				else {
					totSum+=segSum;
					segSum=0;
					totSum+=arr[i];
					continue;
				}
			}
			segSum+=arr[i];
		}
		if(segSum>maxSum) {
			totSum+=maxSum;
			maxSum=segSum;
			segSum=0;
		}
		else {
			totSum+=segSum;
			segSum=0;
		}
		totSum+=((double)maxSum/2);
		System.out.println(totSum);
	}
	
}
