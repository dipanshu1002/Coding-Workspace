import java.util.*;
public class testcaseNikaalo {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[]arr = str.split(" ");
		int count=0;
		int countf=0;
		for(int i =0;i<arr.length;i++) {
			
			if(arr[i].charAt(0)!='f' && arr[i].charAt(0)!='a' && arr[i].charAt(0)!='e') {
				count++;
			}
			if(arr[i].charAt(0)=='f') {
				countf++;
			}
			System.out.println(arr[i]);
		}
		System.out.println("Count "+count+" "+countf);
		System.out.println(arr.length);

	} 
}
