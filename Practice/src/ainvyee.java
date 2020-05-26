
public class ainvyee {
	public static int test(int[] arr) {
		arr[1]=2;
		return 1;
	}
	public static void main(String[] args) {
		int[] arr = new int[2];
		char[] arr2 = new char[2];
		arr2[0]='a';
		arr2[1]='a';
		arr[1]=1;
		System.out.println(arr[1]);
		int res = test(arr);
		System.out.println(arr[1]);
		int res2 = test(arr);
//		System.out.println(arr[]);
		for(int i=0;i<2;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
}
