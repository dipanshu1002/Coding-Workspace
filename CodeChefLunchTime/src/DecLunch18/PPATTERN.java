package DecLunch18;

import java.util.Scanner;

public class PPATTERN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T=s.nextInt();
		for(int t=0;t<T;t++) {
		int n=s.nextInt();
		int[][] arr=new int[n][n];
		int cflag=1;
		int diffC=1;
		for(int i=0;i<n;i++) {;
			for(int j=0;j<n;j++) {
				int factor=i+j+1;
				if(factor>n) {
					factor = n + 1 - (factor - n);
				}
				if(i==0) {
					arr[i][j]=cflag;
				System.out.print(cflag+" ");
				}
				else {
				
					arr[i][j]= factor+arr[i-1][j];
					System.out.print(arr[i][j]+" ");
					
				} 
				cflag+=diffC;
				diffC++;
				
			}
			System.out.println();
		}
		}
	}
}
