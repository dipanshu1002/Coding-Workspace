package Education69;
import java.util.*;
public class typeA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		for(int t=0;t<T;t++) {
			int n = s.nextInt();
			Integer[] arr = new Integer[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			Arrays.sort(arr);
			int k = 0;
			for(int i=0;i<n-2;i++) {
				if(k+1<arr[n-2]) {
					k++;
				}else {
					break;
				}
			}
			System.out.println(k);
		}
		
	}
	
}
