package DP2;
import java.util.*;
public class MinCostPathDP {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] arr = new int[m][n];
		int[][] arrDP = new int[m][n];
		Arrays.fill(arrDP,-1);
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		arrDP[m-1][n-1]=arr[m-1][n-1];
		for(int j=n-2;j>=0;j--) {
			arrDP[m-1][j]=arr[m-1][j]+arr[m-1][j+1];
		}
		for(int i=m-2;i>=0;i--) {
			arrDP[i][n-1]=arr[i][n-1]+arr[i+1][n-1];
		}
		for(int i=m-2;i>=0;i--) {
			for(int j=n-2;j>=0;j--) {
				arrDP[i][j]=Math.min(arrDP[i+1][j],Math.min(arrDP[i][j+1],arrDP[i+1][j+1]));
			}
		}
		System.out.println(arr[0][0]);
		}
	}
