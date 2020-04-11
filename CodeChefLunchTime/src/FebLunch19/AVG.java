package FebLunch19;

import java.util.Scanner;

public class AVG {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			int N = s.nextInt();
			int K = s.nextInt();
			int V = s.nextInt();
			int[] arr = new int[N];
			int sum = 0;
			for(int i=0;i<N;i++) {
				arr[i]=s.nextInt();
				sum+=arr[i];
			}
			if((V*(N+K)-sum)%K==0 && (V*(N+K)-sum>=0)) {
				System.out.println((V*(N+K)-sum)/K);
			}
			else {
				System.out.println(-1);
			}
		}
	}
}
