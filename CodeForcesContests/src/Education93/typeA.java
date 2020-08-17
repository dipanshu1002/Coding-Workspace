package Education93;
import java.util.*;
public class typeA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		while(T-- > 0) {
			int n = s.nextInt();
			int[]arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			long sum = arr[0]+arr[1];
			int ans = 0;
			for(int i=2;i<n;i++) {
				if(arr[i]>=sum) {
					ans = 1;
					System.out.println(1+" "+2+" "+(i+1));
					break;
				}
			}
			if(ans==0) {
				System.out.println(-1);
			}
		}
	}
}
