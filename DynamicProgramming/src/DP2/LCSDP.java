package DP2;
import DP2.LCS;
import java.util.Scanner;

public class LCSDP {
	
	public static int maxLCSDP(String str1, String str2) {
		int m =str1.length();
		int n = str2.length();
		int[][] storage = new int[m+1][n+1];
		for(int i=0;i<m;i++) {
			storage[i][0]=0;
		}
		for(int j=0;j<n;j++) {
			storage[0][j]=0;
		}
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
			//	if(str1.charAt(i-1)==str2.charAt(j-1)) {
				if(str1.charAt(m-i)==str2.charAt(n-j)) {
					storage[i][j]=1+storage[i-1][j-1];
				}
				else {
				storage[i][j]=Math.max(storage[i-1][j],storage[i][j-1]);
			}
			}
		}
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				System.out.print(storage[i][j]+" ");
			}
			System.out.println();
		}
		return storage[m][n];
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		int ans = maxLCSDP(str1,str2);
		//int ans2 = LCS.maxLCS(str1,str2);
		System.out.println(ans);
		//System.out.println(ans2);
		
	}
}
