package DP2;
import java.util.*;
public class MinCostPath {
	public static int costPath(int[][]arr,int m, int n,  int start_x, int start_y, int end_x, int end_y) {
		if(start_x==end_x && start_y==end_y) {
			return arr[end_x][end_y];
		}
		int min = Integer.MAX_VALUE;
		int ans1 = Integer.MAX_VALUE;
		int ans2 = Integer.MAX_VALUE;
		int ans3= Integer.MAX_VALUE;
		if(start_x+1<m && start_y<n) {
			ans1 = costPath(arr, m, n,start_x+1,start_y,end_x,end_y);
		}
		if(start_x+1<m && start_y+1<n) {
			ans2=costPath(arr,m, n,start_x+1,start_y+1,end_x,end_y);
		}
		if(start_x<m && start_y+1<n) {
		  ans3=costPath(arr,m, n, start_x,start_y+1,end_x,end_y);
		}
		
		return arr[start_x][start_y] + Math.min(ans1,Math.min(ans2,ans3));
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] arr = new int[m][n];
		int[][] arrDP = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int ans = costPath(arr,m,n,0,0,m-1,n-1);
		System.out.println(ans);
		
	}
	
}
