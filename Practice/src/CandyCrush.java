import java.util.*;
public class CandyCrush {
	public static void subsetSum(int[] arr, int l, int r, ArrayList<Integer> set, int sum) {
		if(l>r) {
			set.add(sum);
			return;
		}
		subsetSum(arr,l+1,r,set,sum);
		subsetSum(arr,l+1,r,set,arr[l]+sum);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int m = s.nextInt();
		int[] arr1 = new int[n/2];
		int[] arr2 = new int[n-arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=arr[i];
		}
		for(int i=arr1.length;i<arr.length;i++) {
			arr2[i-arr1.length]=arr[i];
		}
		ArrayList<Integer> set1 = new ArrayList<Integer>();
		ArrayList<Integer> set2 = new ArrayList<Integer>();
		subsetSum(arr1,0,arr1.length-1,set1,0);
		System.out.println(set1);
		subsetSum(arr2,0,arr2.length-1,set2,0);
		System.out.println(set2);
	}
}
