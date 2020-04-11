package December18;

import java.util.Scanner;
import java.lang.Math;

public class chfideal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int randomNum = (int)(Math.random()*(3-1+1)+1);
		System.out.println(randomNum);
		System.out.flush();
		int n=s.nextInt();
		System.out.println(6-(n+randomNum));
		System.out.flush();
		s.close();
		
	}

}
