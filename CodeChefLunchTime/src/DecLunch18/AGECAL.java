//* package whatever; // don't place package name! */
package DecLunch18;

import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.Scanner;
class Date{
	long year;
	long month;
	long day;
}
public class AGECAL {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int T=s.nextInt();
		for(int t=0;t<T;t++) {
		int N=s.nextInt();
		long totalDays=0;
		long[] days= new long[N+1];
		for(int i=1;i<=N;i++) {
			long a=s.nextLong();
			days[i]=a;
			totalDays+=a;
		}
		Date dob = new Date();
		long year=s.nextLong();
		dob.year = year;
		long month = s.nextLong();
		dob.month=month;
		long day=s.nextLong();
		dob.day = day;
		
		Date curr = new Date();
		long cyear=s.nextLong();
		curr.year = cyear;
		long cmonth = s.nextLong();
		curr.month=cmonth;
		long cday=s.nextInt();
		curr.day = cday;
		
		long tD1 = 0;
		for(int i=1;i<curr.month;i++) {
			tD1+=days[i];
		}
		long NLY = (curr.year-1)/4;
		long days2 = curr.year*totalDays + tD1 + curr.day + NLY;
		
		
		long tD2 = 0;
		for(int i=1;i<dob.month;i++) {
			tD2+=days[i];
		}
		long NLY2 = (dob.year-1)/4;

		long days1 = dob.year*totalDays + tD2 + dob.day + NLY2;
		
		long ans = days2 - days1 + 1;
		System.out.println(ans);
		
		}
	}
}