package Round427;

import Round427.typeC.Star;

public class prac {
	static int Bs(int[] arr,int x) {
		int start = 0;
		int end = arr.length - 1;
		int ans = -1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(arr[mid]>=x) {
				 ans = mid;
				 end = mid-1;
				 
			}else {
				start = mid+1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {2,2,3,4,5,6};
		int ans = Bs(arr,1);
		System.out.println(ans);
		
	}
}
