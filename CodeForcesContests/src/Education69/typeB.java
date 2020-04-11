package Education69;
import java.util.*;
public class typeB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int i=1;
		int max = arr[0];
		while(i<n) {
			if(arr[i]>=arr[i-1]){
				max=arr[i];
				i++;
				
			}
			else {
				break;
			}
		}
//		System.out.println(max);
//		System.out.println(i);
		int flag=0;
		while(i<n) {
			if(arr[i]<=arr[i-1]) {
				i++;
			}
			else {
				flag=1;
				break;
			}
		}
		
		if(i==n) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
}
