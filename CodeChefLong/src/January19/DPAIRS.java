package January19;

import java.util.Scanner;
import java.util.*;

public class DPAIRS {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
	//	Set<Integer> result=new HashSet<Integer>();
		int[] A= new int[n];
		int[] B= new int[m];
		
		for(int i=0;i<n;i++) {
			A[i]=s.nextInt();
		}
		for(int i=0;i<m;i++) {
			B[i]=s.nextInt();
		}
		int minA=Integer.MAX_VALUE,maxA=Integer.MIN_VALUE,minB=Integer.MAX_VALUE,maxB=Integer.MIN_VALUE,minAindex=0,minBindex=0,maxAindex=0,maxBindex=0;
		for(int i=0;i<A.length;i++) {
			
			if(A[i]>maxA) {
				maxA=A[i];
				maxAindex=i;
			}
			
		}
		for(int i=0;i<B.length;i++) {
			if(B[i]<minB) {
				minB=B[i];
				minBindex=i;
			}
		}
		int count=0;
		for(int i=0;i<m;i++) {
		//	result.add(A[maxAindex]+B[i]);
			count++;
			System.out.println(maxAindex+" "+i);
		}
		
		for(int i=0;i<n;i++) {
			if(i==maxAindex) {
				continue;
			}
			System.out.println(i+" "+minBindex);		
			}
	/*	
		for(int i=0;i<n;i++) {
			if(result.contains(B[minBindex]+A[i])){
				continue;
			}
			else {
				result.add(B[minBindex]+A[i]);
				count++;
				System.out.println(i+" "+minBindex);
				if(count==m+n-1) {
					return;
				}
				
			}
		}
		
		for(int i=0;i<m;i++) {
			if(result.contains(A[minAindex]+B[i])){
				continue;
			}
			else {
				result.add(A[minAindex]+B[i]);
				count++;
				System.out.println(minAindex+" "+i);
				if(count==m+n-1) {
					return;
				}
				
			}
		} */
		
		
	}

}
