package December18;
import java.util.Scanner;
 
public class intxor {
 
	public static void numFour(int i,long[] out) {
		Scanner s=new Scanner(System.in);
		long[] arr=new long[4];
		//int[] out=new int[4];
		long k=i;
		long temp=i+3;
		for(int j=1;j<=4;j++) {
			long a=k;
			long b=k+1;
			long c=k+2;
			if(b>temp) {
				b=b-temp+i-1;
				c=c-temp+i-1;
			}
			if(c>temp) {
				c=c-temp+i-1;
			}
			System.out.println(1+" "+a+" "+b+" "+c);
			System.out.flush();
			long p=s.nextLong();
			if(p==-1) {
				System.exit(0);
			}
			else {
				arr[j-1]=p;
			}
			k++;
		}
		out[i-1]=arr[0]^arr[2]^arr[3];
		out[i]=arr[1]^arr[3]^arr[0];
		out[i+1]=arr[2]^arr[0]^arr[1];
		out[i+2]=arr[3]^arr[1]^arr[2];
		//s.close();
 
	}
 
	public static void numFive(int i,long[] out) {
		Scanner s=new Scanner(System.in);
		long[] arr=new long[5];
		//int[] out=new int[5];
		long k=i;
		long temp=i+4;
		for(int j=1;j<=5;j++) {
			long a=k;
			long b=k+1;
			long c=k+2;
			if(b>temp) {
				b=b-temp+i-1;
				c=c-temp+i-1;
			}
			if(c>temp) {
				c=c-temp+i-1;
			}
			System.out.println(1+" "+a+" "+b+" "+c);
			System.out.flush();
			long p=s.nextLong();
			if(p==-1) {
				System.exit(0);
			}
			else {
				arr[j-1]=p;
			}
			k++;
		}
		long temp1 = arr[0]^arr[1]^arr[2]^arr[3]^arr[4];
		long temp4 = arr[0]^arr[2];
		long temp2 = temp4^temp1;       //3
		long temp3 = arr[0]^temp2;    //1^2
 
		out[i+1]= temp2;
		out[i+3]=arr[4]^temp3;
		out[i+2]=arr[2]^out[i+1]^out[i+3];
		out[i-1]=arr[3]^out[i+2]^out[i+3];
		out[i]=arr[0]^out[i+1]^out[i-1];
 
 
 
	}
 
	public static void numSeven(int i,long[] out) {
		Scanner s=new Scanner(System.in);
		long[] arr=new long[7];
		//int[] out=new int[7];
		long k=i;
		long temp=i+6;
		for(int j=1;j<=7;j++) {
			long a=k;
			long b=k+1;
			long c=k+2;
			if(b>temp) {
				b=b-temp+i-1;
				c=c-temp+i-1;
			}
			if(c>temp) {
				c=c-temp+i-1;
			}
			System.out.println(1+" "+a+" "+b+" "+c);
			System.out.flush();
			long p=s.nextLong();
			if(p==-1) {
				System.exit(0);
			}
			else {
				arr[j-1]=p;
			}
			k++;
		}
		out[i-1]=arr[0]^arr[2]^arr[3]^arr[5]^arr[6];
		out[i]=arr[0]^arr[1]^arr[3]^arr[4]^arr[6];
		out[i+1]=arr[0]^arr[1]^arr[2]^arr[4]^arr[5];
		out[i+2]=arr[1]^arr[2]^arr[3]^arr[5]^arr[6];
		out[i+3]=arr[0]^arr[2]^arr[3]^arr[4]^arr[6];
		out[i+4]=arr[0]^arr[1]^arr[3]^arr[4]^arr[5];
		out[i+5]=arr[1]^arr[2]^arr[4]^arr[5]^arr[6];
 
		//System.out.println(2+" "+out[0]+" "+out[1]+" "+out[2]+" "+out[3]+" "+out[4]+" "+out[5]+" "+out[6]);
	}
 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long T=s.nextLong();
 
		for(long t=0;t<T;t++) {
			int N=s.nextInt();
			long[] out=new long[N];
			if(N%4==0) {
				int i=1;
				while(i<=N) {
					numFour(i,out);
					i+=4;
				}
			}
			else if(N%4==1) {
				numFive(1,out);
				for(int j=6;j<=N;j+=4) {
					numFour(j,out);
				}
 
			}
			else if(N%4==2) {
				numFive(1,out);
				numFive(6,out);
				for(int j=11;j<=N;j+=4) {
					numFour(j,out);
				}
			}
			else if(N%4==3) {
				numSeven(1,out);
				for(int j=8;j<=N;j+=4) {
					numFour(j,out);
				}
			}
			System.out.print(2+" ");
			for(int l=0;l<N;l++) {
				System.out.print(out[l]+" ");
				System.out.flush();
			}
			System.out.flush();
			int ver=s.nextInt();
			if(ver==1) {
				continue;
			}
			if(ver==-1){
				System.exit(0);
			}
			else {
				return;
			}
			
 
 
	}
 
}
}
