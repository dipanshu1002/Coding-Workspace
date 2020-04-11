package February19;

import java.util.Scanner;

public class MAGICJAR {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			int N = s.nextInt();
			long[] arr = new long[N];
			long sum = 0;
			for(int i=0;i<N;i++) {
				arr[i]=s.nextLong();
				sum+=arr[i];
			}
			
			System.out.println(sum-N+1);
		}
	}

}
