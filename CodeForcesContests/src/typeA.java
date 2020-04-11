import java.util.Scanner;
import java.util.*;

public class typeA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		if(arr[arr.length-1]-arr[1]<arr[arr.length-2]-arr[0]) {
			System.out.println(arr[arr.length-1]-arr[1]);
		}
		else {
		System.out.println(arr[arr.length-2]-arr[0]);
	}
	}
}
