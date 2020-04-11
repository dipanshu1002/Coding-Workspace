package Round608;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class typeB {
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		char[] str = s.nextLine().toCharArray();
		int cntB = 0;
		int cntW = 0;
		for(int i=0;i<n;i++) {
			if(str[i]=='B') {
				cntB++;
			}else {
				cntW++;
			}
		}
		if(cntB==n||cntW==n) {
			System.out.println(0);
		}
		else if(cntB%2==1 && cntW%2==1) {
			System.out.println(-1);
		}else {
//			string temp = s;
			char[] temp = new char[n];
			for(int i=0;i<str.length;i++) {
				temp[i]=str[i];
			}
			ArrayList<Integer> v = new ArrayList<>();
//		  	vector<ll> v;
		  	for(int i=0;i<n-1;i++){
		  		if(temp[i]=='W')
		  		   continue;
	 
		  		   else{
		  		   	temp[i]='W';
		  		   	if(temp[i+1]=='W')
		  		   	    temp[i+1]='B';
	 
		  		   	    else
		  		   	       temp[i+1]='W';
	 
		  		   	       v.add(i+1);
		  		   }
		  	}
	 
	 
		  			System.out.println(v.size());
//		  	cout<<v.size()<<endl;
		  		for(int i=0;i<v.size();i++)
		  		   System.out.print(v.get(i)+" ");
	 
	 
		  		Point sc = new Point();
//				sc.x = s.nextInt();
//				sc.y = s.nextInt();
//				Point D = new Point();
//				D.x = sc.x;
//				D.y = sc.y-1;
//				Point U = new Point();
//				U.x = sc.x;
//				U.y = sc.y+1;
//				Point L = new Point();
//				L.x = sc.x-1;
//				L.y = sc.y;
//				Point R = new Point();
//				R.x = sc.x+1;
//				R.y = sc.y;
//				int cntD = 0;
//				int cntU = 0;
//				int cntR = 0;
//				int cntL = 0;
//				Point[] stu = new Point[n];
//				for(int i=0;i<n;i++) {
//					stu[i]= new Point();
//					stu[i].x = s.nextInt();
//					stu[i].y = s.nextInt();
//					if(stu[i].x>=R.x) {
//						cntR++;
//					}
//					if(stu[i].x<=L.x) {
//						cntL++;
//					}
//					if(stu[i].y>=U.y) {
//						cntU++;
//					}
//					if(stu[i].x<=D.y) {
//						cntD++;
//					}
//					
//				}	
//				if(cntU>=cntL && cntU>=cntD && cntU>=cntR) {
//					System.out.println(cntU);
//					System.out.println(U.x+" "+U.y);
//				}
//				else if(cntD>=cntL && cntD>=cntU && cntD>=cntR) {
////					System.out.println("D");
//					System.out.println(cntD);
//					System.out.println(D.x+" "+D.y);
//				}
//				else if(cntL>=cntU && cntL>=cntD && cntL>=cntR) {
//					System.out.println(cntL);
//					System.out.println(L.x+" "+L.y);
//				}
//				else if(cntR>=cntL && cntR>=cntD && cntR>=cntU) {
//					System.out.println(cntR);
//					System.out.println(R.x+" "+R.y);
//				}
//				
	 
		  	}
	 
			
		}
	
	static class FastReader 

	{ 
	    BufferedReader br; 
	    StringTokenizer st; 

	    public FastReader() 
	    { 
	        br = new BufferedReader(new
	                 InputStreamReader(System.in)); 
	    } 

	    String next() 
	    { 
	        while (st == null || !st.hasMoreElements()) 
	        { 
	            try
	            { 
	                st = new StringTokenizer(br.readLine()); 
	            } 
	            catch (IOException  e) 
	            { 
	                e.printStackTrace(); 
	            } 
	        } 
	        return st.nextToken(); 
	    } 

	    int nextInt() 
	    { 
	        return Integer.parseInt(next()); 
	    } 

	    long nextLong() 
	    { 
	        return Long.parseLong(next()); 
	    } 

	    double nextDouble() 
	    { 
	        return Double.parseDouble(next()); 
	    } 

	    String nextLine() 
	    { 
	        String str = ""; 
	        try
	        { 
	            str = br.readLine(); 
	        } 
	        catch (IOException e) 
	        { 
	            e.printStackTrace(); 
	        } 
	        return str; 
	    } 
	} 

}
