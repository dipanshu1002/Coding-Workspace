package Round580;
import java.util.*;
public class typeA {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i]=s.nextInt();
		}
		int m = s.nextInt();
		Arrays.sort(arr1);
		int[] arr2 = new int[m];
		for(int i=0;i<m;i++) {
			arr2[i]=s.nextInt();
		}
		Arrays.sort(arr2);
		System.out.println(arr1[n-1]+" "+arr2[m-1]);
	}
}
