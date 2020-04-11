package Apr19;

import java.util.*;
import java.util.Arrays;
public class Ques3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T=s.nextInt();
		for(int t=0;t<T;t++) {
		int N = s.nextInt();
		String[] arr= new String[N];
		int[] count = new int[26];
		for(int i=0;i<N;i++) {
			arr[i]=s.next();
		}
		for(int i=0;i<N;i++) {
			for(int j=0;j<arr[i].length();j++) {
				int a = arr[i].charAt(j)-97;
				count[a]++;
			}	
		}
		int[] arr2 = new int[6];
		arr2[0]=count[2];
		arr2[1]=count[3];
		arr2[2]=count[4];
		arr2[3]=count[5];
		arr2[4]=count[7];
		arr2[5]=count[14];
		arr2[0]/=2;
		arr2[2]/=2;
		Arrays.sort(arr2);
		System.out.println(arr2[0]);
	}
	}

}
