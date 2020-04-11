package January19;

import java.util.Scanner;
import java.util.*;

public class HP18 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T=s.nextInt();
		for(int t=0;t<T;t++) {
		int  N=s.nextInt();
		long a=s.nextInt();
		long b=s.nextInt();
		int[] arr=new int[N];
		ArrayList<Integer> arrA=new ArrayList<Integer>();
		ArrayList<Integer> arrB=new ArrayList<Integer>();
		ArrayList<Integer> arrC=new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
			if((arr[i]%a==0) && (arr[i]%b == 0)){
				arrC.add(arr[i]);
			}
			else if(arr[i]%a==0) {
				arrB.add(arr[i]);
			}
			else if(arr[i]%b==0) {
				arrA.add(arr[i]);
			}
		}
		if(arrB.size()>=arrA.size() && arrC.size()>0) {
			System.out.println("BOB");
		}
		else {
			System.out.println("ALICE");
		}
	
	
	}
	
}
}
