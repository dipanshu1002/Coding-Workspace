package DecLunch18;

import java.util.Scanner;

public class BUCKETS {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K=s.nextInt();
		int[][] arr=new int[N][K];
		for(int i=0;i<N;i++) {
			for(int j=0;j<K;j++) {
				int a=s.nextInt();
				arr[i][j]=a;
			}
		}
		int[] sum = new int[N];
		for(int i=0;i<N;i++) {
			for(int j=0;j<K;j++) {
				sum[i]+=arr[i][j];
			}
		}
		System.out.println(sum[1]);
	}

}
