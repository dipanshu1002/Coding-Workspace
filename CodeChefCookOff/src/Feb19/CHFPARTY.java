package Feb19;
import java.util.Scanner;
import java.util.*;

public class CHFPARTY {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			int N = s.nextInt();
			long[] arr=new long[N];
			for(int i=0;i<N;i++) {
				arr[i]=s.nextLong();
			}
			Arrays.sort(arr);
			int count = 0;
			for(int i=0;i<arr.length;i++) {
				
				if(count>=arr[i]) {
					count++;
				}
				if(arr[i]>count) {
					break;
				}
			}
			System.out.println(count);
		}
	}
}
