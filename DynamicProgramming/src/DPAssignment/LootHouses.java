package DPAssignment;
import java.util.*;
public class LootHouses {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		if(n==1) {
			System.out.println(arr[0]);
			return;
		}
		int[] dp = new int[n];
		dp[n-1]=arr[n-1];
		dp[n-2]=arr[n-2];
		for(int i=n-3;i>=0;i--) {
			dp[i]=Math.max((arr[i]+dp[i+2]),dp[i+1]);
		}
		System.out.println(dp[0]);
	}
}
