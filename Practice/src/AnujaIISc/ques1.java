package AnujaIISc;

import java.util.Arrays;
import java.util.Scanner;
import java.text.DecimalFormat;

public class ques1 {
	static double pi = 3.14159265359;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int m=s.nextInt();
		double sum=0;
		DecimalFormat dec = new DecimalFormat("#0.0000000");
		double[] area = new double[n];
		for(int i=0;i<n;i++) {
			area[i]=pi*arr[i]*arr[i];
			area[i] =Double.parseDouble(dec.format(area[i]));
			System.out.println(area[i]);
			sum+=area[i]; 
		}
		System.out.println("Sum "+ sum);
		Arrays.sort(area);
		double min = area[0];
		double max = area[n-1];
		double mid = Double.parseDouble(dec.format((min+max)/2));
		int count = 0;
		double ans = -1;
		while(min<=max && (max-min)>0.0001) {
			count=0;
			mid = Double.parseDouble(dec.format((min+max)/2));;
			System.out.println("Mid "+mid);
			for(int i=0;i<n;i++) {
				int pieces = (int)Math.floor(Double.parseDouble(dec.format(area[i]/mid)));
				System.out.println("Pieces "+i+":"+pieces);
				count+=pieces;
			}
			if(count>=m) {
				System.out.println("Count "+count);
				min = mid+0.00001;
				ans = mid;
				
			}
			else {
				max =mid-0.00001;
			}	
		}
		System.out.println(ans);
		
	}

}
