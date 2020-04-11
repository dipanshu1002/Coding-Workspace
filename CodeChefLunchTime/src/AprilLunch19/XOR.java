package AprilLunch19;
import java.util.*;
public class XOR {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T = s.nextLong();
		for(long t=0;t<T;t++) {
			int N = s.nextInt();
			long[] arr = new long[N];
			String[] str = new String[N];
			
			for(int i=0;i<N;i++) {
				arr[i]=s.nextInt();
				str[i]= Long.toBinaryString(arr[i]);
			}
			for(int i=0;i<N;i++) {
				System.out.print(str[i]+" ");
			}
		}
	}
	
}
