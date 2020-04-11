package Round580;
import java.util.*;
public class typeB {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long[] arr = new long[n];
		//int[] cost = new int[n];
		int check = 0;
		long cost = 0;
		ArrayList<Long> list1 = new ArrayList<>();
		ArrayList<Long> list2 = new ArrayList<>();
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
			if(arr[i]==0) {
				check++;
			}
			if(arr[i]<0) {
				list1.add(Math.abs(-1-arr[i]));
			}else {
				list2.add(Math.abs(1-arr[i]));
			}
			
		}
		Collections.sort(list1);
		Collections.sort(list2);
		for(long i: list2) {
			cost+=i;
		}
		for(long i: list1) {
			cost+=i;
		}
		if(list1.size()%2==1 && check==0) {
			cost+=2;
		}
		System.out.println(cost);
		
	}
}
