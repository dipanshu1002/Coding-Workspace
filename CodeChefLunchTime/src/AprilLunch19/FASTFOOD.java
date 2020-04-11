package AprilLunch19;
import java.util.*;
public class FASTFOOD {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T = s.nextLong();
		for(long t = 0;t<T;t++) {
			int N = s.nextInt();
			long[] arr1 = new long[N];
			long[] arr2 = new long[N];
			long sum1 = 0;
			long sum2 = 0;
			for(int i=0;i<N;i++) {
				arr1[i]=s.nextLong();
				sum1+=arr1[i];
			}
			for(int i=0;i<N;i++) {
				arr1[i]=s.nextLong();
				sum2+=arr2[i];
			}
			if(sum1>sum2) {
				int pointer = 0;
				if(arr2[pointer]>arr1[pointer]) {
					pointer++;
				}
			}
			int profit = 0;
			
		}
	}
}
