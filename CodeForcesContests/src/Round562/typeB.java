package Round562;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;

public class typeB {
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
	

	static class Pair {
		int x;
		int y;
	}
	
	public static void main(String[] args) {
		FastReader s = new FastReader();
		int n = s.nextInt();
		int m=s.nextInt();
		Pair[] arr = new Pair[m];
		for(int i=0;i<m;i++) {
			Pair P = new Pair();
			P.x = s.nextInt();
			P.y = s.nextInt();
			if(P.x>P.y) {
				int temp = P.x;
				P.x = P.y;
				P.y = temp;
			}
			arr[i]=P;
		}
		int i=0;
		int flag=-1;
		if(m==1||m==2) {
			System.out.println("YES");
			return;
		}
		HashSet<Integer> setY=new HashSet<Integer>();
		HashSet<Integer> setX=new HashSet<Integer>();
		int a = arr[0].x;
		int b = arr[0].y;
		int c = arr[1].x;
		int d = arr[1].y;
		int tempX = -1;
		int tempY = -1;
		
			setX.add(a);
			setX.add(b);
			setY.add(c);
			setY.add(d);
	
	//WHEN ONLY 1 elem is common in first 2 pairs
		HashSet<Integer> retain = new HashSet<Integer>();
		retain.addAll(setX);
		retain.retainAll(setY);
		Iterator<Integer> it = retain.iterator();
		int elem = it.next();
		int e = arr[2].x;
		int f = arr[2].y;
		
		if(setX.contains(e)&&setY.contains(e)) {
			
		}
		if(e==elem||f==elem) {
			
			tempX = elem;
			setY.addAll(setX);
			setY.remove(elem);
			
		}
		if()
		
		
		setY.addAll(setX);
		tempX = elem;
			
		}
		int chk = -1;
		int k=2;
		while(k<m) {
		int	chk1 = setX.contains(arr[k].x)?1:-1;
		int chk2 = setY.contains(arr[k].x)?1:-1;
		int chk3 = setX.contains(arr[k].y)?1:-1;
		int chk4 = setY.contains(arr[k].y)?1:-1;
		if((chk2==1 && chk4==1)||(chk1==1 && chk3==1)) {
			k++;
			continue;
		}
		else if((chk1==-1)&&(chk2==-1)&&(chk3==-1)&&(chk4==-1)) {
			System.out.println("NO");
			return;
		}
		else if( (chk1==1 || chk3==1) && (chk2==1||chk4==1)) {
			k++;
			continue;
		}
		else if(chk1==1 || chk2==1) {
			tempX = arr[k].x;
			k++;
			break;
		}
		else if(chk3==1 || chk4==1) {
			tempX = arr[k].y;
			k++;
			break;
		}
		}
		
		if(a==b) {
			tempX=a;
		}
		if(c-a==0||c-b==0) {
			tempX = c;
			flag=0;
		}else if(d-a==0||d==b) {
			tempX=d;
			flag=0;
		}
		
		System.out.println(k);
		
		
		if(flag==-1) {
			System.out.println("NO");
			return;
		}
		if(flag==0) {
		for(i=3;i<m;i++) {
			if(arr[i].x==tempX||arr[i].y==tempX) {
				continue;
			}else if(flag==0) {
				flag=1;
				setY.add(arr[i].x);
				setY.add(arr[i].y);
			}else if(flag==1) {
				Iterator<Integer> map = setY.iterator();
				for(Integer ch: setY ) {
					if(arr[i].x==ch) {
						tempY=arr[i].x;
						flag=2;
					}else if(arr[i].y==ch) {
						tempY=arr[i].y;
						flag=2;
					}
				}
				if(flag==1) {
					flag=3;
				}
				
			}else if(flag==2) {
				if(arr[i].x==tempX||arr[i].x==tempY||arr[i].y==tempX||arr[i].y==tempY) {
					continue;
				}else {
					flag++;
					System.out.println("NO");
					return;
				}
			}
		}
		}
		if(flag==0||flag==1||flag==2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
	}
}
