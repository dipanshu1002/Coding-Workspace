package DP2;

import java.util.Scanner;
import java.util.*;


public class EditDistance {
	public static int editDistanceR(String str1, String str2) {
		if(str1.length()==0) {
			return str2.length();	
		}
		if(str2.length()==0) {
			return str1.length();
		}
		else {
			if(str1.charAt(0)==str2.charAt(0)) {
				return editDistanceR(str1.substring(1),str2.substring(1));
			}
			else {
				int insert = editDistanceR(str1, str2.substring(1));
				int delete = editDistanceR(str1.substring(1),str2);
				int sub = editDistanceR(str1.substring(1),str2.substring(1));
				return 1 + Math.min(insert, Math.min(delete,sub));
			}
		}
	}
	
	public static int editDistanceDP(String str1, String str2) {
		int m=str1.length();
		int n=str2.length();
		int[][] storage = new int[m+1][n+1];
		for(int i=0;i<=n;i++) {
			storage[0][i]=i;
		}
		for(int i=0;i<=m;i++) {
			storage[i][0]=i;
		}
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(str1.charAt(i-1)==str2.charAt(j-1)) {
					storage[i][j]=Math.min(storage[i-1][j-1],Math.min(storage[i-1][j],storage[i][j-1]));
				}
				else {
					storage[i][j]=1+Math.min(storage[i-1][j-1],Math.min(storage[i-1][j],storage[i][j-1]));

				}
			}
		}
		return storage[m][n];
		
		
	} 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		String str2 = s.next();
		int ans = editDistanceR(str1,str2);
		int ans2=editDistanceDP(str1,str2);
		System.out.println(ans);
		System.out.println(ans2);
	}
}
